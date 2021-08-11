package com.javaex.thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// thread의 실행 로직
		// 주의!! 이 메서드는 직접 호출하지 말 것.
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%s:%d%n", getName(), i); // getName() 현재 thread 이름
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}
