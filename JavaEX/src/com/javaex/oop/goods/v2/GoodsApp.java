package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods notebook = new Goods();
		// 필드에 접근 -- > setters를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1000000);

		Goods smartphone = new Goods();
		smartphone.setName("iPhone12");
		smartphone.setPrice(800000);

		System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());

		notebook.showInfo();
		smartphone.showInfo();

	}

}
