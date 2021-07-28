package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalEx {

	public static void main(String[] args) {

//		dateEx();
		calenderEx();

	}

	private static void calenderEx() {
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		// 주의 월정보는 0부터 싲가
		custom.set(1999, 11, 31);

		System.out.println("현재 :" + now);
		System.out.println("사용자 정의 : " + custom);

		// 캘린더에어 현재년도, 월, 일
		// 캘린더 상수 사용

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);

		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", year, month, date);

		// 100D일 후로 이동

		Calendar future = Calendar.getInstance();
		future.add(Calendar.DATE, 100);
		System.out.printf("100d일 후 : %d년 %d월 %d일 입니다", future.get(Calendar.YEAR), future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));

		// 이날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		String dowStr = null;

		switch (dow) {
		case Calendar.SUNDAY:
			dowStr = " 일요일";
			break;
		case Calendar.MONDAY:
			dowStr = " 월요일";
			break;

		case Calendar.TUESDAY:
			dowStr = " 화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = " 수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = " 목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = " 금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = " 트요일";
			break;
		}
	
		System.out.println(dowStr);

	}

	private static void dateEx() {
		// 날짜를 얻어온다.
		Date now = new Date(); // 현재 날짜와 시간
		System.out.println(now);

		// 포매터 : 형식화 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long :" + df.format(now));
		// TODO: Datafornat을 midium, shor로 바꿔서 출력 포맷을 해보자

		DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MIDIUM : " + dfm.format(now));
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Short : " + dfs.format(now));

		// simple data format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("SDF : " + sdf.format(now));

		// TODO : Time Format을 바꿔가며 출력을 확인해 봅시다.

	}

}
