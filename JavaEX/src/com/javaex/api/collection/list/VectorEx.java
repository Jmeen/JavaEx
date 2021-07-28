package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터 생성
		// 벡터 - 버퍼기반
		Vector<Integer> v = new Vector<>(); // 기본 버퍼 용량 10
		// new Vector<>(용량)
		System.out.printf("Size : %d, Capacity : %d%n", v.size(), v.capacity());

		for (int i = 1; i <= 10; i++) {
			v.addElement(i); // 항목 추가

		}
		System.out.printf("Size : %d, Capacity : %d%n", v.size(), v.capacity());

		v.addElement(11); // 허용량 초과 -> 버퍼 자동 증가
		System.out.printf("Size : %d, Capacity : %d%n", v.size(), v.capacity());

		System.out.println("v:" + v);

		// 중간에 값넣기
		v.insertElementAt(100, 7);

		System.out.println("v:" + v);

		// 객체 조회 : 찾는 인덱스으 객체를 반환한다.
		int value = v.elementAt(7);
		System.out.println("인덱스7의 객체:" + value);

		// 객체의 인덱스 조회
		System.out.println("7의 인덱스 :" + v.indexOf(7));
		System.out.println("0의 인덱스 :" + v.indexOf(0)); // 없는 객체의 인덱스는 - 1);

		// 객체 포함 여부
		System.out.println("100을 포함? " + v.contains(100));

		// 객체 삭제
		v.removeElement(100); // 객체 삭제
		System.out.println("v:" + v);

		v.removeElementAt(7); // 인덱스 7의 요소 삭제
		System.out.println("v:" + v);

		v.setElementAt(100, 4); // 인덱스 4의 요소를 변경
		System.out.println("v:" + v);

		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();

		// enhanced for
		for (Integer item : v) {
			System.out.print(item + " ");
		}
		System.out.println();

		// Enumeration : 반복자
		// 순서대로 요소를 받아오고자 할때 반복자가 더 효율적이다.
		Enumeration<Integer> e = v.elements(); // 반복자 획득

		while (e.hasMoreElements()) { // 뒤에 요소가 남아있는지 확인, 뒤에 없으면 false
			Integer item = e.nextElement();
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
