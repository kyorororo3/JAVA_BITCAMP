package Cal;

import java.util.Scanner;

public class MyCal {

	
	//멤버 변수 - 클래스 내부면 모두 접근 가능
 	 int number1;
	 int number2;
	 String oper;
	 int result;
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		number1 = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		oper = sc.next();
		
		System.out.print("숫자 입력: ");
		number2 = sc.nextInt();
		
	}
	
	public void process() {
		switch(oper) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		
			
		}
	}
	
	public void resultPrint() {
		System.out.println(number1 + " " + oper + " " + number2 + " = " + result);
	}


}
