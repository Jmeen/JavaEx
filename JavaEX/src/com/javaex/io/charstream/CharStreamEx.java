package com.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";

	public static void main(String[] args) {
//		writeTest();
		reatTest();
	}

	private static void reatTest() {
		Reader freader = null;
		try {
			freader = new FileReader(filename);
			int data = 0;
			while ((data = freader.read()) != -1) {
				System.out.print(data);
				System.out.println();
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				freader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeTest() {
		Writer fwriter = null; // 캐릭터 기반 출력 스트림의 최고 조상

		try {
			// 출력 스트림 생성
			fwriter = new FileWriter(filename, true); // true 면 추가 append);

			// 기록
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2021.07\r\n");
			fwriter.flush(); // 버퍼비우기

			System.out.println("파일을 기록했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
