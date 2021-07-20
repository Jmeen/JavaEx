package com.javaex.practice01_1;

public class Problem04 {

	public static void main(String[] args) {
		// 구구단 배열
		// for 문 사용
		int x = 10;
		for (int j = 1; j <= 10; j++) {
			for (int i = j; i <= x; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("");
			x += 1;
		}

		System.out.println("==================");

		// while 문 사용
		int y = 10;
		int a = 1, b = 1;
		while (a <= 10) {
			while (b <= y) {
				System.out.print(b + "\t");
				b++;
			}
			System.out.println("");
			b = a + 1;
			y++;
			a++;
		}
	}
}
