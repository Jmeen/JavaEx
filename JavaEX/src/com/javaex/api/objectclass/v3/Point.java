package com.javaex.api.objectclass.v3;

// v3. 객체 복제 clone기능을 이용하려면
// 		cloneable 인터페이스를 구현해야한다.
public class Point implements Cloneable {

	int x;
	int y;

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

	// 복제 객체를 생성하는 메서드
	public Point getClone() {
		Point clone = null;
		try {
			clone = (Point) clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}

}
