import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		//continue
		
		/*break의 형제인데 성격은 좀 많이 다름
		  
		 continue == 생략 skip
		 
		 continue문 자체적으로 사용할 수 없다.
		 loop문과 함께 사용해야함 == for while do while 
		 
		 */

		
		for (int i = 0; i < 10; i++) {
			System.out.println("for start");
			System.out.println(" i = "+ i);


			if(i>4) {
				continue;
				//continue 뒤에 있는건 다 생략
			}

			System.out.println("for end");
			System.out.println();
		}
		
		//루프하다가 이프에 있는 조건이 끝나면 컨티뉴 밑에 있는 것을 생략한다
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		for(int i = 0; i<3 ; i++) {
			
		
			System.out.print("숫자를 입력해 주십시오 =" );
			number = sc.nextInt();
			if(number <0) {
				System.out.println("잘못 입력하셨습니다." );				
				continue;
			
			}
		}
		
		
		int w = 0;
		while(w < 3) {
			System.out.print("숫자를 입력해 주십시오 =" );
			number = sc.nextInt();
			if(number <0) {
				System.out.println("잘못 입력하셨습니다." );				
				continue;
			}
			
			w++;
		}
		
		/*
		
		
		
		*/
		
		
		//while은 제대로 입력될때까지 탈출을 하지 않는다.
		
		
		
	}

}
