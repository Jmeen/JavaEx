package com.javaex.practice02;

public class Problem01 {

	public static void main(String[] args) {
		// 주어진 배열데이터를 이용하여 3의 배수의 갯수와 배수의 합을 출력하시오
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int count = 0;
		int sum = 0;
		for (int i : data) {
			if (i % 3 == 0) {
//				count += 1;
				sum += i;
				count++;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 ->"+count);
		System.out.println("주어진 배열에서 3의 배수의 합 ->"+sum);
	}

}
