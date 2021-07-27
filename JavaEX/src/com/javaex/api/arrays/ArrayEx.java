package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		arraycopyEx();
//		basicSortTest();
//		basicSortdestTest();
//		customClassSortTest();
//		basicSearchEx();
		searchCuston();
	}

	// 사용자 정의 클래스 검색
	private static void searchCuston() {
		Member[] member = { new Member("홍길동"), new Member("임꺽정"), new Member("장길산"), new Member("고길동"),
				new Member("전우치") };

		Arrays.sort(member);

		System.out.println(Arrays.toString(member));
		System.out.println(Arrays.binarySearch(member, new Member("홍길동"), new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		}));
	}

	// 검색 - 기본타입
	private static void basicSearchEx() {
		// 자바는 이진 검색 방식을 사용한다. 반드시 검색 전 오름차순 정렬이 되어 있어야한다.
		int[] nums = { 5, 3, 1, 7, 8, 6, 4, 9, 2 };
		Arrays.sort(nums);
		System.out.println("정렬된 배열 : " + Arrays.toString(nums));
		int idx = Arrays.binarySearch(nums, 1);
		System.out.println("1의 인덱스" + idx);

		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		System.out.println("원본배열" + Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		int idx1 = Arrays.binarySearch(str, "Linux");
		System.out.println(idx1);

	}

	// 사용자 정의 클래스의 정렬
	private static void customClassSortTest() {
		Member[] member = { new Member("홍길동"), new Member("임꺽정"), new Member("장길산"), new Member("고길동"),
				new Member("전우치") };
		System.out.println("원본" + Arrays.toString(member));
		Arrays.sort(member);// 오름차순
		Arrays.sort(member, Collections.reverseOrder()); // 내림차순
		System.out.println("정렬" + Arrays.toString(member));
	}

	// 기본 정렬
	private static void basicSortTest() {
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };

		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores); // 오름차순 정렬
		System.out.println(Arrays.toString(scores));
	}

	// 기본타입의 역순 정렬
	private static void basicSortdestTest() {
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println(Arrays.toString(scores));
		// Collections.reverseOrder()); <- 객체 두개의 순서를 비교하려면 Compareto가 있어야한다.
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
		System.arraycopy(src, // 원본배열
				0, // 시작위치(원본)
				target1, // 복사대상
				0, // 복사시작(대상)
				src.length); // 복사 길이

		System.out.println("시스템복사 : " + Arrays.toString(target1));

		// 방법 3 . Arrays.Copyof
		char[] target2 = new char[src.length];
		target2 = Arrays.copyOf(src, src.length);
		System.out.println("copyof + " + Arrays.toString(target2));

		// 방법 4. Arrays.Copyofrange
		char[] target3 = new char[src.length];
		target3 = Arrays.copyOfRange(src, 5, src.length);
		System.out.println("5번부터 " + Arrays.toString(target3));
	}

}
