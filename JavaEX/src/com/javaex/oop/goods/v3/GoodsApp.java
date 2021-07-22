package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Goods notebook = new Goods();  // Goods 클래스엔 기본 생성자가 없음
		// 필드에 접근 -- > setters를 이용한 우회 접근
//		notebook.setName("LG Gram");
//		notebook.setPrice(1000000);
		Goods notebook = new Goods("LG Gram", 1000000);

//		Goods smartphone = new Goods();
//		smartphone.setName("iPhone12");
//		smartphone.setPrice(800000);
		Goods smartphone = new Goods("iPhone 12", 980000);

//		smartphone.setPrice(9900); // price필드는 readonly

		System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());

		notebook.showInfo();
		smartphone.showInfo();

		Goods macbook = new Goods("Macbook", 12300000);
		macbook.showInfo();

	}

}
