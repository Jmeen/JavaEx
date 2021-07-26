package com.javaex.api.objectclass.v2;

// v1. 모든 class의 최상위 부모는 Object 이다.
//public class Point extends java.lang.Object{
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point(%d,%d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		// 전달받은 object가 point class의 객체인가?
		if (obj instanceof Point) {
			Point other = (Point) obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
}
