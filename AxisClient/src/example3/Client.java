package example3;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.utils.Options;

public class Client {

	public static void main(String[] args) {
		try {
			Options options = new Options(args);
			String endpointURL = "http://localhost:8080/Example3/services/MyService";
			String textToSend;
			
			args = options.getRemainingArgs();
			if ((args == null) || (args.length < 1)) {
                textToSend = "<nothing>";
            } else {
                textToSend = args[0];
            }
			
			Service service = new Service();
			Call call = (Call)service.createCall();
			call.setTargetEndpointAddress(new URL(endpointURL));
			call.setOperationName(new QName("http://example3.userguide.samples", "serviceMethod"));
			call.addParameter("arg1", XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_STRING);
			String ret = (String) call.invoke( new Object[] { textToSend } );
            System.out.println("You typed : " + ret);
		} catch(Exception e) {
			System.err.println(e.toString());
		}
	}
}
