
/**
 * WrappedServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ws.client;

/*
 *  WrappedServiceTest Junit test case
 */

public class WrappedServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {

		com.ttdev.ws.client.WrappedServiceStub stub = new com.ttdev.ws.client.WrappedServiceStub();// the
																									// default
																									// implementation
																									// should
																									// point
																									// to
																									// the
																									// right
																									// endpoint

		com.ttdev.ws.Concat concat10 = (com.ttdev.ws.Concat) getTestObject(com.ttdev.ws.Concat.class);
		// TODO : Fill in the concat10 here
		concat10.setS1("abc");
		concat10.setS2("123");
		assertEquals(stub.concat(getS1(concat10), getS2(concat10)), "abc123");
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	private java.lang.String getS1(com.ttdev.ws.Concat wrappedType) {

		return wrappedType.getS1();

	}

	private java.lang.String getS2(com.ttdev.ws.Concat wrappedType) {

		return wrappedType.getS2();

	}

}
