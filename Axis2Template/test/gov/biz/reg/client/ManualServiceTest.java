

/**
 * ManualServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
    package gov.biz.reg.client;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

    /*
     *  ManualServiceTest Junit test case
    */

    public class ManualServiceTest extends junit.framework.TestCase{

     
         /**
         * Auto generated test method
         */
        public  void testStartregister() throws java.lang.Exception{
            gov.biz.reg.client.ManualServiceStub stub = new gov.biz.reg.client.ManualServiceStub();
            gov.biz.reg.Register register6 = (gov.biz.reg.Register)getTestObject(gov.biz.reg.Register.class);
            //Fill in the register6 here
            ServiceClient serviceClient = stub._getServiceClient();
            serviceClient.engageModule("addressing");
            Options options = serviceClient.getOptions();
    		options.setUseSeparateListener(true);
    		register6.setBizName("Foo Ltd.");
    		register6.setOwnerId("Kent");
            stub.startregister(register6, new tempCallbackN65548(serviceClient));
            System.out.println("Request Sent");
            try {
            	Thread.sleep(15000);
            } catch(InterruptedException e) {
            	System.exit(0);
            }
        }

        private class tempCallbackN65548  extends gov.biz.reg.client.ManualServiceCallbackHandler {
            
        	private ServiceClient serviceClient;
        	
        	public tempCallbackN65548(ServiceClient serviceClient){ 
        		super(null);
        		this.serviceClient = serviceClient;
        	}

            public void receiveResultregister(gov.biz.reg.RegisterResponse result) {
            	System.out.println("Got Result: " + result.getApproved());
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

            public void receiveErrorregister(java.lang.Exception e) {
                System.out.println("Got Error from server: " + e.getMessage());
            	fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    