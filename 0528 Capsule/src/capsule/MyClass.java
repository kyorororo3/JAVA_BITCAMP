package capsule;

public class MyClass {

	//캡슐화 내부에서만 접근이 가능하게 하고 외부에서는 차단하게끔 하는 것
	//캡슐화 class 내부에 사용할 변수를 묶음
	private int number;
	String name;
	
	//은닉성 변수의 외부와의 접근을 제어
	//this == instance 주소
	public void setNumber(int number) { 	//setter라는 메소드를 통해서 접근
		this.number = number;   //this.number = num;
		//멤버 변수는 디스 , 가인수는 구냥 냅두는 것  구분이 필요할 때 사용하기 좋다 

	}
	
	public int getNumber() {	//getter 외부에서 가져오는 것 
		return number;
		
	}
	
	public MyClass getInstance() {
		return this; //자기 자신을 가리키는 주소 
	}
	//은닉성 == 우리 마음대로 감추기도하고 드러내기도 하는 것을 말하는 것 

	
}
