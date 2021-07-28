package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		// queue : 선입 선출 First in First o
		Queue<Integer> qu = new LinkedList<>();

		// 데이터 제공하기
		for (int i = 0; i < 5; i++) {
			qu.offer(i); // enqueue
			System.out.println("QUEUE : " + qu);
		}

		// 가장 먼저 입력된 데이터 확인
		System.out.println("PEEK : " + qu.peek());

		System.out.println("QUEUE : " + qu);
		
		while (!qu.isEmpty()) {
			System.out.println("Poll : "+qu.poll());// dequeue
			System.out.println("QUEUE : " + qu);
		}

	}

}
