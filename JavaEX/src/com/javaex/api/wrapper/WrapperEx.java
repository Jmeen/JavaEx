package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {

		// 기본타입과 1:1 매칭되는 포장클래스
		Integer i = new Integer(2021);
		Character c = new Character('C');

		// new 방식의 포장은 JDK 9 이후로 Deprecated

		// 앞으론 . vlaueof() 메서드르 사용해 포장
		float f = f = Float.valueOf(3.14159F);
		Boolean b = Boolean.valueOf(true);

		// 문자열을 해당 데이터 타입으로 변환 하기
		Integer i1 = Integer.valueOf(10);
		Double d1 = Double.valueOf(3.14159);
		Boolean b2 = Boolean.valueOf("false");

		// 문자열의 형태가 해당 기본형의 형태를 갖추고 있어야함.
//		Float f2 = Float.valueOf("a123.456f"); // error

		// 자동 boxing
		Integer i2 = 10; // Integer i2 = Integer.valueOf(10);

		// parse 계열 메소드 : 변환 메소드

		System.out.println(Integer.parseInt("-123")); // 문자열을 정수형으로
		System.out.println(Integer.parseInt("FF", 16)); // 16진수 문자열을 정수형으로
		System.out.println(Integer.toBinaryString(2021)); // 정수를 2진수 문자열
		System.out.println(Integer.toHexString(2021)); // 정수를 16진수 문자열로

		// 형변환 메서드
		System.out.println(i2.doubleValue()); // 내부 데이터를 double로 변환

		Integer i3 = Integer.valueOf(2021);
		Integer i4 = Integer.valueOf(2021);

		System.out.println(i3 == i4); // 다른 객체임을 주의

		System.out.println(i3.equals(i4)); // 내부 값의 비교

		System.out.println(i3.intValue() == i4.intValue()); // 언박싱 비교

	}

}
