package com.javaex.jdbc.oracle.dao;
// VO객체

// - 처리 로직을 갖지 않느나.
// - 순수 데이터를 가지는 객체
// - 기본 생성자가 있어야 한다.
// - tostring, equals등은 오버라이드 하기도 한다.

public class AuthorVO {
	// 필드 만들기
	// VO객체에서는 기본타입대신 Wrapper 사용
	private long authorId;
	private String authorName;
	private String authorDesc;

	// 생성자 - 기본 생성자가 필요
	public AuthorVO() {

	}

	public AuthorVO(String name, String desc) {
		this.authorName = name;
		this.authorDesc = desc;
	}

	public AuthorVO(long id, String name, String desc) {
		this.authorId = id;
		this.authorName = name;
		this.authorDesc = desc;
	}

	// getter & setter
	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc==null? "" : authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}
	
	//tostirng
	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}

}
