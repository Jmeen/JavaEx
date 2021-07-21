package com.javaex.pracice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("    [숫자맞추기게임 시작]     ");
		System.out.println("========================");
		label: while (true) {
			int ran = (int) (Math.random() * 100);
			System.out.println(ran);
			while (true) {
				System.out.print(">>>");
				int num = sc.nextInt();
				if (num > ran) {
					System.out.println("다운");
				} else if (num < ran) {
					System.out.println("업");
				} else {
					System.out.println("정답!");
					break;
				}
			}
			System.out.println("게임을 종료할까요?(y/n)");
			char ch = sc.next().charAt(0);
//			String end = sc.next();
			if (ch == 'y') {
				System.out.println("========================");
				System.out.println("    [게임을 종료합니다.     ");
				System.out.println("========================");
				break label;
			} else if (ch == 'n') {
				continue;
			}
		}
	}
}
