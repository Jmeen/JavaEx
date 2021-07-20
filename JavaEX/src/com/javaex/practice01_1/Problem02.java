package com.javaex.practice01_1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 아래와 같이 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();

		// for 문 사용
		for (int i = 1; i <= num; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print(i);
			}
			System.out.println("");
		}

		System.out.println("==========");

		// while 문 사용

		int x = 1,z = 1;
		while (x != num + 1) {
			while (z != x+1) {
				System.out.print(x);
				z++;
			}
			System.out.println("");
			z = 1;
			x++;
		}

	}

}
