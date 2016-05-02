package com.ttdev.ws.server;

public class WrappedServiceImpl implements WrappedServiceSkeletonInterface {

	@Override
	public String concat(String s1, String s2) {
		return s1 + s2;
	}
	
}
