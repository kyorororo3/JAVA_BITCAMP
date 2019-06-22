package test1;

import test.문자를;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a'); //문자
		System.out.print("hello"); //문자열
		System.out.print("배고픈듯\n");
		System.out.println(1234);
		System.out.println("6");
		System.out.println(123 + 456);
		
		System.out.println('6'); // 문자를 출력되는 것
		
		System.out.println("123"); // 문자열로 출력되는 것
		
		
		System.out.println(12 +56 + "78"); //앞의 숫자는 연산이 되고 뒤에 숫자는 그대로 출력
		
		System.out.println("12" + 34 + 56); //문자열이 앞으로 나올 경우 뒤에 있는 숫자도 문자열로 출력이 됨 그래서 결국에는 이런식의 표현은 결과가 문자열로 나옴
		
		// f == format의 약자
		System.out.printf("%d", 24); //%에 대입되서 출력  - 자주쓰이진 않음
		
		//**************System.out.print의 목적은 출력 (명령 콘솔에 출력하기 위한 함수)
		
		System.out.print("Hello");
		
		System.out.println(); //아무것도 넣지 않은 상태도 개행을 해주기도 함
		
		System.out.print("World");
		
		System.out.println("happy birthday");
		
		System.out.print("to you");
		
		System.out.println();
		
		System.out.print("12 + 35\n");
		
		System.out.print("2"+ 5 + 6 ); // \n을 넣을 때 어디에 넣는게 좋을까요. 혹은 이렇게 생긴 경우 \n을 못 넣고 그냥 println을 써야하는 걸까요
		
		
		System.out.println(124+156-245); // 왠지 \n의 경우 문자나 문자열에만 쓰이는게 아닐까...
		
		
	}

}
