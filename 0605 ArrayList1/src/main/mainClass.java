package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import dto.MemberDto;

public class mainClass {

	public static void main(String[] args) {
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		//추가
		MemberDto dto = new MemberDto(1000,"홍길동");
		list.add(dto);
		
		list.add(new MemberDto(1002,"일지매"));
		
		dto = new MemberDto(1003,"정수동");
		list.add(dto);
		
		/*
		for (int i = 0; i < list.size(); i++) {
			MemberDto d = list.get(i);
			System.out.println(d);
			// System.out.println(d.toString());
		}
		*/  //d 에 대입해서 나오게 됨 리스트 안에 있는 것이 차례차례 나오는 것 안에있는 value가 넘어온다는 것이 키포인트
		for(MemberDto d : list) {
			System.out.println(d.toString());
		}
		
		
		// for each 배열하고 리스트에서만 사용
		int array[] = {1, 2, 3};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for(int num : array) { //num은 인덱스넘버가 아니라 어레이 안에 있는 값을 가져오는 자료형이다
			System.out.println(num);
		}
		
		//원하는 곳에 추가
		
		list.add(1,new MemberDto(1001,"임꺽정"));
	
		for(MemberDto d : list) {
			System.out.println(d.toString());
		}

		///////////////////////////////////////////////
		
		//삭제
		list.remove(2);
		for(MemberDto d : list) {
			System.out.println(d.toString());
		}
		MemberDto dt = list.get(2);
		list.remove(dt);
		for(MemberDto d : list) {
			System.out.println(d.toString());
		
		}
	
		int findIndex = -1;
		for(int i = 0; i < list.size(); i++) {
			MemberDto d = list.get(i);
			if("임꺽정".equals(d.getName()));
				findIndex = i;
				break;
		}
	
		MemberDto findObj = null;
			for(int i = 0; i < list.size(); i++) {
			MemberDto d = list.get(i);
			if("임꺽정".equals(d.getName()));
				d = findObj;
				break;
		}
		list.remove(findObj);
		for(MemberDto d : list) {
			System.out.println(d.toString());
		}
		
		
		
		
		/////////////////////////////////////////////
		
		//검색
		dto = new MemberDto(1000,"홍길동");
		findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			MemberDto d = list.get(i);
			if(d.getName().equals(dto.getName())) { //주소를 비교할 수 없음
				findIndex = i;
				break;
			}
		}
		System.out.println("findIndex = " + findIndex);
		
		//////////////////////////////////////////////
		
		//수정
		
		dto = new MemberDto(1005, "성춘향");
		
		list.set(0, dto);
		
		for(MemberDto d : list) {
			System.out.println(d.toString());
		}
		
		
		
		// vector == ArrayList
		// Linked list (추가되는 메소드가 더 있다)
		
		Vector<MemberDto> vec = new Vector<MemberDto>();
		vec.add(new MemberDto(11,"코끼리"));
		vec.add(new MemberDto(22,"기린"));
		vec.add(new MemberDto(33,"사자"));
		vec.size();
		
		for (MemberDto mem : vec) {
			System.out.println(mem.toString());
			
		}
		
		//Linked list   <----> ArrayList instance 교환이 가능 : 검색할 때는 ArrayList를 사용하고 추가,삭제를 할 때 Linked list를 사용하는 것 
		//추가/삭제의처리 속도가 빠르다 == Game에서 진짜 많이 사용 다만 검색 속도는 느림
		
		LinkedList<MemberDto> _list = new LinkedList <MemberDto>( list );  // 교환을 위해 ArrayList를 생성자의 매개변수로 넣는 것 
		
		if(_list.isEmpty()) {
			System.out.println("list가 비어있습니다.");
		}
		
		_list.addFirst(new MemberDto(1000, "일지매"));
		_list.addLast(new MemberDto(1010,"일매"));
		//이건 결국 add랑 별반 차이가 없기 때문에 잘 안쓰임
		
		for (MemberDto m : _list) {
			System.out.println("_list:" + m.toString());
		}
		
		//iterator == 반복자   // 맵에서 주로 사용 된다
		//pointer
		// int number = 1;
		// int *p;
		// p = &number; 1000;
		// p++; 		1004;
		//*p -> 1 값
		// p -> 1000 주소;
		
		Iterator<MemberDto> it; 
		
		it = _list.iterator();
		//it 안에 0번지 주소값이 들어가있다.
		
		while(it.hasNext()) { //다음값이 있을 때까지 돌아가
		//	MemberDto d = it.next(); // 값을 넘겨주면서 이동 
		//	System.out.println("it:" + d.toString());
			System.out.println("it:" + it.next());
		}
		it = _list.iterator();
		System.out.println("it:" + it.next()); // 
	}

}
