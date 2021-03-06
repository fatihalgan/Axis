package samples.encoding;

import java.io.IOException;

import javax.xml.namespace.QName;

import org.apache.axis.Constants;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;

public class DataSer implements Serializer {

	public static final String STRINGMEMBER = "stringMember";
    public static final String FLOATMEMBER = "floatMember";
    public static final String DATAMEMBER = "dataMember";
    public static final QName myTypeQName = new QName("typeNS", "Data");

	@Override
	public void serialize(QName name, Attributes attributes, Object value,
			SerializationContext context) throws IOException {
		if(!(value instanceof Data))
			throw new IOException("Can't serialize a " + value.getClass().getName() + " with a DataSerializer");
		Data data = (Data)value;
		context.startElement(name, attributes);
		context.serialize(new QName("", STRINGMEMBER), null, data.stringMember);
		context.serialize(new QName("", FLOATMEMBER), null, data.floatMember);
		context.serialize(new QName("", DATAMEMBER), null, data.dataMember);
		context.endElement();
	}

	@Override
	public Element writeSchema(Class arg0, Types arg1) throws Exception {
		return null;
	}

	@Override
	public String getMechanismType() {
		return Constants.AXIS_SAX;
	}

}
