
/**
 * BizServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.foo.client;

import bar.org.QueryItemType;
import bar.org.ResultItemType;

/*
 *  BizServiceTest Junit test case
 */

public class BizServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	/**
	public void testquery() throws java.lang.Exception {

		com.foo.client.BizServiceStub stub = new com.foo.client.BizServiceStub();// the
																					// default
																					// implementation
																					// should
																					// point
																					// to
																					// the
																					// right
																					// endpoint

		bar.org.ProductQuery productQuery8 = (bar.org.ProductQuery) getTestObject(bar.org.ProductQuery.class);
		// TODO : Fill in the productQuery8 here
		QueryItemType queryItem = new QueryItemType();
		queryItem.setProductId("p01");
		queryItem.setQty(100);
		productQuery8.addQueryItem(queryItem);
		queryItem = new QueryItemType();
		queryItem.setProductId("p02");
		queryItem.setQty(200);
		productQuery8.addQueryItem(queryItem);
		queryItem = new QueryItemType();
		queryItem.setProductId("p03");
		queryItem.setQty(500);
		productQuery8.addQueryItem(queryItem);
		ResultItemType[] result = stub.query(productQuery8.getQueryItem());
		assertTrue(result.length > 0);
		for(ResultItemType item : result) {
			System.out.println(item.getProductId() + ":" + item.getPrice());
		}
	}
	**/
	public void testInvalidQuery() throws Exception {
		com.foo.client.BizServiceStub stub = new com.foo.client.BizServiceStub("http://localhost:8080/Axis2Template/services/BizService");
		bar.org.ProductQuery productQuery8 = (bar.org.ProductQuery) getTestObject(bar.org.ProductQuery.class);
		// TODO : Fill in the productQuery8 here
		QueryItemType queryItem = new QueryItemType();
		queryItem.setProductId("p01");
		queryItem.setQty(100);
		productQuery8.addQueryItem(queryItem);
		queryItem = new QueryItemType();
		queryItem.setProductId("p02");
		queryItem.setQty(-200);
		productQuery8.addQueryItem(queryItem);
		queryItem = new QueryItemType();
		queryItem.setProductId("p03");
		queryItem.setQty(500);
		productQuery8.addQueryItem(queryItem);
		ResultItemType[] result = null;
		try {
			result = stub.query(productQuery8.getQueryItem());
		} catch(QueryInvalidProductId e) {
			System.out.println("Invalid product id: " + e.getFaultMessage().getInvalidProductId());
			fail("Wrong exception caught");
		} catch(QueryInvalidQty e) {
			System.out.println("Invalid qty: " + e.getFaultMessage().getInvalidQty());
			return;
		}
		fail("Invalid Quantity was not caught");
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	private bar.org.QueryItemType[] getQueryItem(
			bar.org.ProductQuery wrappedType) {

		return wrappedType.getQueryItem();

	}

}

	