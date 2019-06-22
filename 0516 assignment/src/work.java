import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// 구구단 출력 이중 for문을 사용하면 됨
		// 1단1 * 1 = 1 1*2 =2 
		// 2단 이런 순서로
		/*
		int i, j;
		int num =1;
		
		for(i=1;i <10;i++) {
			num = i * num++;
			System.out.println("\n");
		for(j=1;j<10;j++) {
			
			System.out.println(i+ " * " +j+ " = " + i*j);
		}
		}
		
		//과제 '2'입력을 받아 예) 입력:3을 했을 경우 3단의 구구단이 쭈욱 나오는 것
		
		Scanner scan = new Scanner(System.in);
			System.out.print("어떤 숫자의 구구단을 원하세요?");
			
		int answer = scan.nextInt();
			System.out.println("\n"+answer+"의 구구단은 다음과 같습니다.");
			
			for(j=1;j<10;j++) {
				
			System.out.println(answer+ " * " +j+ " = " + answer*j);
			
		}
	*/
	
			
			for(int ii =1; ii <= 9; ii++) {
				
				for(int jj =1; jj < 10; jj++) {
					System.out.print(ii + " x " + jj + " = "+ ii*jj+" ");
				}
				System.out.println();
			}
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력하고 싶은 구구단은? =");
		int number = sc.nextInt();
		
		for (int ii = 1; ii<=10; ii++) {
			System.out.println(number + " x " + ii +" = " +number*ii);
			
		}
			
			
			
			
	}

}
