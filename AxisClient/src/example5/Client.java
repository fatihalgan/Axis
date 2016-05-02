package example5;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

public class Client {

	public static void main(String[] args) throws Exception {
		Order order = new Order();
		order.setCustomerName("Glen Daniels");
        order.setShippingAddress("275 Grove Street, Newton, MA");
        String [] items = new String[] { "mp3jukebox", "1600mahBattery" };
        int [] quantities = new int [] { 1, 4 };
        order.setItemCodes(items);
        order.setQuantities(quantities);
        
        Service service = new Service();
        Call call = (Call)service.createCall();
        QName qn = new QName( "urn:BeanService", "Order" );
        call.registerTypeMapping(Order.class, qn, new BeanSerializerFactory(Order.class, qn), new BeanDeserializerFactory(Order.class, qn));
        String result;
        try {
        	call.setTargetEndpointAddress(new java.net.URL("http://localhost:8080/Example3/services/OrderProcessor"));
            call.setOperationName(new QName("OrderProcessor", "processOrder"));
            call.addParameter("arg1", qn, ParameterMode.IN);
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
            result = (String) call.invoke( new Object[] { order } );
        } catch(AxisFault fault) {
        	result = "Error : " + fault.toString();
        }
        System.out.println(result);
	}
}
