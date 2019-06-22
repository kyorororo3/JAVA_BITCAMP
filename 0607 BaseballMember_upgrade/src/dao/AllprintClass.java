package dao;

import java.util.Iterator;

import dto.Human;
import single.SingletonClass;

public class AllprintClass implements DaoInterface {

	SingletonClass sc = SingletonClass.getInstance();
	
	@Override
	public void process() {
		
		Iterator<Integer> it = sc.map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = sc.map.get(key);
			System.out.println(h.toString());
		}
		
	}

}
