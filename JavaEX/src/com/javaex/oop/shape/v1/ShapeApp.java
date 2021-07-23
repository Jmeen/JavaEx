package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape rec = new Shape(); // 추상 클래슨ㄴ 객체화 할 수 없다.
		Shape rec = new Rectangle(1,2,30,30);
		System.out.println(rec.area());
		rec.draw();

	}

}
