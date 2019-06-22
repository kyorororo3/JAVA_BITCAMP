package parent;

public class Parent {

	
	private int number;
	
	public Parent() {
		// this(2); 무한루프 돌게 되어버림
		System.out.println("Parent Parent()");
	}
	
	public Parent(int number) {
		//this();
		this.number = number;
		System.out.println("Parent Parent(int i)");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/*
	  Over Ride*****굉장히 중요
	   자식클래스에서 상속 받은 메소드를 고쳐 기입하는 것  (추가기입으로 볼 수도 있음)
	   부모님한테 상속받은 메소드가 부족해서 거기에 고쳐서, 추가해서 기입하는 것
	   
	 
	 */
	
	public void method() {
		System.out.println("Parent method()");
	}
}
