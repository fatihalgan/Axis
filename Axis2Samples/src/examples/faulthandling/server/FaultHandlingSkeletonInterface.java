
/**
 * FaultHandlingSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
    package examples.faulthandling.server;
    /**
     *  FaultHandlingSkeletonInterface java skeleton interface for the axisService
     */
    public interface FaultHandlingSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param withdraw
             * @throws AccountNotExistFaultMessage : 
             * @throws InsufficientFundFaultMessage : 
         */

        
                public examples.faulthandling.WithdrawResponse withdraw
                (
                  examples.faulthandling.Withdraw withdraw
                 )
            throws AccountNotExistFaultMessage,InsufficientFundFaultMessage;
        
         }
    