package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {

//		conditionalEX();
//		ifelseifelseEx();
//		swithEx();
//		switchExam();
		conditionalPractice01();
		conditionalPractice02();
	}

	private static void conditionalEX() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		String r;

		// 조건분기
		// 0체크 -> 양수체크 -> 아니면 음수

//		if (a == 0) {
//			r = "0";
//		} else if (a > 0) {
//			r = "양수";
//		} else {
//			r = "음수";
//		}

		// 중첩 if 문

		if (a == 0) {
			r = "0";
		} else {
			if (a > 0) {
				r = "양수";
			} else {
				r = "음수";
			}
		}

		System.out.println(r + "입니다");
		sc.close();
	}

	private static void ifelseifelseEx() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바	2.C	3.C++	4.파이썬)");
		System.out.print("과목번호 : ");
		int code = sc.nextInt();
		if (code == 1) {
			System.out.println("R101호 입니다.");
		} else if (code == 2) {
			System.out.println("R202호 입니다.");
		} else if (code == 3) {
			System.out.println("R303호 입니다.");
		} else if (code == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		sc.close();
	}

	private static void swithEx() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바	2.C	3.C++	4.파이썬)");
		System.out.print("과목번호 : ");
		int code = sc.nextInt();

		switch (code) {
		case 1: // code == 1
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R202호 입니다.");
			break;
		case 3:
			System.out.println("R303호 입니다.");
			break;
		case 4:
			System.out.println("R404호 입니다.");
			break;
		default:
			System.out.println("상담원에게 문의하세요");
			break;
		}
		sc.close();
	}

	private static void switchExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
		}
		System.out.println(days);
		sc.close();
	}

	private static void conditionalPractice01() {

	}

	private static void conditionalPractice02() {

	}
}
