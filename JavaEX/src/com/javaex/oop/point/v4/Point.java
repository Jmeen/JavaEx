package com.javaex.oop.point.v4;

public class Point {
	// protected-> 상속받은 클래스에서 접근 가능
	protected int x;
	protected int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void draw() {
		System.out.printf("점 [x=%d, y=%d]를 그렸습니다.%n", x, y);
	}

	// 메서드 오버로딩
	// 매개변수의 타입, 갯수, 순서가 다르면 같은 이름의 메서드가 여러개 존재할 수 있다.
	public void draw(boolean bshow) {
//		if (bshow) {
//			System.out.printf("점 [x=%d, y=%d]를 그렸습니다.%n", x, y);
//		}
//		System.out.printf("점 [x=%d, y=%d]를 지웠습니다.%n", x, y);

		String Message = String.format("점 [x=%d,y=%d]를 ", x, y);
		Message += bshow ? "그렸습니다" : "지웠습니다";
		System.out.println(Message);
	}
	

}
