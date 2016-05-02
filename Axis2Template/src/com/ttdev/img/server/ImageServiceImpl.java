package com.ttdev.img.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.activation.DataHandler;

public class ImageServiceImpl implements ImageServiceSkeletonInterface {

	@Override
	public void uploadImage(String productId, DataHandler image) {
		System.out.println(image.getContentType());
		try {
			InputStream in = image.getInputStream();
			String imageDir = "c:/tmp";
			FileOutputStream out = new FileOutputStream(new File(imageDir, productId));
			try {
				 byte[] buf = new byte[1024];
				 for(;;) {
					 int noBytesRead = in.read(buf);
					 out.write(buf, 0, noBytesRead);
					 if(noBytesRead < buf.length) break;
				 }
			} finally {
				out.close();
			}
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
