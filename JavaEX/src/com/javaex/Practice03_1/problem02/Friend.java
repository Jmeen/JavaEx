package com.javaex.Practice03_1.problem02;

public class Friend {

	private String name;
	private String hp;
	private String school;

	// 필요한 메소드 작성
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

}
