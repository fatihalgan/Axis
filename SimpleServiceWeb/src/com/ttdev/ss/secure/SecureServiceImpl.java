package com.ttdev.ss.secure;

import com.ttdev.ss.ConcatResponse;

public class SecureServiceImpl implements SecureServiceSkeletonInterface {
	
	public com.ttdev.ss.ConcatResponse concat(com.ttdev.ss.ConcatRequest concatRequest0) {
		String resp = concatRequest0.getS1() + concatRequest0.getS2();
		ConcatResponse concatResp = new ConcatResponse();
		concatResp.setConcatResponse(resp);
		return concatResp;
	}
}
