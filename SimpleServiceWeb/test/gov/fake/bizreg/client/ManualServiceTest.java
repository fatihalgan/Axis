
/**
 * ManualServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package gov.fake.bizreg.client;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

/*
 *  ManualServiceTest Junit test case
 */

public class ManualServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testStartregister() throws java.lang.Exception {
		gov.fake.bizreg.client.ManualServiceStub stub = new gov.fake.bizreg.client.ManualServiceStub();
		gov.fake.bizreg.client.ManualServiceStub.Register register4 = (gov.fake.bizreg.client.ManualServiceStub.Register) getTestObject(gov.fake.bizreg.client.ManualServiceStub.Register.class);
		// TODO : Fill in the register4 here
		ServiceClient serviceClient = stub._getServiceClient();
		serviceClient.engageModule("addressing");
		Options options = serviceClient.getOptions();
		options.setUseSeparateListener(true);
		register4.setBizName("Foo Ltd.");
		register4.setOwnerId("Kent");
		stub.startregister(register4, new tempCallbackN1000C(serviceClient));
		System.out.println("Request Sent");
		try {
			Thread.sleep(15000);
		} catch(InterruptedException e) {}
	}

	private class tempCallbackN1000C extends gov.fake.bizreg.client.ManualServiceCallbackHandler {
		
		private ServiceClient serviceClient;
		
		public tempCallbackN1000C(ServiceClient serviceClient) {
			super(null);
			this.serviceClient = serviceClient;
		}

		public void receiveResultregister(gov.fake.bizreg.client.ManualServiceStub.RegisterResponse result) {
			System.out.println("Got Result: " + result.getApproved());
			finished();
		}

		public void receiveErrorregister(java.lang.Exception e) {
			System.out.println("Got Error From Server:" + e.getMessage());
			fail();
			finished();
		}
		
		private void finished() {
			try {
				serviceClient.cleanup();
			} catch(AxisFault e) {
				throw new RuntimeException(e);
			} finally {
				System.exit(0);
			}
		}

	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
