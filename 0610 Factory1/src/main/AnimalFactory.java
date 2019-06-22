package main;

public class AnimalFactory {

	
	public static Animal Create(String animalName) {
		
		if(animalName.equals("")) {
			System.out.println("생성할 클래스가 없습니다.");
		}
		
		if(animalName.equals("멍멍이")) {
			return new Dog();
		}
		else if(animalName.equals("야옹이")) {
			return new Cat();
		}
		else if(animalName.equals("황소")) {
			return new Cow();
		}
		return null;
	}
}
