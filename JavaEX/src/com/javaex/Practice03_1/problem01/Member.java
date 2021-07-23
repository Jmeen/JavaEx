package com.javaex.Practice03_1.problem01;

public class Member {

	private String id;
	private String name;
	private int point;

	public Member() {
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setNaem(String name) {
		this.name = name;
	}

	public void setPoint(int Point) {
		this.point = point;
	}
	
	public String getId () {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoint() {
		return this.point;
	}
}
