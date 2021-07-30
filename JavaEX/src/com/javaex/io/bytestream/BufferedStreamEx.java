package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";

	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy_buffered.jpg";

	public static void main(String[] args) {
		InputStream fis = null; // 주스트림
		OutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(source); // 주스트림
			fos = new FileOutputStream(target); // 주스트림

			// 버퍼 기반보조스트림
			bis = new BufferedInputStream(fis); // 보조스티림
			bos = new BufferedOutputStream(fos); // 출력용 보조스트림

			byte[] data = new byte[10240];
			int size = 0;

			while ((size = bis.read(data)) != -1) {
				bos.write(data,0,size);// 버퍼내용 출력
				System.out.println(size + "바이트복사!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close(); // 연결된 주소 스트림도 닫힌다.
				bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
