package Dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Dto.Human;
import Dto.batter;
import Dto.pitcher;

public class dao {

	Scanner scan = new Scanner(System.in);
	
	Human baseballMember[];
	private int count;
	private int playerNum;
	
	
	public dao() {
		baseballMember = new Human[30];
		count = 0;
		playerNum = 1;
	}
	
	
	public void insert() {
		
		System.out.print("선수 이름 : ");
		String name = scan.next();
		System.out.print("선수 나이 : ");
		int age = scan.nextInt();
		System.out.print("선수 신장 : ");
		double height = scan.nextDouble();
		
		System.out.print("투수 or 타자 : ");
		String bOrP = scan.next();
		
		switch(bOrP){
			case "투수" :
				System.out.print("win : ");
				int win = scan.nextInt();
				System.out.print("lose : ");
				int lose = scan.nextInt();
				System.out.print("defense : ");	
				double defence = scan.nextDouble();
				Human dto1 = new pitcher(playerNum, name, age, height, win, lose, defence);
				baseballMember[count] = dto1;
				break;
				
			case "타자" :
				System.out.print("bat : ");
				int bat = scan.nextInt();
				System.out.print("hit : ");
				int hit = scan.nextInt();
				System.out.print("hitAvg : ");	
				double hitAvg = scan.nextDouble();
				Human dto2 = new batter(playerNum, name, age, height, bat, hit, hitAvg);
				baseballMember[count] = dto2;
				break;
		}
		count++;
		playerNum++;
		
		System.out.print("");
	}
	
	
	public void delete() {
		System.out.print("삭제할 선수 이름을 입력하시오: ");
		String name = scan.next();
		int index = search(name);
		if(index == -1) {
			System.out.println("선수 정보를 찾을 수 없습니다.");
		}
		else {
			Human dto = baseballMember[index];
				dto.setNumber(0);
				dto.setName("");
				dto.setAge(0);
				dto.setHeight(0);
			if(dto instanceof batter) {
				((batter) dto).setBat(0);
				((batter) dto).setHit(0);
				((batter) dto).setHitAvg(0);
			}
			else {
				((pitcher)dto).setWin(0);
				((pitcher)dto).setLose(0);
				((pitcher)dto).setDefence(0);
				
			}
		}
		System.out.println("선수 정보를 삭제하였습니다.");
	}
	
	
	public void select() {
		System.out.print("검색할 선수 이름을 입력하시오: ");
		String name = scan.next();
		int index = search(name);
		if(index == -1) {
			System.out.println("선수 정보를 찾을 수 없습니다.");
		}
		else {
			System.out.print("검색된 선수 정보 : ");
			System.out.println(baseballMember[index].toString());
		}
	}
	
	
	
	public int search(String name) {
		int findIndex = -1;
		
		for (int i = 0; i < baseballMember.length; i++) {
			Human dto = baseballMember[i];
			if(dto != null && dto.getNumber() != 0) {
				if(name.equals(dto.getName())) {
					findIndex = i;
					break;
				}
			}
		}
		return findIndex;
	}
	
	
	
	public void update() {
		System.out.print("수정할 선수 이름: ");
		String name = scan.next();
		
		int index = search(name);
		if(index == -1) {
			System.out.println("선수 정보를 찾을 수 없습니다.");
			return;
		}
		Human dto = baseballMember[index];
		
		if(dto instanceof batter) {
			System.out.print("bat : ");
			int bat = scan.nextInt();
			System.out.print("hit : ");
			int hit = scan.nextInt();
			System.out.print("hitAvg : ");	
			double hitAvg = scan.nextDouble();
			
			((batter) dto).setBat(bat);
			((batter) dto).setHit(hit);
			((batter) dto).setHitAvg(hitAvg);
		}
		else {
			System.out.print("win : ");
			int win = scan.nextInt();
			System.out.print("lose : ");
			int lose = scan.nextInt();
			System.out.print("defense : ");	
			double defence = scan.nextDouble();
			
			((pitcher)dto).setWin(win);
			((pitcher)dto).setLose(lose);
			((pitcher)dto).setDefence(defence);
			
		}
		System.out.println("선수 정보 수정이 완료되었습니다. ");
			
		
	}
	
	
	public void allprint() {
		for (int i = 0; i < baseballMember.length; i++) {
			Human dto = baseballMember[i];
			if(dto != null /* && dto.getNumber() != 0 */) {
				System.out.println(dto.toString());
			}
		}
		
	}
	
	public void saveData() {
	
		File newFile = new File("e:\\temp\\playerInfo.txt");
		
		
		try {
			FileWriter fileWriter = new FileWriter(newFile);
			for (int i = 0; i < baseballMember.length; i++) {
				Human dto = baseballMember[i];
				if(dto != null /* && dto.getNumber() != 0 */) {
					fileWriter.write(dto.toString()+"\n");
				}
			}
			System.out.println("playerInfo 파일에 저장 완료!!");
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
