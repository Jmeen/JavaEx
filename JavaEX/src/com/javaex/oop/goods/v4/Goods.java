package com.javaex.oop.goods.v4;

// v2. 접근 제한자
// getter, setter를 통한 내푸 필드의 우회 접근
public class Goods {
	// 필드 선언
	private String name;
	private int price;

	// 생성자 규칙
	// 1. 클래스 이름과 동일, 반환타입 없음.
	// 2. 생성자를 하나도 만들지 않으면, -> javacr가 기본 생성자를 추가한다.
	// 3. 생성자를 임의로 만들었을 때 > javac가 시본 생성자를 추가하지 않음.
//	public Goods() {
//		this.name = null;
//		price = 0;
//	}
	public Goods(String name) { // name 필드만 초기화하는 생성자
		this.name = name;
	}

	public Goods(String name, int price) {
		this(name);  // 내부의 다른 생성자를 호출 할 수 있다.
		this.price = price;
	}

	// getters/ setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}
	// setter를 구현하지 않으면. 해당필드는 Readonly
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
