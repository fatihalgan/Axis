package gov.fake.bizreg;


public class ManualServiceImpl implements ManualServiceSkeletonInterface {
	
	public RegisterResponse register(Register register0) {
		System.out.println("Got Request");
		String regNo = "123";
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			
		}
		RegisterResponse response = new RegisterResponse();
		response.setApproved(regNo);
		return response;
	}

}
