package com.javaex.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionEx {

	public static void main(String[] args) {
//		arithExceptionEx();
//		nullpointerExceptionEx();
//		arrayIndexExceptionEx();
		throwExceptEx();

	}

	private static void throwExceptEx() {
		ThrowExcept except = new ThrowExcept();
		try {
			except.divide(100, 0);
			except.ExcuteExeption();
			except.excuteRuntimeException();

		} catch (CustonArithmeticException e) {
			System.err.println(e.getMessage());
			System.err.printf("입력값 %d는 %d으로 나눌수 없습니다.%n", e.getNum1(), e.getNUm2());

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("End of code");

	}

	private static void arrayIndexExceptionEx() {
		// 배열의 인덱스 범위를 넘어간 접근
		int[] intArray = new int[] { 1, 3, 5, 7, 9 };
		// intArray.length = 5 범위 0~4
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에외 객체: " + e.getClass().getSimpleName());
			System.out.println("예외 메세지 : " + e.getMessage());
			System.out.printf("배열의 인덱스 범위는 0 ~ %d 까지 입니다.%n", intArray.length - 1);
		}

		System.out.println("End of code");
	}

	private static void nullpointerExceptionEx() {
		String str = new String("Java");
		System.out.println(str.toUpperCase());

		str = null;
		System.out.println(str);

		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.err.println("str은 null 입니다.");
		}
	}

	private static void arithExceptionEx() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double result = 0;
		// 스캐너로부터 정수를 입력
		// 100을 입력받은 정수로 나눈다

		System.out.print("정수를 입력해 주세요 >> ");
		try {
			num = sc.nextInt();
			result = 100 / num;
			sc.close();
		} catch (InputMismatchException e) {
			System.err.println("정수를 입려해 주세요");
		} catch (ArithmeticException e) {
			// 구체적인 예외 명시
			System.err.println("0으로 나눌수 없습니다.");
		} catch (Exception e) {
			// 가장 마지막 기타등등 예외
			e.printStackTrace();
		} finally {
			// 예외 여부 관계없이 가장 마지막에 수행
			System.out.println("Finally");
		}
		System.out.println(result);
	}
}
