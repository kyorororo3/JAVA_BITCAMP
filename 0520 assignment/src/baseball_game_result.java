import java.util.Scanner;

public class baseball_game_result {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		//선언부
		int r_num[], u_num[];
		boolean clear;
		String replay;
		//stack에 올라가는 것
		// --------------------------------------------------replay
		while(true) {
		//초기화
			r_num = new int[3];
			u_num = new int[3];
			clear = false;
			
			
			//new 밑에는 heap에 들어감
			
			//1.random number 생성(1~10) - 3개 뽑아야 함
			//	 n1 != n2 != n3
			
			/*1번째 방법
			while(true) {
			
			
			r_num[0]=(int)(Math.random()*10)+1;
			r_num[1]=(int)(Math.random()*10)+1;
			r_num[2]=(int)(Math.random()*10)+1;
				if(r_num[0] !=r_num[1] &&r_num[0] !=r_num[2] && r_num[1] !=r_num[0]) {
					break;
				}
			}
			
			for (int i = 0; i < r_num.length; i++) {
				System.out.println("r_num["+i"] = "+r_num[i] )
			}
			랜덤 수가 많으면 힘들어진다는 것
			
			*/
			
			/* 두번째
			//섞는 횟수에 따라 한계점이 있음.
			int rnum[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int temp;
			
			int n1, n2;
			for (int i = 0; i < 100; i++) {
				n1 = (int)(Math.random()*10); //0~9
				n2 = (int)(Math.random()*10); //0~9
				
				temp = rnum[n1];
				rnum[n1] =rnum[n2];
				rnum[n2] =temp;
				
			}
			
			for (int i = 0; i < rnum.length; i++) {
				System.out.println("rnum["+i+"] = " + rnum[i]);
				
			}
			
			*/
			
			
			/*
			 
			 00000	00000
			 random number -> 3
			 00010	00000 3번째 스위치 on
			 random number -> 5
			 00010	10000 5번째 스위치 on
			 
			 */
			
			boolean swit[] = new boolean[10];
			int r, w;
			
			for (int i = 0; i < swit.length; i++) {
				swit[i] = false;		//00000 00000 
				//이게 초기화
			}
				w = 0;
				
				// swit[0] = true; //이거만 제외하고 싶을 때 이렇게 
				while(w<u_num.length) {
					r = (int)(Math.random()*10); //0~9
					if(swit[r]==false){
						swit[r]=true;
						r_num[w] = r+1;  //ran num 1 ~10까지 하기 위해서
						w++;
					}
						//카드 셔플하는데 쓰이는 코드
				}
				for (int i = 0; i < r_num.length; i++) {
					System.out.println("r_num["+i+"] = " + r_num[i]);
				}
			
			
			
			/////////////////////////////////////////////////loop
			w =0;
				while(w<10) {
				//2. user input (1~10) -> 3개
				// u1 != u2 != u3
				
											while(true) {
					for (int i = 0; i < u_num.length; i++) {
						System.out.print((i+1)+"번째 수: ");
						u_num[i] = sc.nextInt();
							
					}
					
					if(u_num[0] != u_num[1] 
							&& u_num[0] != u_num[2] 
									&& u_num[1] != u_num[2]) {
						break;
					}
					System.out.println("같은 숫자가 있습니다. 다시 입력해주십시오");
				}
				
				int strike, ball;
				//3. finding(Strike, ball) 
				//	strike : 자리O, 숫자O 
				//	ball   : 자리X, 숫자O
				
				strike = ball = 0;
				
				//ball
				for (int i = 0; i < u_num.length; i++) {
					for (int j = 0; j < u_num.length; j++) {
						if(u_num[i] == r_num[j] && i != j) {
							ball++;
							
						}
						
					}
					
				}
				
				//strike
				
				for (int i = 0; i < u_num.length; i++) {
					if(u_num[i] ==r_num[i]) {
						strike++;
					}
				}
				
				if(strike >u_num.length - 1) {
					clear = true;
					break;
				}
				//4. message(Printing)
				System.out.println(strike +" 스트라이크 "+ball+" 볼 "+" 입니다 ");
				
					w++;
			}
			/////////////////////////////////////////////////loop 10번 기회
			
			//5. result(clear, no good)
			
				if(clear == true) {
					System.out.println("축하합니다.");
				}
				
				else {
					System.out.println("아쉽습니다. 다시 도전하세요.");
						
				}
			//6. loop
			// -----------------------------------------------------replay
				System.out.print("계속 도전하시겠습니까?(y/n) : ");
					replay=sc.next();
					
				if (replay.equals("n")) {
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}
				
		
			
		}
		
		

	}

}
