package com.ttdev.image;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageServiceImpl implements ImageServiceSkeletonInterface {

	@Override
	public void uploadImage(UploadImage uploadImage) {
		System.out.println(uploadImage.getImage().getContentType());
		try {
			InputStream in = uploadImage.getImage().getInputStream();
			String imageDir = "c:/tmp";
			FileOutputStream out = new FileOutputStream(new File(imageDir, uploadImage.getProductId()));
			try {
				byte[] buf = new byte[1024];
				for(;;) {
					int noBytesRead = in.read(buf);
					out.write(buf, 0, noBytesRead);
					if (noBytesRead < buf.length) break;
				}
			} finally {
				out.close();
			}
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}
