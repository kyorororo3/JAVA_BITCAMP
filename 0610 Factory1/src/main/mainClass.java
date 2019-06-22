package main;

import java.awt.List;
import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {
		//게임프로그램에서 많이 사용되는 편
	/*
		Animal ani1 = AnimalFactory.Create("야옹이");
		ani1.printDescript();
		Cat cat = (Cat)ani1;
		cat.CatMethod();
		
		Animal ani2 = AnimalFactory.Create("멍멍이");
		ani2.printDescript();
		Dog dog = (Dog)ani2;
		dog.DogMethod();
	
		
		Animal ani3 = AnimalFactory.Create("황소");
		ani3.printDescript();
		Cow cow = (Cow)ani3;
		cow.CowMethod();
		
		*/
	
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		String aniName[] = {"멍멍이", "야옹이","황소"};
		//이 String을 파일로 불러와서 집어넣는 느낌으로 실무에 적용됨
		
		for (int i = 0; i < aniName.length; i++) {
			Animal ani = AnimalFactory.Create(aniName[i]);
			list.add(ani);
		}
		/*
		Animal ani = AnimalFactory.Create("멍멍이");
		list.add(ani);
		ani = AnimalFactory.Create("야옹이");
		list.add(ani);
		ani = AnimalFactory.Create("황소");
		list.add(ani);
		*/
		
		
		for (int i = 0; i < list.size(); i++) {
			Animal a = list.get(i);
			a.printDescript();
		}
	
		for (int i = 0; i < list.size(); i++) {
			Animal a = list.get(i);
			if(a instanceof Cat) {
				((Cat)a).CatMethod(); 
			}
			else if(a instanceof Cow) {
				((Cow)a).CowMethod();
			}
			else if(a instanceof Dog) {
				Dog d = (Dog)a;
				d.DogMethod();
			}
		}
	}
	

}
