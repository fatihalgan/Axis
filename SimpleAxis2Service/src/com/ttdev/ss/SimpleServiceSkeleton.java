/**
 * SimpleServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.ss;

/**
 * SimpleServiceSkeleton java skeleton for the axisService
 */
public class SimpleServiceSkeleton implements SimpleServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param concatRequest0
	 */

	public com.ttdev.ss.ConcatResponse concat(com.ttdev.ss.ConcatRequest concatRequest0) {
		String result = concatRequest0.getS1() + concatRequest0.getS2();
		ConcatResponse response = new ConcatResponse();
		response.setConcatResponse(result);
		return response;
	}

}
