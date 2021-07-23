package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	int radius;
	
	public Circle(int x, int y,int radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, r=%f, area=%d]을 그려써요%n",x,y,radius,area());
		// TODO Auto-generated method stub

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = Math.PI * Math.pow(radius, radius);
		return area;
	}

}
