package main;

import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 list : 목록 
		 목적: 데이터를 관리하기 위한 요소(도구)
		 	STL Standard Template Library
		 	
		 Collection(수집)
		 
		 1) ArrayList
		  == Vector(단방향)
			 배열목록
			 배열 구조를 가지고 있다
			 선형구조 0-0-0-0-0
			 검색 속도가 빠르다(list중에서) 
			 관리: index number로 관리가 됨 0부터 시작
			 
		 2) LinkedList
		 	연결목록
		 	선형구조
		 	검색속도가 ArrayList에 비해 약간 느린 편 
		 	실시간으로 추가/삭제가 가능 -> 굉장히 우수한 편
		 	관리 인덱스번호로 
		 
		 3) HashMap      == json
		 	2진 Tree 구조
		 	가지가 2개 
		 	검색속도가 어마어마하게 빠르다
		 	pair로 관리가 된다 (한쌍, 두쌍) pair = key value 
		 	
		 3-1) TreeMap
		    HashMap과 굉장히 유사
		    HashMap에 비해 무겁다. 처리속도가 느림
		       대신 기능이 추가되어 있음 --> sorting가능
		    
		 
		 */
		//collection class 관리를 하는 클래스
		// ArrayList<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
		//list 인터페이스가 부모클래스 자식클래스인 Array list 이렇게 쓰는거 가능
		
		//추가
		Integer in = new Integer(111);
		list.add(in);
		
		list.add(222);
		list.add(333);
		
		int len = list.size();
		System.out.println("list의 길이는 " + len + "입니다.");
	
		// array[0], array[1], array[2]
		// list.get(0), list.get(1), list.get(2);
		//출력
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		}
		
		list.add(444);
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		}
		// 중간 추가
		list.add(1, new Integer(200));
		//list.add(1,200);
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		}
		//삭제 -검색이 항상 거쳐가는 작업
		
		list.remove(2);   //1. 인덱스 넘버로 삭제
		
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		} //메모리 위에서 삭제되는 것  즉 우리가 필요로 하는 양만 쓰기 좋음 
		// 어떤 언어든 리스트는 필수로 사용 
		
		Integer ri = list.get(1);
		list.remove(ri);  //2. 오브젝트를 삭제
		
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		}
		
		//검색
		int findIndex = list.indexOf(333);
		// int findIndex = list.indexOf(new Integer(333)); 같음
		
		System.out.println("검색된 index number = " + findIndex);
		
		//수정
		list.set(0, 100); // 0번지 111 -> 100으로 가는 것 
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n = " + n );
		}
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		String cls = new String();
		//상위 클래스 ArrayList는 제일 상위에 있는 object가 설정이 되어 있는거다
		Object obj = cls;
		
		
		// add(new Integer(111)) add(new String("hello"))  value가 들어가는 것이 아니라 object가 들어가야함 
		
		
		
		
		ArrayList<String> strlist = new ArrayList<String>();
		//추가, 삭제, 검색, 수정 -> 출력하면서 확인할 것 
		
		
		//추가
		String s = new String("hey");
		strlist.add(s);
		strlist.add("come on");
		strlist.add("가사를 까먹었다");
		
		for (int i = 0; i < strlist.size(); i++) {
			String lylics = strlist.get(i);
			System.out.println("Lylics = " + lylics);
		}
		
		//원하는 곳에 추가 
		
		strlist.add(2, "이런");
		
		for (int i = 0; i < strlist.size(); i++) {
			//String lylics = strlist.get(i);     // String str = member[i];
			//System.out.println("Lylics = " + lylics);
			//System.out.println(lylics.toString());  // toString은 생략 가능 
			System.out.println(strlist.get(i));
		}

		////////////////////////////////////////////////////////////////////////
		
		//삭제
		strlist.remove(0);
		String st = strlist.get(2);
		strlist.remove(st);
		// >> remove는 오버로드
		
		
		for (int i = 0; i < strlist.size(); i++) {
			String lylics = strlist.get(i);
			System.out.println("Lylics = " + lylics);
		}
		
		//검색
		//(1) 방법
		int findIndex1 = strlist.indexOf("come on");
		// int findIndex1 = strlist.indexOf(new String("come on"))'
		System.out.println("검색된 index number = " + findIndex1);
		
		
		//(2) 방법
		for (int i = 0; i <strlist.size(); i++) {
			String str = strlist.get(i);
			if(str.equals("come on"));
				findIndex1 = i;
				break;
		}
		System.out.println("검색된 index number = " + findIndex1);
		
		
		
		//수정
		//있는 부분을 지워서 삽입하는 것 
		//String _str = "그냥 끝내야겠다";
		//strlist.set(0, _str);
		//풀어쓰면 위와 같다
		strlist.set(0, "그냥 끝내야겠다");
		
		for (int i = 0; i < strlist.size(); i++) {
			String lylics = strlist.get(i);
			System.out.println("Lylics = " + lylics);
		}
		
	}

}
