package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape rec = new Shape(); // 추상 클래슨ㄴ 객체화 할 수 없다.
		Shape r1 = new Rectangle(1, 2, 30, 30);
		System.out.println(r1.area());
		r1.draw();

		Shape c1 = new Circle(30, 40, 20);

		Point p1 = new Point(30, 40);
		p1.draw();

		Drawalbe[] objs = { r1, c1, p1, new Rectangle(30, 30, 30, 30), new Circle(100, 50, 30), new Point(30, 40) };

	}

}
