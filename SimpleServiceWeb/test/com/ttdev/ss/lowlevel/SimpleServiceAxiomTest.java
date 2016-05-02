package com.ttdev.ss.lowlevel;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

import junit.framework.TestCase;

public class SimpleServiceAxiomTest extends TestCase {
	
	public void testConcat() throws Exception {
		ServiceClient client = new ServiceClient();
		Options options = new Options();
		options.setTo(new EndpointReference("http://localhost:8000/SimpleServiceWeb/services/SimpleService"));
		client.setOptions(options);
		OMElement request = makeRequest();
		OMElement response = client.sendReceive(request);
		System.out.println(response.toString());
	}
	
	private OMElement makeRequest() {
		OMFactory factory = OMAbstractFactory.getOMFactory();
		OMElement request = factory.createOMElement(new QName("http://ttdev.com/ss", "concatRequest"));
		OMElement s1 = factory.createOMElement(new QName("s1"));
		s1.setText("abc");
		OMElement s2 = factory.createOMElement(new QName("s2"));
		s2.setText("def");
		request.addChild(s1);
		request.addChild(s2);
		return request;
	}
}
