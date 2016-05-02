
/**
 * QueryInvalidProductId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.foo.client;

public class QueryInvalidProductId extends java.lang.Exception{
    
    private bar.org.InvalidProductId faultMessage;
    
    public QueryInvalidProductId() {
        super("QueryInvalidProductId");
    }
           
    public QueryInvalidProductId(java.lang.String s) {
       super(s);
    }
    
    public QueryInvalidProductId(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(bar.org.InvalidProductId msg){
       faultMessage = msg;
    }
    
    public bar.org.InvalidProductId getFaultMessage(){
       return faultMessage;
    }
}
    