package baseball;

import java.util.Scanner;

public class instructorClass {

	//변수
	private int r_num[], u_num[];
	private boolean clear;
	
	//메소드
	public void init() {
		r_num = new int[3];
		u_num = new int[3];
		clear = false;
		random();
	System.out.println();
	}
	
	private void random() {	//r_num[3]
		boolean swit[] = new boolean[10];
		int w, r;
		
		w = 0;
		while(w < 3) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r;
				w++;
			}
		}
	
		for (int i = 0; i < r_num.length; i++) {
			System.out.print(r_num[i] + " ");
		}
	}
	
	public void userInput() { // u_num[3]
		Scanner sc = new Scanner(System.in); // 여러군데에서 입력받아야할 경우 멤버 변수 있는 곳에 둘 것
		
		for (int i = 0; i < u_num.length; i++) {
			System.out.print(i+1+" 번째 수 : ");
			u_num[i] = sc.nextInt();
		}
	}
	
	public void loop() {	//r_num[3], u_num[3], clear
		int w = 0;
		int strike, ball;
		
		while(w<10) {
			userInput();
			
			ball = 0;
			//ball
			for (int i = 0; i < r_num.length; i++) {
				for (int j = 0; j < r_num.length; j++) {
				
					if(r_num[i] == u_num[j] && i != j) {
						ball++;
					}
				}
			}
			
			strike = 0;
			//strike
			for (int i = 0; i < r_num.length; i++) {
				if(r_num[i] == u_num[i]) {
					strike++;
				}
			}
			
			if(strike>u_num.length -1) {
				clear = true;
				break;
			}
			
			System.out.println(strike+ " 스트라이크" + ball + " 볼" + " 입니다.");
			w++;
		}
		
	}
	
	
	public void result() { // clear
		
		if(clear == true) {
			System.out.println("축하합니다.");
		}
		else {
			System.out.println("아쉽습니다. 다시 도전해주세요.");
		}
	}
}
