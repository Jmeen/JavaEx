package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printMessage();
		printMessage("HELLO");
		printDivide(2, 0);
		printDivide(5, 2);

		System.out.println(divide(33, 4));
	}

	// 입력 0, 출력 0
	private static double divide(double num1, double num2) {
		return num1 / num2;
	}

	// 입력 O 출력 X
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌수 없어요");
			return;
		}
		System.out.println((float) num1 / num2);

	}

	// 입력 o, 출력 x
	private static void printMessage(String Message) {
		System.out.println(Message);
	}

	// 입력 x, 출력 x
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}

}
