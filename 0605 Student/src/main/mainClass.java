package main;

import java.util.Scanner;

import dao.StudentDao;

public class mainClass {

	public static void main(String[] args) {
		// student : ArrayList, LinkedList 둘 중 하나
		// baseball : ArrayList, HashMap
		// 타율 순 높은 타율부터 내림차순  같은 
		// +1 0.01/0.02
		Scanner scan = new Scanner(System.in);
		
		StudentDao dao = new StudentDao();
	
		while(true) {
			int choice = -1;
			System.out.println("=========================");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 검색");
			System.out.println("4. 학생 수정");
			System.out.println("5. 모두 출력");
			System.out.println("6. 파일 저장");
			System.out.println("7. 프로그램 종료");
			System.out.println("=========================");
			System.out.print("원하시는 작업의 번호를 입력해주세요 : ");
				choice = scan.nextInt();
				
			
			switch(choice) {
			case 1:
				dao.insert();
				break;
				
			case 2:
				dao.delete();
				break;
				
			case 3:
				dao.select();
				break;
				
			case 4:
				dao.update();
				break;
				
			case 5:
				dao.allprint();
				break;
			case 6:
			//	dao.saveData();
				break;
			}
			if(choice == 7) {
				System.out.println("이용해주셔서 감사합니다. ");
				break;
			}
		}
		
		
	
		
	}

}
