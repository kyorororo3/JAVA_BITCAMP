package single;

import java.util.ArrayList;

import dto.StudentDto;

public class Singleton {

	private static Singleton s = null;
	public ArrayList<StudentDto> list;
	
	private Singleton() {
		list = new ArrayList<StudentDto>();  //이 list는 클래스 어디에도 접근이 가능하게 됨
	}

	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
			
		}
		return s;
	}
}
