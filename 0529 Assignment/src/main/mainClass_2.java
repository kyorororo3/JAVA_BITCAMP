package main;

import java.util.Scanner;

import dice.diceClass;

public class mainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		diceClass d = new diceClass();
		
		
		d.init();
		while(true) {	
			d.randomDice();
			d.userInput();
			d.playDice();
			d.Printing();
		
			Scanner scan = new Scanner(System.in);
			System.out.print("다시 배팅하시겠습니까?(y/n)");
			String answer = scan.next();
			
			if(answer.equals("n")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
		
	}

}
