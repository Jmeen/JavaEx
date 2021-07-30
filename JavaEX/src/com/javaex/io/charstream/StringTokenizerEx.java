package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {

		Reader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);

			String thief;

			while ((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief, " ");

				while (st.hasMoreTokens()) {
					String token = st.nextToken()+"\t";
					System.out.print(token);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
