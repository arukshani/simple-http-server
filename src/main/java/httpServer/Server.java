package httpServer;

import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.Selector;
import java.nio.channels.SelectionKey;
import java.nio.channels.SelectableChannel;
import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.util.Iterator;

public class Server {

    private static int PORT_NUMBER = 1234;

    public static void main (String [] argv) throws Exception {
        new Server().go(argv);
    }

    public void go (String [] argv) throws Exception {
        int port = PORT_NUMBER;
        if (argv.length > 0) { // Override default listen port
            port = Integer.parseInt (argv [0]);
        }

        System.out.println ("Listening on port " + port);

        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverChannel.socket();
        serverSocket.setReceiveBufferSize(1024);
        serverSocket.bind (new InetSocketAddress (port));
        Selector selector = Selector.open();
        serverChannel.configureBlocking(false);
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            System.out.println("waiting on selector -----> <-----");

            int n = selector.select();
            System.out.println("returning from the select @ " + System.currentTimeMillis());
            if (n <= 0) {
                continue;
            } else {
                System.out.println("selector has some event");
            }

            Iterator it = selector.selectedKeys().iterator();
            while (it.hasNext()) {
                try {
                    SelectionKey key = (SelectionKey) it.next();
                    if (key.isValid() && key.isAcceptable()) {
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        SocketChannel channel = server.accept();
                        System.out.println("registering new connection");
                        registerChannel(selector, channel, SelectionKey.OP_READ);
                    }
                    if (key.isValid() && key.isReadable()) {
                        System.out.println("delegating the output to thread ...");
                        readDataFromSocket(key);
                    }
                } finally {
                    it.remove();
                }
            }
        }
    }

    protected void readDataFromSocket (SelectionKey key) throws Exception {}

    private void registerChannel (Selector selector, SelectableChannel channel, int ops) throws Exception {
        if (channel == null) {
            return;
        }
        channel.configureBlocking(false);
        channel.register(selector, ops);
    }
}
