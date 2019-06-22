package child;

import sup.SuperClass;

public class ChildClass extends SuperClass {

	
	public ChildClass() {
		System.out.println("ChildClass ChildClass() ");
	}
	
	public ChildClass(int number) {
		super(number); // this와 함께 사용 할 수 없다.
		System.out.println("ChildClass ChildClass(int number)");
	}
	
	public void overRideMethod() {
		//super.overRideMethod(); //super class에 있는 메소드
		System.out.println("ChildClass overRideMethod()");
	}
	
	public void function() {
		System.out.println("ChildClass function()");
	}
}
