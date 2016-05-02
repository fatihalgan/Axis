package com.ttdev.ss.secure.server;

public class SecureServiceImpl implements SecureServiceSkeletonInterface {

	@Override
	public String concat(String s1, String s2) {
		return s1 + s2;
	}

}
