package httpServer;

import payloads.PAYLOADS;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;

public class SelectSocketsThreadPool extends Server {

    private static final int MAX_THREADS = 1;
    private ThreadPool pool = new ThreadPool(MAX_THREADS);

    public static void main(String[] argv) throws Exception {
        new SelectSocketsThreadPool().go(argv);
    }

    protected void readDataFromSocket(SelectionKey key) throws Exception {
        WorkerThread worker = pool.getWorker();
        if (worker == null) {
            Thread.sleep(1000);
            return;
        }
        worker.serviceChannel(key);
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

    private class WorkerThread extends Thread {
        private ByteBuffer buffer = ByteBuffer.allocate(1024 * 8);
        private ThreadPool pool;
        private SelectionKey key;

        WorkerThread(ThreadPool pool) {
            this.pool = pool;
        }

        public synchronized void run() {
            System.out.println(this.getName() + " is ready");
            while (true) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    this.interrupted();
                }
                if (key == null) {
                    continue;
                }
                System.out.println(this.getName() + " has been awakened");

                // Read data from socket
                try {
                    drainChannel(key);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Check and write the response
                try {
                    StringBuilder inbound_content = (StringBuilder) key.attachment();
                    if (inbound_content.toString().contains("Envelop>")) {
                        String inbound = inbound_content.toString();
                        System.out.println(inbound);

                        responseToClient(key);
                        responseToClient(key);
//                        key.channel().close();

                        inbound_content.delete(0, inbound_content.length() - 1);
                    }
                } catch (Exception e) {
                    System.out.println("Caught '" + e + "' closing channel");
                    try {
                        key.channel().close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    key.selector().wakeup();
                }
                key = null;
                this.pool.returnWorker(this);
            }
        }

        synchronized void serviceChannel(SelectionKey key) {
            this.key = key;
            key.interestOps(key.interestOps() & (~SelectionKey.OP_READ));
            this.notify();
            // Awaken the thread
        }

        void drainChannel(SelectionKey key) throws Exception {
            Object o = key.attachment();
            if (o == null) {
                key.attach(new StringBuilder());
            }
            StringBuilder inbound_content = (StringBuilder) key.attachment();

            SocketChannel channel = (SocketChannel) key.channel();
            int count;
            buffer.clear();
            while ((count = channel.read(buffer)) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    inbound_content.append((char) buffer.get());
                }
            }
            buffer.clear();
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

        void responseToClient(SelectionKey key) {
            try {
                ByteBuffer outbound_content = ByteBuffer.allocateDirect(PAYLOADS.PAYLOAD.getBytes("ASCII").length);
                SocketChannel outBoundChannel = (SocketChannel) key.channel();
                outbound_content.clear();
                outbound_content.put(PAYLOADS.PAYLOAD.getBytes("ASCII"));
                outbound_content.flip();
                if (outBoundChannel.isOpen()) {
                    outBoundChannel.write(outbound_content);
                    outBoundChannel.socket().getOutputStream().flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
