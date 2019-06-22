package dao;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import single.SingletonClass;

public class DeleteClass implements DaoInterface {
	
	SingletonClass sc = SingletonClass.getInstance();
	SearchClass s = new SearchClass();
	
	@Override
	public void process() {
		System.out.print("삭제할 선수 이름>>");
		String name = scan.next();
		
		int findIndex = s.search(name);
		if(sc.map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
		sc.map.remove(findIndex);
		
		System.out.println("선수의 데이터를 정상적으로 삭제하였습니다.");
	}

}
