package com.java.miniproject;

public class PersonInfo {
	private int num;
	private String name;
	private String cellphone;
	private String homephone;

	public PersonInfo(String name, String cellphone, String homephone) {
		this.num = num;
		this.name = name;
		this.cellphone = cellphone;
		this.homephone = homephone;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public void showInfo() {
		System.out.printf("%d. %s\t%s\t%s%n", num, name, cellphone, homephone);
	}

	@Override
	public String toString() {
		String result = String.format("%d. %s\t%s\t%s", num, name, cellphone, homephone);
		return result;
	}

}
