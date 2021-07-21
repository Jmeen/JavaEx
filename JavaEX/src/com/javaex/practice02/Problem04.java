package com.javaex.practice02;

import java.util.Arrays;

public class Problem04 {
	public static void main(String[] args) {

		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * (45 - 1)) + 1;
//			System.out.println(lotto[i]);

			// 중복체크
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
//					System.out.println("중복");
					i--;
				}
				
				// 오름차순 처리 로직
				if (lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int num : lotto) {
			System.out.print(num+" ");
		}

//		while (count<6) {
//			int rdnum = (int) (Math.random() * (45-1))+1;
////			System.out.println(rdnum);
//			for (int i = 0; i<6;i++) {
//				if (lotto[i]==rdnum) {
//					System.out.println("?");
//					break;
//				} else () {
//					lotto[i]=rdnum;
//					count++;
////					System.out.println("?");
//					break;
//				}
//			}
//				System.out.println(rdnum);
//		}
//		
//		System.out.println(Arrays.toString(lotto));

//		while (true) {

//			for (int i = 0; i < lotto.length; i++) {
//				int rdnum = (int) (Math.random() * 46);
//				if (lotto[i] == 0) {
//					lotto[i] = rdnum;
//					System.out.println(lotto[i]);
//				} else if (lotto[i] == rdnum) {
////					System.out.println(lotto[i]);
//					continue;

//		label: for (int i = 0; i < 6; i++) {
//			int rdnum = (int) (Math.random() * 46);
////				System.out.println(rdnum);
//			int a = 0;
//			while (a < 6) {
//				if (rdnum == lotto[i]) {
//					System.out.println("중복수!!!" + rdnum);
//					System.out.println("!!!");
//					break;
//				} else {
//					System.out.println(rdnum);
//					lotto[i] = rdnum;
//					a++;
//				}
//			}
//			}

	}

}
