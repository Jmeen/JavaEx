package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// Hashtable 생성
		Map<String, ClassRoom> map = new Hashtable<>();

		// 맵에 데이터 넣기 : put
		map.put("101", new ClassRoom("java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("python", "R301"));
		map.put("201", new ClassRoom("Linux", "R201"));

		System.out.println(map);

		// 데이터 가져오기 : 키를 이용 접근
		System.out.println("301:" + map.get("301"));

		// 키가 있는지 확인
		System.out.println("301키 있음?" + map.containsKey("301"));
		System.out.println("501키 있음?" + map.containsKey("501"));

		// 값이 있는지 ?
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		System.out.println("Equals : "+map.get("101").equals(new ClassRoom("java","R201")));
		
		//Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) { // 뒤에 요소가 남아 있는가?
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		map.clear();
		System.out.println(map);
		

	}

}
