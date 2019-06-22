package dice;

import java.util.Scanner;

public class diceClass {
	
	int coin;
	
	int r_sum;
	int u_sum;
	int bettingCoin;
	int totalCoin;
	int result;
	boolean clear;
	
	
	public void init() {
		coin = 20;
		totalCoin = totalCoin + coin;
		clear = false;
	}
	public void randomDice() {
		while(true) {
			
			int r_dice1 = (int)(Math.random()*6)+1;
			int r_dice2 = (int)(Math.random()*6)+1;
			r_sum = r_dice1 + r_dice2;
			
			if(r_sum != 2 && r_sum != 12) {
				System.out.print("주사위 번호는" + "( " + r_dice1 +", " + r_dice2+" )");
				System.out.println("   합은 "+ r_sum + " 입니다.");
				break;
			}
		}
	
	}
	
	public void userInput() {
		Scanner scan = new Scanner(System.in);
	

		System.out.print("배팅할 코인 수를 입력하세요 : ");
		bettingCoin = scan.nextInt();
		totalCoin = totalCoin - bettingCoin;
		System.out.println("배팅 후 남은 코인 수는 : " + totalCoin);
		
		while(true) {
		System.out.print("배팅할 두 주사위 합을 입력하세요 : ");
		u_sum = scan.nextInt();
			if(u_sum == 2 || u_sum == 12) {
				System.out.println("제시할 수 없습니다.");
			}
			else {
				break;
			}
		}
	}
	public void playDice() {
		if(r_sum == u_sum) {
			
			if(u_sum == 3 || u_sum == 11) {
				result = bettingCoin * 18;
				clear = true;
				
			}
			else if(u_sum == 4 || u_sum == 10) {
				result = bettingCoin * 12;
				clear = true;
			}
			else if(u_sum == 5 || u_sum == 9) {
				result = bettingCoin * 9;
				clear = true;
			}
			else if(u_sum == 6 || u_sum == 8) {
				result = bettingCoin * 7;
				clear = true;
			}
			else {
				result = bettingCoin * 6;
				clear = true;
			}
		}
		
		else {
		}
	}
	
	public void Printing() {
		if(clear == true) {
			System.out.println("축하합니다!!" + result + " 코인을 얻으셨습니다.");
			System.out.print("현재 총 코인은 "+ (totalCoin + result) + "입니다.");
			totalCoin = totalCoin+result;
		}
		else {
		System.out.println("배팅한 " + bettingCoin + " 코인을 잃으셨습니다.");
		System.out.println("현재 총 코인은 "+ (totalCoin) + "입니다.");
		}
	
	}
}
