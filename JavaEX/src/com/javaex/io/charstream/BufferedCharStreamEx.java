package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leat-filterd.txt";

	public static void main(String[] args) {
		// 주스트림
		Reader fr = null;
		Writer fw = null;
		// 보조스트림
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// 주스트림
			fr = new FileReader(source);
			fw = new FileWriter(target);

			// 메인스트림
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			String line = "";
			while ((line = br.readLine()) != null) {
				// 해당 라인에 leaf 혹은 leaves가 포함된 라인만 따로 저장
				if (line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					// leaf, leaves 들어있는 문장만 출력
					System.out.println(line);
					bw.write(line);
					bw.write("\r\n");
				}
			}
			System.out.println("필더링 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
