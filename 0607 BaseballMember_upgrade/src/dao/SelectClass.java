package dao;

import dto.Human;
import single.SingletonClass;

public class SelectClass implements DaoInterface {
	
	SingletonClass sc = SingletonClass.getInstance();
	SearchClass s = new SearchClass();
	
	@Override
	public void process() {
	System.out.print("검색할 선수 이름>> ");	
		String name = scan.next();
		int findIndex = s.search(name);
		if(sc.map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
		Human h = sc.map.get(findIndex);
		System.out.println("검색한 데이터>> ");
		System.out.println(h.toString());
	}

}
