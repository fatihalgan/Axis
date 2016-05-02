package examples.faulthandling.server;

import examples.faulthandling.AccountNotExistFault;
import examples.faulthandling.InsufficientFundFault;
import examples.faulthandling.Withdraw;
import examples.faulthandling.WithdrawResponse;

public class FaultHandlingImpl implements FaultHandlingSkeletonInterface {

	@Override
	public WithdrawResponse withdraw(Withdraw withdraw)
			throws AccountNotExistFaultMessage, InsufficientFundFaultMessage {
		final String account = withdraw.getAccount();
        if (account.equals("13")) {
            final AccountNotExistFault fault = new AccountNotExistFault();
            fault.setAccount(account);
            AccountNotExistFaultMessage messageException = new AccountNotExistFaultMessage("Account does not exist!");
            messageException.setFaultMessage(fault);
            throw messageException;
        }

        final int amount = withdraw.getAmount();
        if (amount > 1000) {
            final InsufficientFundFault fault = new InsufficientFundFault();
            fault.setAccount(account);
            fault.setBalance(1000);
            fault.setRequestedFund(amount);
            InsufficientFundFaultMessage messageException = new InsufficientFundFaultMessage("Insufficient funds");
            messageException.setFaultMessage(fault);
            throw messageException;
        }

        final WithdrawResponse response = new WithdrawResponse();
        response.setBalance(1000 - amount);
        return response;

	}

}
