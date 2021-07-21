package com.javaex.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// 5개의 숫자를 키보드로 입력받아 배열에 저장한 후, 평균을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];
		float avg = 0, sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			ints[i] = a;
		}
//		System.out.println("5개 입력 끝");
//		System.out.println(Arrays.toString(ints));
		for (int a : ints) {
			sum += a;
			avg = sum / ints.length;
		}
		System.out.printf("평균은 %.1f입니다.%n",avg);
	}
}
