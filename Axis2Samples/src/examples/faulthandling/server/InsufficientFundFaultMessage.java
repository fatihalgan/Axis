
/**
 * InsufficientFundFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package examples.faulthandling.server;

public class InsufficientFundFaultMessage extends java.lang.Exception{
    
    private examples.faulthandling.InsufficientFundFault faultMessage;
    
    public InsufficientFundFaultMessage() {
        super("InsufficientFundFaultMessage");
    }
           
    public InsufficientFundFaultMessage(java.lang.String s) {
       super(s);
    }
    
    public InsufficientFundFaultMessage(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(examples.faulthandling.InsufficientFundFault msg){
       faultMessage = msg;
    }
    
    public examples.faulthandling.InsufficientFundFault getFaultMessage(){
       return faultMessage;
    }
}
    