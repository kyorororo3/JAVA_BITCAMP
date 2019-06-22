package dao;

import java.util.Scanner;

import dto.StudentDto;

//Data Access Object
public class DaoClass {
	Scanner scan = new Scanner(System.in);
	StudentDto students[];
	private int count;
	
	public DaoClass() {
		students = new StudentDto[5];
		count = 0;
	}
	StudentDto dto = new StudentDto();
	// insert
	public void insert() {
		//학생 정보 추가
		//입력	
			System.out.print("학생번호를 입력해주세요 : ");
			dto.setNumber(scan.nextInt());
			System.out.print("학생이름을 입력해주세요 : ");
			dto.setName(scan.next());
			System.out.print("국어점수 : ");
			dto.setLang(scan.nextInt());
			System.out.print("영어점수 : ");
			dto.setEng(scan.nextInt());
			System.out.print("수학점수 : ");
			dto.setMath(scan.nextInt());
			students[count] = dto;	//new StudentDto(dto.getNumber(), dto.getName(), dto.getLang(), dto.getEng(), dto.getMath());
			count++;
	
	}
		
	
	// delete
	public void delete() {
		System.out.print("몇 번 학생의 정보를 삭제하시겠습니까? ");
		count = scan.nextInt();
		switch(count) {
		case 1 :
			students[count-1] = null;
			System.out.println(count + "번 학생의 정보가 삭제되었습니다. ");
			break;
		case 2 :
			students[count-1] = null;
			System.out.println(count + "번 학생의 정보가 삭제되었습니다. ");
			break;
		case 3 :
			students[count-1] = null;
			System.out.println(count + "번 학생의 정보가 삭제되었습니다. ");
			break;
		case 4 :
			students[count-1] = null;
			System.out.println(count + "번 학생의 정보가 삭제되었습니다. ");
			break;
		case 5 :
			students[count-1] = null;
			System.out.println(count + "번 학생의 정보가 삭제되었습니다. ");
			break;
		}
		
	}
	
	// select == search
	public void select() {
		System.out.print("몇 번 학생의 정보를 검색하시겠습니까? ");
		count = scan.nextInt();
		switch(count) {
		case 1 :
			System.out.println("students[" + (count-1) + "] = " + students[count-1]);
			break;
		case 2 :
			System.out.println("students[" + (count-1) + "] = " + students[count-1]);
			break;
		case 3 :
			System.out.println("students[" + (count-1) + "] = " + students[count-1]);
			break;
		case 4 :
			System.out.println("students[" + (count-1) + "] = " + students[count-1]);
			break;
		case 5 :
			System.out.println("students[" + (count-1) + "] = " + students[count-1]);
			break;
		}
	}
	
	// update
	public void update() {
		
		System.out.print("몇 번 학생의 정보를 수정하시겠습니까? ");
		count = scan.nextInt();
		switch(count) {
		case 1 :
			insert();
			break;
		case 2 :
			insert();
			break;
		case 3 :
			insert();
			break;
		case 4 :
			insert();
			break;
		case 5 :
			insert();
			break;
		}
	}
	
	// allprint
	public void allprint() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("students[" + i + "] = " + students[i]);
		}
	}
	
}
