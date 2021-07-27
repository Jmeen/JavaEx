package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
//		StringBasicEx();
//		stringMethodEx();
		stringBufferEx();
	}
	
	
	private static void stringBufferEx() {
		// String 객체는 불변자료형(immutable)
		// StringBuffer 객체는 buffer기반의 가변자료형
		StringBuffer sb = new StringBuffer("This"); // 기본 버퍼 (10) 지정
		sb.append(" is pencel");
		
		System.out.println(sb);
		
		sb.insert(7, " My"); // insert 삽입
		System.out.println(sb);
		
		sb.replace(7, 10, " Your"); // replace 치환
		System.out.println(sb);  //toString()
		
		sb.setLength(10);
		System.out.println(sb);
		
		String s = new StringBuffer("This").append(" is my pencil").insert(7, " My").replace(7, 11, " Your").toString();
		System.out.println(s);
		
	}
	
	
	
	
	
	
	

	private static void stringMethodEx() {
		// 유용한 String Method
		String str = "Java Programming, JavaScript Programming";
		// 변환 메서드
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// String은 불변객체. 내부 내용이 변경되지 않음.
		System.out.println("원본 : " + str);

		// 인덱스 관련
		System.out.println("Length : " + str.length());
		System.out.println("5번째 문자 : " + str.charAt(5));

		// 검색관련
		System.out.println("java를 가지고있는가? " + str.contains("Java"));
		System.out.println("java 가 처음 나오는곳 : " + str.indexOf("Java"));
		System.out.println("java 가 2nd 나오는곳 : " + str.indexOf("Java", 3));
		System.out.println("java 가 2nd 나오는곳 : " + str.indexOf("Java", str.indexOf("Java") + 4));

		// 역방향 검색
		int idx = str.lastIndexOf("Java");
		System.out.println("역방향검색 " + idx);

		// 문자열 추출
		System.out.println("5번째 글자부터 16까지 :" + str.substring(5, 16)); // 5~16앞까지(15까지)

		// 치환
		System.out.println(str.replaceAll("Java", "C"));

		// 화이트 스페이스 제거
		String s2 = "                Hello            ";
		String s3 = ", Java";
		System.out.println(s2.trim() + s3);
		
		// 구분자로 분절
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
		
		// 메서드 체인
		String[] str3 = str.toUpperCase().replaceAll(",", "").split(" ");
		System.out.println(Arrays.toString(str3));
		
		// 문자열 비교(중요) - unicode의 비교
		System.out.println("ABC".compareTo("ABE"));
		// == 0	순서가 같다
		// <0	순서가 앞이다.
		// >0	순서가 뒤다.
		
	}

	private static void StringBasicEx() {
		String s1 = "java"; // 리터럴
		String s2 = new String("java"); // 새 객체 생성
		String s3 = "java"; // 리터럴

		// 리터럴 문자는 값이 같으면 같은 객체다
		System.out.println("s1 == s3 ? " + (s1 == s3));

		// 참조 객체는 다른 값을 가르키고 있어 다른 객체다.
		System.out.println("s1 == s2 ? " + (s1 == s2));

		// 문자열 내부에 char의 연속된 데이터
		String s4 = new String(new char[] { 'j', 'a', 'v', 'a' });
		System.out.println("s4 -> " + s4);

		String s5 = String.valueOf(Math.PI);
		System.out.println("s5 -> " + s5);

	}

	private static void practice() {

		String str = "aBcAbCabcABC";
		System.out.println(str.charAt(2));
		System.out.println();

	}

}
