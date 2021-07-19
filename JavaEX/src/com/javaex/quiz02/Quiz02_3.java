package com.javaex.quiz02;

public class Quiz02_3 {

	public static void main(String[] args) {
		int num = 13579;

//		num의 100자리 미만을 버리는 코드를 작성해 봅시다.
//		num이 456이라면 결과는 400
//		num이 12345라면 결과는 12300이 됩니다.
		int result = num - num % 100;
		int result2 = num / 100 *100;

		// 결과를 화면에 출력해 봅시다.
		System.out.println(result);
		System.out.println(result2);

	}

}
