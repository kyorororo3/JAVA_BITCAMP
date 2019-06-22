package Dao;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class MemberDao {

	private List<Human> list;
	private int sequence;
	
	public MemberDao() {
		list = new ArrayList<Human>();
		
		//file Load
		
		//sequence
		sequence = 1001;
	}
	
	public void insert(Human h) {
		h.setNumber(sequence);
		list.add(h);
	
		sequence++;
	}
	
	public boolean delete(String name) {
		Human h = select(name);
		if(h == null) {
			return false;
		}
		else {
			list.remove(h);
			return true;
		}
	}
	
	public Human select(String name) {
		Human h = null;
		for (int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
			if(name.equals(h.getName())) {
				h = list.get(i);
				break;
			}
		}
		return h;
		//null을 따지는 건 view에서 해야하는 것 
	}
	
	public void update(Human oldData, Human newData) {
		
		Human h = select(oldData.getName());
		
		//수정작업
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
			if(human == h) {
				findIndex = i;
				break;
			}
		}
		
		list.set(findIndex, newData);
		//찾지 못했을 때
	}
	
	public List<Human> allDatas(){
		return list;
	}
	
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
