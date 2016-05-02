
/**
 * SecureServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ss.secure.client;

import java.io.InputStream;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;

/*
 *  SecureServiceTest Junit test case
 */

public class SecureServiceTest extends junit.framework.TestCase {

	public static String CLIENT_REPOSITORY_PATH = "D:/EclipseWorkspaces/Axis/Axis2Template/WebContent/WEB-INF";
	public static String AXIS_CONFIG_PATH = "D:/EclipseWorkspaces/Axis/Axis2Template/WebContent/WEB-INF/conf/axis2.xml";

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {
		ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(CLIENT_REPOSITORY_PATH, AXIS_CONFIG_PATH);
		com.ttdev.ss.secure.client.SecureServiceStub stub = new com.ttdev.ss.secure.client.SecureServiceStub(ctx, "http://localhost:1234/Axis2Template/services/SecureService");
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("rampart-config.xml");
		StAXOMBuilder builder = new StAXOMBuilder(in);
		OMElement configElement = builder.getDocumentElement();
		Policy rampartConfig = PolicyEngine.getPolicy(configElement);
		stub._getServiceClient().getAxisService().getPolicySubject().attachPolicy(rampartConfig);
		com.ttdev.ss.ConcatRequest concatRequest16 = (com.ttdev.ss.ConcatRequest) getTestObject(com.ttdev.ss.ConcatRequest.class);
		concatRequest16.setS1("xyz");
		concatRequest16.setS2("111");
		String result = stub.concat(getS1(concatRequest16), getS2(concatRequest16)); 
		assertEquals(result, "xyz111");
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	private java.lang.String getS1(com.ttdev.ss.ConcatRequest wrappedType) {

		return wrappedType.getS1();

	}

	private java.lang.String getS2(com.ttdev.ss.ConcatRequest wrappedType) {

		return wrappedType.getS2();

	}

}
