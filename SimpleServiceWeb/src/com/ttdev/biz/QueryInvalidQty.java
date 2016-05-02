
/**
 * QueryInvalidQty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.ttdev.biz;

public class QueryInvalidQty extends java.lang.Exception{
    
    private com.ttdev.biz.purchasing.InvalidQty faultMessage;
    
    public QueryInvalidQty() {
        super("QueryInvalidQty");
    }
           
    public QueryInvalidQty(java.lang.String s) {
       super(s);
    }
    
    public QueryInvalidQty(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(com.ttdev.biz.purchasing.InvalidQty msg){
       faultMessage = msg;
    }
    
    public com.ttdev.biz.purchasing.InvalidQty getFaultMessage(){
       return faultMessage;
    }
}
    