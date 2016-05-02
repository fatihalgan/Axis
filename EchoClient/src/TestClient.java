import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;


public class TestClient {

	public static void main(String[] args) {
		try {
			String endpoint = "http://ws.apache.org:5049/axis/services/echo";
			Service service = new Service();
			Call call = (Call)service.createCall();
			call.setTargetEndpointAddress(new URL(endpoint));
			call.setOperationName(new QName("http://soapinterop.org/", "echoString"));
			String ret = (String)call.invoke(new Object[] {"Hello"});
			System.out.println("Sent Hello, " + "Got: " + ret);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
