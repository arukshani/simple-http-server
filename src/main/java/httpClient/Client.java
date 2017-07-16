package httpClient;

import payloads.PAYLOADS;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created with IntelliJ IDEA.
 * User: shafreen
 * Date: 8/29/13
 * Time: 4:44 PM
 */
public class Client {

    private static ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
    private static StringBuilder inbound_content = new StringBuilder();

    public static void main(String[] argv) throws Exception {
        //        new Client().go();
        // sleep for ten minutes
        //        Thread.sleep(600000);

        InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 1234);

        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(true);
        sc.socket().setReceiveBufferSize(1024);
        sc.socket().setSendBufferSize(1024);
        sc.connect(addr);

        ByteBuffer buf = ByteBuffer.allocate(1024 * 16);
        buf.clear();

        byte[] data = PAYLOADS.CLIENT_PAYLOAD.getBytes();

        while (!sc.finishConnect()) {
            // Just loop
        }

        try {
            int i = 0;
            while (i != data.length) {

                // Fill the buffer
                System.out.println("Filling the buffer");
                buf.clear();
                for (; data.length > i; i++) {
                    if (buf.hasRemaining()) {
                        buf.put(data[i]);
                    } else {
                        break;
                    }
                }

                // Drain the buffer
                System.out.println("Draining the buffer");
                buf.flip();
                while (buf.hasRemaining()) {
                    sc.write(buf);
                }
            }

            try {
                System.out.println("reading data from the socket...");
                readDataFromSocket(sc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(20000000);

        System.out.println("Existing the programme");
        System.exit(0);
    }

    private static void readDataFromSocket(SocketChannel socketChannel) throws Exception {
        int count;
        // Empty buffer
        buffer.clear();

        // Loop while data is available; channel is non-blocking
        while ((count = socketChannel.read(buffer)) > 0) {

            // Make buffer readable
            buffer.flip();

            // Send the data; don't assume it goes all at once
            while (buffer.hasRemaining()) {
                inbound_content.append((char) buffer.get());
            }

            // Print the the inbound content
            System.out.println(inbound_content.toString());

            // WARNING: the above loop is evil. Because it's writing back to the same non blocking
            // channel it read the data from, this code can potentially spin in a busy loop. In real life
            // you'd do something more useful than this.

            // Empty buffer
            buffer.clear();
        }

        if (count < 0) {
            // Close channel on EOF, invalidates the key
            System.out.println("====== closing the channel ==========");
            socketChannel.close();
        }
    }

    //    private class WorkerThread extends Thread {
    //
    //        public WorkerThread() {
    //            this.start();
    //        }
    //
    //        @Override
    //        public void run() {
    //            try {
    //                InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 1234);
    //
    //                SocketChannel sc = SocketChannel.open();
    //                sc.configureBlocking(true);
    ////                sc.socket().setReceiveBufferSize(1024);
    ////                sc.socket().setSendBufferSize(1024);
    //                sc.connect(addr);
    //
    //
    ////                while (true) {
    //
    //                while (!sc.finishConnect()) { /* Just loop */ }
    //
    ////                System.out.println("sleeping the connection xxxxxxx");
    ////                sc.close();
    ////                Thread.sleep(10000000);
    //
    //                try {
    //                        System.out.println("writing data from the socket...");
    //                        writeData(sc);
    //
    //                        System.out.println("reading data from the socket...");
    //                        readDataFromSocket(sc);
    //
    //                    } catch (Exception e) {
    //                        e.printStackTrace();
    //                    }
    ////                }
    //            } catch (Exception e) {
    //                e.printStackTrace();
    //            }
    //
    //            System.out.println("exiting thread --> EXIT");
    //        }
    //
    //        private void writeData(SocketChannel sc) throws Exception {
    //
    //            ByteBuffer buf = ByteBuffer.allocate(1024 * 16);
    //            buf.clear();
    //
    //            byte[] data = PAYLOADS.CLIENT_PAYLOAD.getBytes();
    //
    //            int i = 0;
    //            while (i != data.length) {
    //
    //                // Fill the buffer
    //                System.out.println("Filling the buffer");
    //                buf.clear();
    //                for (; data.length > i; i++) {
    //                    if (buf.hasRemaining()) {
    //                        buf.put(data[i]);
    //                    } else {
    //                        break;
    //                    }
    //                }
    //
    //                // Drain the buffer
    //                System.out.println("Draining the buffer");
    //                buf.flip();
    //                while (buf.hasRemaining()) {
    ////                    try {
    //                        sc.write(buf);
    ////                    } catch (IOException e) {
    ////                        e.printStackTrace();
    ////                    }
    //                }
    //            }
    //        }

    //        private void readDataFromSocket(SocketChannel socketChannel) throws Exception {
    //            ByteBuffer buffer = ByteBuffer.allocateDirect(1000);
    //            StringBuilder inbound_content = new StringBuilder();
    //
    //            int count;
    //            // Empty buffer
    //            buffer.clear( );
    //
    //            System.out.println("sleeping xxxxxxxxxxx");
    //            Thread.sleep(60000);
    //            System.out.println("exit xxxxxxxxxxx");
    //
    //            socketChannel.close();
    //
    //            // Loop while data is available; channel is non-blocking
    //            while ((count = socketChannel.read(buffer)) > 0) {
    //
    //                // Make buffer readable
    //                buffer.flip( );
    //
    //                // Send the data; don't assume it goes all at once
    //                while (buffer.hasRemaining()) {
    //                    inbound_content.append((char) buffer.get());
    //                    System.out.println(inbound_content.toString());
    //                }
    //
    //                // WARNING: the above loop is evil. Because it's writing back to the same non blocking
    //                // channel it read the data from, this code can potentially spin in a busy loop. In real life
    //                // you'd do something more useful than this.
    //
    //                // Empty buffer
    //                buffer.clear( );
    //            }
    //
    //            if (count < 0) {
    //                // Close channel on EOF, invalidates the key
    //                System.out.println("====== closing the channel ==========");
    //                socketChannel.close();
    //            }
    //        }
    //    }

    //    public void go() {
    //        for (int i = 0; i < 1; i++) {
    //            new WorkerThread();
    //        }
    //    }
}
