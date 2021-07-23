package com.javaex.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {

		// upcast
		Animal dog1 = new Dog("멍뭉");
		dog1.eat();
		dog1.walk();
//		dog1.bark();
		// 클래스에 지정된 것만 할 수 있다.

		Dog dog2 = new Dog("아지");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// 다운캐스팅
		((Dog) dog1).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		pet = new Cat("didhd");
		pet.eat();
		pet.walk();

		// 다운캐스팅시에는 항상 어떤 클래스의 인스턴스인지 확인
//		((Dog)pet).bark();
		
		if (pet instanceof Dog) {
			((Dog)pet).bark();
			
		}else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}

	}

}
