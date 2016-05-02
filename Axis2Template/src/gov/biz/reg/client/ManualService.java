

/**
 * ManualService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

    package gov.biz.reg.client;

    /*
     *  ManualService java interface
     */

    public interface ManualService {
          

        /**
          * Auto generated method signature
          * 
                    * @param register0
                
         */

         
                     public gov.biz.reg.RegisterResponse register(

                        gov.biz.reg.Register register0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param register0
            
          */
        public void startregister(

            gov.biz.reg.Register register0,

            final gov.biz.reg.client.ManualServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    