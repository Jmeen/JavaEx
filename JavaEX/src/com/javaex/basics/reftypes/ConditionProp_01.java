package com.javaex.basics.reftypes;

import java.util.Random;
import java.util.Scanner;

public class ConditionProp_01 {

	public static void main(String[] args) {
		// 교재 P134 연습문제
		q6();
	}

	private static void q3() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private static void q4() {
		int num = 0;
		while (true) {
			int a = (int) (Math.random() * ((6 - 1) + 1) + 1);
			int b = (int) (Math.random() * ((6 - 1) + 1) + 1);
			if (a + b == 5) {
				System.out.printf("(%d , %d)%n", a, b);
				break;
			}
		}
	}

	private static void q5() {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println(x + "," + y);
				}
			}
		}
	}

	private static void q6() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void q7() {
		Scanner sc = new Scanner(System.in);
		int account = 0;
		boolean x = true;
		label: while (x) {
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 |3.잔고 | 4.종료");
			System.out.println("============================");
			System.out.print("선택> ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("예금액>");
				int input = sc.nextInt();
				account += input;
				System.out.println(" ");
				continue;
			case 2:
				System.out.print("출금액>");
				int output = sc.nextInt();
				account -= output;
				System.out.println(" ");
				continue;
			case 3:
				System.out.printf("잔고 : %d%n", account);
				System.out.println(" ");
				continue;
			case 4:
				System.out.println("프로그램종료");
				break label;

			default:
				System.out.println("다시 입력해주세요");
				System.out.println("");
				continue;
			}
		}
	}
}
