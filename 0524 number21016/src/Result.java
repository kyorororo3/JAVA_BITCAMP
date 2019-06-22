import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number10 = 56;
		String number2 = "";
		
		number2 = number10to2(number10);
		System.out.println("10진수:"+ number10 + "의 2진수는" + number2 + "입니다");
	
		
		number2 = Integer.toBinaryString(number10); //스탠다드
		
		
		int num10;
		/*
		num10 = number2to10(number2);
		System.out.println("2진수:"+ number2 + "의 10진수는" + num10 + "입니다");
	*/	
		
		num10 = Integer.parseInt(number2, 2);
	
		
		String number16;
		/*
		number16 = number10to16(number10);
		System.out.println("10진수:"+ number10 + "의 16진수는 0x" + number16 + "입니다");
		*/
		
		number16 = Integer.toHexString(number10);
		
		/*
		num10 = number16to10(number16);
		System.out.println("16진수 0x:"+ number16 + "의 10진수는" + num10 + "입니다");
	*/
	
		num10 = Integer.parseInt(number16, 16);
	
	
		//수치 변환 프로그램
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1. 10진수  >>>  2진수");
			System.out.println("2. 2진수 >>> 10진수");
			System.out.println("3. 10진수  >>>  16진수");
			System.out.println("4. 16진수 >>> 10진수");
			System.out.println("5. 2진수  >>>  16진수");
			System.out.println("6. 16진수 >>> 2진수");
			System.out.print("어떤 수치를 변환하시겠습니까? :");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				//10진수 입력
				System.out.print("10진수: ");
				int num = sc.nextInt();
				String num2 = number10to2(num);
				System.out.println("2진수는 "+ num2 + "입니다.");
				break;
				
			case 2:
				
				//String입력
				System.out.print("2진수: ");
				String str10 = sc.next();
				num = number2to10(str10);
				System.out.println("10진수는 "+ num + "입니다.");
				break;
				
			case 3:
				
				//10진수 입력
				System.out.print("10진수: ");
				 num = sc.nextInt();
				String num16 = number10to16(num);
				System.out.println("16진수는 "+ num16 + "입니다.");
				
				break;
				
			case 4:
				
				//String 입력
				System.out.print("16진수: ");
				String str16 = sc.next();
				int numberCase4 = number16to10(str16);
				System.out.println("10진수는 "+ numberCase4 + "입니다.");
				break;
				
			case 5:
				
				System.out.println("2진수: ");
				String str2 = sc.next();
				int number = Integer.parseInt(str2);
				String result =Integer.toHexString(number);
				System.out.println("16진수는 "+ result + "입니다.");
				break;
				
			case 6:
				
				System.out.println("16진수: ");
				String str_ = sc.next();
				int n16 = 0;
				for (int j = 0; j < args.length; j++) {
					
					
					char c = str_.charAt(j);
					//equal이 필요없는 char
					if(c == 'a' || c =='A') n16 = 10;
					
					else if(c == 'b' || c =='B') n16 = 11;	
								
					else if(c == 'c' || c =='C') n16 = 12;	
								
					else if(c == 'd' || c =='D') n16 = 13;	
							
					else if(c == 'e' || c =='E') n16 = 14;
					
					else if(c == 'f' || c =='F') n16 = 15;
					
					else {
						break;
					}
				int number_ = Integer.parseInt(str_);
				String result_ =Integer.toBinaryString(number_);
				System.out.println("2진수는 "+ result_ + "입니다.");
				
		
				break;
				}
			}
			
		}
		
	}
	// 10진수에서 2진수로 
	static String number10to2(int num) {
		int tag;
		String num2 = "";
		
		while(true) {
			tag = num % 2;
			System.out.println("tag = "+ tag);
		
			num2 = tag + num2;
			if(num/2 == 0) {
				break;
			}
			num = num / 2;
		}
	return num2;}

	//2진수에서 10진수로
	static int number2to10(String num2) {
		int len = num2.length();
		int n, n1; //n:숫자(나온 숫자) n1:승수
		
		int num10 = 0;
		
		for(int i = 0; i < num2.length(); i++) {
			char c = num2.charAt(i); //1 0 1 0
			n = Integer.parseInt(c + ""); 	//1
			n1 = (int)Math.pow(2, len - 1);	//2의 3승
			
			n = n * n1;
			len--;
			
			num10 = n;
		}
		
		/*
		 1010
		 
		 */
	return num10;}


	//10 ->16
	static String number10to16(int num) {//0~9 abcdef
		int tag;
		String num16 ="";
		String str = ""; // ABCDEF를 추가로 넣을 때 필요한 존재
		
		while(true) {
			tag = num % 16;
			
			switch(tag) {
				case 10:
					str = "A";
					break;
				case 11:
					str = "B";
					break;
				case 12:
					str = "C";
					break;
				case 13:
					str = "D";
					break;
				case 14:
					str = "E";
					break;
				case 15:
					str = "F";
					break;
					default:
						str = tag+ "";
			}
			num16 = str +num16;
			
			if(num / 16 == 0) {
				break;
			}
			num = num / 16;
			
		 }
		
	
		
		return num16; }
	
	static int number16to10(String num16) {
		int len = num16.length();
		
		String str;
		int n = 0; //승수
		int n16; // 하나씩 산출한 숫자
		int num10 = 0; 
		
		for (int i = 0; i < num16.length(); i++) {
			
			char c = num16.charAt(i);
			//equal이 필요없는 char
			if(c == 'a' || c =='A') n16 = 10;
			
			else if(c == 'b' || c =='B') n16 = 11;	
						
			else if(c == 'c' || c =='C') n16 = 12;	
						
			else if(c == 'd' || c =='D') n16 = 13;	
					
			else if(c == 'e' || c =='E') n16 = 14;
			
			else if(c == 'f' || c =='F') n16 = 15;
			
			else {
				n16 = Integer.parseInt(c + "");
			}	
			n = (int)Math.pow(16, len - 1);
			n16 = n16 *n; // 산출한 숫자에 승수를 곱하는 것
			len --;
			
			num10 = num10 + n16;
		}
	return num10; }
}
