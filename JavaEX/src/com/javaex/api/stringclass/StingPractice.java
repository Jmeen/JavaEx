package com.javaex.api.stringclass;

public class StingPractice {
	public static void main(String[] args) {
		String str = "aBcAbCabcABC";
		
		System.out.println("3번 문자열 "+str.charAt(3));
		System.out.println("abC가 처음 나오는곳 :"+str.indexOf("abc", 0));
		System.out.println("전체 문자열 : "+str.length());
		System.out.println("a를 R로 대체 : "+str.replaceAll("a", "r"));
		System.out.println("abc를 123으로 대체 : "+str.replaceAll("abc", "123"));
		System.out.println("처음3개 문자열만 출력 : "+str.substring(0,3));
		System.out.println("전체를 대문자로 : "+str.toUpperCase());

		
	}
}
