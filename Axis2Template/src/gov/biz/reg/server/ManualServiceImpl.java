package gov.biz.reg.server;

import gov.biz.reg.Register;
import gov.biz.reg.RegisterResponse;

public class ManualServiceImpl implements ManualServiceSkeletonInterface {

	@Override
	public RegisterResponse register(Register register) {
		System.out.println("Got request");
		String regNo = "123";
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		RegisterResponse response = new RegisterResponse();
		response.setApproved(regNo);
		return response;
	}

}
