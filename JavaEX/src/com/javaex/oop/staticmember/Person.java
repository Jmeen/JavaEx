package com.javaex.oop.staticmember;

public class Person {
	protected String name;
	protected int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void showinfo() {
		System.out.printf("%s : $d세%n", name, age);
	}
}
