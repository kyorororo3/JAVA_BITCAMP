package sup;

public class SuperClass extends Object{

	private int number;
	
	
	public SuperClass() {
		//기본 생성자는 언제나 만드는 걸로 
		System.out.println("SuperClass SuperClass()");
	}


	public SuperClass(int number) {
		super();  //기본으로 상속받는 것이 object라는 것 자바에서 기본적으로 상속을 받고 있는 클래스가 object 지워도 상관 없음
		this.number = number;
		System.out.println("SuperClass SuperClass(int number)");
	}
	
	public void method() {
		System.out.println("SuperClass method()");
	}
	
	public void overRideMethod() {
		System.out.println("SuperClass overRideMethod()");
		

	}
	
	//하위 클래스에서 재정하는 것을 오버라이드
}
