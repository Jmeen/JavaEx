package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraycopyEx();

	}

	private static void arraycopyEx() {
		char[] src = "Java Programming".toUpperCase().toCharArray();
		System.out.println(Arrays.toString(src));

		// 방법 1. 루프 돌며 복사
		char[] target = new char[src.length];
		for (int i = 0; i < target.length; i++) {
			target[i] = src[i];
		}

		System.out.println("루프복사 : " + Arrays.toString(target));

		// 방법 2. System.arrayCopy
		char[] target1 = new char[src.length];
		System.arraycopy(src,	// 원본배열
				0,				// 시작위치(원본)
				target1, 		// 복사대상
				0, 				// 복사시작(대상)
				src.length); 	// 복사 길이

		System.out.println("시스템복사 : " + Arrays.toString(target1));

		// 방법 3 . Arrays.Copyof
		char[] target2 = new char[src.length];
		target2 = Arrays.copyOf(src, src.length);
		System.out.println("copyof + "+Arrays.toString(target2));
		
		// 방법 4. Arrays.Copyofrange
		char[] target3 = new char[src.length];
		target3 = Arrays.copyOfRange(src, 5, src.length);
		System.out.println("5번부터 " + Arrays.toString(target3));
	}

}
