package main;

import java.util.Scanner;

import Dao.dao;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int choice;
		dao d = new dao();
		while(true) {
			System.out.println("=========================");
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제");
			System.out.println("3. 선수 검색");
			System.out.println("4. 선수 수정");
			System.out.println("5. 모두 출력");
			System.out.println("6. 파일 저장");
			System.out.println("7. 프로그램 종료");
			System.out.println("=========================");
			System.out.print("원하시는 작업의 번호를 입력해주세요 : ");
				choice = scan.nextInt();
				
			
			switch(choice) {
			case 1:
				d.insert();
				break;
				
			case 2:
				d.delete();
				break;
				
			case 3:
				d.select();
				break;
				
			case 4:
				d.update();
				break;
				
			case 5:
				d.allprint();
				break;
			case 6:
				d.saveData();
				break;
			}
			if(choice == 7) {
				System.out.println("이용해주셔서 감사합니다. ");
				break;
			}
		}
		
		
		
	}

}
