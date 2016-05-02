
/**
 * ImageServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
package com.ttdev.image.client;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.apache.axis2.Constants;

/*
 *  ImageServiceTest Junit test case
 */

public class ImageServiceTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testuploadImage() throws java.lang.Exception {

		com.ttdev.image.client.ImageServiceStub stub = new com.ttdev.image.client.ImageServiceStub();// the
																										// default
																										// implementation
																										// should
																										// point
																										// to
																										// the
																										// right
																										// endpoint
		com.ttdev.image.client.ImageServiceStub.UploadImage uploadImage1 = (com.ttdev.image.client.ImageServiceStub.UploadImage) getTestObject(com.ttdev.image.client.ImageServiceStub.UploadImage.class);
		// TODO : Fill in the uploadImage1 here
		stub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, "true");
		DataSource source = new FileDataSource("E:/Downloads/Apache_OpenSource/webservices/axis-1_4/docs/images/axis.jpg");
		DataHandler handler = new DataHandler(source);
		uploadImage1.setImage(handler);
		uploadImage1.setProductId("p01");
		
		// There is no output to be tested!
		stub.uploadImage(uploadImage1);
		System.out.println("Done");
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
