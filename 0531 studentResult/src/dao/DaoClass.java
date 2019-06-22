package dao;

import java.util.Scanner;

import dto.StudentDto;

public class DaoClass {
		//backend (안보이는 부분에서 일을 하는 )
		Scanner scan = new Scanner(System.in);
		StudentDto students[];
		private int count;
		private int studentNum;
		
		public DaoClass() {
			students = new StudentDto[5];
			count = 0;
			studentNum = 1001;
		}
		
		//insert
		
		//insert => allPrint => search => select =>
		public void insert() {
			//바로 과목을 볼 수 있기 때문에 선생님은 이것을 선호함
			System.out.print("이름: ");
			String name = scan.next();
			
			System.out.print("국어: ");
			int lang = scan.nextInt();
			
			System.out.print("영어: ");
			int eng = scan.nextInt();

			System.out.print("수학: ");
			int math = scan.nextInt();
			
		StudentDto dto = new StudentDto(studentNum, name, lang, eng, math);
		students[count] = dto;
		count++;
		studentNum++;
		
		System.out.print("");
		}
		
		//delete
		public void delete() {
			System.out.print("삭제할 학생의 이름 : ");	
			String name = scan.next();
			
			int index = search(name);
			if(index == -1) {
				System.out.println("학생 정보를 찾을 수 없습니다.");
			}
			else {
				StudentDto dto = students[index];
				dto.setNumber(0);
				dto.setName("");
				dto.setLang(0);
				dto.setEng(0);
				dto.setMath(0);
				System.out.println("학생 데이터를 삭제하였습니다. ");
			}
		}
		
		
		//select == search
		public void select() {
			System.out.print("검색할 학생의 이름 : ");	
			String name = scan.next();
			
			int index = search(name);
			if(index == -1) {
				System.out.println("학생 정보를 찾을 수 없습니다.");
			}
			else {
				// StudentDto dto = students[index];
				// System.out.println(dto.toString());
				System.out.print("검색된 학생 정보 : ");
				System.out.println(students[index].toString());
			}
		}
		
		//update
		public void update() {
			System.out.print("수정할 학생의 이름 : ");	
			String name = scan.next();
			
			int index = search(name);
			if(index == -1) {
				System.out.println("학생 정보를 찾을 수 없습니다.");
				return;
			}
			System.out.println("수정할 데이터를 입력해주세요. ");
			System.out.print("국어: ");
			int lang = scan.nextInt();
			
			System.out.print("영어: ");
			int eng = scan.nextInt();

			System.out.print("수학: ");
			int math = scan.nextInt();
			
			StudentDto dto = students[index];
			dto.setLang(lang);
			dto.setEng(eng);
			dto.setMath(math);
			
			System.out.println("수정을 완료하였습니다.");
		}
		
		//search
		public int search(String name) {
			int findIndex = -1;
			
			for (int i = 0; i < students.length; i++) {
				StudentDto dto = students[i];
				if(dto != null && dto.getNumber() != 0) {
				// 0을 먼저 비교했을 경우, nullPointExcetion이 나오게 됨. null은 언제나 앞에서 조건으로 제시해야함
						//String dtoName = dto.getName();
						//if(name.equals(dtoName)) {
							
					if(name.equals(dto.getName())) {
						findIndex = i;
						break;
					}
				}
			}
			return findIndex;
		}
		
		//allPrint
		public void allprint() {
			for (int i = 0; i < students.length; i++) {
				StudentDto dto = students[i];
				if(dto != null /* && dto.getNumber() != 0 */) {
					System.out.println(dto.toString());
				}
			}
		}
		
		
}
