package com.javaex.basics.reftypes;

import java.util.Arrays;

public class EnumEx {

	public static void main(String[] args) {
			
		enumEx1();

	}
	
	public static void enumEx1() {
		Week today = Week.WEDNESDAY;
		System.out.println(today);
		
		System.out.printf("오늘은 %s(%d)입니다.%n",today.name(),today.ordinal());
		
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name()+obj.ordinal());
		
		System.out.printf("%s와 %s의 순번 차 : %d%n",today.name(),obj.name(),today.compareTo(obj));
		
		Week[] days = Week.values();
		System.out.println(Arrays.toString(days));
		
	}

}
