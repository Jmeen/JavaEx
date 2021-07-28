package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		// Stack 생성
		// Last in - Fisrt out

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < 5; i++) {
			stack.push(i);
			System.out.println("Stack" + stack);
		}

		// 가장 위쪽 데이터 확인
		System.out.println(stack.peek());

//		while (true) {
		while (!stack.empty()) {
			System.out.println("POP:" + stack.pop());
			// 가장 마지막 입력 데이터 추출
			System.out.println("Stack" + stack);
		}

	}

}
