package com.javaex.api.practice;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));

		// 복제
		Rectangle z = a.getClone();
		System.out.println(a);
		System.out.println(z);
		System.out.println(a.equals(z));

		z.width = 100;
		System.out.println(a);
		System.out.println(z);
		System.out.println(a.equals(z));

	}
}
