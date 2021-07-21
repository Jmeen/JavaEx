package com.javaex.basics.reftypes;

import java.util.Scanner;

public class Arrypractice_p181 {

	public static void main(String[] args) {

		q9();
	}

	private static void q9() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("Scores[%d] > ", i);
					scores[i] = sc.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("Scores[%d] > %d%n", i, scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				for (int x : scores) {
					if (x > max) {
						max = x;
					}
				}
				double avg = (double) max / studentNum;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);

			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("번호를 확인해주세요");
			}
		}

		System.out.println("프로그램 종료");
	}

	private static void q8() {
		int[][] arry = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0, count = 0;
		double avg = 0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				sum += arry[i][j];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println((double) sum / count);
	}

	private static void q7() {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int a : array) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println(max);
	}

}
