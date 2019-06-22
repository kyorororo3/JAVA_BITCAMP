package animal;

public class Cat extends Animal {

	
	public Cat(String name) {
		super(name);
	}
	public void print() { // over riding 된 함수
		//super.print(); //주석 처리할 경우 이름이 안나오게 된다는 것
		System.out.println("고양이입니다.");
		
		}
	
	public void catMethod() {
		System.out.println("무기는 발톱입니다.");
	}
}
