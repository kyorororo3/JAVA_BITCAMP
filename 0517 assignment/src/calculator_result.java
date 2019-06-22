import java.util.Scanner;

public class calculator_result {

	public static void main(String[] args) {
	
		//1. 첫번째 숫자 입력


		//1-1.입력, 변수선언
		
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		String oper;
		int result = 0;
		String replay;
		
		while(true) {
		
		
			//1-2 숫자 입력하는 곳 만들기
			
			System.out.println("첫번째 숫자 = ");
			number1 = sc.nextInt();
			
			
			//2. 연산자 입력
			
			while(true) {
				System.out.println("연산자 (+,-,*,/) = ");
				oper = sc.next();
				//2-1 oper의 에러를 잡아야함 
				if(oper.equals("+") == true || oper.equals("-") == true 
						|| oper.equals("*") == true || oper.equals("/") == true) {
					break;
				}
				System.out.println("연산자를 잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
				
			
			//3. 두번째 숫자 입력
			
			while(true) {
				System.out.println("두번째 숫자 = ");
				number2 = sc.nextInt();
				
				//나누기는 막아줘야함
				
				if(oper.equals("/")) {
					if(number2 != 0) {
						break;
					}else {
						System.out.print("0으로 나눌 수 없습니다. 다시 입력해주세요 :");
					}
					
				}else {
					break;
		
				}
			}
			
			//4. 계산 처리
			/*
			if(oper.equals("+")) {	
				
			}
			
					
			else if(oper.equals("-")) {	
						
					}
			else if(oper.equals("*")) {	
				
			}
			else if(oper.equals("/")) {	
				
			}
		*/
			
			 //switch일 때는 초기화를 해줘야 함
			switch(oper) {
			case"+":
				result = number1 + number2;
				break;
			case"-":
				result = number1 - number2;
				break;
			case"*":
				result = number1 * number2;
				break;
			case"/":
				result = number1 / number2;
				break;
				
			}
			
			//5. 출력
			
			System.out.println(number1 + " " + oper + " "+ number2 + "=" +result);
		
			
			//각각의 큰 항목, 주제를 알아야한다.
			
			//계속 할건지?
			System.out.print("계산을 계속하시겠습니까?(y/n) = ");
			replay = sc.next();
			
			if(replay.equals("n")) {
				System.out.println("안녕히가십시오");
				break;
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
