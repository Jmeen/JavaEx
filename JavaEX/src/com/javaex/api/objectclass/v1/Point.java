package com.javaex.api.objectclass.v1;

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
}
