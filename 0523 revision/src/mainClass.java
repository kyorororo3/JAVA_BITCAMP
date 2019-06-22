
public class mainClass {

	public static void main(String[] args) {
		//
		
		/*
		 
		 function : 함수
		 
		 자료형 함수명(매개변수1, 매개변수2, ... ){ == 처리, 간략화, 분산 <<목적
		 	처리
		 	return
		 	
		 	호출
		 	자료형 변수 = 함수명(변수, 값) //
		 	
		 		들어가는 값       나오는 값(return value)
		 	함수명( 값value, 주소 address)
		
		 	func(int n, String* str, double** d) >>C언어 *이것이 있는 부분은 나오는 값이다 이런거다
		 	
		 	
		 */
		
		// 두수의 몫과 나머지를 구하라 함수는 하나만 사용하라
		
		int number1, number2;
		int result, tag[];  //몫과 나머지를 받는 공간
		tag = new int[1];
		number1 =9;
		number2 =4;
		
		result = divProcess(number1,number2,tag);
		
		System.out.println("몫:" + result + " 나머지 :" +tag[0]);
		
		//swap을 할 수 있는 함수를 제작하라
		
		int _number[]= new int[2];
		_number[0] = number1;
		_number[1] = number2;
		
		System.out.println("_number[0] =" +_number[0]);
		System.out.println("_number[1] =" +_number[1]);
		
		swap(_number);
		
		System.out.println("_number[0] =" +_number[0]);
		System.out.println("_number[1] =" +_number[1]);
		
		
	}
	static int divProcess(int num1, int num2, int t[]) {
		int re;
		re = num1 / num2;
		t[0] = num1 % num2;
		return re;

	}
	static void swap(int num[]) {
		int temp;
		
		temp = num[0];
		num[0] = num[1];
		num[1] = temp;
	}
}
