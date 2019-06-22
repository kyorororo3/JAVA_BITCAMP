package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDto;
import file.FileClass;
import single.Singleton;

public class StudentDao {

	Scanner scan = new Scanner(System.in);
	
	StudentDto dto = new StudentDto();
	//ArrayList<StudentDto> list = new ArrayList<StudentDto>();
	private int sequence;
	FileClass file;
	
	
	public StudentDao() {
		
		file = new FileClass("StudentInfo");
		
		Singleton sc = Singleton.getInstance();
		if(sc.list.size() == 0) {
			sequence = 1001;
		}
		else {
			StudentDto sd = sc.list.get(sc.list.size()-1);			
			sequence = sd.getNumber() + 1;
		}
	}
	
	//insert
	
	public void insert() {
		System.out.print("학생 이름 : ");
		String name = scan.next();
		System.out.print("국어 점수 : ");
		int lang = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		
		dto.setNumber(sequence);
		dto.setName(name);
		dto.setLang(lang);
		dto.setEng(eng);
		dto.setMath(math);
		
		Singleton sc = Singleton.getInstance();
		sc.list.add(new StudentDto(sequence, name, lang, eng, math));
		
		sequence++;
	}
	//delete
	public void delete() {
		Singleton sc = Singleton.getInstance();

		System.out.print("삭제할 학생이름 : ");
		String name = scan.next();
		
		int findIndex = search(name);
		
		if(sc.list.get(findIndex) == null && name.equals("")) {
			System.out.println("학생이름을 찾을 수 없습니다.");
			return;
		}
		
		sc.list.remove(findIndex);
		System.out.println("학생 정보가 정상적으로 삭제되었습니다. ");
		
	}
	
	
	//select
	
	public void select() {
		Singleton sc = Singleton.getInstance();

		System.out.print("검색할 학생이름 : ");
		String name = scan.next();
		
		int findIndex = search(name);
		
		if(sc.list.get(findIndex) == null && name.equals("")) {
			System.out.println("학생이름을 찾을 수 없습니다.");
			return;
		}
		StudentDto d = sc.list.get(findIndex);
		System.out.println(d.toString());
	}
	
	//search
	public int search (String name) {
		Singleton sc = Singleton.getInstance();

		int findIndex = -1;
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto d = sc.list.get(i);
			if(name.equals(dto.getName()) &&  name.equals(d.getName())) {
				findIndex = i;
			}
	
		}
		return findIndex;
	}
	
	
	//update
	public void update() {
		Singleton sc = Singleton.getInstance();

		System.out.print("수정할 학생이름 : ");
		String name = scan.next();
		
		int findIndex = search(name);
		
		if(sc.list.get(findIndex) == null && name.equals("")) {
			System.out.println("학생이름을 찾을 수 없습니다.");
			return;
		}
		System.out.print("국어 점수 : ");
		int lang = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		
		dto.setLang(lang);
		dto.setEng(eng);
		dto.setMath(math);
		
		
		sc.list.set(findIndex, dto);
		System.out.println("학생 정보가 정상적으로 수정되었습니다. ");
	}
	
	//allprint
	Singleton sc = Singleton.getInstance();

	public void allprint() {
		for (StudentDto sd : sc.list) {
			System.out.println(sd.toString());
		}
	
	}
	
}
