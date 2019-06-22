import java.util.Scanner;

public class rockpaperscissiors_result {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 선언부 
		
		int userNum, comNum;
		int win, lose, draw;
		int result=0;//승패 무승부를 가리기 위한 것
		//잘못된 것을 잡을 때는 String이 보다 나음 
		
		// 초기화
		win = lose = draw = 0;
		while(true) {
			///////////////////////////////////////////////// replay loop
			
			// 1. random number를 취득(0~2) -> 컴퓨터의 숫자
			comNum = (int)(Math.random()*3);
			
			
			// 2. user input(0~2)
			System.out.print("가위(0), 바위(1), 보(2) = ");
			userNum =sc.nextInt();
			
			/*
			while(true) {
			String userInput =sc.next();
				if(userInput.equals("0")||userInput.equals("1")||userInput.equals("2")) {
					break;
				}
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오");
			}
			
			// 문자열 ->숫자
			userNum =Integer.parseInt(userInput);
			
			
			*/
			
			// 3. finding(비교)
			//win 0-2,1-0,2-1;
			if(userNum == 0 && comNum ==2) {
				result =1;
			}
			else if(userNum == 1 && comNum ==0) {
				result =1;		
			}
			
			else if(userNum == 2 && comNum ==1) {
				result =1;
			}
			//lose
			if(userNum == 2 && comNum ==0) {
				result =0;
			}
			else if(userNum == 0 && comNum ==1) {
				result =0;
			}
	
			else if(userNum == 1 && comNum ==2) {
				result =0;	
			}
			//draw
			if(userNum == 2 && comNum ==2) {
				result =2;
			}
			else if(userNum == 0 && comNum ==0) {
				result =2;
			}
	
			else if(userNum == 1 && comNum ==1) {
				result =2;
			}
			
			
			//user 0(가위) 1(바위) 2(보)
			/*
		
			 user win
			 com user
			 2	- 0		+ 2		= 4 % 3 >> 1
			 0  - 1     + 2		= 1 % 3 >> 1
			 1  - 2		+ 2		= 1 % 3 >> 1
			 
			user lose
			 com user
			 0	- 2		+ 2		= 0 % 3 >> 0
			 1  - 0     + 2		= 3 % 3 >> 0
			 2  - 1		+ 2		= 3 % 3 >> 0 
			 
			 user draw
			 com user
			 2	- 2		+ 2		= 2 % 3 >> 2
			 1  - 1     + 2		= 2 % 3 >> 2
			 0  - 0		+ 2		= 2 % 3 >> 2
			 
			 */
			
			//result = (comNum - userNum+ 2) % 3;
			
			String resultMsg = "";
			switch(result) {
			case 1:			//승
				resultMsg = "You win";
				win++;
				break;
			case 0:			//패
				resultMsg = "You lose";
				lose++;
				break;
			case 2:			//무승부
				resultMsg = "You draw";
				draw++;
				break;
			
			}
			
			String userChar = "";
			String comChar = "";
			
			if(userNum == 0) userChar ="가위";
			else if (userNum == 1) userChar ="바위";
			else 				 userChar ="보";
			
			if(comNum == 0) comChar ="가위";
			else if (comNum == 1) comChar ="바위";
			else 				 comChar ="보";
			
			
			// 4. result print
			System.out.println(resultMsg+ "으로 당신은" +userChar +"이고 com은 "+ comChar +"입니다.");
			System.out.println(win + "승" + lose + "패" +draw + "무 입니다");
			
			System.out.print("한 판 더? 아무키나 눌러 주십시오. 그만하시려면 n을 입력해주십시오 =");
			
			String nextStage = sc.next();
			
			if(nextStage.equals("n")) {
				System.out.println("안녕히 가십시오");
				break;
			}
			
			System.out.println("다시 게임을 시작합니다. ");
		}
			
			
			///////////////////////////////////////////////// replay loop
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
