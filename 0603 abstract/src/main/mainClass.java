package main;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  abstract : 추상
		  			완전체는 아닌 선언만 되어있는 메소드 포함하고 있는 클래스 
		  			
		  			추상메소드 + 일반메소드 = 추상클래스
		  			>선언만 되어 있는 것 
		  			
		  			생성 불가능하다 --> 상속 후 생성 가능해진다 
		  			
		  public int method(char c, int i) => prototype		
		
		기본 기능을 부모클래스에 넣어두고
		상속 받은 클래스에서 정의하라라고 주는 부분이 추상 메소드
		
		
		
		 */
		
		// 생성이 불가능하다 AbstractClass acls = new AbstractClass();
		
		MyClass cls = new MyClass();
		cls.abstractMethod();
		cls.method();
		
		AbstractClass acls = new MyClass();
		//이게 가능해짐 
		acls.abstractMethod();
		acls.method();
		
		AbstractClass aac = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass aac abstractMethod");
				
			}
		};
		aac.abstractMethod();
		
	}

}
