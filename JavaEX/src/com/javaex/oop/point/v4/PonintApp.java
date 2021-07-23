package com.javaex.oop.point.v4;

public class PonintApp {
	public static void main(String[] args) {
		
//		Point p1 = new Point();
//		p1.setX(10);
//		p1.setY(5);
		Point p1 = new Point(10,8);
//		
		p1.draw();
		
		Point p2 = new Point(32,34);
		p2.draw();
		
		p1.draw(false);
		p2.draw(false);
		
		p1.draw(true);
		
		ColorPoint cp1 = new ColorPoint(10,20,"Red");
		cp1.draw();
		cp1.draw(false);
	}
}
