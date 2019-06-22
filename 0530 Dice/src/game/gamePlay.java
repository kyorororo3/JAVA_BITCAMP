package game;

import java.util.Scanner;

import dice.Dice;

public class gamePlay {

	
	
	private int coin = 20;
	private int betting;
	private int inputNumber;
	
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	
	public void init() {
		dice1.diceRandom();
		dice2.diceRandom();
		
		System.out.println("dice1 : " + dice1.getNumber()  );
		System.out.println("dice2 : " + dice2.getNumber()  );
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		//betting
		System.out.print("배팅할 코인 : ");
		betting = sc.nextInt();
		
		coin = coin - betting;
		
		
		//sum of dice number
		while(true) {
			System.out.println("두 주사위의 합 : ");
			inputNumber = sc.nextInt();
			if (inputNumber > 2 && inputNumber < 12
					&& inputNumber !=2 && inputNumber != 12){
				break;
				
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오");
		}
		
		
		
	}
	
	public void finding() {
		
		int dNum1 = dice1.getNumber();
		int dNum2 = dice2.getNumber();
		
		int sum = dNum1 + dNum2;
		
		if(inputNumber == sum) {
			if(sum == 3 || sum == 11) {
				betting = betting * 18;
			}else if(sum == 4 || sum == 10) {
				betting = betting * 12;
			}else if(sum == 5 || sum == 9) {
				betting = betting * 9;
			}else if(sum == 6 || sum == 8) {
				betting = betting * 7;
			}else if(sum == 7) {
				betting = betting * 6;
			}
			System.out.println("축하합니다.");
			coin = coin + betting;
		}else {
			System.out.println("아쉽습니다. 다음기회에...");
		}
				
	
	}
	
	
	public void resultPrint() {
		System.out.println("주사위1: " + dice1.getNumber());
		System.out.println("주사위2: " + dice2.getNumber());
		
		System.out.println("합계 :" + (dice1.getNumber() + dice2.getNumber()));

		System.out.println("현재 코인 : "+ coin);
	}
	
}
