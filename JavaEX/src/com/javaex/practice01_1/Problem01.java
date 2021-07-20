package com.javaex.practice01_1;

public class Problem01 {

	public static void main(String[] args) {
		// 1~100까지 수 중 5의 배수 이면서 7의 배수인 것 표시
		// for문 사용
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println(i);
			}
		}

		// while문 사용
		int a = 1;
		while (a <= 100) {
			if ((a % 5 == 0) && (a % 7 == 0)) {
				System.out.println(a);
				a++;
			}
			a++;
		}

	}

}
