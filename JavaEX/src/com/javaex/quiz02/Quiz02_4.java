package com.javaex.quiz02;

public class Quiz02_4 {

	public static void main(String[] args) {
		char ch = 'A';

		// 이 변수에 담긴 알파벳을 소문자로 변환해 봅시다.

		/*
		 * 참고 ch에 오직 대문자만 담겨 있다고 가정합니다. 다른 문자가 담겨 있는 상황은 없다고 가정합니다.
		 * 'A'의 코드는 65, 'a'의 코드는 97 입니다.
		 */
		
//		int ch_B = ch + (97-65);
		char ch_s = (char)(ch + (97-65));
		System.out.println("알파벳 대문자 "+ch+"의 소문자는 "+ch_s+"입니다");

	}

}
