package child; //부모랑 자식을 같은 패키지에다가 넣어둔다

import sup.SuperClass;

public class SubClass extends SuperClass {


	public SubClass() {
		System.out.println("SubClass SubClass()");
	}
	
	public SubClass(int number) {
		super(number);
		System.out.println("SubClass SubClass(int number)");
	}
	public void overRideMethod() {
		//super.overRideMethod(); //super class에 있는 메소드
		System.out.println("SubClass overRideMethod()");
	}
	
	
	public void func() {
		System.out.println("SubClass func()");
	}
}
