package assignment1;

import java.util.Scanner;

public class java07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4;
		int b = 7;
		int result;
		
		result = a+b;
		System.out.println(a + "+" +b + "=" + result);
		
		result = a-b;
		System.out.println(a + "-" +b + "=" + result);
		
		result = a*b;
		System.out.println(a + "*" +b + "=" + result);
		
		result = a/b;
		
		System.out.println(a + "/" +b + "=" + result);
		
		result = a%b;
		
		System.out.println(a + "%" +b + "=" + result);
		
		// + - * / %
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		int result1;
		
		System.out.print("첫번째 수:");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수:");
		num2 = scan.nextInt();
		
		result1 = num1 + num2;
		System.out.println(num1 + "+" +num2+"="+result1);
		
		System.out.println(num1 + "-" +num2+"="+(num1-num2)); //변수 하나 버림 result1
		
		// num1 *= num2;
		result1 = num1 * num2;
		System.out.println(num1 + "*" +num2+"="+result1);
		
		result1 = num1/num2; //num 2! = 0 // 몫
		System.out.println(num1 + "/" +num2+"="+result1);
		
		result1 = num1%num2; //나머지
		System.out.println(num1 + "/" +num2+"="+result1);
		
		
		
		
	}

}
