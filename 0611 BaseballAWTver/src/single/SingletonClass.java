package single;

import java.util.ArrayList;

import dto.Human;

public class SingletonClass {

	private static SingletonClass single = null;
	public ArrayList<Human> list;
	public int sequence;
	public String updateName;
	
	private SingletonClass() {
		list = new ArrayList<Human>();
		int lastNum;
		if(list.isEmpty()) {
			sequence = 1001;
		}
		else {
			Human h = list.get(list.size() - 1);
			lastNum = h.getNumber();
		
			sequence = 1000 + (lastNum%1000 + 1);
			
			}
		
	}

	
	public static SingletonClass getInstance() {
		if(single == null) {
			single = new SingletonClass();
		
		}
	
		return single; 
		
	}
	
	public Human search(String name) {
		int findIndex = -1;
		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				findIndex = i;
			}
			
		}
		Human human = list.get(findIndex);
		
	  return human;
	}
}
