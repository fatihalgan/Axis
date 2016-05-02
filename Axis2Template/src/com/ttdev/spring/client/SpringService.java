

/**
 * SpringService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.ttdev.spring.client;

    /*
     *  SpringService java interface
     */

    public interface SpringService {
          

        /**
          * Auto generated method signature
          * 
                    * @param concat0
                
         */

         
                     public java.lang.String concat(

                        java.lang.String s11,java.lang.String s22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param concat0
            
          */
        public void startconcat(

            java.lang.String s11,java.lang.String s22,

            final com.ttdev.spring.client.SpringServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    