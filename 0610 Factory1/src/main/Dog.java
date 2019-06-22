package main;

public class Dog implements Animal {

	@Override
	public void printDescript() {
		System.out.println("멍멍이입니다.");
		DogMethod();
	}

	
	public void DogMethod() {
		System.out.println("멍멍");
	}
}
