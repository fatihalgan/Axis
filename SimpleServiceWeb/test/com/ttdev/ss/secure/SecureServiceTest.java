
/**
 * SecureServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ss.secure;


import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.description.PolicyInclude;
import org.apache.neethi.PolicyEngine;
import org.apache.neethi.Policy;
import com.ttdev.ss.ConcatResponse;

/*
 *  SecureServiceTest Junit test case
 */

public class SecureServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testconcat() throws java.lang.Exception {

		com.ttdev.ss.secure.SecureServiceStub stub = new com.ttdev.ss.secure.SecureServiceStub("http://localhost:1234/axis2/services/SecureService");// the
																									// default
																									// implementation
																									// should
																									// point
																									// to
																									// the
																									// right
																									// endpoint

		com.ttdev.ss.secure.SecureServiceStub.ConcatRequest concatRequest4 = (com.ttdev.ss.secure.SecureServiceStub.ConcatRequest) getTestObject(com.ttdev.ss.secure.SecureServiceStub.ConcatRequest.class);
		// TODO : Fill in the concatRequest4 here
		concatRequest4.setS1("xyz");
		concatRequest4.setS2("111");
		ServiceClient serviceClient = stub._getServiceClient();
		serviceClient.engageModule("rampart");
		StAXOMBuilder builder = new StAXOMBuilder("rampart-config.xml");
		OMElement configElement = builder.getDocumentElement();
		Policy rampartConfig = PolicyEngine.getPolicy(configElement);
		stub._getServiceClient().getAxisService().getPolicyInclude().
			addPolicyElement(PolicyInclude.SERVICE_POLICY, rampartConfig);
		com.ttdev.ss.secure.SecureServiceStub.ConcatResponse resp = stub.concat(concatRequest4);
		assertNotNull(resp.getConcatResponse());
		System.out.println("Response is: " + resp.getConcatResponse());
	}

	/**
	 * Auto generated test method
	 */
	public void testStartconcat() throws java.lang.Exception {
		com.ttdev.ss.secure.SecureServiceStub stub = new com.ttdev.ss.secure.SecureServiceStub();
		com.ttdev.ss.secure.SecureServiceStub.ConcatRequest concatRequest4 = (com.ttdev.ss.secure.SecureServiceStub.ConcatRequest) getTestObject(com.ttdev.ss.secure.SecureServiceStub.ConcatRequest.class);
		// TODO : Fill in the concatRequest4 here

		stub.startconcat(concatRequest4, new tempCallbackN1000C());

	}

	private class tempCallbackN1000C extends
			com.ttdev.ss.secure.SecureServiceCallbackHandler {
		public tempCallbackN1000C() {
			super(null);
		}

		public void receiveResultconcat(
				com.ttdev.ss.secure.SecureServiceStub.ConcatResponse result) {

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
