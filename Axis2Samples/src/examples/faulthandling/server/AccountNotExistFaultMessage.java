
/**
 * AccountNotExistFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package examples.faulthandling.server;

public class AccountNotExistFaultMessage extends java.lang.Exception{
    
    private examples.faulthandling.AccountNotExistFault faultMessage;
    
    public AccountNotExistFaultMessage() {
        super("AccountNotExistFaultMessage");
    }
           
    public AccountNotExistFaultMessage(java.lang.String s) {
       super(s);
    }
    
    public AccountNotExistFaultMessage(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(examples.faulthandling.AccountNotExistFault msg){
       faultMessage = msg;
    }
    
    public examples.faulthandling.AccountNotExistFault getFaultMessage(){
       return faultMessage;
    }
}
    