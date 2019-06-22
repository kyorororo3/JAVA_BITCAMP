package assignment20190515;

public class Java10 {

	public static void main(String[] args) {
		// bit연산
		int number;
		number = 5;
		System.out.printf("0x%x\n",number);
		
		number = number <<4;
		System.out.println("first number = " + number);
		number = number >>5;
		System.out.println("first number = " + number);
		number = number >>1;
		System.out.println("first number = " + number);
		

		//필기 20190516
		
		/* &	AND								1 1 ->1
		   |	OR								1 0, 1 1 -> 1
		   ^	XOR								1 0, 0 1 -> 1
		   << left shift *2							0001 0010
		   >> right shift /2						1000 0100
		   ~   tilde 손으로 계산하기가 힘들어요 0->1			
		 */
		
		int num = 5;//초기화가 되지 않았다 int num = 5; 안하고 바로 num = num <<4;
		num = num << 4; // 0101 0000
		
		num = num >> 5; //0000 0010 로테이션 없이 1은 버린다
		
		num = num >> 1; // 
		
	}

}
