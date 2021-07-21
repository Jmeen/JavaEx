package com.javaex.pracice01_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// 입력받은 숫자가 홀수인 경우 입력값까지 홀수의 합을 출력
		// 7 입력, 1,3,5,7 => 합 16
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int sum = 0;

		if (num % 2 != 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}

		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
		}
		System.out.println("결과값 : " + sum);
	}
}
