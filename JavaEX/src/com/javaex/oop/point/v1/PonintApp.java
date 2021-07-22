package com.javaex.oop.point.v1;

public class PonintApp {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(5);
		
		System.out.println(p1.getX()+p1.getY());
		
		p1.draw();
	}
}
