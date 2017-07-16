package sslServer;/* sslServer.SslReverseEchoer.java
 - Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */
import payloads.PAYLOADS;

import java.io.*;
import java.net.*;
import java.security.*;
import javax.net.ssl.*;

public class SslReverseEchoer {

    public static void main(String[] args) {

        String ksName = "/home/shaf/Documents/wso2/software/wso2esb-4.9.0/repository/resources/security/wso2carbon.jks";
        char ksPass[] = "wso2carbon".toCharArray();
        char ctPass[] = "wso2carbon".toCharArray();

        try {
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(ksName), ksPass);
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(ks, ctPass);

            SSLContext sc = SSLContext.getInstance("TLSv1.2");
            sc.init(kmf.getKeyManagers(), null, null);
            SSLServerSocketFactory ssf = sc.getServerSocketFactory();
            SSLServerSocket s = (SSLServerSocket) ssf.createServerSocket(8888);

//            printServerSocketInfo(s);

            SSLSocket c = (SSLSocket) s.accept();

            while (true) {

//                printSocketInfo(c);

//                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(c.getOutputStream()));
//                BufferedReader r = new BufferedReader(new InputStreamReader(c.getInputStream()));

                String request = readAll(c);
                if (request == null) {
                    c = (SSLSocket) s.accept();
                    continue;
                } else {
                    System.out.println(request);
                }

                String m = PAYLOADS.PAYLOAD;

                c.getOutputStream().write(m.getBytes());
                c.getOutputStream().flush();

//                w.close();
//                r.close();
//                c.close();
//                s.close();

//                if (Math.random())
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printSocketInfo(SSLSocket s) {
        System.out.println("Socket class: "+s.getClass());
        System.out.println("   Remote address = "
                +s.getInetAddress().toString());
        System.out.println("   Remote port = "+s.getPort());
        System.out.println("   Local socket address = "
                +s.getLocalSocketAddress().toString());
        System.out.println("   Local address = "
                +s.getLocalAddress().toString());
        System.out.println("   Local port = "+s.getLocalPort());
        System.out.println("   Need httpClient authentication = "
                +s.getNeedClientAuth());
        SSLSession ss = s.getSession();
        System.out.println("   Cipher suite = "+ss.getCipherSuite());
        System.out.println("   Protocol = "+ss.getProtocol());
    }

    private static void printServerSocketInfo(SSLServerSocket s) {
        System.out.println("Server socket class: "+s.getClass());
        System.out.println("   Socket address = "
                +s.getInetAddress().toString());
        System.out.println("   Socket port = "
                +s.getLocalPort());
        System.out.println("   Need httpClient authentication = "
                +s.getNeedClientAuth());
        System.out.println("   Want httpClient authentication = "
                +s.getWantClientAuth());
        System.out.println("   Use httpClient mode = "
                +s.getUseClientMode());
    }

    public static String readAll(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;

        if ((line = reader.readLine()) == null) {
            socket.close();
            return null;
        } else {
            sb.append(line);
        }

        while (!(line = reader.readLine()).equalsIgnoreCase("")) {
            System.out.println(line);
            sb.append(line);
        }
        return sb.toString();
    }

//    public static int randInt(int min, int max) {
//
//        // NOTE: This will (intentionally) not run as written so that folks
//        // copy-pasting have to think about how to initialize their
//        // Random instance.  Initialization of the Random instance is outside
//        // the main scope of the question, but some decent options are to have
//        // a field that is initialized once and then re-used as needed or to
//        // use ThreadLocalRandom (if using at least Java 1.7).
//        Random rand;
//
//        // nextInt is normally exclusive of the top value,
//        // so add 1 to make it inclusive
//        int randomNum = rand.nextInt((max - min) + 1) + min;
//
//        return randomNum;
//    }
}