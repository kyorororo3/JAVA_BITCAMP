import java.util.Scanner;

public class Array2_Array1 {

	public static void main(String[] args) {
		// array 2 -> array 1
		
		Scanner sc = new Scanner(System.in);
		
		int array2[][] = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}		
		};
		
		/*
		int array1[] = new int[array2.length * array2[0].length];
		// 0 1 2 3		i = 0 j = 0~3
		// 4 5 6 7		i = 0 j = 0~3	+4 	= array2[0].length
		// 8 9 10 11	i = 0 j = 0~3	+8	= array2[0].length * 2
		
		
		for (int i = 0; i < array2.length; i++) {
	
			for (int j = 0; j < array2[j].length; j++) {
				array1[array2[0].length* i + j] = array2[i][j];
			}
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1["+i+"] =" + array1[i]);
		}
		
		 내가 한 것
		Scanner sc = new Scanner(System.in);
		
		int array2[][] = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}		
		};
		
		
		int array1[] = new int[array2[0].length];
		
		int temp;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				temp = array2[i][j];
				array2[i][j] = array1[j];
				array1[j] = temp;
				
			}
		}
		
	
		}
						
		*/
		
		
		//fibonnaci 수열 
		// 0 1 1 2 3 5 8  >>30번 진행
		
		// 앞 뒤 더한 수가 그 다음에 나옴 증권 환을 거래할 때 쓰임 
		// 달팽이와 딱 들어맞음 
		
		//선언
		int a, b, c;
		int arrNum[] = new int[30];
		
		int w = 0;
		
		//초기화
		
		a = 0;
		b = 1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		while(w<28) {
		c = a + b;
		System.out.print("a =" + a);
		System.out.print("\tb =" + b);
		System.out.println("\tc =" + c);
		
		arrNum[w + 2] = c;
		//array number는 저장용
		a = b;
		b = c;
		
		
		
			w++;
		}
		
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i] +" ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
