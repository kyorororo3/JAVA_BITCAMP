import java.util.Scanner;

public class Random_number_result {

	public static void main(String[] args) {
		//포커나 블랙잭은 프로그래밍적 성질을 가지고 있음
		//간단하더라도 분산하려고 하는 습관이 필요
		
		
		Scanner sc = new Scanner(System.in);
		//random number 찾기
		//변수 선언부
		int rand_num, user_num;
		boolean clear;

		
		//init
		clear =false;
		
		//1.random number를 setting
		rand_num = (int)(Math.random()*100)+1;
		System.out.print("rand_num: "+rand_num);
		
		////////////////////////////////////////////////// loop 10번 돌아가야하는 구간
		
		
		
	
		int w = 0;
		while(w <10) {
			//2.user의 입력을 받기
			while(true) {
				System.out.print("숫자를 입력해주십시오(1~100): ");
				user_num = sc.nextInt();
			
				if(user_num < 1 || user_num > 100) {
					System.out.print("범위를 벗어 났습니다. 다시 입력해주십시오.");
					continue;
				}
				break;
			}

		//3.finding 비교
	
			int msg = 0;
			if(user_num > rand_num) {
				msg = 1;
			}else if(user_num < rand_num) {
				msg = 2;
			}else {
				clear = true;
				break;
			}
				
				
				
			//4.출력
			
			switch(msg) {
				case 1:
					System.out.print("너무 큽니다");
					break;
				case 2:
					System.out.print("너무 작습니다");
					break;
			}
			w++;
		}
		/////////////////////////////////////////////////
		
		//5. result printing
			if(clear) {
				System.out.println("축하합니다. Game Clear입니다");
			}
			else {
				System.out.println("아쉽습니다. 다시 도전해보십시오.");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
