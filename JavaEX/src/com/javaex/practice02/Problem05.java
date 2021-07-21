package com.javaex.practice02;

public class Problem05 {
	public static void main(String[] args) {
		int scoreboard[][] = { { 80, 75, 90, 95, 78 }, { 92, 88, 89, 92, 70 }, { 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 }, { 89, 83, 93, 94, 78 }

		};
		int sum = 0, count = 0;
		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard[i].length; j++) {
				if (scoreboard[i][j] >= 85) {
					sum += scoreboard[i][j];
					count += 1;
				}
			}
		}
		System.out.printf("배열 내 85점이상 점수의 합은 %d입니다.%n", sum);
		System.out.printf("배열 내 85점이상 점수의 평균은 %d입니다.%n", (sum / count));
	}

}
