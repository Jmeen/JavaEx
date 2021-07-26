package com.javaex.oop.summary;

public class Human extends Animal {
	// 생성자가 아무것도 없으면 기본 생성자를 만들고, 상속받았으면 부모 생성자를 호출
	// 생성자 만들어주기

	public Human(String name, int age) {
		// 명시적으로 부모 생성자 호출
		super(name, age);

	}

	@Override // 메서드 덮어쓰기
	public void say() {
		// animal class에 있는 추상 메서드
		System.out.printf("Hello, I`m %s.%n", this.name);
	}

}
