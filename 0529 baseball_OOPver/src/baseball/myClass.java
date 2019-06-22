package baseball;

import java.util.Scanner;

public class myClass {

	/*
	 메소드의 기능을 생각하면서 어떤 걸 짜야하는지 확인해야함
	 */
	
	///변수
	//선언
	
	private int r_num[];
	private int u_num[];
	boolean clear;
	private int strike;
	private int ball;
	boolean swit[];
	
	
	///메소드
	//초기화
	public void init() {
		clear = true;
		r_num = new int[3];
		u_num = new int[3];
		swit = new boolean[10];
		
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false;
		}
		
	}
	 
	//랜덤 숫자 출력
	public void randomNumber() {
		int r = 0;
		
		int w = 0;
		while(w < r_num.length) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r;
				w++;}
		}
		
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println("r_num["+i+"] = "+r_num[i]);
		}
		
	}
	//유저 숫자 입력
	public void userNumber() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < u_num.length; i++) {
				System.out.print((i+1)+"번째 수: ");
				u_num[i] = scan.nextInt();
					
			}
			
			if(u_num[0] != u_num[1] 
					&& u_num[0] != u_num[2] 
							&& u_num[1] != u_num[2]) {
				break;
			}
			System.out.println("같은 숫자가 있습니다. 다시 입력해주십시오");
		}
		
	}
		
	//finding x 10 번 (Strike, ball)
	public void finding10() {
		//ball
		int w = 0;
		
		while(w < 10) {
		
			for (int i = 0; i < u_num.length; i++) {
				for (int j = 0; j < u_num.length; j++) {
					if(r_num[i] == u_num[j] && i !=j ) {
						ball++;
					}
				}
			}
		
			for (int i = 0; i < u_num.length; i++) {
				if(r_num[i] == u_num[i]) {
					strike++;
				}
			}
			
			if(strike>(u_num.length - 1)) {
				break;
			}
		w++;
		}
		System.out.println(strike + " 스트라이크" + ball + " 볼" + " 입니다.");
	}
	

	//result
	
	//replay
	
}
