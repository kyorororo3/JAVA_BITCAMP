import java.util.Scanner;

public class Random_number {

	public static void main(String[] args) {
		// random number
		int num = 0;
		int r = (int)(Math.random()*100)+1;
			System.out.println("r =" + r);
	
		Scanner sc = new Scanner(System.in);
		
	
			
		System.out.print("0~100사이의 숫자를 입력해주세요: ");
		int userInput = sc.nextInt();
			
	
		
		for (int i=0; i<9; i++) {
			
		
			if(!(userInput>=0 && userInput <=100)) {
					i--;
					System.out.print("숫자를 잘못 입력하셨습니다. 다시 입력해주세요: ");
					userInput = sc.nextInt();				
			}
	
			else if(userInput<r) {
				System.out.println("입력 숫자보다 작습니다.\n");
				System.out.print("숫자를 다시 입력해주세요: ");	
				userInput =sc.nextInt();

			}
			else if(userInput>r) {
				System.out.println("입력 숫자보다 큽니다.\n");	
				System.out.print("숫자를 다시 입력해주세요: ");	
				userInput =sc.nextInt();
			
			}
			else if(userInput==r){
				System.out.println("정답입니다.");
					num++;
					break ;
					
			}
	
			else {		

			}
		
	}

	
		if(num==0) {
			System.out.println("10번의 기회를 모두 잃으셨습니다.");

	}				
		
	
		
	
	}

}
