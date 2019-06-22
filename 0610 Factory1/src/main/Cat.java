package main;

public class Cat implements Animal {

	@Override
	public void printDescript() {
		System.out.println("야옹이입니다.");
		CatMethod();
	}
	
	public void CatMethod() {
		System.out.println("야옹야옹");
	}

}
