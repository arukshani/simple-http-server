package httpClient;

import payloads.PAYLOADS;

import java.io.IOException;
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

    public static void main(String[] argv) throws Exception {

        SocketChannel clientSocket = connectToRemoteEndpoint();

        try {
            writeRequest(clientSocket);
            readResponse(clientSocket);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(20000000);

        System.out.println("Existing the programme");
        System.exit(0);
    }

    private static SocketChannel connectToRemoteEndpoint() throws IOException {
        InetSocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 1234);

        SocketChannel clientSocket = SocketChannel.open();
        clientSocket.configureBlocking(true);
        clientSocket.socket().setReceiveBufferSize(1024);
        clientSocket.socket().setSendBufferSize(1024);
        clientSocket.connect(remoteAddress);

        while (!clientSocket.finishConnect()) {
            // wait till the connection is complete
        }
        return clientSocket;
    }

    private static void writeRequest(SocketChannel sc) throws IOException {
        System.out.println("Write out the request");

        int i = 0;
        ByteBuffer buf = ByteBuffer.allocate(1024 * 16);
        buf.clear();
        byte[] data = PAYLOADS.CLIENT_PAYLOAD.getBytes();
        while (i != data.length) {
            buf.clear();
            for (; data.length > i; i++) {
                if (buf.hasRemaining()) {
                    buf.put(data[i]);
                } else {
                    break;
                }
            }
            buf.flip();
            while (buf.hasRemaining()) {
                sc.write(buf);
            }
        }
    }

    private static void readResponse(SocketChannel socketChannel) throws Exception {
        System.out.println("read the response");

        int count;
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        StringBuilder inbound_content = new StringBuilder();

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

            // Empty buffer
            buffer.clear();
        }

        if (count < 0) {
            // Close channel on EOF, invalidates the key
            System.out.println("====== closing the channel ==========");
            socketChannel.close();
        }
    }
}
