package com.javaex.api.practice;

public class Circle {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//  두 객체의 반지름이 같으면 객체가 동일한것으로 설정
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle) obj;
			return radius == other.radius ;
		}

		return super.equals(obj);
	}

}
