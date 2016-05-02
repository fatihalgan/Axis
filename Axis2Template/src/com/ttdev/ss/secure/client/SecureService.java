

/**
 * SecureService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.ttdev.ss.secure.client;

    /*
     *  SecureService java interface
     */

    public interface SecureService {
          

        /**
          * Auto generated method signature
          * 
                    * @param concatRequest1
                
         */

         
                     public java.lang.String concat(

                        java.lang.String s12,java.lang.String s23)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param concatRequest1
            
          */
        public void startconcat(

            java.lang.String s12,java.lang.String s23,

            final com.ttdev.ss.secure.client.SecureServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    