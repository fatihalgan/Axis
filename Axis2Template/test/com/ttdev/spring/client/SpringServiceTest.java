
/**
 * SpringServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.spring.client;

/*
 *  SpringServiceTest Junit test case
 */

public class SpringServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {

		com.ttdev.spring.client.SpringServiceStub stub = new com.ttdev.spring.client.SpringServiceStub();// the
																											// default
																											// implementation
																											// should
																											// point
																											// to
																											// the
																											// right
																											// endpoint

		com.ttdev.spring.Concat concat15 = (com.ttdev.spring.Concat) getTestObject(com.ttdev.spring.Concat.class);
		// TODO : Fill in the concat15 here
		concat15.setS1("xyz");
		concat15.setS2("123");
		String result = stub.concat(getS1(concat15), getS2(concat15)); 
		assertEquals("xyz123", result);

	}

	/**
	 * Auto generated test method
	 */
	public void testStartconcat() throws java.lang.Exception {
		com.ttdev.spring.client.SpringServiceStub stub = new com.ttdev.spring.client.SpringServiceStub();
		com.ttdev.spring.Concat concat15 = (com.ttdev.spring.Concat) getTestObject(com.ttdev.spring.Concat.class);
		// TODO : Fill in the concat15 here

		stub.startconcat(getS1(concat15), getS2(concat15),
				new tempCallbackN1000C());

	}

	private class tempCallbackN1000C extends
			com.ttdev.spring.client.SpringServiceCallbackHandler {
		public tempCallbackN1000C() {
			super(null);
		}

		public void receiveResultconcat(java.lang.String result) {

		}

		public void receiveErrorconcat(java.lang.Exception e) {
			fail();
		}

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	private java.lang.String getS1(com.ttdev.spring.Concat wrappedType) {

		return wrappedType.getS1();

	}

	private java.lang.String getS2(com.ttdev.spring.Concat wrappedType) {

		return wrappedType.getS2();

	}

}
