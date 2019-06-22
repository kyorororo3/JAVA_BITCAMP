package result;

import java.util.Scanner;

public class sortClass {
	private int number[];
	private int updown;
	
	public void init() {
		updown = 0;
	}
	
	public void input() {
		//클래스 안에서 모두 다 접근이 가능하기 때문에 굳이 리턴해야할 필요가 없다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 숫자를 정렬하시겠습니까?");
		int count = sc.nextInt();
		
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(i+1 + "번째 수 : ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("올림(1)/내림(2) :");
		updown = sc.nextInt();
	
	}
	

	public void sorting() {
		
		for (int i = 0; i < number.length -1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown == 1) {
					if(number[i] > number[j]) {
						swap( i , j );
					}
				}
				else {
					if(number[i] < number[j]) {
						swap( i , j );
					}
				}
			}
		}
		
	}
	private void swap(int i, int j) {
		int temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
		
		
	}
	//void, 매개변수가 없는 메소드가 제일 많다.
	public void resultPrint() {
		
		if(updown == 1)  System.out.println("오름차순 정렬");
		else			 System.out.println("내림차순 정렬");
		
		for (int i = 0; i < number.length; i++) {
			System.out.println((i+1) + ":" + number[i]);
		}
	}
}
