package constructor;

public class MyClass {

			
			/*
			 constructor : 생성자 			!=초기화 		처음 값 설정
			 destructor : 소멸자 -> c++;  
			 
			 c++이 자바보다 먼저 나온 것
			 가비지 콜렉터가 해주는 기능 destructor 
			
			 int arr[] = { 1, 2, 3, 4, 5};
			 
			 structure(구조체) c언어
			STRUCT myst{
			 	int num,
			 	double d,
			 	String s
			 };
			 
			 myst st = {1, 1.5, "abc"};
			 
			 // number, name
			 MyClass cls = {1, "홍길동" }; 초기화 불가능 
			 클래스에선 불가능 c++도 그러함
			 
			 
			 생성자
			 1. 함수 -> method
			 2. 클래스명과 같은 이름을 쓰자
			 3. return 값이 없다.
			 4. Over Load가 가능하다 
			 5. 1번만 호출, 임의의 호출이 불가능 
			 6. initialize과는 성격이 다르다.
			 7. 생략이 가능하다
			 8. 실행되는 시기는 객체를 생성시(new라고 적어놓았을 때)
			 
			 소멸자는 반드시 1개 (delete) c++;에 있음
			 
			 
			 
			 */
			
		/*
		 생성자의 목적은 무엇인가?
		 배열처럼 초기값을 넣고 싶어요 라는 마음에서 시작된 것
		 
		 */
	public MyClass(){		//기본 생성자 
	System.out.println("MyClass MyClass()");
		
		}
	
	public MyClass(int i) {
		this(); // MyClass() 호출
		System.out.println("MyClass MyClass(int i)");
	}
	public MyClass(char c) {
		this(1); //MyClass(int i) 호출
		System.out.println("MyClass MyClass(char c)");
	}
}

