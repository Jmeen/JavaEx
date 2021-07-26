package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point p2 = new Point(2, 3);

		System.out.println("p와 p2는 같은 객체인가? : " + (p == p2));
		System.out.println("p와 p2의 값은 같은가? : "+p.equals(p2));

		
		
	}



}
