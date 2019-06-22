package assignment;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		
		x=1;
		y=2;
		
		x=scan.nextInt();
		y=scan.nextInt();
		
		
		System.out.print("x="+y);
		System.out.println("y="+x);
		
		int num1 = 11;
		int num2 = 22;

		System.out.println("num1 = " + num1 + "numb2 =" + num2);

		//swap
		int temp; //temp 아무 의미 없는 변수일 경우, 일회용일 경우 변수명:temp
				//값을 교환한다 Swap sorting(정렬)을 할 때 알아야함
		//buffer(저장소)
		temp = num1; //num1의 값을 보관/저장(temp)
		num1 = num2; //num1은 새로운 값을 할당한다
		num2 = temp; //num2의 저장했던 num1의 값을 대입
		System.out.println("num1 = " + num1 + "numb2 = " + num2);

	}

}
