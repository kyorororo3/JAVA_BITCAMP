package dao;

import java.util.Iterator;
import java.util.TreeMap;

import dto.Human;
import dto.Pitcher;
import single.SingletonClass;

public class sortDefenseClass implements DaoInterface {

	SingletonClass sc = SingletonClass.getInstance();
	
	@Override
	public void process() {
		TreeMap<Double, Pitcher> tMap = new TreeMap<Double, Pitcher>();
		Iterator<Integer> it = sc.map.keySet().iterator();
		
		double seq = 0.0000001;
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = sc.map.get(key);
			if(h instanceof Pitcher) {
			Pitcher p = (Pitcher) h;
			tMap.put(p.getDefence() + seq, p);
			seq = seq + 0.0000001;
			}
		}
		
		Iterator<Double> its = tMap.descendingKeySet().iterator();
		
		double num1;
		double num2 = 0;
		int rank = 1;
		while(its.hasNext()) {
			Double key = its.next();
			Pitcher p = tMap.get(key);
			
			num1 = p.getDefence();
			if(num1 == num2) {
				rank--;
				num2 = num1;
				System.out.println(rank + "위" + p.toString());
				rank++;
			}
			else {
				num2 = num1;
				System.out.println(rank + "위" + p.toString());
				rank++;
			}
		}
		
		// TODO Auto-generated method stub
		
	}

}
