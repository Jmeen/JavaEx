package com.javaex.ali.generic;

//  generic 이용
public class GenericBox<T> {
	T content; // 타입 미정 상태

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	

}
