package com.javaex.basics;

//JVM에서 진입점을 찾아 실행
public class Types {
	static final int SPEED_LIMIT = 100;

	public static void main(String[] args) {

		// 변수 예제 & 데이터 타입에 관련된 예제를 테스트 할 것임.
//		varEx(); // 아래 명시된 메서드를 실행
//		integerEx();
//		floatDoubleEx();
//		booleanEx();
//		charEx();
//		constantEx();
//		promotionEx();
		castingEx();
	}

	// 명시적 형변환 (casting : explicit casting)
	private static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
		// 강제로 타입 변환을 수행해야함. 자료의 유실이 일어날 수 있음.
		float f = 1234567890.123456789f; // 4바이트 실수형
		System.out.println(f);
		long l = (long) f; // 8바이트 정수형 -> 소수점 자료의 유실 발생
		System.out.println(l);
		int i = (int) l; // 4바이트 정수형
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		short s = (short) i; // 2바이트 정수형 -> 자료의 유실 발생
		System.out.println(Integer.toBinaryString(s));
		System.out.println(s);
		byte b = (byte) s; // 1바이트 정수형 -> 자료의 유실 발생

		System.out.println(b);

	}

	// 암묵적 형변환 (Promotion: implicit casting)
	private static void promotionEx() {
		// byte < short < int < long < float < double
		// 표현범위 좁은 자료형 -> 넓은 자료형으로 자동 변환수행한다.
		byte b = 25; // 1byte 정수형
		System.out.println(b);
		short s = b; // 2byte 정수
		System.out.println(s);
		int i = s; // 4byte 정수
		System.out.println(i);
		long l = i; // 8byte 정수
		System.out.println(l);
		float f = l; // 4byte 실수
		System.out.println(f);
		double d = f; // 8byte 실수
		System.out.println(d);
	}

	// 상수
	private static void constantEx() {

		System.out.println("제한속도 : " + SPEED_LIMIT);

		int limit = SPEED_LIMIT;
		System.out.println("현재 도로의 제한 속도는 " + limit + "입니다.");

		// 코드의 가독성과 코드의 변경이 용이해진다.

//		SPEED_LIMIT = 320; // 변경 시도 -> 불가
		System.out.println("지금은 " + SPEED_LIMIT + "입니다");

	}

	private static void varEx() {
		/*
		 * 변수의 식별자 규칙 1. 문자, 숫자, $, _ 사용 가능 2. 숫자로 시작할 수 없다. 3. 예약어는 사용할 수 없다. 4. 변수,
		 * 메서드의 명명규칙은 : camelCase
		 */

		// int age; // 선언, 메모리에 이름을 붙임.
		// age = 50;
		int age = 34; // 선언 + 초기화

		// 자바는 정적타입 언어이기 때문에, 다른 타입의 데이터를 담을 수 없다.
		// age = 3.14; -> error 발생

		// 조회 :
		System.out.println("당신의 나이는 " + age + "살 입니다");

		// 한번에 여러 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		// 여러 변수에 동일한 값을 할당하고자 할 때
		v1 = v2 = v3 = 40;
	}

	// 정수형 데이터 타입
	private static void integerEx() {
		// byte(1) < Short (2) < int(4) < long(8)
		int intVar1, intVar2; // 두개의 정수형 데이터 선언
		intVar1 = 2021; // 초기화
//		intVar2 = 22342122212; // out of range - 저장범위 초과
		System.out.println(Integer.toBinaryString(intVar1));

		long longVar1, longVar2;
		longVar1 = 2021L;
		longVar2 = 23487123123L;
		System.out.println(longVar1);
		System.out.println(longVar2);

		// 2진수 , 8진수, 16친수
		int bin, oct, hex;
		bin = 0b1101; // 2진수 앞에 0b
		oct = 072; // 8진수 앞에 0
		hex = 0xFF; // 16진수 앞에 0x

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

	// 실수형 데이터 타입
	private static void floatDoubleEx() {
		// float(4) < double (8)

		float floatVar = 3.141592f;
		double doubleVar = 3.141592;

		System.out.println(floatVar);
		System.out.println(doubleVar);

		// 지수표기법
		floatVar = 3e-6f; // 3 * 10^-6;
		doubleVar = 3E10; // 3 * 10^10
		System.out.println(floatVar);
		System.out.println(doubleVar);

		// 부동소수점 계산의 문제
		// float, double같은 경우 정밀도를 포기
		// 표현 범위만 넓힌 것
		// 점일 실수 처리에는 적합하지 않음.

		System.out.println(0.1 * 3);

	}

	// 논리형 데이터 타입
	private static void booleanEx() {
		// 1byte : true or false
		// 조건 분기, 반복문 등에 활용 -> 중요한 자료형

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1);
		System.out.println(b2);
		// 비교 연산, 논리연산의 결과로 활용된다.

		int a = 7, b = 3;
		boolean result = a > b;
		System.out.println(result);

	}

	// 문자형 데이터 타입
	private static void charEx() {
		// 부호가 없는 정수 코드
		char ch1 = 'A';
		char ch2 = '한';
//		char ch3 = "하";

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);

		String str = "A한";
		System.out.println(str);

	}
}