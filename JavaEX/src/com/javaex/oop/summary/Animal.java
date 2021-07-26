package com.javaex.oop.summary;

public abstract class Animal {
	// 필드
	protected String name;
	protected int age;

	// 생성자
	public Animal(String name) {
		super();
		this.name = name;

	}

	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}

	// 일반 메서드
	public void eat() {
		System.out.printf("%s is eatiing...%n", this.name);

	}

	public abstract void say();
}
