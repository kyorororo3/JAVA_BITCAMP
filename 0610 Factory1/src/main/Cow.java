package main;

public class Cow implements Animal {

	@Override
	public void printDescript() {
	System.out.println("홯소입니다.");
	 CowMethod();
	}
	public void CowMethod() {
		System.out.println("음메음메");
	}
}
