package httpServer;

import payloads.PAYLOADS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;

public class SelectSocketsThreadPool extends Server {

    private ThreadPool pool = new ThreadPool(MAX_THREADS);

    protected void readDataFromSocket(SelectionKey key) throws IOException, InterruptedException {
        WorkerThread worker = pool.getWorker();
        if (worker == null) {
            Thread.sleep(1000);
            return;
        }

        System.out.println("delegating the output to thread ...");
        worker.serviceChannel(key);
    }

    private class WorkerThread extends Thread {
        private ByteBuffer buffer = ByteBuffer.allocate(APPLICATION_BUFFER_SIZE);
        private ThreadPool pool;
        private SelectionKey key;

        WorkerThread(ThreadPool pool) {
            this.pool = pool;
        }

        public synchronized void run() {
            System.out.println(this.getName() + " is ready");
            while (true) {
                if (waitForRequest()) {
                    continue;
                }
                System.out.println(this.getName() + " has been awakened");

                // Check and write the response
                try {
                    // Read data from socket
                    readRequest(key);
                    respondIfRequestComplete();
                } catch (Exception e) {
                    handleError(e);
                }
                key = null;
                this.pool.returnWorker(this);
            }
        }

        private void readRequest(SelectionKey key) throws Exception {
            Object o = key.attachment();
            if (o == null) {
                key.attach(new StateBean());
            }
            StateBean stateBean = (StateBean) key.attachment();
            StringBuilder inbound_content = stateBean.content;
            clearExistingContent(inbound_content);

            SocketChannel channel = (SocketChannel) key.channel();
            int count = readNexContent(inbound_content, channel);

            if (count < 0) {
                System.out.println("Need to close the connection");
                channel.close();
                return;
            }

            // Resume interest in OP_READ
            key.interestOps(key.interestOps() | SelectionKey.OP_READ);
            // Cycle the selector so this key is active again
            key.selector().wakeup();
        }

        private int readNexContent(StringBuilder inbound_content, SocketChannel channel) throws IOException {
            int count;
            buffer.clear();
            while ((count = channel.read(buffer)) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    inbound_content.append((char) buffer.get());
                }
            }
            buffer.clear();
            return count;
        }

        private void clearExistingContent(StringBuilder inbound_content) {
            if (inbound_content.length() > 0) {
                inbound_content.delete(0, inbound_content.length() - 1);
            }
        }

        private void respondIfRequestComplete() {
            StateBean stateBean = (StateBean) key.attachment();
            StringBuilder inbound_content = stateBean.content;
            if (checkIfEndOfRequest(inbound_content)) {
                System.out.println(inbound_content.toString());
                inbound_content.delete(0, inbound_content.length() - 1);

                respond(key);
            }
        }

        private boolean checkIfEndOfRequest(StringBuilder inbound_content) {
            // this only work for chunk request
            return inbound_content.toString().matches("[.\\n\\w\\W]*0\\r\\n\\r\\n");
        }

        void respond(SelectionKey key) {
            try {
                SocketChannel outBoundChannel = (SocketChannel) key.channel();
                writeHeaders(outBoundChannel);
                writeBody(outBoundChannel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void writeHeaders(SocketChannel outBoundChannel) throws IOException {
            ByteBuffer outbound_header = ByteBuffer.allocateDirect(PAYLOADS.PAYLOAD_HEADERS.getBytes("ASCII").length);
            outbound_header.clear();
            outbound_header.put(PAYLOADS.PAYLOAD_HEADERS.getBytes("ASCII"));
            outbound_header.flip();
            if (outBoundChannel.isOpen()) {
                outBoundChannel.write(outbound_header);
                outBoundChannel.socket().getOutputStream().flush();
            }
        }

        private void writeBody(SocketChannel outBoundChannel) throws IOException {
            int count = 0;
            ByteBuffer outbound_content = ByteBuffer.allocate(1024*8);
            outbound_content.put("<a>".getBytes("ISO-8859-1"));
            String payload = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n";
            while (true) {
                if (count != 0) {
                    // Don't have to clear when we do it for the first time.
                    outbound_content.clear();
                }
                count = count + payload.getBytes().length;
                outbound_content.put(payload.getBytes("ISO-8859-1"));

                if (outBoundChannel.isOpen()) {
                    if (count < 500987) {
                        outbound_content.flip();
                        outBoundChannel.write(outbound_content);
                        outBoundChannel.socket().getOutputStream().flush();
                    } else {
                        // finish sending the body
                        outbound_content.put("</a>".getBytes());
                        outbound_content.flip();
                        outBoundChannel.write(outbound_content);
                        outBoundChannel.socket().getOutputStream().flush();
                        System.out.println(count);
                        break;
                    }
                }
            }
        }

        private boolean waitForRequest() {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.interrupted();
            }
            return key == null;
        }

        private void handleError(Exception e) {
            System.out.println("Caught '" + e + "' closing channel");
            try {
                key.channel().close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            key.selector().wakeup();
        }

        synchronized void serviceChannel(SelectionKey key) {
            this.key = key;
            key.interestOps(key.interestOps() & (~SelectionKey.OP_READ));
            this.notify();
            // Awaken the thread
        }
    }

    private class ThreadPool {

        List idle = new LinkedList();

        ThreadPool(int poolSize) {
            for (int i = 0; i < poolSize; i++) {
                WorkerThread thread = new WorkerThread(this);
                thread.setName("Worker" + (i + 1));
                thread.start();
                idle.add(thread);
            }
        }

        WorkerThread getWorker() {
            WorkerThread worker = null;
            synchronized (idle) {
                if (idle.size() > 0) {
                    worker = (WorkerThread) idle.remove(0);
                }
            }
            return (worker);
        }

        void returnWorker(WorkerThread worker) {
            synchronized (idle) {
                idle.add(worker);
            }
        }
    }
}
