package httpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class Server {

    private static int PORT_NUMBER = 8080;
    static final int MAX_THREADS = 100;
    static final int APPLICATION_BUFFER_SIZE = 1024 * 16;
    private static final int SOCKET_RCV_BUFFER_SIZE = 1024 * 16;

    public static void main (String [] argv) throws Exception {
        new SelectSocketsThreadPool().go(argv);
    }

    void go(String [] argv) {
        int port = PORT_NUMBER;
        if (argv.length > 0) { // Override default listen port
            port = Integer.parseInt (argv [0]);
        }

        System.out.println ("Listening on port " + port);

        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            ServerSocket serverSocket = serverChannel.socket();
            serverSocket.setReceiveBufferSize(SOCKET_RCV_BUFFER_SIZE);
            serverSocket.bind(new InetSocketAddress(port));
            Selector selector = Selector.open();
            serverChannel.configureBlocking(false);
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                if (waitOnSelect(selector)) {
                    continue;
                }

                handleSelectedChannels(selector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleSelectedChannels(Selector selector) throws IOException, InterruptedException {
        Iterator it = selector.selectedKeys().iterator();
        while (it.hasNext()) {
            try {
                SelectionKey key = (SelectionKey) it.next();
                if (key.isValid() && key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel channel = server.accept();
                    registerChannel(selector, channel, SelectionKey.OP_READ);
                }
                if (key.isValid() && key.isReadable()) {
                    readDataFromSocket(key);
                }
            } finally {
                it.remove();
            }
        }
    }

    private boolean waitOnSelect(Selector selector) throws IOException {
        System.out.println("waiting on selector -----> <-----");
        int n = selector.select();
        System.out.println("returning from the select @ " + System.currentTimeMillis());
        if (n <= 0) {
            return true;
        }
        return false;
    }

    protected void readDataFromSocket(SelectionKey key) throws IOException, InterruptedException {}

    private void registerChannel(Selector selector, SelectableChannel channel, int ops) throws IOException {
        System.out.println("registering new connection");
        if (channel == null) {
            return;
        }
        channel.configureBlocking(false);
        channel.register(selector, ops);
    }
}
