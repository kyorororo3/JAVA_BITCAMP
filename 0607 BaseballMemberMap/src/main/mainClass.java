package main;

import java.util.Scanner;

import dao.MemberDao;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MemberDao dao = new MemberDao();

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
				dao.defenceSort();
				break;
			case 7:
				dao.saveData();
				break;
			}
			if(choice == 8) {
				System.out.println("이용해주셔서 감사합니다. ");
				break;
			}
		}
		
		
		
	}

}
