package com.javaex.practice01_1;

public class Problem03 {

	public static void main(String[] args) {
		// 구구단 작성
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("===========================");
		// while 이용
		int x = 2;
		int y = 2;
		while (x<10) {
			while(y<10) {
				System.out.print(y + "*" + x + "=" + x * y + "\t");
				y++;
			}
			System.out.println("");
			y=2;
			x++;
		}
	}

}
