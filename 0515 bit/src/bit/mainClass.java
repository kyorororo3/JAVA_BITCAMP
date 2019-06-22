package bit;

public class mainClass {

	public static void main(String[] args) {
		//bit 연산 == 고급연산자
		/*
		 bit:0/1로써 연산처리를 하는 연산
		 & AND
		 | OR
		 ^ XOR
		 << left shift
		 >> right shift
		 ~ 반점 (조금 이해하기 힘든 편이지만 사실 간단한 원리)
		 
		 /**/
		
		//AND
		int number;
		number = 0x71 & 0xb5;
		
		/*
		 8421 8421
		 0111 0001
		 
		 8421 8421
		 1011 0101
		 
		 0011 0001 --> 16진수 0x31
		 /**/
		System.out.println("number = " + number);
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
	
		//OR
		
		number= 0x71 | 0xb5;
		
		System.out.println("number = " + number);
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
		
		//XOR 비트가 다를 때 참인 연산
		/*
		 8421 8421
		 0111 0001
		 
		 8421 8421
		 1011 0101
		 
		 1111 0101 -->16진수 0xF5
		 /**/
		
		number = 0x71 ^ 0xb5;
		
		System.out.println("number = " + number);
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
		//left shift
		/* *2한 결과 ==left shift
		 0001 ->10진수 :1
		 0010 ->10진수 :2
		 0100 ->10진수 :4
		 1000 ->10진수 :8

		이것을 쓰면 속도가 빨라진다
		 */

		number =0x1 << 2;
		System.out.println("number = " +number);
	
		//right shift == /2한 결과 
		number = 0x23 >> 3;
		System.out.println("number = " + number);
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
		//기술면접,시험에서 자주 나오는 것이 비트연산
		/*
		(a | b)^(a & b); 
		
		/**/
		
		// ~ 비트를 반전시켜주는 게 ~ 틸드 : 0 ->1 1->0
		/* 0101 0101 -> 1010 1010
		 
		 /**/
		
		number = ~0x55;
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
		byte by;
		
		by = ~0x55;
		System.out.printf("number = " + "0x%x\n" ,by); //16진수를 출력하는 방법
		
		
		number = ~0xA3;
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
		/*
		 8421 8421
		 1010 0011
		 0101 1100 0x5C
		 */
		int a, b, result;
		a = 0x55;
		b = 0xA6;
		result = (a|b)^(a&b);
		System.out.println("(a|b)^(a&b)=" +result);
		System.out.printf("(a|b)^(a&b) = "+"0x%x\n",result);
		
		/*
		 (0x55|0xA6)
		 
		 8421 8421
		 0101 0101 
		 1010 0110
		 (1111 0111 16진수:0xf7)
		 (0x55&0xA6)
		 0000 0100 16진수:0x04)
		 (0xf7)^(0x04)
		 1010 0010 16진수:0xA2
		
		 
		1011 0101 0xB5
		0111 1101 0x7D
		*/
		
		//삼항 연산자 ==사용 빈도수가 굉장히 높음 없는 곳이 없음
		/* 조건문과 유사함
		 value = (조건)? 값1 : 값2
		 			조건이 참 = 값1
		 			조건이 거짓 = 값2
		 
		 */
		
		char c;
		int num = 5;
		
		c =(num > 0)? 'Y':'N';
		System.out.println("c = " + c);
		
		int n;
		n = (num != -1)? 100:200;
		System.out.println("n =" +n);
		
		String str = (num <= 0)? "0보다 작다거나 같다" : "0보다 크다";
		System.out.println("str =" +str);
		
	}
		

}
