
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


public class MyHandler implements HttpHandler {
	connection s=new connection();	
	
	
	  public void handle(HttpExchange t) throws IOException {
          String response = s.getresponse();
          
          t.sendResponseHeaders(200, response.length());
          OutputStream os = t.getResponseBody();
          os.write(response.getBytes());
          os.close();
      }
	
	
	
}
