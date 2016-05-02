
/**
 * SimpleServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ss.client;

/*
 *  SimpleServiceTest Junit test case
 */

public class SimpleServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {

		com.ttdev.ss.client.SimpleServiceStub stub = new com.ttdev.ss.client.SimpleServiceStub();// the
																									// default
																									// implementation
																									// should
																									// point
																									// to
																									// the
																									// right
																									// endpoint

		com.ttdev.ss.ConcatRequest concatRequest11 = (com.ttdev.ss.ConcatRequest) getTestObject(com.ttdev.ss.ConcatRequest.class);
		// TODO : Fill in the concatRequest11 here
		concatRequest11.setS1("abc");
		concatRequest11.setS2("123");
		String result = stub.concat(getS1(concatRequest11), getS2(concatRequest11)); 
		assertEquals("abc123", result);

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
