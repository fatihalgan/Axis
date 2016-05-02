package example4;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.utils.Options;

public class Client {

	public static void main(String[] args) {
		try {
			Options options = new Options(args);
			String endpointURL = "http://localhost:8080/Example3/services/LogTestService";
			
			Service service = new Service();
			Call call = (Call)service.createCall();
			call.setTargetEndpointAddress(new URL(endpointURL));
			call.setOperationName(new QName("LogTestService", "testMethod"));
			String res = (String)call.invoke(new Object[] {});
			System.out.println(res);
		} catch(Exception e) {
			System.err.println(e.toString());
		}
	}
}
