package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringType();
		stringformatEx();
	}

	private static void stringformatEx() {

		// %d 정수 %s 문자열 %n 개행 %% % %f 실수
		String food = "사과";
		int total = 10, eat = 3;
		// total개의 food중에서 eat개를 먹었다

		System.out.println(total + "개의 " + food + "중에서 " + eat + "개를 먹었다");
		System.out.printf("%d개의 %s중에서 %d개를 먹었다%n", total, food, eat);

		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";
		System.out.printf(fmt, 4, "햄버거", 2);

		float rate = 1.234f;
		// 현재 이자율은 몇 %입니다.
		String rate1 = "현재 이자율은 %f%% 입니다.%n";
		System.out.printf(rate1, rate);
		String rate2 = "현재 이자율은 %.2f%% 입니다.%n"; // 소수점 2자리까지 표기
		System.out.printf(rate2, rate);

	}

	private static void stringType() {
		// 문자열 선언
		String str; // 선언
		str = "Java"; // <- 리터럴

		String str2 = "Java"; // 리터럴
		String str3 = new String("Java");

		// 참조 타입에서 == 는 참조 주소가 같은지?(같은 객체인지)를 판별

		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));

		// 값의 비교는?.equals()
		System.out.println("str, str2 내용이 같은가? :" + str.equals(str2));
		System.out.println("str, str3 내용이 같은가? :" + str.equals(str3));

		String str4; // 선언했으나 할당하지 않음.
//		str4.equals(str); // null 상태의 객체의 메서드를 이용하고자하면 에러 발생
	}

}
