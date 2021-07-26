package com.javaex.exception;

import java.io.IOException;

// 강제 예외 발생
public class ThrowExcept {
	public void ExcuteExeption() throws IOException {
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외"); // checked Exception -> 반드시 예외처리

	}

	public void excuteRuntimeException() {
		System.out.println("런타임 예외");
		throw new RuntimeException("RuntimeException"); // unchecked Exceptio
	}

	public double divide(int num1, int num2) {

		if (num2 == 0) {
			throw new CustonArithmeticException("사용자 정의 Exception", num1, num2);
		}
		double result = num1 / num2;
		return result;
	}

}
