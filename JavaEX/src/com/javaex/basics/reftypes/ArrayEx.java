package com.javaex.basics.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		defineArray();
//		multiDimArray();
//		arrayCopyFor();
		arraycopySystem();
	}

	private static void arraycopySystem() {
		int sourse[] = { 1, 2, 3 };
		int target[] = new int[10];
		System.arraycopy(sourse, 0, target, 0, sourse.length);

		for (int i = 0; i < sourse.length; i++) {
			System.out.print(sourse[i] + "\t");
		}

		System.out.println();
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();

		System.out.println("원본 : " + Arrays.toString(sourse));
		System.out.println("복사본 : " + Arrays.toString(target));

		for (int a : target) {
			System.out.print(a + "=======");
		}

	}

	private static void arrayCopyFor() {
		// 배열은 크기 변경 불가
		// 새 배열을 생성 복사

		int sourse[] = { 1, 2, 3 };
		int target[] = new int[10];

		// 배열 복사
		for (int k = 0; k < sourse.length; k++) {
			target[k] = sourse[k];
		}

		for (int i = 0; i < sourse.length; i++) {
			System.out.print(sourse[i] + "\t");
		}

		System.out.println();
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();

	}

	private static void multiDimArray() {
		// 2차원 배열의 선언
		int[][] twoDim = new int[5][10];

		int table[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, { 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 }, { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 }, { 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 } };
//		
//		System.out.println(table.length+table[0].length);
//		
//		// talbe의 인덱스 범위 0~length -1
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}

		int sum = 0;
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				sum += table[row][col];
			}
		}
		System.out.println(sum);

	}

	private static void defineArray() {
		// 선언
		String[] name; // 타입[] 식별자
		int scores[]; // 타입 식별자[]

		// 일반적인 초기화
		scores = new int[4];
		// 인덱스 접근
		// 인덱스 범위 0~ lenth-1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 65;
		scores[3] = 93;
//		scores[4] = 50; //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

		// 데이터를 가지고 있을 경우 배열의 사이즈를 지정할 필요 없음.
		name = new String[] { "홍길동", "임꺽정", "장길산", "전우치" };

		// 데이터를 가지고있고, 선언과 동시에 초기화
		float heights[] = { 175.3f, 180.5f, 190.2f, 165.2f };

		System.out.println(name.length);

		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", name[i], heights[i], scores[i]);
		}

		// 배열을 참조 타입이다.
		int scores2[] = scores; // 참조복사 - 객체를 복사한 것이 아니라 주소를 복사. 같은 객체를 참조
		scores[2] = 75;
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2:" + Arrays.toString(scores2));

		scores2[2] = 100;
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2:" + Arrays.toString(scores2));

	}

}
