package com.javaex.Practice03_1.problem04;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	int stateCode;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
		if (this.stateCode == 1) {
			System.out.println(this.title + "이(가) 대여 됐습니다.");
			this.stateCode = 0;
		} else {
			System.out.println("이미 대여중인 책입니다.");
		}
	}

	public void print() {
		String str1 = String.format("%d 책 제목: %s, 작가: %s, 대여 유무 : ", this.bookNo, this.title, this.author);
		String str2 = this.stateCode == 1 ? "재고있음" : "대여중";
		System.out.println(str1 + str2);

	}

}
