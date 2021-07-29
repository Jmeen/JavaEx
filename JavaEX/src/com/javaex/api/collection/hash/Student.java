package com.javaex.api.collection.hash;

public class Student {
	// 필드
	String name;
	int i;

	// 생성자
	public Student(String name, int i) {
		this.name = name;
		this.i = i;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", i=" + i + "]";
	}

	// hashcode / equal override
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i; // student 학번을 해시코드로 활용한다.
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return ((this.name == other.name) && (this.i == other.i));
		}
		return super.equals(obj);
	}

}
