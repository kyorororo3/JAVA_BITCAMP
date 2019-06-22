package main;

import java.util.Scanner;

import dao.AllprintClass;
import dao.DaoInterface;
import dao.DeleteClass;
import dao.InsertClass;
import dao.SelectClass;
import dao.UpdateClass;
import dao.sortDefenseClass;
import file.FileClass;


public class mainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		DaoInterface d1 = new InsertClass();
		DaoInterface d2 = new DeleteClass();
		DaoInterface d3 = new SelectClass();
		DaoInterface d4 = new UpdateClass();
		DaoInterface d5 = new AllprintClass();
		DaoInterface d6 = new sortDefenseClass();
		FileClass f = new FileClass();
		
		
		
		while(true) {
			int choice = -1;
			System.out.println("=========================");
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제");
			System.out.println("3. 선수 검색");
			System.out.println("4. 선수 수정");
			System.out.println("5. 모두 출력");
			System.out.println("6. 방어율 순서로 출력");
			System.out.println("7. 파일 저장");
			System.out.println("8. 프로그램 종료");
			System.out.println("=========================");
			System.out.print("원하시는 작업의 번호를 입력해주세요 : ");
				choice = scan.nextInt();
				
			
			switch(choice) {
			case 1:
				d1.process();
				break;
				
			case 2:
				d2.process();
				break;
				
			case 3:
				d3.process();
				break;
				
			case 4:
				d4.process();
				break;
				
			case 5:
				d5.process();
				break;
			case 6:
		
				break;
			case 7:
				f.saveData();
				break;
			}
			if(choice == 8) {
				System.out.println("이용해주셔서 감사합니다. ");
				break;
			}
		}
	}
}
