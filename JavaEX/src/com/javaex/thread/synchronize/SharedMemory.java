package com.javaex.thread.synchronize;

// 여러 쓰레드가 공유할 객체
public class SharedMemory {
	// 필드
	
	private int memory;
	
	public int getmemory() {
		return memory;
	}
	// 임께 영역 : 멀티 쓰레드에서 단 하나의 쓰레드만 접근할 수 있는 코드 영역
	// 임계 영억 설정 : 메서드 선언부에 synchronized를 붙인다.
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		
		try {
			Thread.sleep(1000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}

}
