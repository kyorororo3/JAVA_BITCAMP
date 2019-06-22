package main;

import java.util.Scanner;

public class sortClass {

	//클래스 멤버 Variable  -> class 내부 접근

	private int number[];
	private int updown[] = new int[1];
	
	
	//클래스 멤버 Method
	
	
	public int[] getUpdown() {
		return updown;
	}




	public void setUpdown(int updown[]) {
		this.updown = updown;
	}


	public int[] getNumber() {
		return number;
	}
	
	
	
	
	public void setNumber(int[] number) {
		this.number = number;
	}


	//number input method
	public int[] numberInput(int updown[]) {
		Scanner scan = new Scanner(System.in);
		
		int number[];
		
		System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
		int count = scan.nextInt();
		
		number = new int[count];
		
		//숫자의 갯수의 맞게 숫자들을 입력받는다.
		for (int i = 0; i < number.length; i++) {
			System.out.println(i+1 + "번째 숫자: ");
			number[i] = scan.nextInt();
		}

		System.out.print("올림(1)/내림(2) ? ");
		updown[0] = scan.nextInt();
	
		//리턴값으로 받은 숫자들을 내보냄
	return number;}
		
	

	
	
	//swap
	
	private void swap(int[]number, int i, int j) {
		
		int temp;
		
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
		
		
	}
	
	//finding
	
	private void upOrDown(int[] number, int updown) {
		int temp = 0;
		
		for (int i = 0; i < number.length-1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				
				if(updown == 1) {
					
					if(number[i] < number[j]) {
					
					swap(number, i, j);
					}
				}
				else {
					if(number[i] > number[j]) {
					
					swap(number, i, j);
					}
				}
				
			}
		}
	}
	//result
	
	public void allPrint(int[] number, int updown) {
		
		upOrDown(number, updown);
		String ud = "";
		if(updown == 1) ud = "올림";
		else			ud = "내림";
		
			System.out.println(ud+"차순 정렬입니다");
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(i+1 +"번째 : " + number[i]);
		}
	}




	
}
