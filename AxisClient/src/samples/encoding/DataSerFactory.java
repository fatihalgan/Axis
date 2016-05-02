package samples.encoding;

import java.util.Iterator;
import java.util.Vector;

import javax.xml.rpc.encoding.Serializer;

import org.apache.axis.Constants;
import org.apache.axis.encoding.SerializerFactory;

public class DataSerFactory implements SerializerFactory {
	
	private Vector mechanisms;
	
	public Serializer getSerializerAs(String mechanismType) {
		return new DataSer();
	}
	
	public Iterator getSupportedMechanismTypes() {
		if(mechanisms == null) {
			mechanisms = new Vector();
			mechanisms.add(Constants.AXIS_SAX);
		}
		return mechanisms.iterator();
	}
}
