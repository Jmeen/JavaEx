package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(2, 3);

		// point는 object클래스의 모든 메서드를 사용 가능하다.
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString()); // com.javaex.api.objectclass.v1.Point@5aaa6d82
		System.out.println(p);

		// p의 부모 확인
		System.out.println("P의 부모:" + p.getClass().getSuperclass().getName());

	}

}
