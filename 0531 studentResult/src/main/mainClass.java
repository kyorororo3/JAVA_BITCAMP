package main;

import java.util.Scanner;

import dao.DaoClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scan = new Scanner(System.in);
		//menu
		//1.학생을 등록하시겠습니까
		
		DaoClass dao = new DaoClass();
			//front end
		//menu
		/*
		 1. 학생정보를 추가
		 2. 학생정보를 삭제
		 3. 학생정보를 검색
		 4. 학생정보를 수정
		 5. 학생정보를 모두 출력
		 
		 */
		while(true) {
			System.out.println("---------------------");
			System.out.println("       M E N U");
			System.out.println("---------------------");
			System.out.println("    1. 학생정보 추가");
			System.out.println("    2. 학생정보 삭제");
			System.out.println("    3. 학생정보 검색");
			System.out.println("    4. 학생정보 수정");
			System.out.println("    5. 학생정보 출력");
			System.out.println("    6. 프로그램 종료");
			System.out.println("---------------------");
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
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		if(choice == 6) {
			break;
		}
		}
	}

}
