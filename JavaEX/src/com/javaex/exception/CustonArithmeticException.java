package com.javaex.exception;

// 사용자 정의 예외
public class CustonArithmeticException extends ArithmeticException {
	// 필드 : 예외상황의 데이터 혹은 환경 정보
	private int num1;
	private int num2;

	// 생성자

	public CustonArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNUm2() {
		return num2;
	}

}
