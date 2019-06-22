package assignment1;

import java.util.Scanner;

public class java08 {

	public static void main(String[] args) {
		/*
		double inch;
		inch = 0;
		inch = inch + 2.54;
		System.out.println("1 inch = " + inch + " cm");
		
		double yard;
		yard = 0;
		yard = yard + 0.3048;
		System.out.println("1 yard = " + yard + " m");
		
		double mile;
		mile = 0;
		mile = mile + 1.6093;
		System.out.println("1 mile = " + mile + " km");
		/**/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단위 환산 프로그램입니다");
		double dNumber;
		System.out.print("숫자를 입력해주십시오");
		dNumber = scan.nextDouble();
		
		double dCm, dm, dKm;	
		dCm = dNumber *2.54;
		dm = dNumber *0.3048;
		dKm = dNumber *1.6093;
		
		System.out.println("입력하신 수치는" + dNumber +"입니다");
		System.out.println(dNumber + "inch는" + dCm + "cm입니다");
		System.out.println(dNumber + "yard는" + dm + "m입니다");
		System.out.println(dNumber + "mile은" + dKm + "km입니다");
		
		
		
	}

}
