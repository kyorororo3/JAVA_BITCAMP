package main;

import my.myClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		myClass cls = new myClass();
		
		cls.setNumber(2);
		cls.method();
		 static : 정적 != 동적
		 값을 유지하는 것
		 프로그램 시작시에 memory에 올라감으로 계속 유지 
		 남발을 해서는 안된다.
		 
		 
		 
		 global variable
		 ==>
		 
		 */
		
		myClass.st_number = 111;
		//클래스명이 옴 객체로 오지 않음
		//한지붕에있지만 객체에 의존하지 않고 혼자서 독립적으로 노는 놈이다.
		myClass cls = new myClass();
		System.out.println(cls.st_number);
		System.out.println(	myClass.st_number);
		
		myClass cls1 = new myClass();
		cls1.st_number = 222;
		System.out.println(	myClass.st_number);
		
		//여기번쩍 저기 번쩍 어디서든 부를 수 있는 존재
		
		System.out.println(cls.st_number);
		System.out.println(	myClass.st_number);
							//보통 이렇게 접근
		
		//메모리 공간이 이거 하나밖에 없구만. 객체가 몇개든 말든 메모리 공간은 하나다 
		
		
		
		//st_number 프로그램 작성시에 생성(static) 영역 하나 짜리 
		
		myClass cls2 = new myClass();		//number 여기서 생성(heap에 생성)
		
		cls2.function();		//num 여기서 생성(stack) 여기서 계속 유지를 하고 있음 
		cls2.function();
		cls2.function();
		
		myClass cls3 = new myClass();	//엄연히 다른 객체
		
		cls3.function();	// 새롭게 생성
		cls3.function();	// 새롭게 생성 되는 것
		cls3.function(); 	//공통 영역에서 사용되기 때문에 그대로 이어서 추가하게 된다. 위에 3이되었고 이걸로 4가 된다는 것
		
		
		myClass.st_method(); //instance를 가지고 호출하는게 아니라 클래스 이름으로 가져옴 
		
	}

}
