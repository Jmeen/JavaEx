package com.javaex.basics;

import java.util.Scanner;

public class consolEx {
	public static void main(String[] args) {
//		consoleOutputEx();
		scannerEX();
	}

	private static void consoleOutputEx() {
		// 표준 출력 : stdout -> System.out
		// 표준 에러 : stderr -> System.err

		// 출력 메서드
		// print : 개행 안함
		// println : 개행한다 -> print \n
		// printf : 형식화 된 출력

		System.out.print("hello ");
		System.out.println("JAVA");

		// 이스케이프 문자 (\) - 특수한 의미를 지닌 문자
		System.out.println("hello\t자바"); // <- \t 탭
		System.out.println("hello\n자바"); // <= \n 강제 개행
		System.out.println("Hello \"자바\""); // \" "특수문자화
		System.out.println("C:\\Users\\BIT\\Desktop\\JM_JAVA"); // 문자열 내의 \

		System.err.println("표준에러출력");

	}

	private static void scannerEX() {
		// 표준 입력 :stdin -> System.in
		Scanner _scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		String value = _scanner.next();
		System.out.print("나이:");
		String value2 = _scanner.next();

		System.out.println("당신의 이름은 " + value + ",나이는 " + value2 + "세 입니다.");
		// 중요!! 시스템 자원을 사용하는 클래스는 반드시 닫아주자

		_scanner.close();
	}

}
