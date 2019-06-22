package main;

public abstract class AbstractClass {

	
	private int number;
	
	public abstract void abstractMethod();
	// abstract public void abstractMethod(); 도 가능
	
	public void method() {
		System.out.println("AbstractClass method()");
	}
}
