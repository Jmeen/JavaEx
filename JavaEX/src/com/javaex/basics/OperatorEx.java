package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
		arithOperEx();
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
}
