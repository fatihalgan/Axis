
/**
 * BizServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
    package com.foo.server;
    /**
     *  BizServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface BizServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                        * @param queryItem
             * @throws QueryInvalidQty : 
             * @throws QueryInvalidProductId : 
         */

        
                public bar.org.ResultItemType[] query
                (
                  bar.org.QueryItemType[] queryItem
                 )
            throws QueryInvalidQty,QueryInvalidProductId;
        
         }
    