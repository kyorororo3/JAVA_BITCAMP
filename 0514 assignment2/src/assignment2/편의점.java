package assignment2;

import java.util.Scanner;

public class 편의점 {

	public static void main(String[] args) {
	
		/*-----------------------------------------------------------
		int ice = 3420;
		int customer = 10000;
		
		System.out.println("5000 = " + ((customer-ice)/5000));
		System.out.println("1000 = " + (((customer-ice)-5000))/1000);
		System.out.println("500 = " + (((customer-ice)-6000))/500);
		System.out.println("50 = " + (((customer-ice)-6500))/50);
		System.out.println("10 = " + (((customer-ice)-6550))/10);
		
		//%로 어떻게 하면 나올까
		
		-----------------------------------------------------------*/
		/*-----------------------------------------
		Scanner scan = new Scanner(System.in);
		
		int ice1, customer1, result;
		
		ice1 = scan.nextInt();
		customer1 = scan.nextInt();
		
		result = customer1 - ice1;
		/*---------------------------------------------------------*/
		//편의점 프로그램
		/*	금액:4230원
		 	지불한 금액:10000원
		 	
		 	10000-4230=5770
		 	거스름돈:출력
		 	5000원 -?장
		 	1000원 -?장
		 	500원 -?개
		 	100원 -?개
		 	50원 -?개
		 	10원 -?개
		 	
		 */
		Scanner sc = new Scanner(System.in);
		/*
		int price; //지불금액
		int myMoney; //지불한금액
		
		System.out.print("지불하실 금액:"); // \\->원 적는 방법
		price = sc.nextInt();
		System.out.print("자신이 낸 금액:"); // \\->원 적는 방법
		myMoney =sc.nextInt();
		
		int changeMoney = myMoney - price;
		
		//5000원
		System.out.println("거스름돈은"+changeMoney+"원입니다.");
		int m5000;
		m5000 = changeMoney/5000;
		System.out.println("5000원권:" +m5000 + "장.");
		//1000원
		int m1000;
		m1000 = (changeMoney%5000)/1000;
		System.out.println("1000원권:" +m1000 + "장.");
		
		//500원
		int m500;
		m500 = (changeMoney%1000)/500;
		System.out.println("500원권:" +m500 + "개.");
		
		//100원
		int m100;
		m100 = (changeMoney%500)/100;
		System.out.println("100원권:" +m100 + "개.");
		//50원
		int m50;
		m50 = (changeMoney%100)/50;
		System.out.println("50원권:" +m50 + "개.");
		//10원
		int m10;
		m10 = (changeMoney%50)/10;
		System.out.println("10원권:" +m10 + "개.");
		/**/
	
		
		//--------------------------------------------------
		
		int price, pay, change;
	
		
		System.out.print("지불할 금액:");
		price = sc.nextInt();
		System.out.print("지불한 금액:");
		pay = sc.nextInt();
	
		change = pay - price;
		System.out.println("거스름돈:"+change+"원입니다.");
		
		//int ge = change/5000;
		System.out.println("5000원권"+change/5000+"장");
									//	+ge+
		change= change%5000;
		System.out.println("1000원권"+change/1000+"장");
		
		change= change%1000;
		System.out.println("500원권"+change/500+"개");
		
		change= change%500;
		System.out.println("100원권"+change/100+"개");
		
		change= change%100;
		System.out.println("50원권"+change/50+"개");
		
		change= change%50;
		System.out.println("10원권"+change/10+"개");
		
	}
}
