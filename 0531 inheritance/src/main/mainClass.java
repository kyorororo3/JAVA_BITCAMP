package main;

import Child.Child;
import Child.Parents;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 상속성: 부모클랙스에 있는 모든 특성을 하위(자식)클래스에서 계승하는 것을 의미
		 
		 
		 */
		Parents pa = new Parents();
		
		pa.pMethod();
		pa.setpNumber(234);
		System.out.println(pa.getpNumber());
		
		
		Child ch = new Child();
		ch.pMethod();
		
		
		//하위클래스에 생성된 메소드는 상위클래스에서 접근이 불가능하다
		//다중상속은 불가능하다 ------자바에서!
		//c++의 경우 다중상속은 가능  extends Parents, Patrents2 이런식으로 
		
		//ch.pNumber = 12;
		
		
	}

}
