package dao;

import java.util.Iterator;

import dto.Human;
import single.SingletonClass;

public class SearchClass{

	SingletonClass sc = SingletonClass.getInstance();
	
public Integer search(String name) {
		
		Iterator<Integer> it = sc.map.keySet().iterator();
		
		Integer findIndex = 0;
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = sc.map.get(key);
			if(h.getName().equals(name)) {
				findIndex = key;
			}
		}
		return findIndex;
	}

}
