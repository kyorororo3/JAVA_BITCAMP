package main;

import Cal.MyCal;
import myclass.MyClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 Object Oriented Programming
		 객체		지향	
		 
		 <---> 절차지향 : 순차적인 처리
		 
		 */
		
						//cls는 주소만 가지고 있음 
				MyClass cls = new MyClass(); //객체를 생성한 것
	//  class template  object(객체, instance(주체))
	// 				main(stack)  heap 영역
		// 변수와 같은 형태 
		//메모리 영역에 올라가는 실제 이름을 instance라고 함 MyClass를 동적할당했다는 것은 cls에 주소를 대입해준 것과 같다.
				
			//	System.out.println(cls);   //console myclass.MyClass@15db9742  -->  heap영역에 있는 cls 의 주소 4바이트 
		
			//stack(자동) heap
				
				{
					int n;
					//블록이 시작되면 변수가 활동하고 닫히면 자동적으로 사라지는 것
					// MyClass cls1 = new MyClass();
					
					//원래대로라면 delete cls1 지금은 garbage collector가 알아서 제거해줌
				}
				
				// heap은 사용하는 순간 계속 유지가 된다. 
				
		cls.number =123;
		cls.name = "홍길동";
		
		cls.method();
				
		MyClass mcls = null;
		mcls = new MyClass();
		//주소만 가지고 있는 변수
		//초기화는 어케? null!!! 0은 안됨
		
		int i; // i는 변수
		//변수는 저장영역이 하나 , 객체의 경우 딸린 식구들이 많아, 덩어리가 됨 범위의 영역이 다름
		
		/*
		 
		 OOP의 3대 요소
		 	캡슐화 == 은닉성
		 	다형성
		 	상속성
		 
		 
		 */
		
		//객체 지향의 장점
		//1. 각각 따로 관리해야하는 것들을 묶음으로 관리할 수가 있다.
		
		//절차
		int number[] = new int[5];
		String name[] = new String[5];
		int lang[] = new int[5];
		
		//객체
		MyClass member[] = new MyClass[6]; // 객체 생성

		
		//2. 가독성이 좋다

		//절차
		String students[][] = {
				{"1001", "홍길동", "90", "100", "80"},
				{"1002", "일지매", "90", "100", "80"}
		};
		
		String num1 = students[0][0];
		String num2 = students[1][0];
		
		
		//객체
		MyClass mycls = new MyClass();
		int num = mycls.number;
		
		
		//객체란 무엇인가? 
		
		//클래스란 붕어빵 틀 
		MyClass my1, my2, my3; //instance들은 붕어빵
		//다른색깔을 같게끔 보이게하는 것 붕어빵안에 슈크림이냐 팥이냐 
		
		my1 = new MyClass(); 
		my2 = new MyClass(); 
		my3 = new MyClass(); 
		
		my1.number = 1;
		my1.name = "김유신";
		
		my2.number = 2;
		my2.name = "계백";
		
		my3.number = 3;
		my3.name = "연개소문";
		
		
		
		MyCal cal = new MyCal();
		
		cal.input();
		cal.process();
		cal.resultPrint();
		//따로 넘버가 안보이는 것을 은닉성, 캡슐화  ------객체와의 첫번째 요소 
	
		
	}

}
