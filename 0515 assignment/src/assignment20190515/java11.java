package assignment20190515;

public class java11 {

	public static void main(String[] args) {
		// 계산기 먼저 사용해도 가능
		
		int num1, num2;
		
		num1 = 128;
		num2 = 56;
		/* 손으로 계산할 필요보다는 계산기로 하면 됨
		  1000 0000
		  8421 8421
		  num1 = 0x80
		  0011 1000
		  num2 = 0x38
		  */
		System.out.printf("0x%x\n", num1);
		System.out.printf("0x%x\n", num2);
		
		// num1 =(num1 & num2)|(num1&num2);
		num2 =~(num1^num2); //부호비트트트트트트트!!
		/*
	  1000 0000		1000 0000			
      0011 1000		0011 1000
      0000 0000		0000 0000
		 */
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		/*
		 1000 0000
		 0011 1000
		 1011 1000
		 0100 0111
	*/
	}

}
