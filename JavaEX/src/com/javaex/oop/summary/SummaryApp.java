package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h1 = new Human("Jaemin", 30);
		Human h2 = new TheOne("Neo", 99);
		Panda p1 = new Panda("Pang", 5);
		Panda p2 = new KungfuPanda("Pho", 20);

		h1.eat(); // Animal 일반 메서드
		h1.say(); // Animal 추상메서드 -> 자식클래스애서 override
		fight(h1);
		fly(h1);

		System.out.println();
		p1.eat();
		p1.say();
		fight(p1);
		fly(p1);

		System.out.println();
		p2.eat();
		p2.say();
		fight(p2);
		fly(p2);

		System.out.println();
		h2.say();
		h2.eat();
		fight(h2);
		fly(h2);
	}
	

	private static void fight(Animal actor) {
		// actor가 KungfuSkill 인터페이스를 구현?
		if (actor instanceof KungfuSkill) {
			// KungFuSkill로 다운캐스팅 가능
			((KungfuSkill) actor).kungfu();
		} else {
			// KungFuskill 이 없어서 캐스팅 불가
			System.out.printf("%s(%d) 쿵푸못해여....%n", actor.name, actor.age);
		}
	}

	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable) actor).fly();
		} else {
			System.out.printf("%s(%d) 못날아여.....%n", actor.name, actor.age);
		}
	}
}
