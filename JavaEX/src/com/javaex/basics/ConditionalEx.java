package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {

		String day;

//		conditionalEX();
//		ifelseifelseEx();
//		swithEx();
//		switchExam();
//		conditionalPractice01();
//		conditionalPractice02();
		switchEx3("sunday");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println(num + "은 3의 배수가 아닙니다.");
		}
		sc.close();
	}

	private static void conditionalPractice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("당신의 등급은 " + grade + "입니다.");
		sc.close();
	}

	private static void switchEx3(String day) {
		// TODO : 이 코드는 나중에 enum타입으로 개선해 볼 예정
		String act;
		switch (day) {
		case "sunday":
			act = "짜파게티 요리사";
			break;
		case "monday":case "tuesday":case "wednesday":case "thursday":
			act = "오늘은 열공";
			break;
		case "friday":
			act = "불급불금";
			break;
		case "saturday ":
			act = "토요일은 쉬는날";
			break;
		default:
			act = "????????뭐";
			break;
		}
		System.out.println(day+"는 "+act);
		
	}

}
