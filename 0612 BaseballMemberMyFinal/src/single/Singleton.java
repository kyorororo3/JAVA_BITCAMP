package single;

import Dao.MemberDao;

public class Singleton {

	private static Singleton s = new Singleton();
	public MemberDao dao;
	public String updateName;
	//어디서든 넣고 빼고가 가능하다 list의 경우 dao안에 있는거죠
//	public List<Human> list = new ArrayList<Human>();
	//dao에다가 다 모아두는 거라 생성자에서 생성하는게 맞다
	
	private Singleton() {
		System.out.println("singleton 생성자실행");
		dao = new MemberDao();
		updateName = "";
	}
	
	public static Singleton getInstance() {
		return s;
	}
	
	
	
}
