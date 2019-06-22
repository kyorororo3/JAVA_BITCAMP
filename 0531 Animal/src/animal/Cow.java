package animal;

public class Cow extends Animal {

	public Cow(String name) {
		super(name);
		
	}

	public void print() { // over riding 된 함수
		//super.print();
		System.out.println("소입니다.");
		
		}
	
	
}
