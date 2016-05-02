package examples.faulthandling.client;

import examples.faulthandling.AccountNotExistFault;
import examples.faulthandling.InsufficientFundFault;
import examples.faulthandling.Withdraw;
import examples.faulthandling.WithdrawResponse;
import junit.framework.TestCase;

public class FaultHandlingTest extends TestCase {
	
	private String account = "13";
	private Integer withdrawalAmount = 1500;
	
	public void testAccountNotExistFault() throws Exception {
		FaultHandlingStub stub = new FaultHandlingStub("http://localhost:8000/Axis2Samples/services/FaultHandling");
		Withdraw withdrawRequest = new Withdraw();
		withdrawRequest.setAccount(account);
		withdrawRequest.setAmount(withdrawalAmount);
		try {
			WithdrawResponse resp = stub.withdraw(withdrawRequest);
		} catch(AccountNotExistFaultMessage e)  {
			final AccountNotExistFault fault = e.getFaultMessage();
            System.out.println("Account#" + fault.getAccount() + " does not exist");
            return;
		} catch(InsufficientFundFaultMessage e) {
			InsufficientFundFault fault = e.getFaultMessage();
            System.out.println("Account#" + fault.getAccount() + " has balance of " + fault.getBalance() + ". It cannot support withdrawal of " + fault.getRequestedFund());
		}
		fail("Should have caught an exception");
	}
}
