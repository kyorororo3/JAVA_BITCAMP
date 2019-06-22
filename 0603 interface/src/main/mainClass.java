package main;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 
		 
		 interface : 추상 메소드만을 포함하고 있는 것
		 			 abstract를 붙이지않는다
		 			 
		 			 interface 자체만으로 생성 불가능
		 			 상속 후 생성 가능
		 			 
		 			 다중 상속 가능 
		 			 일반 메소드는 추가할 수 없다.
		 			 변수는 추가할 수 없다.
		 			 
		 부모Class	: method를 무조건 정의 
		 	|
		 	| - 자식 클래스 1
		 	| - 자식 클래스 2
		 	| - 자식 클래스 3
		 
		 
		 interface로 정의를 먼저 한 후, 자식클래스에서 알아서 해야하는 것이 많으니까 부모클래스에서 무조건 정의를 할 필요 없게 만든 것 
		 	|
		 	| - 자식 클래스 1
		 	| - 자식 클래스 2
		 	| - 자식 클래스 3
		 
		 도형의 넓이를 구할 때 원, 삼각형, 사각형 마름모 등등 각자의 수식이 다르고 가로 세로도 다르고 유저가 원하는 것이 다르기 때문에 인터페이스에 넣어주기만 하고 자식 클래스가 알아서 수정하는 식의 느낌
		 
		 
		 */
		
		
		
		//Ainterface ai = new Ainterface();
		//껍데기에서 생성 불가 메소드의 정의가 되어있고 안되어있는 차이
		
		Aclass ac = new Aclass();
		ac.method();
		
		Ainterface ai = new Aclass();
		ai.method();
		
		AAclass ssc = new AAclass();
		ssc.method();
		ssc.func();
		
		Ainterface ai2 = new AAclass();
		Ainterface ai3 = new Aclass();
		
		ai3.method();
		ai2.method();
		// instance 값이 달라짐에 따라서 ai2.func();
		
		Ainterface a1 = new Aclass();
		Ainterface a2 = new A1class();
		
	}
}
