package com.javaex.oop.shape.v2;

// 츠상 클래스를 상속받은 클래스는 반드시 추상 메서드를 구현해야 함.
public class Rectangle extends Shape implements Drawalbe {
	// 필드
	protected int width;
	protected int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("사격형 [x=%d, y=%d, w=%d, h=#d, area=%d]을 그려써요%n",x,y,width,height,area());
		// TODO Auto-generated method stub

	}

	@Override
	public double area() {
		int recArea = width * height;
		// TODO Auto-generated method stub
		return recArea;
	}

}
