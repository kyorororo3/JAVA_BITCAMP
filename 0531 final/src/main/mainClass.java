package main;

public class mainClass {
	public static void main(String[] args) {
	//final
		
		final int number = 1; //변수 -> 상수
		
		
	}
}


 /* final */ class SuperClass{
	//상속때 부모클래스에 final을 붙이면 자식 클래스에서 에러가 난다. 상속 받지 못함
	
	 
	 public /* final */ void method() {
		 	//상속받는건 가능 하지만 over ride 금지
	 }
}

class ChildClss extends SuperClass{
	
	public void method() { //over ride
		 
	 }
	
}