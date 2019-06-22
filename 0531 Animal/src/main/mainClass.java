package main;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal animal1 = new Cat("초록이");
		animal1.print();
		
		
		Animal animal2 = new Dog("멍멍이");
		animal2.print();
		
		Animal animal3 = new Cow("음메");
		animal3.print();
		
		Cat cat[] = new Cat[5];
		Dog dog[] = new Dog[3];
		Cow cow[] = new Cow[2];
		
		for (int i = 0; i < cat.length; i++) {
			cat[i] = new Cat("야옹1");
		}
		
		for (int i = 0; i < dog.length; i++) {
			dog[i] = new Dog("멍멍1");
		}
		for (int i = 0; i < cow.length; i++) {
			cow[i] = new Cow("음메1");
		}
		
		for (int i = 0; i < cat.length; i++) {
			cat[i].print();
		}
		for (int i = 0; i < dog.length; i++) {
			dog[i].print();
		}
		for (int i = 0; i < cow.length; i++) {
			cow[i].print();
		}
		// --> 하드코드로 바뀜
		
		Animal ani[] = new Animal[10];
		
		ani[0] = new Dog("멍멍");
		ani[1] = new Cat("야옹");
		ani[2] = new Cow("음메");
		
		for (int i = 0; i < ani.length; i++) {
			if(ani[i] != null) {
			ani[i].print();
			}
		//==> 하나의 인스턴스로 관리 강점
			
		}
	
	
		Cat c = (Cat)ani[1];
		c.catMethod();
		//cast 변환은 이걸 많이 씀 
	
	}

}
