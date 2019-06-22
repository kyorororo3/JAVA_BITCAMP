package main;

import java.util.ArrayList;

import abstractweapon.AbstractWeapon;
import abstractweapon.Atype;
import abstractweapon.Btype;
import person.Person;

public class mainClass {

	public static void main(String[] args) {

		
		
		/*
		Person human = new Person();
		human.Create(new Btype());		//실제생성
		
		//확인 출력해주는 부분
		human.m_weapon.DrawWeapon();
		human.m_bomb.DrawBomb();
		*/
		
		ArrayList<Person> list = new ArrayList<Person>();

		AbstractWeapon type[] = {new Atype(), new Btype(), new Atype(),new Btype(),new Btype()};
		Person human = new Person();
		
		for (int i = 0; i < type.length; i++) {	
			human.Create(type[i]);
			
			human.m_weapon.DrawWeapon();
			human.m_bomb.DrawBomb();
			
			list.add(human);
		}
		
	}

}
