package com.javaex.practice01_1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// 5개의 숫자 입력받아 최대값 찾기
		// for문 활용
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i = 1; i<=5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if(num>max) {
				max = num;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		// while 문 활용
		int max_a = 0;
		int value = 0;
		int count = 0;
		System.out.println("숫자를 입력하세요");
		while (count != 5) {
			System.out.print("숫자: ");
			value = sc.nextInt();
			if(value>max_a) {
				max_a = value;
			}
			count+=1;
		}
		System.out.println("최대값은 "+max_a+"입니다.");

	}

}
