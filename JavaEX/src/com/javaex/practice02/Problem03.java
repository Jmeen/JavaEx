package com.javaex.practice02;

public class Problem03 {
	public static void main(String[] args) {
		// 주어진 문자열의 공백을 ','로 변경 후 출력하세요.
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		char ch1 = ' ';
		char ch2 = ',';

		read(c);
		
		System.out.println();

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ch1) {
				c[i] = ch2;
			}
		}
		
		read(c);
	}

	private static void read(char[] c) {
		for (char ch : c) {
			System.out.print(ch);
		}
	}
}
