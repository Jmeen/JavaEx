package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";

	public static void main(String[] args) {
		// 파일객체 생성
		File root = new File(rootPath);

		printInfo(root);

		// 파일이 실제 존재하는가?
		System.out.println(rootPath + " : " + root.exists());
		if (!root.exists()) {
			root.mkdirs();

		}

		// 디렉터리 내부에 파일을 생성해 보자
		File newFile = new File(rootPath + "myfile.txt");
		if (!newFile.exists()) { // myfile.txt 가 없으면

			// 파일생성
			try {
				newFile.createNewFile(); // 파일 실제 생성
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		printInfo(root);
		
		//파일삭제
		newFile.delete();

		printInfo(root);

	}

	private static void printInfo(File f) {
		System.out.println("-------------------");
		// 전달받은 파일 객체가 디렉터리인가?
		if (f.isDirectory()) {
			// 디렉터리 내부의 파일 목록을 받아와서 출력
			System.out.println("Directory : " + f.getName());
			File[] files = f.listFiles();

			for (File file : files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.printf("%s - %d%n", file.getName(), file.length());
			}
		} else { // 파일일 경우
			System.out.println("File : " + f.getName());
		}
	}

}
