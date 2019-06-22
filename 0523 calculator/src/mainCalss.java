import java.util.Scanner;

public class mainCalss {

	public static void main(String[] args) {
		//계산기
		
		/*
		String number1, number2;
		number1 = number2 ="";
		String oper = "";
		int result;
		
		// 첫번째 수 입력
		numberInput(number1);
		System.out.println(number1);
		
		
		// 연산자 입력
		operatorInput(oper);
		System.out.println(number1);
		
		// 두번째 수 입력
		numberInput(number2);
		System.out.println(number2);
		
		//연산처리
		result = processing(number1, oper, number2);
		System.out.println(number1 + " + " + number2 + " = " + " result ");
		*/
		
		
		int number1, number2;
		String oper;
		int result;
		
		//첫번째 숫자 입력 문자열로 입력받고 숫자로 전환하는 것
		
		number1 = numberInput(1);
		
		
		//연산자 입력
		oper = operatorInput();

		//두번째 수 
	
		number2 = numberInput(2);
		
		//연산
		result = processing(number1, oper, number2);
		
		//결과 출력
		printing(number1,oper,number2,result);
		
	
  }
	
	static int numberInput(int n) {
		Scanner sc = new Scanner(System.in);
		String strNum ="";
		
		while(true) {
			System.out.print(n + "번째 숫자 입력 : ");
			strNum = sc.next();
			boolean b = isNumber(strNum);  //모두 숫자로 되어 있는지 검사
			
			if(n == 2 && strNum.equals("0")) {
				continue;
			}
			if(b == true) {
				break;
			}else {
				System.out.println("숫자가 아닌 문자가 포함되어 있습니다.");
				System.out.println("다시 입력해주세요");
			}
		}
		// 숫자로 바꿔준 후에 리턴
		int number = Integer.parseInt(strNum);
		return number;
	}
	
	
	
	
	static boolean isNumber(String str) {
		//null heap에 공간이 없는 것, 빈칸은 그래도 메모리를 차지하는 것
		if(str == null || str =="") {
			return false;
		}
		// charAt(0,1,2) --> 0번째 1번째 2번째
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int ascNum = (int)c;
			if(ascNum < 48 || ascNum > 57 ) {
				//ascNum >=48 && ascNum <=57
				b = false;
				break;
				
			}
			
		}
		return b;
	}
	
	
	
	
	static String operatorInput() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		
		while(true) {
			System.out.print("연산자(+,-,*,/) : ");
			oper = sc.next();
			
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {	
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오");
				
			}
		}
		return oper;
	}
	
	static int processing(int num1, String oper, int num2) {
		int result= 0;
		switch (oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		return result;
	}
	
	static void printing(int num1, String oper, int num2, int result) {
		System.out.println(num1 + " " + oper + " " + num2 + " = "+ result);
	}
	/*
	static String numberInput(String num) {
		
		Scanner sc = new Scanner(System.in);
		String str="";
		
		int w = 0;
		while(w<1) {
			System.out.print("숫자를 입력하시오: ");
			num = sc.next();
			char c = num.charAt(w);
			int n = (int)c;
			
			if(n>=48 && n<=57) {	
			str = n+"";
			w++;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
			
		}
	return str;
	}
	
	
	static String operatorInput(String oper) {
		Scanner sc = new Scanner(System.in);
		
	
		
		int w = 0;
		while(w<1) {
			System.out.print("연산자를 입력하시오: ");
			oper = sc.next();
			
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {	
				w++;
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
	
		}
		return oper;
	}
	
	static int processing(String num1, String oper, String num2) {
	
		
		for (int i = 0; i < num1.length(); i++) {
			char c1 = num1.charAt(i);
			int n1 = (int)c1;
			
			for (int j = 0; j < num2.length(); j++) {
				char c2 = num1.charAt(i);
				int n2 = (int)c2;
			
			int result;
				if(oper == "+") {
					result = n1 + n2;	
	
				}
				else if(oper == "-") {
					result = n1 - n2;		
					
				}
				else if(oper == "*") {
					result = n1 * n2;	
					
				}
				else if(oper == "/") {
					result = n1 / n2;							
				}
				
			}	
		}
	
	}
*/
	
	
	
	
}
