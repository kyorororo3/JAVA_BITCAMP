package capsule;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	  캡슐화(은닉성)
	  상속성
	  다형성
	  
	  class 내부에 있는 요소 (멤버변수)를 외부와 차단
	  
	  
	 */
		
		MyClass cls = new MyClass();
		//cls.number = 1;
		cls.setNumber(1);
		int n = cls.getNumber();

		System.out.println(cls);  //주소 capsule.MyClass@15db9742
		cls.name = "홍길동";
		
		MyClass mcls = new MyClass();
		System.out.println(mcls); //주소 capsule.MyClass@6d06d69c
		
		
		System.out.println(mcls.getInstance());
	}

}
