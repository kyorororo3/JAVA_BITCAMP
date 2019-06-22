package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 map : dictionary(사전)  -> json xml(데이터관리 사용하기가 너무 힘들어서 json이 나타난 것 )
		 
		 <HashMap> <==> 웹으로 전송할 경우 json으로 
		 데이터를 넘겨주고 넘겨받고 하는게 HashMap과 jason이 함
		 apple : 사과
		 key    value   --> pair(쌍)
		 		String
		 		Integer
		 		MemberDto
		 		
		 		
		 key 중복을 허용하지 않습니다. 
		 apple < - 사과 
		 apple < - 능금
		 --> 이 경우, 사과라는 값이 없어지고 능금만 생김
		 
		 2진 트리 구조 
		 
		 <TreeMap>
		 
		 TreeMap : hashMap + sorting
		 sorting을 위해서 HashMap과 호환시킬 수 있다
		 
		 관리: key로 관리
		 */
		//HashSet의 경우 집합 사용할일이 거의 없음
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		//관리가 필요할 때는 interface를 쓰는 것이 정석이다
		// Map<Integer, String> hMap = new HashMap<Integer, String>();  부모클래스이기때문에 다른 트리맵과 함께 쓰기가 편함
		//보편적으로 key로 dto를 주기보단 value로 함
		
		//추가
		hMap.put(1001, "사과");
		hMap.put(1002, "배");
		hMap.put(1003, "바나나");
		hMap.put(1004, "오렌지");
		hMap.put(1005, "귤");
		
		//원하는 위치 추가는 불가능 
		
		// Iterator<Integer> it = hMap.keySet().iterator(); Key값을 넣어야함
		
		// 정답만 집어오는 느낌
		
		//삭제
	//	hMap.remove(1004); //value 값을 넘겨주면서 지움 
		
		String val = hMap.remove(1004);
		System.out.println("val :" + val);
		//삭제한 후 key값을 찾는 방법
		
		//확인작업 key 가 있는지 없는지 
		boolean b = hMap.containsKey(new Integer(1004));
		System.out.println("b =" + b );
		
		
		//검색
		
		boolean b1 = hMap.containsKey(new Integer(1004));
		System.out.println("b1 =" + b1 );
		
		//수정
		
		hMap.replace(1002, "pear");
		
		
		
		
		/*
		
		Iterator<Integer> it = new hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next(); //값을 넘겨주면서 다음 포인터로 이동 
			String value = hMap.get(key);
			System.out.println("key 값" + key + " " + "value값 " + value);
			
		}
		
		
		//HashMap<String, Object> map = new HashMap<String, object>();
		*/
		
		for (Integer key : hMap.keySet()) {
			String value = hMap.get(key);
			System.out.println("key 값" + key + " " + "value값 " + value);
			
		}
		
		
		//////////////////////////////////////////////////////////////
		HashMap<String, String> sMap = new HashMap<String, String>();
		//사전
		//apple: 사과
		
		//추가
		sMap.put("고양이", "cat");
		sMap.put("강아지", "dog");
		sMap.put("양", "sheep");
		
		for (String key : sMap.keySet()) {
			String value = sMap.get(key);
			System.out.println("key 값 " + key + " " +  " value값 " + value);
		}
		//삭제
	
		String _str = sMap.remove("고양이");
		System.out.println("남은 value값" + _str);

		Iterator<String> its = new sMap.keySet().Iterator();
		while(its.hasNext()) {
			Integer key = its.next(); //값을 넘겨주면서 다음 포인터로 이동 
			String value = hMap.get(key);
			System.out.println("key 값" + key + " " + "value값 " + value);
		}
		//검색
		
		//수정
		
		//모두출력
		
		
		
		
		
	}

}
