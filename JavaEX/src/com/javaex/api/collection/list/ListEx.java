package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// 3ktue5je
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();

		// 객체추가 :add - 맨 뒤에 새 요소 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		lst.add("Java");

		System.out.println("lst : " + lst);

		// List 는 순서가 있고, 중복 요소를 허용한다.
		lst.add(3, "C#"); // insert
		System.out.println("insert : " + lst);

		// 요소의 갯수
		System.out.println("size : " + lst.size()); // capacity는 없다.

		// 요소의 삭제
		lst.remove(3);// 인덱스로 삭제
		System.out.println("remove : " + lst);
		lst.remove("Python"); // 객체로 삭제
		System.out.println("remove : " + lst);

		// 반복자 : List에서는 Iterator이용

		Iterator<String> iter = lst.iterator();
		while (iter.hasNext()) {
			String item = iter.next();
			System.out.print(item + " ");
		}
		System.out.println();

//		리스트 비우기
		lst.clear();
		System.out.println("lst : " + lst);

	}

}
