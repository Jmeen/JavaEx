package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";

	static final String filename = rootPath + "primives.txt";

	// DataStrea ; 기본 데이터 타입을 저장
	public static void main(String[] args) {
//		Saveprimitives();
		loadprimitives();
	}

	private static void loadprimitives() {
		InputStream fis = null; // 주스트림
		DataInputStream dis = null; // 주스트림

		try {
			fis = new FileInputStream(filename);
			dis = new DataInputStream(fis);

			for (int i = 0; i < 2; i++) {
				// 주의 : 출력한 순서대로 읽어온다.
				// String -> Boolean -> int -> Float
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();

				System.out.printf("%s:%b:%d:%f%n", s, b, val, f);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void Saveprimitives() {
		OutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(filename); // 주스트림
			dos = new DataOutputStream(fos); // 보조스트림

			// 출력 : String -> Boolean -> int -> Float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(25.5f);

			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(385);
			dos.writeFloat(99.9f);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
