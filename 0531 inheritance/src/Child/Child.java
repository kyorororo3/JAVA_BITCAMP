package Child;

public class Child	extends Parents {

	public void func() {
		//parents class에서 접근은 불가능 
		
		pNumber = 12; //private 으로 바뀌었을 경우 바로 가져오지 못한다
		//int num = getpNumber();
		
		System.out.println("Child func()");
	}
}
