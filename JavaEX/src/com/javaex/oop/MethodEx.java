package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printMessage();
		printMessage("HELLO");
		printDivide(2, 0);
		printDivide(5, 2);

		System.out.println(divide(33, 4));

		System.out.println(getsum(new double[] { 1, 1, 5, 4, 7, 8, 3, 2, 4, 32, 4 }));
		System.out.println(getSumVar(1, 1, 5, 4, 7, 8, 3, 2, 4, 32, 4));
		
		printSum("HaHa",4654,156,2,15,3,25,1);
	}
	
	private static void printSum(String message, double... values) {
		System.out.println(message+":"+getSumVar(values));
	}
	
	
	// 방법2. 가변인수 : 변수이름 앞에 ...
	private static double getSumVar(double... values) {
//		// 가변인수는 배열로 전환되어 들어온다.
//		double sum = 0;
//		for (double value : values) {
//			sum += value;
//		}
//		return sum;
		// 중복된 코드는 연결해서 줄이자.
		return(getsum(values));
	}

	// 매개변수 갯수를 모른다
	private static double getsum(double[] values) {
		double sum = 0;
		for (double value : values) {
			sum += value;
		}
		return sum;
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
