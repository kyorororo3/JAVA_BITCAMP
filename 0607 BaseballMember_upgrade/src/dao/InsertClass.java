package dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.FileClass;
import single.SingletonClass;

public class InsertClass implements DaoInterface  {



	SingletonClass sc = SingletonClass.getInstance();
	HashMap<Integer, Human> hMap = new HashMap<Integer, Human>();
	FileClass f = new FileClass();
	private int sequence;
	private int keyNum;
	
	
	
	public InsertClass() {
		int lastNum;
		sc.map = hMap;
		f.loadData();
		if(sc.map.isEmpty()) {
			sequence = 1001;
		}
		else {
			Human h = sc.map.get(sc.map.size() - 1);
			lastNum = h.getNumber();
		
			sequence = 1000 + (lastNum%1000 + 1);
			keyNum = sc.map.size();
			}
		
	}
	
	@Override
	public void process() {
		System.out.println("선수 등록");
		System.out.print("투수(1)/타자(2) 중 등록할 선수를 선택해주세요 >>");
		int pos = scan.nextInt();
		
		Human human = new Human();
		
		System.out.print("선수 이름>> ");
		String name = scan.next();
		
		System.out.print("선수 나이>> ");
		int age = scan.nextInt();
		System.out.print("선수 키>> ");
		double height = scan.nextDouble();
		
		if(pos == 1) {
			System.out.print("승>> ");
			int win = scan.nextInt();

			System.out.print("패>> ");
			int lose = scan.nextInt();

			System.out.print("방어율>> ");
			double defense = scan.nextDouble();

			human = new Pitcher(sequence, name, age, height, win, lose, defense);
			
		}
		else {
			System.out.print("볼>> ");
			int bat = scan.nextInt();

			System.out.print("안타>> ");
			int hit = scan.nextInt();

			System.out.print("안타율>> ");
			double hitAvg = scan.nextDouble();

			human = new Batter(sequence+1000, name, age, height, bat, hit, hitAvg);
			
		}
		hMap.put(keyNum,human);
		sequence++;
		keyNum++;
	}
	
	
}
