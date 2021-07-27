package com.javaex.api.practice;

public class Rectangle implements Cloneable {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 구해지는 면적이 같으면 두 객체가 같은 것으로 판별하도록 equals()를 오버라이딩 하세요.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			return width*height == other.width*other.height;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// 복제하기
	public Rectangle getClone() {

		Rectangle clone = null;
		try {
			clone = (Rectangle) clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
