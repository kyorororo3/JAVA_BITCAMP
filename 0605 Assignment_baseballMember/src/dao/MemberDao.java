package dao;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.FileClass;

public class MemberDao {

	Scanner scan = new Scanner(System.in);
	FileClass myFile;
	private int memberCount;
	private int sequence;
	HashMap<Integer, Human> map = new HashMap<Integer, Human>();
	
	
	
	public MemberDao() {
		memberCount = 0;
		System.out.print("새로 만들 파일/불러올 파일의 이름을 적어주세요>> ");
		String filename = scan.next();
		myFile = new FileClass(filename);
		loadData();
		if(map.isEmpty()) {
			sequence = 1001;			
		}
		else {
			int lastNum = 0;
			Iterator<Integer> it = map.keySet().iterator();
			while(it.hasNext()) {
				Integer key = it.next();
				Human h = map.get(key);
				if(!map.isEmpty()) {
					lastNum = key;
				}
				else {
					break;
				}
			}
		memberCount = lastNum + 1;
		sequence = 1000 + (map.get(lastNum).getNumber()%1000) + 1;
		}
	}
	
	
	//insert
	public void insert() {
		System.out.println("-선수 등록-");
		System.out.print("투수(1)/타자(2) 중 하나를 선택해주세요 >>");
		int pos = scan.nextInt();
		System.out.print("선수 이름 >>");
		String name = scan.next();
		System.out.print("선수 나이>>");
		int age = scan.nextInt();
		System.out.print("선수 키>>");
		double height = scan.nextDouble();
		
		
		if(pos == 1) {
			System.out.print("승 >>");
			int win = scan.nextInt();
			System.out.print("패 >>");
			int lose = scan.nextInt();
			System.out.print("방어율>>");
			double defense = scan.nextDouble();
			
			Human human = new Pitcher(sequence, name, age, height, win, lose, defense);	
			map.put(memberCount, human);
		}
		
		else {
			System.out.print("볼 >>");
			int bat = scan.nextInt();
			System.out.print("안타 >>");
			int hit = scan.nextInt();
			System.out.print("안타율>>");
			double hitAvg = scan.nextDouble();
			
			Human human = new Batter(sequence+1000, name, age, height, bat, hit, hitAvg);	
			map.put(memberCount, human);
		}
		sequence++;
		memberCount++;
	}
	
	//delete
	public void delete() {
		System.out.print("삭제할 선수 이름>> ");
		String name = scan.next();
		Integer findIndex = search(name);
		if(map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
		
		map.remove(findIndex);
		System.out.println("선수 정보를 정상적으로 삭제하였습니다.");
	}
	
	//select
	public void select() {
		System.out.print("검색할 선수 이름>> ");
		String name = scan.next();
		Integer findIndex = search(name);
		if(map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
			
		Human h = map.get(findIndex);
		System.out.println("baseballMember : " + h.toString());
	}
	
	//update
	public void update() {
		System.out.print("검색할 선수 이름>> ");
		String name = scan.next();
		Integer findIndex = search(name);
		if(map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
		if(map.get(findIndex) instanceof Pitcher) {
			System.out.print("승 >>");
			int win = scan.nextInt();
			System.out.print("패 >>");
			int lose = scan.nextInt();
			System.out.print("방어율>>");
			double defense = scan.nextDouble();
			
			Pitcher p = (Pitcher)map.get(findIndex);
			p.setWin(win);
			p.setLose(lose);
			p.setDefense(defense);
			
			map.replace(findIndex, p);
		}
		else if(map.get(findIndex) instanceof Batter) {
			System.out.print("볼 >>");
			int bat = scan.nextInt();
			System.out.print("안타 >>");
			int hit = scan.nextInt();
			System.out.print("안타율>>");
			double hitAvg = scan.nextDouble();
			
			Batter b = (Batter)map.get(findIndex);
			b.setBat(bat);
			b.setHit(hit);
			b.setHitAvg(hitAvg);
			map.replace(findIndex, b);
		}
	}
	
	//search
	public Integer search(String name) {
		
		Iterator<Integer> it = map.keySet().iterator();
		
		Integer findIndex = 0;
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = map.get(key);
			if(h.getName().equals(name)) {
				findIndex = key;
			}
		}
		return findIndex;
	}
	
	//allprint
	public void allprint() {
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = map.get(key);
			System.out.println("baseballMember : "+ key + " " + h.toString());
		}
	}
	
	public void saveData() {
		Iterator<Integer> it = map.keySet().iterator();
		Integer dataLength = 0;
		while(it.hasNext()) {
			
			dataLength = it.next();
			Human h = map.get(dataLength);	
		}
		int len = 0;
		String datas[] = new String[dataLength+1];
		for (int i = 0; i < datas.length; i++) {
			if(map.get(i) != null && !map.get(i).getName().equals("")) {
				datas[len] = map.get(i).toString();
				len++;
			}
		}
		for (int i = 0; i < datas.length; i++) {
			System.out.println(i + "datas = " + datas[i]);
			myFile.writeFile(datas);
		}
	}
	
	public void loadData() {
	
		String datas[] = myFile.readFile();
		
		for (int i = 0; i < datas.length; i++) {
			String str = datas[i];
			String data[] = str.split("-");
		
			int number = Integer.parseInt(data[0]);
			if(number <2000) {
				Human p = new Pitcher(number,
										data[1],
										Integer.parseInt(data[2]),
										Double.parseDouble(data[3]),
										Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6]));
			map.put(i, p);}
			else {
				Human b = new Batter(number,
									  data[1],
									  Integer.parseInt(data[2]),
									  Double.parseDouble(data[3]),
									  Integer.parseInt(data[4]),
									  Integer.parseInt(data[5]),
									  Double.parseDouble(data[6]));
			map.put(i, b);
			}
		}
	}
	public void highestDefense() {
		TreeMap<Integer, Human> tMap = new TreeMap<Integer, Human>(map);
		
		System.out.println("비교해 볼 선수의 수 : " + tMap.size());
		
		Iterator<Integer> it = tMap.keySet().iterator();
	
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = tMap.get(key);
		/*	if(h instanceof Batter) {
				tMap.remove(key);
			}*/
		}
//		System.out.println("비교해 볼 투수의 수 : " + tMap.size());
	
		TreeMap<Double, String> defenseMap = new TreeMap<Double, String>();
		
		it = tMap.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			Human h = tMap.get(key);
			if(h instanceof Pitcher) {
			Pitcher p = (Pitcher) h;
			defenseMap.put(p.getDefense(), p.getName());	
			}
	
		}
		Iterator<Double> its = defenseMap.descendingKeySet().iterator();
		
		int w = 1;
		while(its.hasNext()) {
			Double key = its.next();
			String name = defenseMap.get(key);
			System.out.println(w + "위 안타율 : " + key + "선수 이름 : " + name);
			w++;
		}
		
		
	}
	
}
