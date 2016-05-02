

/**
 * FaultHandling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package examples.faulthandling.client;

    /*
     *  FaultHandling java interface
     */

    public interface FaultHandling {
          

        /**
          * Auto generated method signature
          * 
                    * @param withdraw0
                
             * @throws examples.faulthandling.client.AccountNotExistFaultMessage : 
             * @throws examples.faulthandling.client.InsufficientFundFaultMessage : 
         */

         
                     public examples.faulthandling.WithdrawResponse withdraw(

                        examples.faulthandling.Withdraw withdraw0)
                        throws java.rmi.RemoteException
             
          ,examples.faulthandling.client.AccountNotExistFaultMessage
          ,examples.faulthandling.client.InsufficientFundFaultMessage;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param withdraw0
            
          */
        public void startwithdraw(

            examples.faulthandling.Withdraw withdraw0,

            final examples.faulthandling.client.FaultHandlingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    