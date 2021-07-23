package com.javaex.oop.point.v4;

// 상속 Extend

public class ColorPoint extends Point {
	private String color;

	// 생성자
	// 추가 필드
	public ColorPoint(int x, int y, String color) {
		// 명시적으로 부모생성자 선택
		super(x, y);
		this.color = color;
	}

	@Override
	public void draw() {
		// 방법 1. 부모의 getter, setter 사용
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]인 점을 그렸습니다%n",
//					super.getX(),super.getY(),color);

		// 방법 2.
		System.out.printf("색깔점[x=%d, y=%d, color=%s]인 점을 그렸습니다%n", x, y, color);
	}

	// TODO : point 클래스의 draw(booblean) 메서드를 오버라이드 해보자
	@Override
	public void draw(boolean bshow) {
		String Message = String.format("색깔점[x=%d, y=%d, color=%s]인 점을 ", x, y, color);
		Message += bshow ? "그렸습니다" : "지웠습니다";
		System.out.println(Message);
	}

}
