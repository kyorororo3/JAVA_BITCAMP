package main;

import baseball.instructorClass;
import baseball.myClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//replay는 여기서 하는게 나은 가봐 
		instructorClass ball = new instructorClass();
		
		ball.init();
		ball.loop();
		ball.result();
		
		final int number = 1;   //final을 붙여줌으로서 변수 -> 상수 
		int num;
		num = number; //변수의 대입용으로 쓰임
		
		
		
		
		
		
		
		
		/*
		myClass cls = new myClass();
		
		cls.init();
		cls.randomNumber();
		cls.userNumber();
		cls.finding10();
		*/
	}

}
