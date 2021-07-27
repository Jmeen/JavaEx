package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point p2 = p.getClone();
		// 참조 복제는 같은 객체 참조
//		Point p2 = p;

		System.out.println("p	= " + p);
		System.out.println("p2	= " + p2);

		// p2를 변경
		p2.x = 100;
		System.out.println("p	= " + p);
		System.out.println("p2	= " + p2);

	}

}
