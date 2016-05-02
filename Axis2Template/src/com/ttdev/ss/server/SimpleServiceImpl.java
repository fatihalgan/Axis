package com.ttdev.ss.server;

public class SimpleServiceImpl implements SimpleServiceSkeletonInterface {

	@Override
	public String concat(String s1, String s2) {
		String result = s1 + s2;
		return result;
	}
	
	
}
