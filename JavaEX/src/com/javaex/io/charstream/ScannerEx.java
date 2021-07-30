package com.javaex.io.charstream;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {

		File file = new File(filename);

		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			while (scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				System.out.printf("%s : %f , %f %n", name, height, weight);
				scanner.nextLine();
			}
			scanner.close();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
