
/**
 * QueryInvalidQty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.foo.server;

public class QueryInvalidQty extends java.lang.Exception{
    
    private bar.org.InvalidQty faultMessage;
    
    public QueryInvalidQty() {
        super("QueryInvalidQty");
    }
           
    public QueryInvalidQty(java.lang.String s) {
       super(s);
    }
    
    public QueryInvalidQty(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(bar.org.InvalidQty msg){
       faultMessage = msg;
    }
    
    public bar.org.InvalidQty getFaultMessage(){
       return faultMessage;
    }
}
    