package main;

import java.util.Calendar;

import vo.MemberVo;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		MyClass mycls = new MyClass();
	
		mycls.method();
		mycls.function();
	초기화 해야할 부분이 많다면 */	
		
		MyClass mycls = MyClass.getInstance();
		//위에 것과 출력이 같다
		
		Calendar cal = Calendar.getInstance();
		
		//class array  (객체 배열)
		YouClass ycls[] = new YouClass[5];		// 배열만 생성 == 변수만 선언
		//YouClass ycls0, ycls1; 이런식으로 변수여럿을 묶은 배열의 변수만 선언한거랑 똑같음
		
		//ycls[0] = new YouClass();
		
		for (int i = 0; i < ycls.length; i++) {
			ycls[i] = new YouClass();
		} // 하나씩 동적할당 되는것 영역이 잡히는 것
		

		
		ycls[0].setNumber(1);
		ycls[0].method();
		
		
		
		//3명에 대한 Data
		MemberVo member[] = new MemberVo[3];
		
		for (int i = 0; i < member.length; i++) {
			member[i] = new MemberVo();
		} //동적할당을 안하는 것을 제일 많이 하는 실수
		
		member[0].setAge(24);
		member[0].setName("홍길동");
		
		member[1].setAge(21);
		member[1].setName("일지매");
		
		member[2].setAge(27);
		member[2].setName("임꺽정");
		
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].toString());
		}
	}

}
