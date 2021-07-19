package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
//		arithOperEx();
//		logioperEx();
		bitOperEx();
	}

	// 연산자 : 산술연산
	private static void arithOperEx() {
		int a = 7, b = 3;

		// 부호연산자 : +, -
		System.out.println(-a);

		// 산술연산자 : +, -, * , / , %
		System.out.println(a / b); // int / int => int
		System.out.println(a % b); // 정수 나눗셈의 나머지

		// 실제 해 구하기
		System.out.println((float) a / (float) b);
		System.out.println((float) a / b); // 큰쪽의 형태로 변환한다.

		// 나눗셈 보충
//		System.out.println(4/0); //ArithmeticException
		System.out.println(4.0 / 0); // Infinity
		System.out.println(4.0 / 0 + 10); // Infinity 가 포함된 연산은 항상 Infinity.
		System.out.println(0.0 / 0.0); // NaN (Not a Number)

		// 우리의 연산식 결과가 Infinity인지 확인
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println("end of coding");

		// 증감연산자 : ++, --
		// 전치 증감 (++a 등) , 후치 증감(b--) 혼동하지 말자.
		int num = 10;
		System.out.println("num : " + num);
		System.out.println("++num : " + ++num);
		System.out.println("num++ : " + num++);
		System.out.println("num : " + num);

	}

	// 비교연산과 논리연산
	private static void logioperEx() {
		int a = 7;
		double b = 3;

		// 비교연산자 : > , >= , <, <= , ==(같다), !=(같지않다)
		System.out.println("a > b ? : " + (a > b));
		System.out.println("a와 b가 같습니까? : " + (a == b));
		System.out.println("a와 b가 다릅니가? : " + (a != b));

		System.out.println("형변환 비교 TEST");
		int a1 = 3;
		double a2 = 3.222;
		float a3 = 3.222f;
		System.out.println("int a1 = double a2? : " + (a1 == a2));
		System.out.println("int a1 = int a2? : " + (a1 == (int) a2));
		System.out.println("double a2 : " + a2);
		System.out.println("float a3 : " + a3);
		System.out.println((double) a3); // 형변환시 데이터값이 변경할 수있다. 주의
		System.out.println("double a2= double a3? : " + (a2 == (double) a3));

		// 논리연산자 : 논리곱(AND:&&), 논리합(OR:||), 논리부정(NOT:!)
		int num = 5;

		// num : 0초과, 10미만의 값인가?

		// 조건 1 ; num > 0
		// 조건 2 : num < 10
		// 결과 : 조건 1 and 조건 2
		boolean r1 = num > 0;
		boolean r2 = num < 10;
		boolean r1Andr2 = r1 && r2;
		System.out.println("r1 && r2 = " + r1Andr2);
		System.out.println("num이 0초과 10미만인가? : " + (num > 0 && num < 10));

		// num : 0이하이거나, 10이상의 값인가?
		// 조건 1 = num <= 0;
		// 조건 2 = num >= 10;
		// 조건 1 or 조건 2?
		boolean r3 = num <= 0;
		boolean r4 = num >= 10;
		boolean r3Andr4 = r3 || r4;
		System.out.println("r3 || r4 = " + r3Andr4);

		// 논리부정
		// num > 0 && num < 10 -> 논리부정
		// num <=0 || num >=10
		boolean rNot = !(num > 0 && num < 10);
		System.out.println("num이 0초과 , 10미만의 값인가? : " + rNot);

	}

	// 비트연산자
	private static void bitOperEx() {
		// 하드웨어 제어, 이미지 처리
		// 미세하기 비트 단위 데이터 제어에 활용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		System.out.println("b1 :" + Integer.toBinaryString(b1));
		System.out.println("b2 :" + Integer.toBinaryString(b2));

		int result = b1 & b2; // 비트 논리곱
		System.out.println("b1&b2 = " + Integer.toBinaryString(result));

		result = b1 | b2; // 비트 논리합
		System.out.println("b1|b2 = " + Integer.toBinaryString(result));

		result = ~b1; // 비트 논리 부정
		System.out.println("~b1 = " + Integer.toBinaryString(result));

		result = b1 ^ b2; // 배타적 논리합
		System.out.println("b1^b2 " + Integer.toBinaryString(result));

//		int b8 = 1, b9 = 2;
//		System.out.println(Integer.toBinaryString(b1));
//		System.out.println(Integer.toBinaryString(b2));
//		System.out.println(Integer.toBinaryString(b1&b2));
//		System.out.println(Integer.toBinaryString(b1|b2));		
//		System.out.println(Integer.toBinaryString(b1^b2));	

	}
}
