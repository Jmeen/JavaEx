package com.javaex.pracice01_2;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
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
