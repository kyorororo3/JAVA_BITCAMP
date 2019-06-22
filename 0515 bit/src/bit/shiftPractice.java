package bit;

public class shiftPractice {

	public static void main(String[] args) {

		int number;
		number =0x1 << 2;
		System.out.println("number = " +number);
	
		//right shift == /2한 결과 
		number = 0x23 >> 3;
		System.out.println("number = " + number);
		System.out.printf("number = " + "0x%x\n" ,number); //16진수를 출력하는 방법
		
	}

}
