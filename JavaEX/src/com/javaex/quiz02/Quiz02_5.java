package com.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		//다음 두 값이 같은지 확인하는 코드를 작성해 봅시다. 같다면 "같음" 다르다면 "다름"을 출력하세요.
		int r1 = ++num1 + 1;
		int r2 = num2++ + 1;
 
		String result = r1 == r2 ? "같음" : "다름";

		System.out.println(result);
		
		//  num1과 num2의 값을 출력해 봅시다.
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
