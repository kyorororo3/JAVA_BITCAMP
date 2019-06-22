package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import dto.MemberDto;

public class mainClass {

	public static void main(String[] args) {
	/*
	 
	 TreeMap
	 단독으로 사용은 가능 하나 HashMap과 혼용함
	 HashMap을 업그레이드 시킨 것 
	 sorting이 필요할 때 treemap으로 가고 다시 hashmap으로 
	 
	 
	 */
		
	HashMap<Integer, MemberDto> map = new HashMap<Integer, MemberDto>();
	
	
	//추가
	MemberDto dto = new MemberDto(1, "홍길동");
	map.put(1001,dto);
	
	map.put(1002, new MemberDto(2,"일지매"));
	map.put(1000, new MemberDto(3,"성춘향"));
	
	
	//map.put(1001,new MemberDto(2,"임꺽정"));  //수정   추가가 아니다. 키값은 중복을 허하지 않기 때문에..
	
	
	//삭제
	//map.remove(1001);
	
	//map.remove(1001, map.get(1001));
	
	
	
	//검색
	//보통Object로 검색하는 것이 아닌, key 값으로 하는 것 
	
	//오름차순 정렬
	Iterator<Integer> it = map.keySet().iterator();
	
	Integer k = 0;
	while(it.hasNext()) {
		Integer key = it.next();
		MemberDto m = map.get(key);
		if(m.getName().equals("성춘향")) {
			k = key;
			break;
		}
	}
	
	MemberDto rdto = map.get(k);
	System.out.println("key 값  : "+ k +" value 값 : " + rdto.toString());
	
	//수정  ==> value key값의 경우 수정이 아닌 삭제해서 다시 만들어야 한다
	map.replace(1002, new MemberDto(6, "일지매"));  //보통 키값을 먼저 구하고 여기에 대입 위에 함수를 씀
	
	
	
	it = map.keySet().iterator();
	
		while(it.hasNext()) {
			Integer key = it.next();
			MemberDto m = map.get(key);
			System.out.println(m.toString());
			//키값으로 나오는 것이기 때문에 입력한 순서대로 나오는지는 중요하지 않다. 
		}
		
		
		//정렬 --> key로 정렬밖에 안됨. value의 경우 코드를 짜야함 
		TreeMap<Integer, MemberDto> tMap = new TreeMap<Integer, MemberDto>(map);
		//Map<Integer, MemberDto> tMap = new TreeMap<Integer, MemberDto>();
		
	
	it = tMap.keySet().iterator();
	
		while(it.hasNext()) {
			Integer key = it.next();
			MemberDto m = tMap.get(key);
			System.out.println("tmap : "+ key + " " + m.toString());
			//키값으로 나오는 것이기 때문에 입력한 순서대로 나오는지는 중요하지 않다. 
		}
		
		
		
	//내림차순
	
	it = tMap.descendingKeySet().iterator();
	
		k = 0;
		while(it.hasNext()) {
			Integer key = it.next();
			MemberDto m = map.get(key);
		
			System.out.println("tmap : "+ key + " " + m.toString());
			
		}
		
	TreeMap<Integer, MemberDto> numMap = new TreeMap<Integer, MemberDto>();
		
	it = tMap.keySet().iterator();
	
		while(it.hasNext()) {
			Integer key = it.next();  // 초기화를 돌려준 것
			MemberDto d = tMap.get(key);
		
			numMap.put(d.getNumber(), d);
	
		}
		
	it = numMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			MemberDto d = numMap.get(key);
			System.out.println("key: " + key + " value : " + d.toString());
			
			//number가 같은 경우 정렬이 안되기 때문에 time으로 쓰는 것 
		}
		
		
		
		HashMap<String, ArrayList<MemberDto>> maplist = new HashMap<String, ArrayList<MemberDto>>();
		// 책장 정리하듯이 
		ArrayList<MemberDto> lions = new ArrayList<MemberDto>();
		lions.add(new MemberDto(1, "김상현"));
		lions.add(new MemberDto(2, "이성민"));
		

		ArrayList<MemberDto> tigers = new ArrayList<MemberDto>();
		tigers.add(new MemberDto(1, "김성한"));
		tigers.add(new MemberDto(1, "선동열"));
		
		maplist.put("삼성", lions);
		maplist.put("기아", tigers);
		
		Iterator<String> its = maplist.keySet().iterator();
		its = maplist.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			ArrayList a = maplist.get();
			System.out.println("key: " + key + " value : " + a.toString());
			
		}
		
		// HashMap<Integer,ArrayList<Integer>> 이차원 배열
	
		
			
	}
	
}
