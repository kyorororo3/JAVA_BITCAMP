package my;

public class myClass {

	
	private int number; //은닉성을 통해서 접근을 하려면 setter/getter로 접근할 수 있도록 설정해야함
	// 멤버 변수
	public static int st_number; // 정적 변수
	public static int num; //생성하지 않아도 무조건 잡힘 instance 생성한적 없음
	
	
	
	
	
	public int getNumber() { //멤버 메소드
		return number;
	}
	

	//멤버 메소드 == 인스턴스 메소드
	public void setNumber(int number) { //멤버 메소드
		this.number = number;
	}


	public void method() {//멤버 메소드
		int i; // stack에 올라간다 == auto
		// static이 있으면 메모리에 머물게끔 해주는 것
		//local variable  --> 무조건 stack안으로 들어간다
		System.out.println("MyClass method()");
		
		myClass.st_number = 222; // 이게 정석
		//어디서든 불러도 되는 존재
		
		st_number =333; // 이렇게 되긴하지만 그래도 정석을쓰자
		//우리 지붕 밑에 있으니까 앞에 있는 클래스명 쓸 필요 없음
		int num;
		
		// ==> 어떤 변수가 우선식 똥깨도 자기집에서 반은먹는게 아니라 다먹고 들어간다
		//local variable이 더 우선식됨
		//이렇게 쓰면 안되지만 로컬이 먼저라는걸 알아둬야 한다.
	}
	//어떤 메소드가 먼저 실행되는지 알고 싶을 때 static 변수에 증가연산자를 붙여서 호출하면 보인다. 프로그램의 전체 흐름을 볼 때 사용한다.
	public void function() {
		int num = 0;
		num++; // local variable
		number++; // member variable
		myClass.st_number++; // static variable
		
		//>> 메모리에 올라가는 순서가 다름
		System.out.println("num = " + num);
		System.out.println("number = " + number);
		System.out.println("st_number = " + myClass.st_number);
	
		//this.number =123;
		//힙 영역의 메모리
	}
	
	public static void st_method() {
		System.out.println("myClass st_method()");  //인스턴스를 사용해서 호출한게 아니라서 this를 접근을 못함 
	//	st_number = 123;
		// static메소드에서 static 변수는 접근이 가능 
	//	number = 12; 에러 member변수를 사용하지 못함 
	}
}
