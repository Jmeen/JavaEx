package com.javaex.oop.staticmember;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	// 생성자
	private Singleton() {
		// 외부에서 new로 인스턴스 생성 불가
	}
	public static Singleton getInstance() {
		return instance;
	}
	
	public void InstanceMethod() {
		
	}
//	private int[]
}
