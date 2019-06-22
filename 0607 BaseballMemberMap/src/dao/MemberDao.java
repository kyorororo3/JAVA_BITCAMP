package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.FileClass;

public class MemberDao {

	Scanner sc = new Scanner(System.in);
	
	private int sequence; // 회원번호에다가 +1 을 더해주는 존재 그다음으로 가는 것 번호 +1 
	// member의 index를 관리하기 위한 변수 
	ArrayList<Human> list;
	
	FileClass myfile;
	
	
	public MemberDao() {
		//밖에서 유저가 입력하는 경우
	
		sequence = 1001;
		myfile = new FileClass();
		list = new ArrayList<Human>();
				
		
		myfile = new FileClass("lions");
		
		loadData(); // 파일로부터 배열에 세팅

		int lastNum = 0;
		if(list.isEmpty()) {
			lastNum = 1001;
		}
		else {
		Human h = list.get(list.size() - 1);
		lastNum = h.getNumber();
	
		sequence = 1000 + (lastNum%1000 + 1);
		}
	}
	
	public void insert() {
		System.out.print(">>선수 등록");
		System.out.println("투수(1)/타자(2) 중 등록하고 싶은 포지션을 입력해주세요.");
		System.out.print(">>");
		int pos = sc.nextInt();
		
		// 이름
		System.out.print("이름 >>");
		String name = sc.next();
		// 나이
		System.out.print("나이 >>");
		int age = sc.nextInt();
		// 키 
		System.out.print("키 >>");
		double height = sc.nextDouble();
		
		Human human = null; //초기화
		//pitcher
		if(pos == 1) {
			//승
			System.out.print("승 >>");
			int win = sc.nextInt();
			//패
			System.out.print("패 >>");
			int lose = sc.nextInt();
			//방어율
			System.out.print("방어율 >>");
			double defence = sc.nextDouble();
			
			human = new Pitcher(sequence, name, age, height, win, lose, defence);
			
		}
		
		//batter
		else {
			/*
			 
			 human = new Batter(sequence + 1000)
			 batter와 pitcher의 구분을 회원번호로 바로 볼 수 있도록 
			 번호는 sequence 하나로 관리가 된다.
			 --> 사원전체를 체크할 때 쓰기 편하도록
			 
			 */
			//승
			System.out.print("볼 >>");
			int bat = sc.nextInt();
			//패
			System.out.print("안타 >>");
			int hit = sc.nextInt();
			//방어율
			System.out.print("안타율 >>");
			double hitAvg = sc.nextDouble();
			
			human = new Batter(sequence + 1000 , name, age, height, bat, hit, hitAvg);
			
			
			
		}
		list.add(human);
		sequence++;
	}	
	
	public void delete() {
		System.out.print("삭제하고 싶은 이름>>");
		String name = sc.next();
		
		int findIndex = search(name);
		
		if(findIndex == -1) {
			System.out.println("데이터를 찾지 못하였습니다. ");
			return; //지뢰 심어놓기
		}
		
		Human h = list.remove(findIndex);
		System.out.println(h.toString() + " 데이터를 삭제하였습니다.");
			
	}
	
	public void select() { //나중가서 가장 어려운 부분 검색의 종류가 많이 때문에 오라클에서 셀렉트를 제일 많이 파야함
		System.out.print("검색하고 싶은 이름>>");
		String name = sc.next();
		
		int findIndex = search(name);
		
		if(findIndex == -1) {
			System.out.println("데이터를 찾지 못하였습니다. ");
			return; //지뢰 심어놓기
		}
		System.out.println("검색된 데이터는 >> ");
		Human h = list.get(findIndex);
		System.out.println(h.toString());
		
	}
	public void update() {
		
		System.out.print("수정하고 싶은 이름>>");
		String name = sc.next();
		int findIndex = search(name);
		
		if(findIndex == -1) {
			System.out.println("데이터를 찾지 못하였습니다. ");
			return; //지뢰 심어놓기
		}
		// if(member[findIndex] instanceof Pitcher) {
		Human h = list.get(findIndex);	
		if(h instanceof Pitcher) {
				
			System.out.print("승 >>");
			int win = sc.nextInt();
			//패
			System.out.print("패 >>");
			int lose = sc.nextInt();
			//방어율
			System.out.print("방어율 >>");
			double defence = sc.nextDouble();
			
			
			Pitcher p = (Pitcher)h;
			p.setWin(win);
			p.setLose(lose);
			p.setDefence(defence);
			
		}
		else if(h instanceof Batter) {
			//승
			System.out.print("볼 >>");
			int bat = sc.nextInt();
			//패
			System.out.print("안타 >>");
			int hit = sc.nextInt();
			//방어율
			System.out.print("안타율 >>");
			double hitAvg = sc.nextDouble();
			
			
			Batter b = (Batter)h;
			b.setBat(bat);
			b.setHit(hit);
			b.setHitAvg(hitAvg);
			
		}
		
	
	}
	public void allprint() {
	
		if(list.size() == 0) return;
		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
		System.out.println(h.toString());
		}
	}
	
	public int search(String name) {
		int findIndex = -1;
		/*
		for (int i = 0; i < member.length; i++) {
			Human h = member[i];
			if(h != null && !h.getName().equals("")) {
				if(name.equals(h.getName())) {
					findIndex = i;
					break;					
				}
			}
		}*/
		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				findIndex = i;
			}
			
		}
		
	  return findIndex;
	}
	public void saveData() {
		int dataLength = list.size();
		
		String datas[] = new String[dataLength];
		int len = 0;
		for (int i = 0; i <list.size(); i++) {
				datas[len] = list.get(i).toString();
				len++;
			}
	
		for (int i = 0; i < datas.length; i++) {
			System.out.println(i + "datas = " + datas[i]);
		myfile.writeFile(datas);}
	}
	public void loadData() {
		//Human member[] <= String []
		
		String datas[] = myfile.readFile();
		/*
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}*/ //확인 용
		
		//문자열을 자른 후 Pitcher, Batter에 맞게 데이터를 넣어줘야 함
		
		for (int i = 0; i < datas.length; i++) {
			String str = datas[i];				//1001-김일-28-167.5-4-6-2.5
			String data[] = str.split("-");     //1001 김일 28 167.5 4 6 2.5
												//번호    이름  나이 키      승 패 방어율
			int number = Integer.parseInt(data[0]); //투수인지 타자인지 알아보기 위한 방법
			if(number <2000) { //투수
				Pitcher p = new Pitcher(number, 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]));
				list.add(p);
			}
			else {			   //타자
				Batter b = new Batter(number, 						//	번호
									  data[1], 						//  이름
									  Integer.parseInt(data[2]), 	//  나이
									  Double.parseDouble(data[3]), 	// 	키
									  Integer.parseInt(data[4]), 	//  승
									  Integer.parseInt(data[5]),    //  패
									  Double.parseDouble(data[6])); //  방어율
				list.add(b);
			}
		}
	}
	
	public void defenceSort() {
		TreeMap<Double, Pitcher> tMap = new TreeMap<Double, Pitcher>();
		double seq = 0.000001;
		//list를 맵에 넣어주기
		//Human에서 Pitcher만 받아오는 작업
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(h instanceof Pitcher) {
				Pitcher pit = (Pitcher)h;
				tMap.put(pit.getDefence() +seq , pit);
				seq = seq +  0.000001;
			}
		}
		
		Iterator<Double> it = tMap.descendingKeySet().iterator();
		while(it.hasNext()) {
			Double key = it.next();
			Pitcher p = tMap.get(key);
			System.out.println(key + " : " + p.toString());
		}
		
	}
}