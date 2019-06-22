
public class mainClass {

		// TODO Auto-generated method stub
		/*
		 function :함수
		 		  :특정 처리를 하기 위한 Process
		 
		 구성: return값(자료형), 매개변수(인수,인자,parameter) =자료형
		 
		형태:
		return 값 함수명(매개변수1, 매개변수2, ...){
			처리 영역
			return 값;
		
		}
		
		
		
		void: 형태가 없는 자료형
		
		method == function
		: 특정 class에 소속되어 있는 function(함수)
		
		C언어의 특징:function -> C++ function(method) 객체화됨
		자바의 특징:class <-function(method) 을 합쳐서 사용
		
		
		
		
		
		 */

	public static void main(String[] args) { //함수
				  //return 값이 많음
		function1(); //메인에서 호출한 것
		function2(123);
		function2(345);
		
		function3('A', 34, "hello");
		
		int re;
		re = function4();
		System.out.println("re = "+re);
		
		double d;
		d = function5(5, 2);
		System.out.println("d =" + d);
		
		int num1, num2;
		String op;
		int result;
		num1 = 7;
		num2 = 3;
		
		op = "+";
		
		result = calculator(num1, op, num2);
		System.out.println(num1 + op + num2 + "=" + result);
		
		num1 = 8;
		num2 = 6;
		
		op = "*";
		
		result = calculator(num1, op, num2);
		System.out.println(num1 + op + num2 + "=" + result);
		
		
		//char -> ASCII코드 값이 나오게끔 
		char c;
		c = 'A';
		int result1;
		result1=change(c);
		System.out.println(c + "문자의 아스키코드 값: " + result1);
		
		//ASCII -> char
		int i;
		i = 97;
		char result2;
		result2=change2(i);
		System.out.println("아스키코드 값 "+i+"의 문자: " + result2);
		
		char c1 = 'D';
		char c_result = charToChar(c1);
		System.out.println(c1+"의 소문자는: "+c_result);
		
		// char(대문자) -> char(소문자) 
	}
	
	static void function1( ) {
		   //출구                입구
		//매개변수가 괄호 안으로 들어옴
		System.out.println("function1() 호출");
	}	
	static void function2 (int n) { // n == 가상인수
		System.out.println("function2(int n) 호출");
		System.out.println("n =" + n);
		
	}
		
	static void function3 (char c, int i, String str) {
		System.out.println("function3(char c, int i, String str) 호출");
		System.out.println("c =" + c);
		System.out.println("i =" + i);
		System.out.println("str =" + str);
		
	}
	
	static int function4() {
		System.out.println("function4()호출");
		
		return 3;
	}
	static double function5(int num1, int num2) {
		System.out.println("function5(int num1, int num2) 호출");
		double d = (double)num1/num2;
		return d;
	}
	
	static int calculator(int num1, String oper, int num2) {
		int result = 0;
		if(oper.equals("+")) {
			result = num1 + num2;
		}
		else if(oper.equals("-")) {
			result = num1 - num2;
		}
		else if(oper.equals("*")) {
			result = num1 * num2;
		}
		else if(oper.equals("/"))
			result = num1 / num2;
		
		return result;
	}
	
	static int change(char c) {  //선생님의 경우 함수의 이름을 charToAscCode
		System.out.println("change(c) 호출");
		int result;
		return result = (int)c;  //int code = (int)c; return code;
	}
	
	static char change2(int i) { //ascCodeToChar
		System.out.println("change2(i) 호출");
		char result;			// char c = (char)n;
		return result = (char)i;
	}
	
	static char charToChar(char c) {  //선생님의 경우 함수의 이름을 charToAscCode
		System.out.println("charToChar 호출"); // 선생님의 경우 함수 이름 toLowerCase
	//	int i1 = (int)c + 32;
	//	char c1 = (char) i1;
	//	return c1;	
		
		return (char)((int)c+32); //한줄로 표현 가능하지만 풀어쓰는 것이 파악은 잘되는 편
	}
	
}
