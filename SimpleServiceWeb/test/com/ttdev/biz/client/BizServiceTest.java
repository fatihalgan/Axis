
/**
 * BizServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.biz.client;

import org.apache.axis2.transport.http.HTTPConstants;

import com.ttdev.biz.client.BizServiceStub.ProductQueryResult;
import com.ttdev.biz.client.BizServiceStub.QueryItemComplexType;
import com.ttdev.biz.client.BizServiceStub.ResultItemComplexType;

/*
 *  BizServiceTest Junit test case
 */

public class BizServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testquery() throws java.lang.Exception {

		BizServiceStub stub = new BizServiceStub();// the
																					// default
																					// implementation
																					// should
																					// point
																					// to
																					// the
																					// right
																					// endpoint
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
		BizServiceStub.ProductQuery productQuery4 = (BizServiceStub.ProductQuery) getTestObject(BizServiceStub.ProductQuery.class);
		
		QueryItemComplexType queryItem = new QueryItemComplexType();
		queryItem.setProductId("p01");
		queryItem.setQty(100);
		productQuery4.addQueryItem(queryItem);
		queryItem = new QueryItemComplexType();
		queryItem.setProductId("p02");
		queryItem.setQty(-200);
		productQuery4.addQueryItem(queryItem);
		queryItem = new QueryItemComplexType();
		queryItem.setProductId("p03");
		queryItem.setQty(500);
		productQuery4.addQueryItem(queryItem);
		ProductQueryResult result = null;
		try {
			result = stub.query(productQuery4);
			assertNotNull(result);
			for (ResultItemComplexType resultItem : result.getResultItem()) {
				System.out.println(resultItem.getProductId() + ": " + resultItem.getPrice());
			}
		} catch (QueryInvalidProductId e) {
			System.out.println("Invalid product id: " + e.getFaultMessage().getInvalidProductId());
		} catch (QueryInvalidQty e) {
			System.out.println("Invalid qty: " + e.getFaultMessage().getInvalidQty());
		}
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
