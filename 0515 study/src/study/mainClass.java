package study;

import java.util.Scanner;

public class mainClass {

		public static void main(String[] args) {
			//5월15일 복습
			//변수 자료형
			//자기 욕심이 있는 사람들이 잘된다. 본인의 프로젝트를 따로 준비하는 사람들이라는 느낌?
			//숫자 자료형
			byte by; //크기는 8bit 1byte
			short sh; // 2byte
			int i; //4byte
			long lo; //8byte
			
			float f; // 4byte
			double d; // 8byte
			
			// 문자열 자료형
			char c; //2byte 왜 2바이트인가? a b c A B C -> 1byte다 
					//1byte 한글을 1byte가 아니다. '한 '가' -> 2byte unicode (각국의 문자를 담아내기 위해) C언어를 보완해서 나왔기에 2byte
			String str; //wrapper class byte는 유동적이다
			
			
			// 참/거짓 자료형
			boolean b; // 1byte  0(false)/1(true)밖에 안들어간다. 
			
			//논리 연산자 &&(and), ||(or), !(not) ==(대입) --> 우리는 출력에다가 썼지만 제어문에서 쓰는 경우가 많다
			// true/false 결론으로는 이걸 가려서 참인지 거짓인지를 판단하는 것
			
			//scanner
			
			Scanner sc = new Scanner(System.in); //포인터, 메모리가 new
			/*
			boolean bb = sc.nextBoolean();
			
			int num = sc.nextInt(); //정수 -3 ~ 0 ~ 3
			
			String msg = sc.next(); // 콘솔환경외에서는 nextline을 쓰지 않음. anyway 여기서 문자열 입력을 받음
			/**/
			
			//increment(++) >>1씩 더하고, decrement(--) >>1씩 빼고,
			
			int a = 0;
			a++; //뒤에다 적는 것이 보편적이다
			++a;
			a--;
			--a;
			System.out.println("a =" + a);
			
			int a1; //값 안넣고 출력하려고 할때 안된다. C는 가능
			// a1 = a++; a = 1 a1 =0
			a1 = ++a; // 굳이 이렇게 넣지 말고 a++, a1 = a로 하는게 낫다. 
			System.out.println("a =" + a); 
			System.out.println("a1 =" + a1);
			
			
			
			
		}
}