package samples.encoding;

import java.util.Iterator;
import java.util.Vector;

import org.apache.axis.Constants;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.DeserializerFactory;

public class DataDeserFactory implements DeserializerFactory {

	private Vector mechanisms;
	
	public Deserializer getDeserializerAs(String mechanismType) {
		return new DataDeser();
	}
	
	public Iterator getSupportedMechanismTypes() {
		if (mechanisms == null) {
            mechanisms = new Vector();
            mechanisms.add(Constants.AXIS_SAX);
        }
        return mechanisms.iterator();
	}
}
