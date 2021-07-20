package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		while99Ex();
		dowhileEx();

	}

	private static void whileEx() {
		int i = 0; // 반복 조건 제어 변수
		while (i < 10) {
			System.out.println("I Like Java" + i);
			i += 1; // 주의! 무한 반복에 빠지지 않도록 적절히 제어
		}

	}

	private static void while99Ex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 출력할 단을 입력하세요");
		int num = sc.nextInt();

		int i = 1; // 제어변수
		while (i < 10) {
			System.out.println(num + " x 1 = " + num * i);
			i++; // 제어변수 변경
		}
		sc.close();
	}

	private static void dowhileEx() {
		Scanner sc = new Scanner(System.in);
		// 적어도 한번은 수행해야 하는 경우
		// 반복 조건이 반복문 내부에서 할당되는 경우

		int value = 0;
		int total = 0;
		do {
			System.out.println("숫자를 입력해주세요(0은 종료)");
			value = sc.nextInt();
			total += value;
			System.out.println("합계 :" + total);
		} while (value != 0);
		sc.close();

	}

}
