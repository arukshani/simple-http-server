package payloads;


public class PAYLOADS {

//
//    public static final String PAYLOAD = "HTTP/1.1 200 OK\r\n"
//            + "httpServer.Server: nginx\r\n"
//            + "Content-Type: text/xml;charset=UTF-8\r\n"
//            + "Connection: Keep-Alive\r\n"
//            + "Cache-Control: no-cache\r\n"
//            + "X-Frame-Options: SAMEORIGIN\r\n"
//            + "Strict-Transport-Security: max-age=31536000;\r\n"
//            + "Content-Length: 42245\r\n"
//            + "\r\n"
//            + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
//            "   <soapenv:Header/>\n" +
//            "   <soapenv:Body>\n" +
//            "   <m:buyStocks xmlns:m=\"http://services.samples/xsd\">\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "<order><symbol>MSFT</symbol><buyerID>kasun</buyerID><price>23.56</price><volume>8030</volume></order>\n" +
//            "<order><symbol>SUN</symbol><buyerID>miyru</buyerID><price>14.56</price><volume>500</volume></order>\n" +
//            "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>\n" +
//            "<order><symbol>IBM</symbol><buyerID>dushan</buyerID><price>140.34</price><volume>2000</volume></order>\n" +
//            "</m:buyStocks>\n" +
//            "   </soapenv:Body>\n" +
//            "</soapenv:Envelope>" ;


//        public static final String PAYLOAD = "POST /services/MyMockProxy HTTP/1.1\r\n"
//            + "Accept-Encoding: gzip,deflate\r\n"
//            + "Content-Type: text/xml;charset=UTF-8\r\n"
//            + "SOAPAction: \"urn:findBenutzer\"\r\n"
//            + "Transfer-Encoding: chunked\r\n"
//            + "Host: wlss1h01.suvanet.ch:53203\r\n"
//            + "Connection: Keep-Alive\r\n"
//            + "User-Agent: Synapse-PT-HttpComponents-NIO\r\n"
//            + "\r\n"
//            + "19a\r\n"
//            + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:adap=\"http://adapter.mitarbeiter.mix.suva.ch\">\n"
//            + "   <soapenv:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\"><wsa:Action>urn:findBenutzer</wsa:Action></soapenv:Header>\n"
//            + "   <soapenv:Body>\n"
//            + "      <adap:findBenutzer>\n"
//            + "         <adap:param0>A0002798</adap:param0>\n"
//            + "      </adap:findBenutzer>\n"
//            + "   </soapenv:Body>\n"
//            + "</soapenv:Envelope>\r\n"
//            + "0\r\n"
//            + "\r\n";
//
//    public static final String PAYLOAD_HEADERS = "HTTP/1.1 200 OK\r\n"
//            + "Content-Type: application/xml;charset=UTF-8\r\n"
//            + "SOAPAction: \"urn:findBenutzer\"\r\n"
//            + "Transfer-Encoding: chunked\r\n"
//            + "Host: wlss1h01.suvanet.ch:53203\r\n"
//            + "Connection: Keep-Alive\r\n"
//            + "User-Agent: Synapse-PT-HttpComponents-NIO\r\n"
//            + "\r\n";

//        public static final String PAYLOAD = "HTTP/1.1 200 OK\r\n"
//            + "Content-Type: application/xml;charset=UTF-8\r\n"
//            + "SOAPAction: \"urn:findBenutzer\"\r\n"
//            + "Transfer-Encoding: chunked\r\n"
//            + "Host: wlss1h01.suvanet.ch:53203\r\n"
//            + "Connection: Keep-Alive\r\n"
//            + "User-Agent: Synapse-PT-HttpComponents-NIO\r\n"
//            + "\r\n"
//            + "2000\r\n"
//            + "<axis2ns35:DataServiceFault xmlns:axis2ns35=\"http://ws.wso2.org/dataservice\"><axis2ns35:current_params>{guid=OAHJIZ6K50XU01, published_at_string=2016-07-18T12:18:32.674Z, revision_id=2016-07-18T15:57:36.119Z, suid=OAIFIW6JTSED, source_id=ID:nyclqsynesbap01.addmz.bloomberg.com-57434-1468856404812-177:8:2378:1:1, content_service_response={\"webHidden\":false,\"summary\":{\"text\":\"Gold is in a major bull market and may surge to more than $1,500 an ounce as..low interest rates buoy demand and the U.S. presidential election looms, according to..DBS Group Holdings Ltd., which foresaw this year\\u2019s rally and is now advising investors to buy any declines.\",\"type\":\"text\\/html\",\"autoGenerated\":true},\"body\":{\"text\":\"&lt;!DOCTYPE html>&lt;html xmlns=\\\"http:\\/\\/www.w3.org\\/1999\\/xhtml\\\" xml:lang=\\\"en\\\" lang=\\\"en\\\">\\n  &lt;head>\\n    &lt;meta charset=\\\"UTF-8\\\"\\/>\\n    &lt;meta property=\\\"Content-Type\\\" content=\\\"application\\/xhtml+xml\\\"\\/>\\n    &lt;title>News Story&lt;\\/title>\\n  &lt;\\/head>\\n  &lt;body itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/Version\\/2.0\\\">\\n    &lt;section class=\\\"news-rsf-text-headlines\\\">&lt;h1 itemscope=\\\"itemscope\\\" itemprop=\\\"Headlines\\\">&lt;meta itemprop=\\\"story\\\" content=\\\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\\\"\\/>&lt;meta itemprop=\\\"short\\\" content=\\\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\\\"\\/>&lt;meta itemprop=\\\"long\\\" content=\\\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\\\"\\/>&lt;meta itemprop=\\\"web\\\" content=\\\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\\\"\\/>Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)&lt;\\/h1>&lt;\\/section>\\n    &lt;section class=\\\"news-rsf-abstract\\\">&lt;ul>&lt;li>Low rates, U.S. presidential vote to support prices, DBS says&lt;\\/li>&lt;li>Technical patterns also suggest rally to last, Wong predicts&lt;\\/li>&lt;\\/ul>&lt;\\/section>\\n    &lt;section class=\\\"news-header\\\">&lt;p itemprop=\\\"Byline\\\" class=\\\"news-byline\\\">&lt;meta content=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/NewsIndividualAttribution\\\" itemprop=\\\"BylineType\\\"\\/>By &lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/15931227\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"rpakiam@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+65-6499-2991\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"Singapore\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"5373594\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"15931227\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"by\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"reporter\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Ranjeetha Pakiam\\\" itemprop=\\\"name\\\"\\/>Ranjeetha Pakiam&lt;\\/span>&lt;\\/p>&lt;span itemscope=\\\"itemscope\\\" itemprop=\\\"NewsDateline\\\" class=\\\"news-dateline\\\">&lt;meta itemprop=\\\"location\\\" content=\\\"London\\\"\\/>&lt;meta itemprop=\\\"publisher\\\" content=\\\"Bloomberg\\\"\\/>     (Bloomberg) --&lt;\\/span>&lt;\\/section>\\n    &lt;section class=\\\"news-rsf-news-body\\\">&lt;p>&lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/securities\\/XAU%20Curncy\\/BQ\\\" title=\\\"Bloomberg Quote\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"security\\\" content=\\\"XAU Curncy\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"BQ\\\"\\/>Gold&lt;\\/a> is in a major bull market and may surge to more than $1,500 an ounce as..low interest rates buoy demand and the U.S. presidential election looms, according to..DBS Group Holdings Ltd., which foresaw this year\\u2019s rally and is now advising investors to buy any declines.&lt;\\/p>&lt;p>\\u201CGold has seen four &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/securities\\/XAU%20Curncy\\/GP%20Y\\\" title=\\\"Long-Term Graph of Prices\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"security\\\" content=\\\"XAU Curncy\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"GP Y\\\"\\/>major bull markets&lt;\\/a> since 1970: this is another one,\\u201D..Benjamin Wong, foreign exchange strategist at the Singapore-based bank\\u2019s Chief Investment Office, said in an e-mail. \\u201CThe market has yet to deal with the political uncertainty going into the Nov. 8 presidential election.\\u201D&lt;\\/p>&lt;p>Bullion rallied to the highest since March 2014 this month, topping $1,375, as volatility in global equities, the spread of negative interest rates, and..the turmoil surrounding Britain\\u2019s &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/screens\\/BREX\\\" title=\\\"BREXIT - UK\\u2019s EU Referendum\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"BREX\\\"\\/>vote to leave&lt;\\/a> the E.U. fanned demand...As the timeline draws closer for Americans to choose a new leader, the Federal Reserve may hold off from raising borrowing costs in September or November, potentially benefiting gold. Last week, Bank of America Merrill Lynch also listed the U.S. vote among factors that may lift bullion to $1,500 over 12 months.&lt;\\/p>&lt;figure data-type=\\\"image\\\" data-id=\\\"300282102\\\" data-image-type=\\\"chart\\\" data-image-size=\\\"full\\\" data-align=\\\"center\\\">&lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/screens\\/G%20NEWS6%209286%20THEME:NEWST\\\" title=\\\"Click to load this chart.\\\">&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"G NEWS6 9286 THEME:NEWST\\\"\\/>&lt;img src=\\\"http:\\/\\/resource.bloomberg.com\\/images\\/300282102\\\" alt=\\\"\\\"\\/>&lt;\\/a>&lt;figcaption>&lt;div class=\\\"news-figure-caption-text\\\">&lt;p\\/>&lt;\\/div>&lt;div class=\\\"news-figure-credit\\\"\\/&gt;&lt;\\/figcaption>&lt;\\/figure>&lt;p>\\u201CWe remain bullish and gold carries an overweight rating,\\u201D said Wong, who also cited technical charts supporting the stance, including a so-called inverse head-and-shoulders pattern. Last October, DBS &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/news\\/stories\\/NWAD0I6JTSEE\\\" title=\\\"Don\\u2019t Fear the Fed: DBS Makes Case for Gold Amid Rate Debate (1)\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"StoryLink\\\"\\/>&lt;meta itemprop=\\\"suid\\\" content=\\\"NWAD0I6JTSEE\\\"\\/>flagged the potential&lt;\\/a> for gold to gain this year, saying then the Fed would raise rates only gradually. It followed that in February with another &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/news\\/stories\\/O2OBEV6KLVR6\\\" title=\\\"Gold Outlook Pits DBS Overweight Call Against Goldman Bears (1)\\\" data-web-url=\\\"http:\\/\\/staging.bloomberg.com\\/news\\/articles\\/2016-02-17\\/gold-outlook-pits-dbs-s-overweight-call-against-goldman-s-bears\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"StoryLink\\\"\\/>&lt;meta itemprop=\\\"suid\\\" content=\\\"O2OBEV6KLVR6\\\"\\/>positive outlook &lt;\\/a>on bullion.&lt;\\/p>&lt;h3>Brexit Vote&lt;\\/h3>&lt;p>Bullion for immediate delivery, which traded at $1,326 an ounce on Monday,..was last above $1,500 in April 2013, according to Bloomberg generic pricing. After dropping for three years, it\\u2019s 25 percent higher so far in 2016 as investors boosted holdings in &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/securities\\/.GLDTONS%20Index\\/HCP%20M\\\" title=\\\"Monthly Changes\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"security\\\" content=\\\".GLDTONS Index\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"HCP M\\\"\\/>exchange-traded funds&lt;\\/a>.&lt;\\/p>&lt;p>In the U.S. contest, presumptive Republican nominee &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/people\\/profile\\/1252249\\\" title=\\\"Bloomberg Profile\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"ProfileLin\r\n"
//            + "2000\r\n"
//            + "k\\\"\\/>&lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/1252249\\\"\\/>&lt;meta itemprop=\\\"profile\\\" content=\\\"1252249\\\"\\/>Donald Trump&lt;\\/a> will up go against Democrat &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/people\\/profile\\/1442508\\\" title=\\\"Bloomberg Profile\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"ProfileLink\\\"\\/>&lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/1442508\\\"\\/>&lt;meta itemprop=\\\"profile\\\" content=\\\"1442508\\\"\\/>Hillary Clinton&lt;\\/a>. While polls show the former secretary of state holding a slim advantage over Trump, both candidates are saddled with high unfavorability ratings. The Republican convention opens on Monday.&lt;\\/p>&lt;p>\\u201CThe next few weeks, as the political debate heats up in the U.S., the support for gold is going to increase,\\u201D &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/people\\/profile\\/6949917\\\" title=\\\"Bloomberg Profile\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"ProfileLink\\\"\\/>&lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/6949917\\\"\\/>&lt;meta itemprop=\\\"profile\\\" content=\\\"6949917\\\"\\/>Francisco Blanch&lt;\\/a>, head of commodities research at Bank of America Merrill Lynch, said in an interview with Bloomberg Television Canada. Long-term interest rates are pretty anchored, and will probably end up moving lower over time, he said.&lt;\\/p>&lt;p>While the U.S. central bank raised borrowing costs in December for the first time in almost a decade, bullion advanced this year as investors &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/screens\\/WIRP\\\" title=\\\"World Interest Rate Probability\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"WIRP\\\"\\/>scaled back bets&lt;\\/a> on follow-through increases. Investors see only an 8 percent probability of a rise in July,..while the odds of a move by December are at 44 percent, according to pricing in federal funds futures contracts.&lt;\\/p>&lt;p>Any dips to $1,296 to $1,300 would be opportunities to accumulate, said Wong. The next &lt;a itemscope=\\\"itemscope\\\" itemprop=\\\"StoryLink\\\" href=\\\"bbg:\\/\\/securities\\/XAU%20Curncy\\/BTST\\\" title=\\\"Strategy Backtesting\\\">&lt;meta itemprop=\\\"active\\\" content=\\\"true\\\"\\/>&lt;meta itemprop=\\\"type\\\" content=\\\"FunctionLink\\\"\\/>&lt;meta itemprop=\\\"security\\\" content=\\\"XAU Curncy\\\"\\/>&lt;meta itemprop=\\\"function\\\" content=\\\"BTST\\\"\\/>rebound&lt;\\/a&gt; may top resistance at about $1,380 and move prices toward $1,437 to $1,455, he added. \\u201CLonger term, if the full force of the inverse head-and-shoulders pattern is applied, there remains scope for $1,525.\\u201D&lt;\\/p>&lt;\\/section>\\n    &lt;section class=\\\"news-trashline\\\">&lt;meta itemprop=\\\"version\\\" content=\\\"1\\\"\\/>&lt;meta itemprop=\\\"versiontype\\\" content=\\\"update\\\"\\/>(&lt;span itemprop=\\\"description\\\">Updates price in fifth paragraph.&lt;\\/span>)&lt;\\/section>\\n    &lt;section class=\\\"news-footer\\\">&lt;p>--With assistance from &lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/19202678\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"dbochove1@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+1-416-203-5706\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"Toronto\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"14411642\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"19202678\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"assist\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Danielle Bochove\\\" itemprop=\\\"name\\\"\\/>&lt;a href=\\\"bbg:\\/\\/people\\/profile\\/19202678\\\" itemprop=\\\"StoryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Bloomberg Profile\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/19202678\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"ProfileLink\\\" itemprop=\\\"type\\\"\\/>&lt;meta content=\\\"19202678\\\" itemprop=\\\"profile\\\"\\/>Danielle Bochove&lt;\\/a>&lt;\\/span> and &lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/18846837\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"jdeaux@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+1-212-617-8004\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"New York\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"12680850\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"18846837\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"assist\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Joe Deaux\\\" itemprop=\\\"name\\\"\\/>&lt;a href=\\\"bbg:\\/\\/people\\/profile\\/18846837\\\" itemprop=\\\"StoryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Bloomberg Profile\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/18846837\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"ProfileLink\\\" itemprop=\\\"type\\\"\\/>&lt;meta content=\\\"18846837\\\" itemprop=\\\"profile\\\"\\/>Joe Deaux&lt;\\/a>&lt;\\/span>. &lt;br\\/>&lt;br\\/>To contact the reporter on this story:&lt;br\\/>&lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/15931227\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"rpakiam@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+65-6499-2991\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"Singapore\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"5373594\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"15931227\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"by\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"reporter\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Ranjeetha Pakiam\\\" itemprop=\\\"name\\\"\\/>&lt;a href=\\\"bbg:\\/\\/people\\/profile\\/15931227\\\" itemprop=\\\"StoryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Bloomberg Profile\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/15931227\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"ProfileLink\\\" itemprop=\\\"type\\\"\\/>&lt;meta content=\\\"15931227\\\" itemprop=\\\"profile\\\"\\/>Ranjeetha Pakiam&lt;\\/a>&lt;\\/span> in Singapore at &lt;a href=\\\"bbg:\\/\\/msg\\/rpakiam@bloomberg.net\\\" itemprop=\\\"StoryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Click to view webpage.\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"WebLink\\\" itemprop=\\\"type\\\"\\/>rpakiam@bloomberg.net&lt;\\/a>&lt;br\\/>To contact the editors responsible for this story:&lt;br\\/>&lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/17703435\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"jrogers73@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+81-3-3201-8479\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"Tokyo\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"9247180\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"17703435\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"editor\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"responsible\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Jason Rogers\\\" itemprop=\\\"name\\\"\\/>&lt;a href=\\\"bbg:\\/\\/people\\/profile\\/17703435\\\" itemprop=\\\"StoryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Bloomberg Profile\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/17703435\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"ProfileLink\\\" itemprop=\\\"type\\\"\\/>&lt;meta content=\\\"17703435\\\" itemprop=\\\"profile\\\"\\/>Jason Rogers&lt;\\/a>&lt;\\/span> at &lt;a href=\\\"bbg:\\/\\/msg\\/jrogers73@bloomberg.net\\\" itemprop=\\\"Sto\r\n"
//            + "2000\r\n"
//            + "ryLink\\\" itemscope=\\\"itemscope\\\" title=\\\"Click to view webpage.\\\">&lt;meta content=\\\"true\\\" itemprop=\\\"active\\\"\\/>&lt;meta content=\\\"WebLink\\\" itemprop=\\\"type\\\"\\/>jrogers73@bloomberg.net&lt;\\/a>&lt;br\\/>&lt;span class=\\\"news-rsf-editor-byline\\\">&lt;span itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">&lt;link href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\" itemprop=\\\"additionalType\\\"\\/>&lt;meta content=\\\"bbg:\\/\\/people\\/profile\\/15016760\\\" itemprop=\\\"url\\\"\\/>&lt;meta content=\\\"jlloydsmith@bloomberg.net\\\" itemprop=\\\"email\\\"\\/>&lt;meta content=\\\"+65-6212-1548\\\" itemprop=\\\"telephone\\\"\\/>&lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">&lt;meta content=\\\"Singapore\\\" itemprop=\\\"name\\\"\\/>&lt;\\/span>&lt;meta content=\\\"3939736\\\" itemprop=\\\"uuid\\\"\\/>&lt;meta content=\\\"15016760\\\" itemprop=\\\"pepl\\\"\\/>&lt;meta content=\\\"editor\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"primary\\\" itemprop=\\\"role\\\"\\/>&lt;meta content=\\\"Jake Lloyd-Smith\\\" itemprop=\\\"name\\\"\\/>Jake Lloyd-Smith&lt;\\/span>&lt;\\/span>&lt;\\/p>&lt;\\/section>\\n    &lt;section class=\\\"news-rsf-attribution\\\">&lt;h4>Attribution&lt;\\/h4>\\n&lt;div itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">\\n  &lt;link itemprop=\\\"additionalType\\\" href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\"\\/>\\n  &lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/18846837\\\"\\/>\\n  &lt;meta itemprop=\\\"email\\\" content=\\\"jdeaux@bloomberg.net\\\"\\/>\\n  &lt;meta itemprop=\\\"telephone\\\" content=\\\"+1-212-617-8004\\\"\\/>\\n  &lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">\\n    &lt;meta itemprop=\\\"name\\\" content=\\\"New York\\\"\\/>\\n  &lt;\\/span>\\n  &lt;meta itemprop=\\\"uuid\\\" content=\\\"12680850\\\"\\/>\\n  &lt;meta itemprop=\\\"pepl\\\" content=\\\"18846837\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"assist\\\"\\/>\\n  &lt;meta itemprop=\\\"name\\\" content=\\\"Joe Deaux\\\"\\/>\\nJoe Deaux: assist&lt;\\/div>\\n&lt;div itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">\\n  &lt;link itemprop=\\\"additionalType\\\" href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\"\\/>\\n  &lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/19202678\\\"\\/>\\n  &lt;meta itemprop=\\\"email\\\" content=\\\"dbochove1@bloomberg.net\\\"\\/>\\n  &lt;meta itemprop=\\\"telephone\\\" content=\\\"+1-416-203-5706\\\"\\/>\\n  &lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">\\n    &lt;meta itemprop=\\\"name\\\" content=\\\"Toronto\\\"\\/>\\n  &lt;\\/span>\\n  &lt;meta itemprop=\\\"uuid\\\" content=\\\"14411642\\\"\\/>\\n  &lt;meta itemprop=\\\"pepl\\\" content=\\\"19202678\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"assist\\\"\\/>\\n  &lt;meta itemprop=\\\"name\\\" content=\\\"Danielle Bochove\\\"\\/>\\nDanielle Bochove: assist&lt;\\/div>\\n&lt;div itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">\\n  &lt;link itemprop=\\\"additionalType\\\" href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\"\\/>\\n  &lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/15016760\\\"\\/>\\n  &lt;meta itemprop=\\\"email\\\" content=\\\"jlloydsmith@bloomberg.net\\\"\\/>\\n  &lt;meta itemprop=\\\"telephone\\\" content=\\\"+65-6212-1548\\\"\\/>\\n  &lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">\\n    &lt;meta itemprop=\\\"name\\\" content=\\\"Singapore\\\"\\/>\\n  &lt;\\/span>\\n  &lt;meta itemprop=\\\"uuid\\\" content=\\\"3939736\\\"\\/>\\n  &lt;meta itemprop=\\\"pepl\\\" content=\\\"15016760\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"editor\\\"\\/>\\n  &lt;meta itemprop=\\\"name\\\" content=\\\"Jake Lloyd-Smith\\\"\\/>\\nJake Lloyd-Smith: editor&lt;\\/div>\\n&lt;div itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">\\n  &lt;link itemprop=\\\"additionalType\\\" href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\"\\/>\\n  &lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/15931227\\\"\\/>\\n  &lt;meta itemprop=\\\"email\\\" content=\\\"rpakiam@bloomberg.net\\\"\\/>\\n  &lt;meta itemprop=\\\"telephone\\\" content=\\\"+65-6499-2991\\\"\\/>\\n  &lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">\\n    &lt;meta itemprop=\\\"name\\\" content=\\\"Singapore\\\"\\/>\\n  &lt;\\/span>\\n  &lt;meta itemprop=\\\"uuid\\\" content=\\\"5373594\\\"\\/>\\n  &lt;meta itemprop=\\\"pepl\\\" content=\\\"15931227\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"by\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"reporter\\\"\\/>\\n  &lt;meta itemprop=\\\"name\\\" content=\\\"Ranjeetha Pakiam\\\"\\/>\\nRanjeetha Pakiam: by reporter&lt;\\/div>\\n&lt;div itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Person\\\">\\n  &lt;link itemprop=\\\"additionalType\\\" href=\\\"http:\\/\\/bloomberg.com\\/StoryFormat\\/ContactInfo\\\"\\/&gt;\\n  &lt;meta itemprop=\\\"url\\\" content=\\\"bbg:\\/\\/people\\/profile\\/17703435\\\"\\/>\\n  &lt;meta itemprop=\\\"email\\\" content=\\\"jrogers73@bloomberg.net\\\"\\/>\\n  &lt;meta itemprop=\\\"telephone\\\" content=\\\"+81-3-3201-8479\\\"\\/>\\n  &lt;span itemprop=\\\"workLocation\\\" itemscope=\\\"itemscope\\\" itemtype=\\\"http:\\/\\/schema.org\\/Place\\\">\\n    &lt;meta itemprop=\\\"name\\\" content=\\\"Tokyo\\\"\\/>\\n  &lt;\\/span>\\n  &lt;meta itemprop=\\\"uuid\\\" content=\\\"9247180\\\"\\/>\\n  &lt;meta itemprop=\\\"pepl\\\" content=\\\"17703435\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"editor\\\"\\/>\\n  &lt;meta itemprop=\\\"role\\\" content=\\\"responsible\\\"\\/>\\n  &lt;meta itemprop=\\\"name\\\" content=\\\"Jason Rogers\\\"\\/>\\nJason Rogers: editor responsible&lt;\\/div>\\n&lt;\\/section>\\n    &lt;section class=\\\"news-rsf-presentation\\\">&lt;span class=\\\"news-rsf-source-copy\\\">  &lt;\\/span>&lt;\\/section>\\n  &lt;\\/body>\\n&lt;\\/html>\\n\",\"type\":\"application\\/xhtml+xml-rsf\"},\"bviewBackfill\":false,\"primarySite\":\"bbiz\",\"storyUpdatedAt\":\"2016-07-18T15:57:36.119Z\",\"credits\":[{\"id\":18846837,\"name\":\"Joe Deaux\",\"roles\":\"assist\",\"uuid\":12680850},{\"id\":19202678,\"name\":\"Danielle Bochove\",\"roles\":\"assist\",\"uuid\":14411642},{\"id\":15016760,\"name\":\"Jake Lloyd-Smith\",\"roles\":\"editor\",\"uuid\":3939736},{\"id\":15931227,\"name\":\"Ranjeetha Pakiam\",\"roles\":[\"by\",\"reporter\"],\"uuid\":5373594},{\"id\":17703435,\"name\":\"Jason Rogers\",\"roles\":[\"editor\",\"responsible\"],\"uuid\":9247180}],\"terminalExclude\":false,\"storyEmbargoEndsAt\":\"2016-07-18T01:02:24.446Z\",\"embeds\":null,\"type\":\"article\",\"relatedStories\":null,\"id\":\"OAHJIZ6K50XU01\",\"publishedAt\":\"2016-07-18T12:18:33.942Z\",\"revision\":\"OAIFIW6JTSED\",\"storyPublishedAt\":\"2016-07-18T12:18:32.674Z\",\"byline\":\"Ranjeetha Pakiam\",\"quote\":null,\"attachments\":{\"id\":300282102,\"imageType\":\"chart\",\"type\":\"image\"},\"headlines\":{\"short\":\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\",\"story\":\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\",\"web\":\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500\",\"long\":\"Gold, Trump and Rates: Bank That Foresaw Rally Flags $1,500 (4)\"},\"metadata\":null,\"sites\":\"bbiz\",\"tags\":{\"niCodes\":[{\"id\":\"ALLTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"ANNOTATED\",\"score\":100,\"role\":\"public\"},{\"id\":\"ASBNX\",\"score\":100,\"role\":\"public\"},{\"id\":\"BIZNEWS\",\"score\":100,\"role\":\"public\"},{\"id\":\"BNALL\",\"score\":100,\"role\":\"public\"},{\"id\":\"BNCOPY\",\"score\":100,\"role\":\"public\"},{\"id\":\"BNCOPY2\",\"score\":100,\"role\":\"public\"},{\"id\":\"BNSTAFF\",\"score\":100,\"role\":\"public\"},{\"id\":\"BNTEAMS\",\"score\":100,\"role\":\"public\"},{\"id\":\"BUSINESS\",\"score\":100,\"role\":\"public\"},{\"id\":\"CATOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"CATOPZ2\",\"score\":100,\"role\":\"public\"},{\"id\":\"CATOPZ3\",\"score\":100,\"role\":\"public\"},{\"id\":\"CECO\",\"score\":100,\"role\":\"public\"},{\"id\":\"CEN\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMD\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDTOPZ1\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDX\",\"score\":100,\"role\":\"public\"},{\"id\":\"CNG\",\"score\":100,\"role\":\"public\"},{\"id\":\"DUPLICATE\",\"score\":100,\"role\":\"public\"},{\"id\":\"ECO\",\"score\":100,\"role\":\"public\"},{\"id\":\"ELECT\",\"score\":100,\"role\":\"public\"},{\"id\":\"EMTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"EMTOPZ3\",\"score\":100,\"role\":\"public\"},{\"id\":\"EMTOPZ4\",\"score\":100,\"role\":\"public\"},{\"id\":\"EUBNX\",\"score\":100,\"role\":\"public\"},{\"id\":\"EUCMDMKT\",\"score\":100,\"role\":\"public\"},{\"id\":\"EUROPEME\",\"score\":100,\"role\":\"public\"},{\"id\":\"EUROSTORY\",\"score\":100,\"role\":\"public\"},{\"id\":\"EXCLUSIVE\",\"score\":100,\"role\":\"public\"},{\"id\":\"FED\",\"score\":100,\"role\":\"public\"},{\"\r\n"
//            + "1ff0\r\n"
////            + "1B58\r\n"
//            + "id\":\"FINNEWS\",\"score\":100,\"role\":\"public\"},{\"id\":\"FIRST\",\"score\":100,\"role\":\"public\"},{\"id\":\"G7ECOS\",\"score\":100,\"role\":\"public\"},{\"id\":\"GOV\",\"score\":100,\"role\":\"public\"},{\"id\":\"GOVMISC\",\"score\":100,\"role\":\"public\"},{\"id\":\"HLDUPLICAT\",\"score\":100,\"role\":\"public\"},{\"id\":\"HLNOVELTY0\",\"score\":100,\"role\":\"public\"},{\"id\":\"INTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"INTOPZ7\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATAMCMD\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATTOPZ2\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATTOPZ3\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATTOPZ6\",\"score\":100,\"role\":\"public\"},{\"id\":\"LATTOPZ7\",\"score\":100,\"role\":\"public\"},{\"id\":\"LST\",\"score\":100,\"role\":\"public\"},{\"id\":\"MARKETS\",\"score\":100,\"role\":\"public\"},{\"id\":\"MATOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"MET\",\"score\":100,\"role\":\"public\"},{\"id\":\"METAMTEAM\",\"score\":100,\"role\":\"public\"},{\"id\":\"METASTEAM\",\"score\":100,\"role\":\"public\"},{\"id\":\"METEUTEAM\",\"score\":100,\"role\":\"public\"},{\"id\":\"METTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"METTOPZ1\",\"score\":100,\"role\":\"public\"},{\"id\":\"MSCINAMER\",\"score\":100,\"role\":\"public\"},{\"id\":\"MSCIWORLD\",\"score\":100,\"role\":\"public\"},{\"id\":\"NORTHAM\",\"score\":100,\"role\":\"public\"},{\"id\":\"NOVELTY0\",\"score\":100,\"role\":\"public\"},{\"id\":\"NYX\",\"score\":100,\"role\":\"public\"},{\"id\":\"ONWEB\",\"score\":100,\"role\":\"public\"},{\"id\":\"POL\",\"score\":100,\"role\":\"public\"},{\"id\":\"POLNEWS\",\"score\":100,\"role\":\"public\"},{\"id\":\"SASTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"SASTOPZ4\",\"score\":100,\"role\":\"public\"},{\"id\":\"SSX\",\"score\":100,\"role\":\"public\"},{\"id\":\"STD\",\"score\":100,\"role\":\"public\"},{\"id\":\"SWTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"SWTOPZ3\",\"score\":100,\"role\":\"public\"},{\"id\":\"SWTOPZ4\",\"score\":100,\"role\":\"public\"},{\"id\":\"TOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"TORX\",\"score\":100,\"role\":\"public\"},{\"id\":\"TYO\",\"score\":100,\"role\":\"public\"},{\"id\":\"UPDATE\",\"score\":100,\"role\":\"public\"},{\"id\":\"US\",\"score\":100,\"role\":\"public\"},{\"id\":\"USBNX\",\"score\":100,\"role\":\"public\"},{\"id\":\"USECO\",\"score\":100,\"role\":\"public\"},{\"id\":\"USGOV\",\"score\":100,\"role\":\"public\"},{\"id\":\"USSTORY\",\"score\":100,\"role\":\"public\"},{\"id\":\"USTOP\",\"score\":100,\"role\":\"public\"},{\"id\":\"USTOPZ3\",\"score\":100,\"role\":\"public\"},{\"id\":\"USTOPZ6\",\"score\":100,\"role\":\"public\"},{\"id\":\"WASHNEWS\",\"score\":100,\"role\":\"public\"},{\"id\":\"AGRKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"ATTACHMENT\",\"score\":100,\"role\":\"public\"},{\"id\":\"BASIC\",\"score\":100,\"role\":\"public\"},{\"id\":\"BB\",\"score\":100,\"role\":\"public\"},{\"id\":\"BBGTVCITE\",\"score\":100,\"role\":\"public\"},{\"id\":\"BBPROFILE\",\"score\":100,\"role\":\"public\"},{\"id\":\"BGOVBILLGO\",\"score\":100,\"role\":\"public\"},{\"id\":\"BGOVCODES\",\"score\":100,\"role\":\"public\"},{\"id\":\"WORLD\",\"score\":100,\"role\":\"public\"},{\"id\":\"WEPFEX1\",\"score\":100,\"role\":\"public\"},{\"id\":\"WEBELIG\",\"score\":100,\"role\":\"public\"},{\"id\":\"BONDWIRES\",\"score\":100,\"role\":\"public\"},{\"id\":\"TIMENI\",\"score\":100,\"role\":\"public\"},{\"id\":\"TIMECO\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDGLOMAC\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"CMDMARKET\",\"score\":100,\"role\":\"public\"},{\"id\":\"COS\",\"score\":100,\"role\":\"public\"},{\"id\":\"CREDITKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"DC\",\"score\":100,\"role\":\"public\"},{\"id\":\"DEBTKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"SRCRANK1\",\"score\":100,\"role\":\"public\"},{\"id\":\"EQUITYKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"SPREGIONS\",\"score\":100,\"role\":\"public\"},{\"id\":\"RATESKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"POLIRISK\",\"score\":100,\"role\":\"public\"},{\"id\":\"PHOTO\",\"score\":100,\"role\":\"public\"},{\"id\":\"PCS\",\"score\":100,\"role\":\"public\"},{\"id\":\"OILKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"FXKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"G10MEMB\",\"score\":100,\"role\":\"public\"},{\"id\":\"LEAST\",\"score\":100,\"role\":\"public\"},{\"id\":\"NRGKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"NONFERR\",\"score\":100,\"role\":\"public\"},{\"id\":\"MNG\",\"score\":100,\"role\":\"public\"},{\"id\":\"GEN\",\"score\":100,\"role\":\"public\"},{\"id\":\"MISC\",\"score\":100,\"role\":\"public\"},{\"id\":\"METMNG\",\"score\":100,\"role\":\"public\"},{\"id\":\"METALKEY\",\"score\":100,\"role\":\"public\"},{\"id\":\"GLOMACBB\",\"score\":100,\"role\":\"public\"},{\"id\":\"INDUSTRIES\",\"score\":100,\"role\":\"public\"},{\"id\":\"INTERNAL\",\"score\":100,\"role\":\"public\"},{\"id\":\"MAJOR\",\"score\":100,\"role\":\"public\"},{\"id\":\"G7MEMB\",\"score\":100,\"role\":\"public\"},{\"id\":\"BIOINSDM\",\"score\":98,\"role\":\"public\"},{\"id\":\"FIALL\",\"score\":98,\"role\":\"public\"},{\"id\":\"FIASST\",\"score\":98,\"role\":\"public\"},{\"id\":\"GLOBALMACR\",\"score\":97,\"role\":\"public\"},{\"id\":\"GDCIT\",\"score\":95,\"role\":\"public\"},{\"id\":\"GD\",\"score\":95,\"role\":\"public\"},{\"id\":\"KAITLIN\",\"score\":95,\"role\":\"public\"},{\"id\":\"METMARKET\",\"score\":93,\"role\":\"public\"},{\"id\":\"GLD\",\"score\":93,\"role\":\"public\"},{\"id\":\"GLDMARKET\",\"score\":93,\"role\":\"public\"},{\"id\":\"PCSMARKET\",\"score\":93,\"role\":\"public\"},{\"id\":\"BON\",\"score\":90,\"role\":\"public\"},{\"id\":\"CBRATES\",\"score\":80,\"role\":\"public\"},{\"id\":\"NIRP\",\"score\":80,\"role\":\"public\"},{\"id\":\"REPPARTY\",\"score\":78,\"role\":\"public\"},{\"id\":\"BRNEWS\",\"score\":70,\"role\":\"public\"},{\"id\":\"REGIONFILT\",\"score\":70,\"role\":\"public\"},{\"id\":\"FIN\",\"score\":69,\"role\":\"public\"},{\"id\":\"BNK\",\"score\":69,\"role\":\"public\"},{\"id\":\"EXE\",\"score\":50,\"role\":\"public\"},{\"id\":\"GBN\",\"score\":50,\"role\":\"public\"},{\"id\":\"MKTMISC\",\"score\":49,\"role\":\"public\"},{\"id\":\"VOL\",\"score\":49,\"role\":\"public\"},{\"id\":\"DEMPARTY\",\"score\":49,\"role\":\"public\"},{\"id\":\"FUTURES\",\"score\":38,\"role\":\"public\"},{\"id\":\"FINFUT\",\"score\":38,\"role\":\"public\"}],\"topics\":[{\"id\":\"canada\",\"name\":\"Canada\",\"score\":0.2514638906961614},{\"id\":\"brexit\",\"name\":\"Brexit\",\"score\":0.5198438516590761},{\"id\":\"federal-reserve\",\"name\":\"Federal Reserve\",\"score\":0.7202342225113858},{\"id\":\"singapore\",\"name\":\"Singapore\",\"score\":0.8721535458685752},{\"id\":\"bull-market\",\"name\":\"Bull Market\",\"score\":0.9938191281717632},{\"id\":\"interest-rates\",\"name\":\"Interest Rates\",\"score\":1.9925178919973976},{\"id\":\"gold\",\"name\":\"Gold\",\"score\":9.101821730644112}],\"tickers\":[{\"id\":\"BAC:US\",\"name\":\"Bank of America Corp\",\"score\":0.9567338972023421},{\"id\":\"DBS:SP\",\"name\":\"DBS Group Holdings Ltd\",\"score\":1.5247234873129474}],\"primary\":null,\"terminalPeople\":[{\"id\":1252249,\"score\":95,\"role\":\"public\"},{\"id\":15931227,\"score\":70,\"role\":\"public\"},{\"id\":15016760,\"score\":70,\"role\":\"public\"},{\"id\":15168345,\"score\":70,\"role\":\"public\"},{\"id\":15371896,\"score\":70,\"role\":\"public\"},{\"id\":1442508,\"score\":70,\"role\":\"public\"},{\"id\":17703435,\"score\":70,\"role\":\"public\"},{\"id\":18846837,\"score\":70,\"role\":\"public\"},{\"id\":19202678,\"score\":70,\"role\":\"public\"},{\"id\":6949917,\"score\":70,\"role\":\"public\"}],\"people\":[{\"id\":1442508,\"name\":\"Hillary Diane Rodham Clinton\",\"score\":0.3959011060507482},{\"id\":15849061,\"name\":\"Benjamin Wong\",\"score\":1.5832791151594012},{\"id\":1252249,\"name\":\"Donald John Trump\",\"score\":5.536465594695913}]},\"chinaExclude\":false,\"webOriginal\":false,\"primaryCategory\":\"industries\",\"wire\":{\"id\":25,\"mnemonic\":\"BN\",\"class\":88},\"wordCount\":500,\"languageId\":1,\"url\":\"http:\\/\\/staging.bloomberg.com\\/news\\/articles\\/2016-07-18\\/gold-s-in-major-bull-market-and-may-surpass-1-500-dbs-says\",\"updatedAt\":\"2016-07-18T15:57:40.076Z\",\"draft\":false,\"blpBackfillUncategorized\":false,\"terminalSlug\":\"gold dbs bullish\",\"groupPublishedAt\":\"2016-07-18T00:47:23.446Z\",\"blpBackfill\":false,\"slug\":\"2016-07-18\\/gold-s-in-major-bull-market-and-may-surpass-1-500-dbs-says\",\"categories\":[\"world\",\"industries\",\"markets\"],\"language\":\"ENGLISH\"}, transaction_id=urn:uuid:24eefde8-55ba-4c8f-a0df-0e786dfb1a61}</axis2ns35:current_params><axis2ns35:current_request_name>insertContentServiceArticle</axis2ns35:current_request_name><axis2ns35:nested_exception>com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Duplicate entry 'OAHJIZ6K50XU01-OAIFIW6JTSED-2016-07-18T15:57:36.119Z' for key 'IDX_CONTENT_SERVICE_ARTICLES_UNIQUE'</axis2ns35:nested_exception><axis2ns35:source_data_service><axis2ns35:location>/ArchiveManagementDataService.dbs</axis2ns35:location><axis2ns35:default_namespace>http://ws.wso2.org/dataservice</axis2ns35:default_namespace><axis2ns35:description>N/A</axis2ns35:description><axis2ns35:data_service_name>ArchiveManagementDataService</axis2ns35:data_service_name></axis2ns35:source_data_service><axis2ns35:ds_code>DATABASE_ERROR</axis2ns35:ds_code></axis2ns35:DataServiceFault>\r\n"
//            + "0\r\n"
//            + "\r\n";
//
//        public static final String PAYLOAD2 = ">\r\n0\r\n"
//                + "\r\n";
//
    public static String CLIENT_PAYLOAD = "POST /services/StockQuoteProxy HTTP/1.1\r\n"
            + "Accept-Encoding: gzip,deflate\r\n"
            + "Content-Type: text/xml; charset=UTF-8\r\n"
            + "SOAPAction: \"http://dex.suva.ch/oms/websvc/printreminder/printReminderDocRequest\"\r\n"
            + "Transfer-Encoding: chunked\r\n"
            + "Host: c501157.suvanet.ch:7001\r\n"
            + "Connection: Keep-Alive\r\n"
            + "User-Agent: Synapse-PT-HttpComponents-NIO\r\n"
            + "\r\n"
            + "175\r\n"
            + "<?xml version='1.0' encoding='UTF-8'?>\n"
            + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ejb3=\"http://ejb3.oms.dex.suva.ch\">\n"
            + "   <soapenv:Header/>\n"
            + "   <soapenv:Body>\n"
            + "      <ejb3:printReminderDocRequest>\n"
            + "         <JobId>test</JobId>\n"
            + "         <RemindId>test</RemindId>\n"
            + "      </ejb3:printReminderDocRequest>\n"
            + "   </soapenv:Body>\n"
            + "</soapenv:Envelope>\r\n"
            + "0\r\n"
            + "\r\n";
//
//    public static String CLIENT_PAYLOAD = "POST /services/endpointtest HTTP/1.1\r\n"
//            + "host: esb.amp.com.au\r\n"
//            + "Accept: application/vnd.siren+json\r\n"
//            + "Authorization: Basic dGFtdXNlcl9wcm9kOjJYT2hoMloxNVQ=\r\n"
//            + "Content-Type: application/json;\r\n"
//            + "Content-Length: 2\r\n"
//            + "Connection: keep-alive\r\n"
//            + "\r\n"
//            + "{}";

//    public static String CLIENT_PAYLOAD = "Envelope>";


    public static String PAYLOAD = "HTTP/1.1 200 OK\r\n"
            + "httpServer.Server: nginx\r\n"
            + "Content-Type: text/xml;charset=UTF-8\r\n"
            + "Transfer-Encoding: chunked\r\n"
            + "Connection: Keep-Alive\r\n"
            + "Cache-Control: no-cache\r\n"
            + "X-Frame-Options: SAMEORIGIN\r\n"
            + "Strict-Transport-Security: max-age=31536000;\r\n"
            + "\r\n"
            + "18c\r\n"
            + "<?xml version=\"1.0\" ?><soap:Envelope xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tns=\"http://www.example.com/\"><soap:Body><tns:receive.orderResponse><Result><Code>1000</Code><Description><![CDATA[OK]]></Description></Result></tns:receive.orderResponse></soap:Body></soap:Envelope>\r\n"
            + "0\r\n"
            + "\r\n";

//    public static String PAYLOAD = "HTTP/1.1 404 Not Found\r\n"
//            + "httpServer.Server: nginx\r\n"
////            + "Content-Type: text/xml;charset=UTF-8\r\n"
//            + "Connection: Keep-Alive\r\n"
//            + "Cache-Control: no-cache\r\n"
//            + "X-Frame-Options: SAMEORIGIN\r\n"
//            + "Strict-Transport-Security: max-age=31536000;\r\n"
//            + "Content-Length: 0\r\n"
//            + "\r\n";

//    public static String PAYLOAD = "HTTP/1.1 404 Not Found\r\n"
//            +"X-Frame-Options: DENY\r\n"
//            +"Strict-Transport-Security: max-age=31536000 ; includeSubDomains\r\n"
//            +"Content-Language: en-US\r\n"
//            +"X-XSS-Protection: 1; mode=block\r\n"
//            +"Expires: 0\r\n"
//            +"Set-Cookie: JSESSIONID=0000y-tsZOW84o7YXolpOuThrLa:-1; Path=/; HttpOnly\r\n"
//            +"X-Request-Id: 13232\r\n"
//            +"Content-Type: application/json\r\n"
//            +"X-Powered-By: Servlet/3.0\r\n"
//            +"X-Content-Type-Options: nosniff\r\n"
//            +"Pragma: no-cache\r\n"
//            +"Cache-Control: no-cache, no-store, max-age=0, must-revalidate\r\n"
//            +"Date: Wed, 07 Dec 2016 01:27:31 GMT\r\n"
//            +"Server: WSO2-PassThrough-HTTP\r\n"
////            +"Transfer-Encoding: chunked\r\n"
//            +"Content-Length: 0\r\n"
//            +"Connection: Keep-Alive\r\n"
//            +"\r\n";

//    public static String PAYLOAD = "HTTP/1.1 404 Not Found\r\n"
//            +"Cache-Control: no-cache, no-store, max-age=0, must-revalidate\r\n"
//            +"Content-Language: en-US\r\n"
//            +"Date: Wed, 07 Dec 2016 01:26:43 GMT\r\n"
//            +"Expires: 0\r\n"
//            +"Pragma: no-cache\r\n"
//            +"Set-Cookie: JSESSIONID=0000_bpRYy7T47iNDTkGZjyWqnM:-1; Path=/; HttpOnly\r\n"
//            +"Strict-Transport-Security: max-age=31536000 ; includeSubDomains\r\n"
//            +"X-Content-Type-Options: nosniff\r\n"
//            +"X-Frame-Options: DENY\r\n"
//            +"X-Powered-By: Servlet/3.0\r\n"
//            +"X-XSS-Protection: 1; mode=block\r\n"
//            +"Content-Length: 0\r\n"
//            +"Connection: keep-alive\r\n"
//            +"Content-Type: application/json\r\n"
//            +"\r\n";

//        public static String PAYLOAD = "HTTP/1.1 200 OK\r\n"
//                + "Date: Tue, 06 Dec 2016 15:29:38 GMT"
//                + "httpServer.Server: Apache\r\n"
//                + "X-Powered-By: Servlet 2.5; JBoss-5.0/JBossWeb-2.1\r\n"
//                + "Connection: keep-alive\r\n"
//                + "Content-Type: text/xml;charset=UTF-8\r\n"
//                + "\r\n"
//                + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
//                + "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
//                + "   <soap:Body>\n"
//                + "      <ns1:rateResponse xmlns:ns1=\"http://www.amfam.com/xsd/message/rateprocessingservice/v4\">\n"
//                + "         <rps:rating xmlns:rps=\"http://www.amfam.com/xsd/message/rateprocessingservice/v4\">\n"
//                + "            <rps:schemaVersion>4.0</rps:schemaVersion>\n" + "            <rps:rateProcess>\n"
//                + "               <rps:timestamp>2016-12-06T09:29:37.912</rps:timestamp>\n"
//                + "               <rps:processRule type=\"isSNOA\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"isNICompareCPGRequest\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"storeRating\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"lineCode\">01</rps:processRule>\n"
//                + "               <rps:processRule type=\"needsExternalReports\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"rpmApplies\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"requestForScoreReason\">RN</rps:processRule>\n"
//                + "               <rps:processRule type=\"state\">OH</rps:processRule>\n"
//                + "               <rps:processRule type=\"bestPremiumForCredit\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"CreditPrescreenNotApplicable\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"copyPriorCPGsToRES\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"creditNotAppliedForQuoteBindingStates\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"creditScoringEvent\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"validForNonRPM\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"needsPremiums\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"isPPA\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"isBPP\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"isCycle\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"isStateAvailableForCPGCapping\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"applyCPGCapping\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"rateProcessCode\">BILL</rps:processRule>\n"
//                + "               <rps:processRule type=\"isMRATE\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"useCredit\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"effectiveDate\">2017-01-09</rps:processRule>\n"
//                + "               <rps:processRule type=\"isFNOA\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"pollForExternalReports\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"bestCPGforPremium\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"riskId\">1</rps:processRule>\n"
//                + "               <rps:processRule type=\"rateProgram\">PPA</rps:processRule>\n"
//                + "               <rps:processRule type=\"ratingTimestamp\">2016-06-06T07:54:03.429</rps:processRule>\n"
//                + "               <rps:processRule type=\"typeCode\">01</rps:processRule>\n"
//                + "               <rps:processRule type=\"productStatusType\">POLICY</rps:processRule>\n"
//                + "               <rps:processRule type=\"creditBasedPremiumIncreaseDisclosureRule\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"doesQuoteBindingRuleApply\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"productId\">1604972911</rps:processRule>\n"
//                + "               <rps:processRule type=\"useOfPreviousCreditBasedOnConsent\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"isCamper\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"applyCPGCappingInd\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"isQuoteBoundState\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"credit1stAppliedDt\">2014-08-07</rps:processRule>\n"
//                + "               <rps:processRule type=\"useNeutralScoreForPreviousCBIS\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"needsPriorRating\">true</rps:processRule>\n"
//                + "               <rps:processRule type=\"useSelfAssessmentBasedScores\">false</rps:processRule>\n"
//                + "               <rps:processRule type=\"creditAAStandardCode\">X</rps:processRule>\n"
//                + "               <rps:processRule type=\"rateStrategy\">RPMAutoRateStrategy</rps:processRule>\n"
//                + "               <rps:processRule type=\"needsPriorCPG\">false</rps:processRule>\n"
//                + "               <rps:processParam type=\"prevCBIS\">664</rps:processParam>\n"
//                + "               <rps:processParam type=\"prevCBISScoreType\">V</rps:processParam>\n"
//                + "               <rps:processParam type=\"resCappingApplicable\">false</rps:processParam>\n"
//                + "               <rps:processParam type=\"useNonCreditScoreBestCpgFlag\">true</rps:processParam>\n"
//                + "            </rps:rateProcess>\n"
//                + "            <request xmlns=\"http://www.amfam.com/xsd/message/rateprocessingservice/v4\">\n"
//                + "               <schemaVersion>4.5</schemaVersion>\n"
//                + "               <requestId>e686ccb1-0397-4245-ab15-18508e246e11</requestId>\n"
//                + "               <systemId>AUTOPLUS</systemId>\n" + "               <riskId>1</riskId>\n"
//                + "               <userId>AUTOPLUS</userId>\n"
//                + "               <productStatusType>POLICY</productStatusType>\n"
//                + "               <rateProcessCode>BILL</rateProcessCode>\n"
//                + "               <useCredit>true</useCredit>\n"
//                + "               <credit1stAppliedDate>2014-08-07</credit1stAppliedDate>\n"
//                + "               <processDate>2016-12-05</processDate>\n"
//                + "               <processTime>00:00:00.000</processTime>\n"
//                + "               <eventType>ExistingProduct</eventType>\n"
//                + "               <ratingTimestamp>2016-06-06T07:54:03.429</ratingTimestamp>\n"
//                + "               <creditAAStandardCode>I</creditAAStandardCode>\n"
//                + "               <applyCPGCappingInd>true</applyCPGCappingInd>\n"
//                + "               <creditScoringEvent>true</creditScoringEvent>\n"
//                + "               <requestForScoreReason>RN</requestForScoreReason>\n" + "               <product>\n"
//                + "                  <productId>1604972911</productId>\n"
//                + "                  <lineCode>01</lineCode>\n" + "                  <typeCode>01</typeCode>\n"
//                + "                  <company>AFIC</company>\n" + "                  <state>OH</state>\n"
//                + "                  <effectiveDate>2017-01-09</effectiveDate>\n"
//                + "                  <accountNumber>16049729</accountNumber>\n"
//                + "                  <recordNumber>11</recordNumber>\n" + "                  <term>06</term>\n"
//                + "                  <entryDate>2016-12-05</entryDate>\n"
//                + "                  <rateTerritory>037</rateTerritory>\n" + "               </product>\n"
//                + "               <risk>\n" + "                  <vehicle>\n"
//                + "                     <priceGroupSymbol>23</priceGroupSymbol>\n"
//                + "                     <vin>KMHDN45D81U233457</vin>\n" + "                     <make>HYUN</make>\n"
//                + "                     <model>EST</model>\n" + "                     <year>2001</year>\n"
//                + "                     <grossWeight>000000</grossWeight>\n"
//                + "                     <useCode>W</useCode>\n"
//                + "                     <coverage categoryName=\"BodilyInjury\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERPRS\" type=\"Limit\">\n"
//                + "                           <amount>0100000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPEROCC\" type=\"Limit\">\n"
//                + "                           <amount>0300000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"PropDamage\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPEROCC\" type=\"Limit\">\n"
//                + "                           <amount>0100000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"Comprehensive\">\n"
//                + "                        <limitDeductibleBlanket code=\"DXDPEROCC\" type=\"Deductible\">\n"
//                + "                           <amount>0500</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"Collision\">\n"
//                + "                        <limitDeductibleBlanket code=\"DXDPEROCC\" type=\"Deductible\">\n"
//                + "                           <amount>0500</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"UM\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERPRS\" type=\"Limit\">\n"
//                + "                           <amount>0100000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPEROCC\" type=\"Limit\">\n"
//                + "                           <amount>0300000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"UIM\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERPRS\" type=\"Limit\">\n"
//                + "                           <amount>0100000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPEROCC\" type=\"Limit\">\n"
//                + "                           <amount>0300000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"RentalReimburse\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERDAY\" type=\"Limit\">\n"
//                + "                           <amount>30</amount>\n"
//                + "                        </limitDeductibleBlanket>\n"
//                + "                        <limitDeductibleBlanket code=\"LXDMAXIMUM\" type=\"Limit\">\n"
//                + "                           <amount>750</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"DeathAndDismember\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERPRS\" type=\"Limit\">\n"
//                + "                           <amount>0005000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"MedicalExpense\">\n"
//                + "                        <limitDeductibleBlanket code=\"LXDPERPRS\" type=\"Limit\">\n"
//                + "                           <amount>005000</amount>\n"
//                + "                        </limitDeductibleBlanket>\n" + "                     </coverage>\n"
//                + "                     <coverage categoryName=\"ERS\" />\n"
//                + "                     <rateAdjustment categoryName=\"MultiVehicle\" />\n"
//                + "                     <rateAdjustment categoryName=\"PassiveRestraint\" />\n"
//                + "                     <ratedDriver>\n" + "                        <p2cId>005309971</p2cId>\n"
//                + "                        <rateClass>C1B</rateClass>\n"
//                + "                        <rateCode>3005</rateCode>\n"
//                + "                        <principalOrOccasional>P</principalOrOccasional>\n"
//                + "                     </ratedDriver>\n" + "                     <drivingInformation>\n"
//                + "                        <personNumber>01</personNumber>\n"
//                + "                        <status>E</status>\n"
//                + "                        <incurDate>201308</incurDate>\n"
//                + "                        <violationType>ACC</violationType>\n"
//                + "                        <infoSourceCode>CM</infoSourceCode>\n"
//                + "                        <demeritPoints>04</demeritPoints>\n"
//                + "                        <totalClaimAmount>000000000</totalClaimAmount>\n"
//                + "                     </drivingInformation>\n" + "                     <drivingInformation>\n"
//                + "                        <personNumber>01</personNumber>\n"
//                + "                        <status>X</status>\n"
//                + "                        <incurDate>201308</incurDate>\n"
//                + "                        <convictionDate>1309</convictionDate>\n"
//                + "                        <violationType>FVC</violationType>\n"
//                + "                        <infoSourceCode>M</infoSourceCode>\n"
//                + "                        <demeritPoints>04</demeritPoints>\n"
//                + "                        <totalClaimAmount>000000000</totalClaimAmount>\n"
//                + "                     </drivingInformation>\n" + "                     <drivingInformation>\n"
//                + "                        <personNumber>02</personNumber>\n"
//                + "                        <status>X</status>\n"
//                + "                        <incurDate>201307</incurDate>\n"
//                + "                        <convictionDate>1309</convictionDate>\n"
//                + "                        <violationType>SPD</violationType>\n"
//                + "                        <infoSourceCode>M</infoSourceCode>\n"
//                + "                        <demeritPoints>02</demeritPoints>\n"
//                + "                        <totalClaimAmount>000000000</totalClaimAmount>\n"
//                + "                     </drivingInformation>\n" + "                  </vehicle>\n"
//                + "               </risk>\n" + "               <parties>\n" + "                  <agent>\n"
//                + "                     <agentCode>071</agentCode>\n"
//                + "                     <districtCode>206</districtCode>\n" + "                  </agent>\n"
//                + "                  <insuredPersons>\n"
//                + "                     <insuredPerson role=\"NAMEDINSURED\">\n"
//                + "                        <p2cId>005309970</p2cId>\n" + "                        <onicc>\n"
//                + "                           <date>2014-07-09</date>\n"
//                + "                           <reason>R</reason>\n" + "                        </onicc>\n"
//                + "                        <namedInsuredData>\n" + "                           <added>false</added>\n"
//                + "                           <prevRatedUnder19>false</prevRatedUnder19>\n"
//                + "                        </namedInsuredData>\n" + "                     </insuredPerson>\n"
//                + "                     <insuredPerson role=\"NAMEDINSURED\">\n"
//                + "                        <p2cId>005309971</p2cId>\n" + "                        <onicc>\n"
//                + "                           <date>2014-07-09</date>\n"
//                + "                           <reason>R</reason>\n" + "                        </onicc>\n"
//                + "                        <namedInsuredData>\n" + "                           <added>false</added>\n"
//                + "                           <prevRatedUnder19>false</prevRatedUnder19>\n"
//                + "                        </namedInsuredData>\n" + "                     </insuredPerson>\n"
//                + "                     <insuredPerson role=\"OPERATOR\">\n"
//                + "                        <p2cId>5309970</p2cId>\n" + "                        <gender>F</gender>\n"
//                + "                        <dateOfBirth>1977-05-21</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>000000000</socialSecurityNumber>\n"
//                + "                        <maritalStatus>M</maritalStatus>\n"
//                + "                        <occupation>UNKNOWN</occupation>\n"
//                + "                        <driversLicense>\n" + "                           <state>OH</state>\n"
//                + "                           <licNumber>RR364638</licNumber>\n"
//                + "                           <origLicDate>1993-05-01</origLicDate>\n"
//                + "                        </driversLicense>\n" + "                        <onicc>\n"
//                + "                           <date>2014-07-09</date>\n"
//                + "                           <reason>R</reason>\n" + "                        </onicc>\n"
//                + "                        <attribute type=\"PersonNumber\">01</attribute>\n"
//                + "                     </insuredPerson>\n" + "                     <insuredPerson role=\"OPERATOR\">\n"
//                + "                        <p2cId>5309971</p2cId>\n" + "                        <gender>M</gender>\n"
//                + "                        <dateOfBirth>1978-04-24</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>000000000</socialSecurityNumber>\n"
//                + "                        <maritalStatus>M</maritalStatus>\n"
//                + "                        <occupation>LAYBORER</occupation>\n"
//                + "                        <driversLicense>\n" + "                           <state>OH</state>\n"
//                + "                           <licNumber>RS494799</licNumber>\n"
//                + "                           <origLicDate>1994-04-01</origLicDate>\n"
//                + "                        </driversLicense>\n" + "                        <onicc>\n"
//                + "                           <date>2014-07-09</date>\n"
//                + "                           <reason>R</reason>\n" + "                        </onicc>\n"
//                + "                        <attribute type=\"PersonNumber\">02</attribute>\n"
//                + "                        <attribute type=\"PointRatedOnPolicy\">Y</attribute>\n"
//                + "                     </insuredPerson>\n" + "                     <insuredPerson role=\"OPERATOR\">\n"
//                + "                        <p2cId>5309972</p2cId>\n" + "                        <gender>F</gender>\n"
//                + "                        <dateOfBirth>1997-06-03</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>392473762</socialSecurityNumber>\n"
//                + "                        <maritalStatus>V</maritalStatus>\n"
//                + "                        <occupation>UNEMPLOYED</occupation>\n"
//                + "                        <driversLicense>\n" + "                           <state>OH</state>\n"
//                + "                           <licNumber>UD277845</licNumber>\n"
//                + "                           <origLicDate>2013-06-01</origLicDate>\n"
//                + "                        </driversLicense>\n" + "                        <onicc>\n"
//                + "                           <date>2014-07-09</date>\n"
//                + "                           <reason>R</reason>\n" + "                        </onicc>\n"
//                + "                        <attribute type=\"PersonNumber\">03</attribute>\n"
//                + "                     </insuredPerson>\n" + "                     <insuredPerson role=\"CHILD\">\n"
//                + "                        <p2cId>5309973</p2cId>\n" + "                        <gender>F</gender>\n"
//                + "                        <dateOfBirth>2003-10-16</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>000000000</socialSecurityNumber>\n"
//                + "                        <attribute type=\"PersonNumber\">04</attribute>\n"
//                + "                     </insuredPerson>\n" + "                     <insuredPerson role=\"CHILD\">\n"
//                + "                        <p2cId>65782211</p2cId>\n" + "                        <gender>F</gender>\n"
//                + "                        <dateOfBirth>2006-09-11</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>000000000</socialSecurityNumber>\n"
//                + "                        <maritalStatus>V</maritalStatus>\n"
//                + "                        <occupation>UNEMPLOYED</occupation>\n"
//                + "                        <attribute type=\"PersonNumber\">05</attribute>\n"
//                + "                     </insuredPerson>\n" + "                     <insuredPerson role=\"CHILD\">\n"
//                + "                        <p2cId>75648676</p2cId>\n" + "                        <gender>F</gender>\n"
//                + "                        <dateOfBirth>2009-06-29</dateOfBirth>\n"
//                + "                        <socialSecurityNumber>000000000</socialSecurityNumber>\n"
//                + "                        <maritalStatus>V</maritalStatus>\n"
//                + "                        <occupation>UNEMPLOYED</occupation>\n"
//                + "                        <attribute type=\"PersonNumber\">06</attribute>\n"
//                + "                     </insuredPerson>\n" + "                  </insuredPersons>\n"
//                + "               </parties>\n" + "            </request>\n" + "            <rps:aggregatedData>\n"
//                + "               <eras:reportSet xmlns:eras=\"http://www.amfam.com/xsd/message/extreportaggregationservice/v4\">\n"
//                + "                  <eras:requestor>\n"
//                + "                     <eras:requestId>e686ccb1-0397-4245-ab15-18508e246e11</eras:requestId>\n"
//                + "                     <eras:name>RPS</eras:name>\n"
//                + "                     <eras:userId>AUTOPLUS</eras:userId>\n"
//                + "                     <eras:orderSource>RS</eras:orderSource>\n"
//                + "                     <eras:clientBillingInd>P</eras:clientBillingInd>\n"
//                + "                  </eras:requestor>\n" + "                  <eras:process>\n"
//                + "                     <eras:code>RATEbyREFNUMWITHCURRENTDATECHECK</eras:code>\n"
//                + "                     <eras:priority>O</eras:priority>\n"
//                + "                     <eras:useCredit>true</eras:useCredit>\n"
//                + "                     <eras:credit1stAppliedDate>2014-08-07</eras:credit1stAppliedDate>\n"
//                + "                     <eras:rateProcessCode>BILL</eras:rateProcessCode>\n"
//                + "                     <eras:reasonCode>RN</eras:reasonCode>\n"
//                + "                     <eras:processDate>2016-12-05</eras:processDate>\n"
//                + "                     <eras:poll>false</eras:poll>\n"
//                + "                     <eras:pollMax>3000</eras:pollMax>\n"
//                + "                     <eras:ratingTimestamp>2016-06-06T07:54:03.429</eras:ratingTimestamp>\n"
//                + "                     <eras:creditScoringEvent>true</eras:creditScoringEvent>\n"
//                + "                     <eras:processParam type=\"currentCreditReportType\">CreditScore</eras:processParam>\n"
//                + "                  </eras:process>\n" + "                  <eras:product>\n"
//                + "                     <eras:productStatusType>POLICY</eras:productStatusType>\n"
//                + "                     <eras:effectiveDate>2017-01-09</eras:effectiveDate>\n"
//                + "                     <eras:agentCode>071</eras:agentCode>\n"
//                + "                     <eras:districtCode>206</eras:districtCode>\n"
//                + "                     <eras:company>AFIC</eras:company>\n"
//                + "                     <eras:lineCode>01</eras:lineCode>\n"
//                + "                     <eras:typeCode>01</eras:typeCode>\n"
//                + "                     <eras:state>OH</eras:state>\n"
//                + "                     <eras:accountNumber>16049729</eras:accountNumber>\n"
//                + "                     <eras:recordNumber>11</eras:recordNumber>\n"
//                + "                  </eras:product>\n" + "                  <eras:persons>\n"
//                + "                     <eras:person role=\"NAMEDINSURED\">\n"
//                + "                        <eras:p2cId>005309970</eras:p2cId>\n"
//                + "                        <eras:firstName>Jessika</eras:firstName>\n"
//                + "                        <eras:lastName>Taylor</eras:lastName>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>1977-05-21</eras:dateOfBirth>\n"
//                + "                        <eras:lastCreditReferenceNum>20140708092640048843</eras:lastCreditReferenceNum>\n"
//                + "                        <eras:driversLicense>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:licNumber>RR364638</eras:licNumber>\n"
//                + "                        </eras:driversLicense>\n"
//                + "                        <eras:namedInsuredData>\n"
//                + "                           <eras:added>false</eras:added>\n"
//                + "                           <eras:prevRatedUnder19>false</eras:prevRatedUnder19>\n"
//                + "                        </eras:namedInsuredData>\n"
//                + "                        <eras:address type=\"MAILING\">\n"
//                + "                           <eras:address1>7701 Hartman Rd</eras:address1>\n"
//                + "                           <eras:city>Ripley</eras:city>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:zip>45167</eras:zip>\n"
//                + "                           <eras:zipPlus4>9733</eras:zipPlus4>\n"
//                + "                           <eras:countryCode>224</eras:countryCode>\n"
//                + "                        </eras:address>\n" + "                     </eras:person>\n"
//                + "                     <eras:person role=\"NAMEDINSURED\">\n"
//                + "                        <eras:p2cId>005309971</eras:p2cId>\n"
//                + "                        <eras:firstName>Charles</eras:firstName>\n"
//                + "                        <eras:lastName>Taylor</eras:lastName>\n"
//                + "                        <eras:middleInitial>R</eras:middleInitial>\n"
//                + "                        <eras:gender>M</eras:gender>\n"
//                + "                        <eras:dateOfBirth>1978-04-24</eras:dateOfBirth>\n"
//                + "                        <eras:lastCreditReferenceNum>20140708092640074586</eras:lastCreditReferenceNum>\n"
//                + "                        <eras:driversLicense>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:licNumber>RS494799</eras:licNumber>\n"
//                + "                        </eras:driversLicense>\n"
//                + "                        <eras:namedInsuredData>\n"
//                + "                           <eras:added>false</eras:added>\n"
//                + "                           <eras:prevRatedUnder19>false</eras:prevRatedUnder19>\n"
//                + "                        </eras:namedInsuredData>\n"
//                + "                        <eras:address type=\"MAILING\">\n"
//                + "                           <eras:address1>7701 Hartman Rd</eras:address1>\n"
//                + "                           <eras:city>Ripley</eras:city>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:zip>45167</eras:zip>\n"
//                + "                           <eras:zipPlus4>9733</eras:zipPlus4>\n"
//                + "                           <eras:countryCode>224</eras:countryCode>\n"
//                + "                        </eras:address>\n" + "                     </eras:person>\n"
//                + "                     <eras:person role=\"OPERATOR\">\n"
//                + "                        <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>1977-05-21</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                        <eras:driversLicense>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:licNumber>RR364638</eras:licNumber>\n"
//                + "                           <eras:origLicDate>1993-05-01</eras:origLicDate>\n"
//                + "                        </eras:driversLicense>\n" + "                     </eras:person>\n"
//                + "                     <eras:person role=\"OPERATOR\">\n"
//                + "                        <eras:p2cId>5309971</eras:p2cId>\n"
//                + "                        <eras:gender>M</eras:gender>\n"
//                + "                        <eras:dateOfBirth>1978-04-24</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                        <eras:driversLicense>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:licNumber>RS494799</eras:licNumber>\n"
//                + "                           <eras:origLicDate>1994-04-01</eras:origLicDate>\n"
//                + "                        </eras:driversLicense>\n" + "                     </eras:person>\n"
//                + "                     <eras:person role=\"OPERATOR\">\n"
//                + "                        <eras:p2cId>5309972</eras:p2cId>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>1997-06-03</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>392473762</eras:socialSecurityNumber>\n"
//                + "                        <eras:driversLicense>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:licNumber>UD277845</eras:licNumber>\n"
//                + "                           <eras:origLicDate>2013-06-01</eras:origLicDate>\n"
//                + "                        </eras:driversLicense>\n" + "                     </eras:person>\n"
//                + "                     <eras:person role=\"CHILD\">\n"
//                + "                        <eras:p2cId>5309973</eras:p2cId>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>2003-10-16</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                     </eras:person>\n" + "                     <eras:person role=\"CHILD\">\n"
//                + "                        <eras:p2cId>65782211</eras:p2cId>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>2006-09-11</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                     </eras:person>\n" + "                     <eras:person role=\"CHILD\">\n"
//                + "                        <eras:p2cId>75648676</eras:p2cId>\n"
//                + "                        <eras:gender>F</eras:gender>\n"
//                + "                        <eras:dateOfBirth>2009-06-29</eras:dateOfBirth>\n"
//                + "                        <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                     </eras:person>\n" + "                  </eras:persons>\n"
//                + "                  <eras:reports>\n" + "                     <eras:report type=\"CREDIT\">\n"
//                + "                        <eras:withinRenewalPrescreenDateRange>true</eras:withinRenewalPrescreenDateRange>\n"
//                + "                        <eras:requestStatus>\n"
//                + "                           <eras:returnCode>0024</eras:returnCode>\n"
//                + "                           <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                           <eras:exceptionInformation>No exception.</eras:exceptionInformation>\n"
//                + "                        </eras:requestStatus>\n" + "                        <eras:bestScore>\n"
//                + "                           <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                           <eras:score>664</eras:score>\n"
//                + "                           <eras:referenceNum>20140708092640048843</eras:referenceNum>\n"
//                + "                           <eras:scoreType>V</eras:scoreType>\n"
//                + "                           <eras:reasonCodes>\n"
//                + "                              <eras:reasonCode>088</eras:reasonCode>\n"
//                + "                              <eras:reasonCode>063</eras:reasonCode>\n"
//                + "                              <eras:reasonCode>062</eras:reasonCode>\n"
//                + "                              <eras:reasonCode>052</eras:reasonCode>\n"
//                + "                           </eras:reasonCodes>\n" + "                        </eras:bestScore>\n"
//                + "                        <eras:reportDetails>\n" + "                           <eras:reportDetail>\n"
//                + "                              <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                              <eras:reportDate>2014-07-08</eras:reportDate>\n"
//                + "                              <eras:reportName>TAYLOR, JESSIKA R</eras:reportName>\n"
//                + "                              <eras:referenceNum>20140708092640048843</eras:referenceNum>\n"
//                + "                              <eras:score>664</eras:score>\n"
//                + "                              <eras:scoreType>V</eras:scoreType>\n"
//                + "                              <eras:reportStatus>R</eras:reportStatus>\n"
//                + "                              <eras:reportStatusInd>P</eras:reportStatusInd>\n"
//                + "                              <eras:requestStatus>\n"
//                + "                                 <eras:returnCode>0024</eras:returnCode>\n"
//                + "                                 <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                              </eras:requestStatus>\n"
//                + "                           </eras:reportDetail>\n"
//                + "                           <eras:reportDetail>\n"
//                + "                              <eras:p2cId>5309971</eras:p2cId>\n"
//                + "                              <eras:reportDate>2014-07-08</eras:reportDate>\n"
//                + "                              <eras:reportName>TAYLOR, CHARLES R</eras:reportName>\n"
//                + "                              <eras:referenceNum>20140708092640074586</eras:referenceNum>\n"
//                + "                              <eras:score>648</eras:score>\n"
//                + "                              <eras:scoreType>V</eras:scoreType>\n"
//                + "                              <eras:reportStatus>R</eras:reportStatus>\n"
//                + "                              <eras:reportStatusInd>P</eras:reportStatusInd>\n"
//                + "                              <eras:requestStatus>\n"
//                + "                                 <eras:returnCode>0024</eras:returnCode>\n"
//                + "                                 <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                              </eras:requestStatus>\n"
//                + "                           </eras:reportDetail>\n"
//                + "                        </eras:reportDetails>\n" + "                     </eras:report>\n"
//                + "                  </eras:reports>\n" + "               </eras:reportSet>\n"
//                + "               <rps:priorRating>\n" + "                  <rps:aggregateData>\n"
//                + "                     <eras:reportSet xmlns:eras=\"http://www.amfam.com/xsd/message/extreportaggregationservice/v4\">\n"
//                + "                        <eras:requestor>\n"
//                + "                           <eras:requestId>9ae01919-2181-4eb0-85c4-580e3fa192da</eras:requestId>\n"
//                + "                           <eras:name>RPS</eras:name>\n"
//                + "                           <eras:userId>AUTOPLUS</eras:userId>\n"
//                + "                           <eras:orderSource>RS</eras:orderSource>\n"
//                + "                           <eras:clientBillingInd>P</eras:clientBillingInd>\n"
//                + "                        </eras:requestor>\n" + "                        <eras:process>\n"
//                + "                           <eras:code>RATEbyREFNUMWITHCURRENTDATECHECK</eras:code>\n"
//                + "                           <eras:priority>O</eras:priority>\n"
//                + "                           <eras:useCredit>true</eras:useCredit>\n"
//                + "                           <eras:credit1stAppliedDate>2014-08-07</eras:credit1stAppliedDate>\n"
//                + "                           <eras:rateProcessCode>BILL</eras:rateProcessCode>\n"
//                + "                           <eras:reasonCode>RN</eras:reasonCode>\n"
//                + "                           <eras:processDate>2016-06-03</eras:processDate>\n"
//                + "                           <eras:poll>false</eras:poll>\n"
//                + "                           <eras:pollMax>3000</eras:pollMax>\n"
//                + "                           <eras:ratingTimestamp>2015-12-07T09:15:47.381</eras:ratingTimestamp>\n"
//                + "                           <eras:creditScoringEvent>true</eras:creditScoringEvent>\n"
//                + "                           <eras:processParam type=\"currentCreditReportType\">CreditScore</eras:processParam>\n"
//                + "                        </eras:process>\n" + "                        <eras:product>\n"
//                + "                           <eras:productStatusType>POLICY</eras:productStatusType>\n"
//                + "                           <eras:effectiveDate>2016-07-09</eras:effectiveDate>\n"
//                + "                           <eras:agentCode>071</eras:agentCode>\n"
//                + "                           <eras:districtCode>206</eras:districtCode>\n"
//                + "                           <eras:company>AFIC</eras:company>\n"
//                + "                           <eras:lineCode>01</eras:lineCode>\n"
//                + "                           <eras:typeCode>01</eras:typeCode>\n"
//                + "                           <eras:state>OH</eras:state>\n"
//                + "                           <eras:accountNumber>16049729</eras:accountNumber>\n"
//                + "                           <eras:recordNumber>11</eras:recordNumber>\n"
//                + "                        </eras:product>\n" + "                        <eras:persons>\n"
//                + "                           <eras:person role=\"NAMEDINSURED\">\n"
//                + "                              <eras:p2cId>005309970</eras:p2cId>\n"
//                + "                              <eras:firstName>Jessika</eras:firstName>\n"
//                + "                              <eras:lastName>Taylor</eras:lastName>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>1977-05-21</eras:dateOfBirth>\n"
//                + "                              <eras:lastCreditReferenceNum>20140708092640048843</eras:lastCreditReferenceNum>\n"
//                + "                              <eras:driversLicense>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:licNumber>RR364638</eras:licNumber>\n"
//                + "                              </eras:driversLicense>\n"
//                + "                              <eras:namedInsuredData>\n"
//                + "                                 <eras:added>false</eras:added>\n"
//                + "                                 <eras:prevRatedUnder19>false</eras:prevRatedUnder19>\n"
//                + "                              </eras:namedInsuredData>\n"
//                + "                              <eras:address type=\"MAILING\">\n"
//                + "                                 <eras:address1>7701 Hartman Rd</eras:address1>\n"
//                + "                                 <eras:city>Ripley</eras:city>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:zip>45167</eras:zip>\n"
//                + "                                 <eras:zipPlus4>9733</eras:zipPlus4>\n"
//                + "                                 <eras:countryCode>224</eras:countryCode>\n"
//                + "                              </eras:address>\n" + "                           </eras:person>\n"
//                + "                           <eras:person role=\"NAMEDINSURED\">\n"
//                + "                              <eras:p2cId>005309971</eras:p2cId>\n"
//                + "                              <eras:firstName>Charles</eras:firstName>\n"
//                + "                              <eras:lastName>Taylor</eras:lastName>\n"
//                + "                              <eras:middleInitial>R</eras:middleInitial>\n"
//                + "                              <eras:gender>M</eras:gender>\n"
//                + "                              <eras:dateOfBirth>1978-04-24</eras:dateOfBirth>\n"
//                + "                              <eras:lastCreditReferenceNum>20140708092640074586</eras:lastCreditReferenceNum>\n"
//                + "                              <eras:driversLicense>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:licNumber>RS494799</eras:licNumber>\n"
//                + "                              </eras:driversLicense>\n"
//                + "                              <eras:namedInsuredData>\n"
//                + "                                 <eras:added>false</eras:added>\n"
//                + "                                 <eras:prevRatedUnder19>false</eras:prevRatedUnder19>\n"
//                + "                              </eras:namedInsuredData>\n"
//                + "                              <eras:address type=\"MAILING\">\n"
//                + "                                 <eras:address1>7701 Hartman Rd</eras:address1>\n"
//                + "                                 <eras:city>Ripley</eras:city>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:zip>45167</eras:zip>\n"
//                + "                                 <eras:zipPlus4>9733</eras:zipPlus4>\n"
//                + "                                 <eras:countryCode>224</eras:countryCode>\n"
//                + "                              </eras:address>\n" + "                           </eras:person>\n"
//                + "                           <eras:person role=\"OPERATOR\">\n"
//                + "                              <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>1977-05-21</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                              <eras:driversLicense>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:licNumber>RR364638</eras:licNumber>\n"
//                + "                                 <eras:origLicDate>1993-05-01</eras:origLicDate>\n"
//                + "                              </eras:driversLicense>\n"
//                + "                           </eras:person>\n"
//                + "                           <eras:person role=\"OPERATOR\">\n"
//                + "                              <eras:p2cId>5309971</eras:p2cId>\n"
//                + "                              <eras:gender>M</eras:gender>\n"
//                + "                              <eras:dateOfBirth>1978-04-24</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                              <eras:driversLicense>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:licNumber>RS494799</eras:licNumber>\n"
//                + "                                 <eras:origLicDate>1994-04-01</eras:origLicDate>\n"
//                + "                              </eras:driversLicense>\n"
//                + "                           </eras:person>\n"
//                + "                           <eras:person role=\"OPERATOR\">\n"
//                + "                              <eras:p2cId>5309972</eras:p2cId>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>1997-06-03</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>392473762</eras:socialSecurityNumber>\n"
//                + "                              <eras:driversLicense>\n"
//                + "                                 <eras:state>OH</eras:state>\n"
//                + "                                 <eras:licNumber>UD277845</eras:licNumber>\n"
//                + "                                 <eras:origLicDate>2013-06-01</eras:origLicDate>\n"
//                + "                              </eras:driversLicense>\n"
//                + "                           </eras:person>\n"
//                + "                           <eras:person role=\"CHILD\">\n"
//                + "                              <eras:p2cId>5309973</eras:p2cId>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>2003-10-16</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                           </eras:person>\n"
//                + "                           <eras:person role=\"CHILD\">\n"
//                + "                              <eras:p2cId>65782211</eras:p2cId>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>2006-09-11</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                           </eras:person>\n"
//                + "                           <eras:person role=\"CHILD\">\n"
//                + "                              <eras:p2cId>75648676</eras:p2cId>\n"
//                + "                              <eras:gender>F</eras:gender>\n"
//                + "                              <eras:dateOfBirth>2009-06-29</eras:dateOfBirth>\n"
//                + "                              <eras:socialSecurityNumber>000000000</eras:socialSecurityNumber>\n"
//                + "                           </eras:person>\n" + "                        </eras:persons>\n"
//                + "                        <eras:reports>\n"
//                + "                           <eras:report type=\"CREDIT\">\n"
//                + "                              <eras:withinRenewalPrescreenDateRange>true</eras:withinRenewalPrescreenDateRange>\n"
//                + "                              <eras:requestStatus>\n"
//                + "                                 <eras:returnCode>0024</eras:returnCode>\n"
//                + "                                 <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                                 <eras:exceptionInformation>No exception.</eras:exceptionInformation>\n"
//                + "                              </eras:requestStatus>\n"
//                + "                              <eras:bestScore>\n"
//                + "                                 <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                                 <eras:score>664</eras:score>\n"
//                + "                                 <eras:referenceNum>20140708092640048843</eras:referenceNum>\n"
//                + "                                 <eras:scoreType>V</eras:scoreType>\n"
//                + "                                 <eras:reasonCodes>\n"
//                + "                                    <eras:reasonCode>088</eras:reasonCode>\n"
//                + "                                    <eras:reasonCode>063</eras:reasonCode>\n"
//                + "                                    <eras:reasonCode>062</eras:reasonCode>\n"
//                + "                                    <eras:reasonCode>052</eras:reasonCode>\n"
//                + "                                 </eras:reasonCodes>\n"
//                + "                              </eras:bestScore>\n"
//                + "                              <eras:reportDetails>\n"
//                + "                                 <eras:reportDetail>\n"
//                + "                                    <eras:p2cId>5309970</eras:p2cId>\n"
//                + "                                    <eras:reportDate>2014-07-08</eras:reportDate>\n"
//                + "                                    <eras:reportName>TAYLOR, JESSIKA R</eras:reportName>\n"
//                + "                                    <eras:referenceNum>20140708092640048843</eras:referenceNum>\n"
//                + "                                    <eras:score>664</eras:score>\n"
//                + "                                    <eras:scoreType>V</eras:scoreType>\n"
//                + "                                    <eras:reportStatus>R</eras:reportStatus>\n"
//                + "                                    <eras:reportStatusInd>P</eras:reportStatusInd>\n"
//                + "                                    <eras:requestStatus>\n"
//                + "                                       <eras:returnCode>0024</eras:returnCode>\n"
//                + "                                       <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                                    </eras:requestStatus>\n"
//                + "                                 </eras:reportDetail>\n"
//                + "                                 <eras:reportDetail>\n"
//                + "                                    <eras:p2cId>5309971</eras:p2cId>\n"
//                + "                                    <eras:reportDate>2014-07-08</eras:reportDate>\n"
//                + "                                    <eras:reportName>TAYLOR, CHARLES R</eras:reportName>\n"
//                + "                                    <eras:referenceNum>20140708092640074586</eras:referenceNum>\n"
//                + "                                    <eras:score>648</eras:score>\n"
//                + "                                    <eras:scoreType>V</eras:scoreType>\n"
//                + "                                    <eras:reportStatus>R</eras:reportStatus>\n"
//                + "                                    <eras:reportStatusInd>P</eras:reportStatusInd>\n"
//                + "                                    <eras:requestStatus>\n"
//                + "                                       <eras:returnCode>0024</eras:returnCode>\n"
//                + "                                       <eras:returnMessage>Report(s) found</eras:returnMessage>\n"
//                + "                                    </eras:requestStatus>\n"
//                + "                                 </eras:reportDetail>\n"
//                + "                              </eras:reportDetails>\n"
//                + "                           </eras:report>\n" + "                        </eras:reports>\n"
//                + "                     </eras:reportSet>\n" + "                  </rps:aggregateData>\n"
//                + "                  <rps:response>\n"
//                + "                     <rps:requestId>9ae01919-2181-4eb0-85c4-580e3fa192da</rps:requestId>\n"
//                + "                     <rps:productId>1604972911</rps:productId>\n"
//                + "                     <rps:riskId>1</rps:riskId>\n"
//                + "                     <rps:timestamp>2016-06-06T07:54:03.429</rps:timestamp>\n"
//                + "                     <rps:priceGroups>\n"
//                + "                        <rps:priceGroup type=\"Comprehensive\">\n"
//                + "                           <rps:group>38</rps:group>\n"
//                + "                           <rps:factor>1.18</rps:factor>\n"
//                + "                           <rps:score>425</rps:score>\n"
//                + "                        </rps:priceGroup>\n"
//                + "                        <rps:priceGroup type=\"BodilyInjuryPropDamage\">\n"
//                + "                           <rps:group>38</rps:group>\n"
//                + "                           <rps:factor>1.14</rps:factor>\n"
//                + "                           <rps:score>425</rps:score>\n"
//                + "                        </rps:priceGroup>\n"
//                + "                        <rps:priceGroup type=\"MedicalExpense\">\n"
//                + "                           <rps:group>38</rps:group>\n"
//                + "                           <rps:factor>1.22</rps:factor>\n"
//                + "                           <rps:score>425</rps:score>\n"
//                + "                        </rps:priceGroup>\n"
//                + "                        <rps:priceGroup type=\"Collision\">\n"
//                + "                           <rps:group>38</rps:group>\n"
//                + "                           <rps:factor>1.14</rps:factor>\n"
//                + "                           <rps:score>425</rps:score>\n"
//                + "                        </rps:priceGroup>\n"
//                + "                        <rps:appliedPriceGroup>Current</rps:appliedPriceGroup>\n"
//                + "                     </rps:priceGroups>\n" + "                  </rps:response>\n"
//                + "               </rps:priorRating>\n" + "            </rps:aggregatedData>\n"
//                + "            <rps:response>\n" + "               <rps:schemaVersion>4.6</rps:schemaVersion>\n"
//                + "               <rps:requestId>e686ccb1-0397-4245-ab15-18508e246e11</rps:requestId>\n"
//                + "               <rps:productId>1604972911</rps:productId>\n"
//                + "               <rps:riskId>1</rps:riskId>\n"
//                + "               <rps:timestamp>2016-12-06T09:29:37.912</rps:timestamp>\n"
//                + "               <rps:longevityYears>2</rps:longevityYears>\n"
//                + "               <rps:ngccDate>2014-07-09</rps:ngccDate>\n"
//                + "               <rps:rateSetEffDate>2016-05-01</rps:rateSetEffDate>\n"
//                + "               <rps:iso type=\"BodilyInjuryPropDamage\">\n"
//                + "                  <rps:symbol>310</rps:symbol>\n"
//                + "                  <rps:factor>1.02</rps:factor>\n" + "               </rps:iso>\n"
//                + "               <rps:iso type=\"MedicalExpense\">\n"
//                + "                  <rps:symbol>565</rps:symbol>\n"
//                + "                  <rps:factor>1.28</rps:factor>\n" + "               </rps:iso>\n"
//                + "               <rps:premiums>\n" + "                  <rps:premiumGroup type=\"Base\">\n"
//                + "                     <rps:premium type=\"TotalCoverage\">532.6</rps:premium>\n"
//                + "                     <rps:premium type=\"BodilyInjuryPropDamage\">244.5</rps:premium>\n"
//                + "                     <rps:premium type=\"Comprehensive\">53.8</rps:premium>\n"
//                + "                     <rps:premium type=\"Collision\">137</rps:premium>\n"
//                + "                     <rps:premium type=\"UM\">23</rps:premium>\n"
//                + "                     <rps:premium type=\"UIM\">6.1</rps:premium>\n"
//                + "                     <rps:premium type=\"MedicalExpense\">41.4</rps:premium>\n"
//                + "                     <rps:premium type=\"ERS\">7.5</rps:premium>\n"
//                + "                     <rps:premium type=\"DeathAndDismember\">1.3</rps:premium>\n"
//                + "                     <rps:premium type=\"RentalReimburse\">18</rps:premium>\n"
//                + "                  </rps:premiumGroup>\n" + "               </rps:premiums>\n"
//                + "               <rps:savings>\n"
//                + "                  <rps:amount type=\"TotalAirBag\">12.4</rps:amount>\n"
//                + "                  <rps:amount type=\"TotalMultiVehicle\">64.8</rps:amount>\n"
//                + "               </rps:savings>\n" + "               <rps:priceGroups>\n"
//                + "                  <rps:priceGroup type=\"Comprehensive\">\n"
//                + "                     <rps:group>38</rps:group>\n"
//                + "                     <rps:factor>1.18</rps:factor>\n"
//                + "                     <rps:score>425</rps:score>\n" + "                  </rps:priceGroup>\n"
//                + "                  <rps:priceGroup type=\"BodilyInjuryPropDamage\">\n"
//                + "                     <rps:group>38</rps:group>\n"
//                + "                     <rps:factor>1.14</rps:factor>\n"
//                + "                     <rps:score>425</rps:score>\n" + "                  </rps:priceGroup>\n"
//                + "                  <rps:priceGroup type=\"MedicalExpense\">\n"
//                + "                     <rps:group>38</rps:group>\n"
//                + "                     <rps:factor>1.22</rps:factor>\n"
//                + "                     <rps:score>425</rps:score>\n" + "                  </rps:priceGroup>\n"
//                + "                  <rps:priceGroup type=\"Collision\">\n"
//                + "                     <rps:group>38</rps:group>\n"
//                + "                     <rps:factor>1.14</rps:factor>\n"
//                + "                     <rps:score>425</rps:score>\n" + "                  </rps:priceGroup>\n"
//                + "                  <rps:appliedPriceGroup>Current</rps:appliedPriceGroup>\n"
//                + "               </rps:priceGroups>\n" + "               <rps:ratingInfo type=\"Evaluated\">\n"
//                + "                  <rps:ratingOptions>\n"
//                + "                     <rps:priceGroup priceGroupUsed=\"Previous\" />\n"
//                + "                  </rps:ratingOptions>\n" + "                  <rps:priceGroups>\n"
//                + "                     <rps:priceGroup type=\"Comprehensive\">\n"
//                + "                        <rps:group>38</rps:group>\n"
//                + "                        <rps:factor>1.18</rps:factor>\n" + "                     </rps:priceGroup>\n"
//                + "                     <rps:priceGroup type=\"BodilyInjuryPropDamage\">\n"
//                + "                        <rps:group>38</rps:group>\n"
//                + "                        <rps:factor>1.14</rps:factor>\n" + "                     </rps:priceGroup>\n"
//                + "                     <rps:priceGroup type=\"Collision\">\n"
//                + "                        <rps:group>38</rps:group>\n"
//                + "                        <rps:factor>1.14</rps:factor>\n" + "                     </rps:priceGroup>\n"
//                + "                     <rps:priceGroup type=\"MedicalExpense\">\n"
//                + "                        <rps:group>38</rps:group>\n"
//                + "                        <rps:factor>1.22</rps:factor>\n" + "                     </rps:priceGroup>\n"
//                + "                  </rps:priceGroups>\n" + "               </rps:ratingInfo>\n"
//                + "               <rps:pricingModel>RPM</rps:pricingModel>\n" + "               <rps:credit>\n"
//                + "                  <rps:creditCRNApplies>N</rps:creditCRNApplies>\n"
//                + "                  <rps:sendCreditCRN>N</rps:sendCreditCRN>\n" + "               </rps:credit>\n"
//                + "               <rps:mvraclAAInd>Y</rps:mvraclAAInd>\n"
//                + "               <rps:ratingParms type=\"Base\">\n"
//                + "                  <rps:parameter type=\"CPG_USED\">Current</rps:parameter>\n"
//                + "               </rps:ratingParms>\n" + "            </rps:response>\n" + "         </rps:rating>\n"
//                + "      </ns1:rateResponse>\n" + "   </soap:Body>\n" + "</soap:Envelope>";

}
