import java.util.Scanner;

public class practice {

	public static void main(String[] args) {


	//국어, 영어, 수학의 점수를 입력을 받는다 --> 출력(학생5명)
		
		//1. 국어, 영어,수학 점수 입력
		/*
		Scanner scan = new Scanner(System.in);
		
		int array[][] = new int[5][3];
		
		for (int i = 0; i < array.length; i++) {
		int j = 0;		
				System.out.print("국어 점수를 입력하시오 :"); 
				array[i][j] = scan.nextInt();
				
				System.out.print("영어 점수를 입력하시오 :");
				array[i][j++] = scan.nextInt();
				
				System.out.print("수학 점수를 입력하시오 :");
				array[i][j++] = scan.nextInt();
				// System.out.print("array["+i+"]["+j+"] =" + array2[i][j] + " ");
				System.out.println();
			
		}
		
		//2.다섯명의 학생 점수 출력
		

		*/
		
		Scanner scan = new Scanner(System.in);
		
		int array[][] = new int[5][3];
		
		int kor, eng, math;
		for (int i = 0; i < array.length; i++) {
				System.out.print((i+1)+"번째 학생의\n");
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("국어/영어/수학 점수를 차례대로 입력하시오: ");
				array[i][j]= scan.nextInt();
				
				
				
				
			}
			System.out.println();
		}
		
	System.out.println();
		
for(int i=0; i < 5; i++) {
	for ( int j=0; j<3; j++) {

		System.out.print("array["+i+"]["+j+"] =" + array[i][j] + ",  ");
	}
}
		
		
	}

}
