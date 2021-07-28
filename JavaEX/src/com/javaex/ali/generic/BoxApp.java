package com.javaex.ali.generic;

public class BoxApp {

	public static void main(String[] args) {
		
		IntegerBox iBox = new IntegerBox();
		iBox.setContent(2021);
		System.out.println("iBox : "+iBox.getContent());
		
		StringBox sBox = new StringBox();
		sBox.setContent("String Box");
		System.out.println("sBox : "+sBox.getContent());
		
		
		// 모든 객체를 담을 수 있는는 상자
		// 1.캐스팅을 반드시 해야함.
		//2. 캐스팅을 잘못하면 심각한 예외 발생
		ObjectBox oBox = new ObjectBox();
		oBox.setContent(2021);
		
		Integer i = (Integer) oBox.getContent();
		System.out.println("Content : "+i);
		
		oBox.setContent("Sting Obj"); 
		
		String s = (String) oBox.getContent();
//		Integer i2 = (Integer) oBox.getContent(); // 캐스팅 오류
		
		// generic
		//   설계시에 타입을 미정상태로 두고, 객체 생성시 실제 타입을 결정한다.
		GenericBox<Integer> intBox = new GenericBox();
		intBox.setContent(2021);//OK
//		intBox.setContent("STIRNG");  // int로 고정되어서 변경 불가
		
		Integer i3 = intBox.getContent();  // 
		System.out.println(i3);
		
		GenericBox<String> strBox = new GenericBox();
		strBox.setContent("String blabla");
//		strBox.setContent(2021); // 컴파일러가 타입을 체크할 수 잇다.
		String s3 = strBox.getContent();
		System.out.println(s3);
		
		// generic을 사용하면 생기는 장점:
		// 1. data type을 여러 타입에 대응하는 단일 클래스 를 설계할 수 있다.
		// 2. Type check를 컴파일러에게 맡길수 있다. 안전성의 확보
		// 3. 불필요한 캐스팅을 피할 수 있다.
	}

}
