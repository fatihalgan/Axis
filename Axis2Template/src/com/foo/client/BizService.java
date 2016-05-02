

/**
 * BizService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.foo.client;

    /*
     *  BizService java interface
     */

    public interface BizService {
          

        /**
          * Auto generated method signature
          * 
                    * @param productQuery
                
             * @throws com.foo.client.QueryInvalidQty : 
             * @throws com.foo.client.QueryInvalidProductId : 
         */

         
                     public bar.org.ResultItemType[] query(

                        bar.org.QueryItemType[] queryItem)
                        throws java.rmi.RemoteException
             
          ,com.foo.client.QueryInvalidQty
          ,com.foo.client.QueryInvalidProductId;

        

        
       //
       }
    