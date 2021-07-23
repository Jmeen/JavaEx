package com.javaex.oop.staticmember;

public class Student extends Person {
//	 Student extends Person{
	public Student(String name, int age, String School) {
		// 명시적으로 부모생성자 선택
		super(name, age);
	}

}
