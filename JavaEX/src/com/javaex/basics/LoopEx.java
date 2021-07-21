package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		while99Ex();
//		dowhileEx();
//		forEx()	;
//		loopPractice();
//		loopPractice01();
//		forStar();
		findInt();
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
			System.out.println(num + " x " + i + " = " + num * i);
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

	private static void forEx() {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요");
		int dan = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		sc.close();
	}

	private static void loopPractice() {

		for (int i = 0; i <= 20; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
			}
			System.out.println(i);
		}
	}

	private static void loopPractice01() {
		// 구구단 for 문 이용 출력
		for (int i = 2; i < 10; i++) {
			for (int x = 1; x < 10; x++) {
				System.out.println(i + " x " + x + " = " + i * x);
			}
			System.out.println("===========");
		}

		// 구구단 while문 이용 출력
		int i = 2, x = 2;
		while (i < 10) {
			while (x < 10) {
				System.out.println(i + " x " + x + " = " + i * x);
				x++;
			}
			System.out.println("===========");
			x = 2;
			i++;
		}
	}

	private static void forStar() {
		// 별찍기 for 문 사용
		for (int i = 1; i <= 6; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 별찍기 while 사용
		int a = 6, b = 6;
		while (a != 1) {
			while (b != 1) {
				System.out.print("*");
				b--;
			}
			System.out.println("");
			a--;
			b = a;
		}

		int row = 1;
		while (row <= 6) {
			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println("");
			row++;
		}
	}

	private static void findInt() {
		int a = 1;
		while (true) {
			if ((a % 6 == 0) && (a % 14 == 0)) {
				System.out.println(a);
				break;
			}
			a++;
		}

		

	}
}
