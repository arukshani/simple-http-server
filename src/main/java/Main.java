//import org.apache.axiom.om.impl.builder.StAXOMBuilder;

//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamReader;
import payloads.PAYLOADS;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

        public static void main (String [] argv) throws Exception {

            System.out.println(PAYLOADS.PAYLOAD.getBytes().length);

            System.out.println(System.currentTimeMillis());

//            String xxx = (String) null;

//        new Main().go();

        Thread.sleep(200000);

//        StringReader strReader = new StringReader(PAYLOAD);
//        XMLInputFactory xmlInFac = XMLInputFactory.newInstance();
//
//        XMLStreamReader parser = xmlInFac.createXMLStreamReader(strReader);
//        StAXOMBuilder builder = new StAXOMBuilder(parser);
//        builder.getDocumentElement().buildWithAttachments();
    }

//    public void go() {
//        XMLInputFactory xmlInFac = XMLInputFactory.newInstance();
////        StringReader strReader = new StringReader(PAYLOAD);
//
//        InputStream inputStream = new ByteArrayInputStream(PAYLOAD.getBytes());
//
//        Executor executor = Executors.newCachedThreadPool();
//
//        for (int i = 0; i < 4; i++) {
//            executor.execute(new Workers(xmlInFac, inputStream));
//        }
//    }
//
//    private class Workers implements Runnable {
//
//        XMLInputFactory xmlInputFactory;
//        InputStream inputStream;
//
//        public Workers(XMLInputFactory inputFactory, InputStream inputStream) {
//            this.xmlInputFactory = inputFactory;
//            this.inputStream = inputStream;
//        }
//
//        public void run() {
//            try {
//                XMLStreamReader parser = xmlInputFactory.createXMLStreamReader(this.inputStream, "UTF-8");
//                StAXOMBuilder builder = new StAXOMBuilder(parser);
//                System.out.println(builder.getDocumentElement().toString());
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
