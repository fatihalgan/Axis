
/**
 * SimpleServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ss;

/*
 *  SimpleServiceTest Junit test case
 */

public class SimpleServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {

		com.ttdev.ss.SimpleServiceStub stub = new com.ttdev.ss.SimpleServiceStub();// the
																					// default
																					// implementation
																					// should
																					// point
																					// to
																					// the
																					// right
																					// endpoint

		com.ttdev.ss.SimpleServiceStub.ConcatRequest concatRequest4 = (com.ttdev.ss.SimpleServiceStub.ConcatRequest) getTestObject(com.ttdev.ss.SimpleServiceStub.ConcatRequest.class);
		concatRequest4.setS1("Hello ");
		concatRequest4.setS2("World");
		com.ttdev.ss.SimpleServiceStub.ConcatResponse response = stub.concat(concatRequest4);
		assertEquals(response.getConcatResponse(), "Hello World");
	}

	/**
	 * Auto generated test method
	 */
	public void testStartconcat() throws java.lang.Exception {
		com.ttdev.ss.SimpleServiceStub stub = new com.ttdev.ss.SimpleServiceStub();
		com.ttdev.ss.SimpleServiceStub.ConcatRequest concatRequest4 = (com.ttdev.ss.SimpleServiceStub.ConcatRequest) getTestObject(com.ttdev.ss.SimpleServiceStub.ConcatRequest.class);
		// TODO : Fill in the concatRequest4 here
		concatRequest4.setS1("Hello ");
		concatRequest4.setS2("World");
		stub.startconcat(concatRequest4, new tempCallbackN65548());

	}

	private class tempCallbackN65548 extends
			com.ttdev.ss.SimpleServiceCallbackHandler {
		public tempCallbackN65548() {
			super(null);
		}

		public void receiveResultconcat(
				com.ttdev.ss.SimpleServiceStub.ConcatResponse result) {

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

}
