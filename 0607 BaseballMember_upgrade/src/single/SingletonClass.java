package single;

import java.util.HashMap;

import dto.Human;

public class SingletonClass {
	
	private static SingletonClass single = null;
	
	public HashMap<Integer, Human> map;
	
	
	private SingletonClass(){
		map = new HashMap<Integer, Human>();
	}
	
	public static SingletonClass getInstance() {
		if(single == null) {
			single = new SingletonClass();
			
		}
		return single;
	}
}
