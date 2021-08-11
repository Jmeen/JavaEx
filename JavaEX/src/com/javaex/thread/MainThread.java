package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Working thread 호출 --2
		Thread thread = new DigitThread();
		thread.setName("DigitThread");


		// Main Thread 로직 --- 1
		// A ~ Z 까지 출력
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//
//			// 0.3초 대기
//			try {
//				Thread.sleep(300); // 300ms = 0.3s
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
		Thread thread2 = new Thread(new AlphabetThread());
		
		// Thread 우선순위 변경
		// 1 (MIN) ~ 5(Normal) ~ 10(Max)
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		// Thread시작 : run메소드 직접 호출하지 말것.
		thread.start();
		thread2.start();

		// MainThread의 흐름에 Working Thread들의 흐름을 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END of MainThread");

	}

}
