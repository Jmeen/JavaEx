package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트"+StaticEx.refCount);
		
		// static 멤버는 new로 인스턴슬ㄹ 생성하지 않아도 접근 가능.
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트"+s2.refCount);
		
		// 객체가 제거
		s1 = null; // 참조를 실행
		System.out.println("s1해제");
		System.out.println("참조카운트"+StaticEx.refCount);
		
		System.gc(); // 가비지 콜렉터 수행
		try {
			// 잠시대기
			Thread.sleep(1000);
			System.out.println("참조카운트"+StaticEx.refCount);
		} catch (Exception e) {}
		
		
	}

}
