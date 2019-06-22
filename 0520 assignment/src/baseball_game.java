import java.util.Scanner;

public class baseball_game {

	public static void main(String[] args) {
		//1!=1!=2
		//10회
		
		while(true) {
		String replay;
		//base ball의 out 숫자 랜덤 출력
		int w =0;
		int out1 = (int)(Math.random()*10);
		int out2 = (int)(Math.random()*10);
		int out3 = (int)(Math.random()*10);
		int result = 0;
		
		while(true) {

		
			if(out1 != out2 && out1 != out3 && out2 != out3) {
				System.out.print(out1+" " + out2+" "+out3 +"을 찾아야해\n");	
				break;
			}else {
				 out1 = (int)(Math.random()*10);
				 out2 = (int)(Math.random()*10);
				 out3 = (int)(Math.random()*10);
			
			}
			w++;
			
		}
	
		// user가 3가지 숫자를 임의로 입력
		Scanner scan = new Scanner(System.in);
		w = 0;
		while(w<10) {
		System.out.print("첫번째 숫자: ");
		int in1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int in2 = scan.nextInt();
		System.out.print("세번째 숫자: ");
		int in3 = scan.nextInt();
		
		// 컴퓨터 vs user 비교
		
		int strike, ball, run;
		strike = ball = run = 0;
		if(out1 == in1) {
			strike++;   //strike
		}
		if(out2 == in2) {
					//strike
			strike++; 
		}
		if(out3 == in3) {
					//strike
			strike++; 
		}
		if(out1 == in2 || out1 == in3 ) {
					//ball
			ball++;
		}
		if(out2 == in1 || out2 == in3 ) {
					//ball
			ball++;
		}
		if(out3 == in1 || out3 == in2 ) {
				//ball
			ball++;
		}
		if(out1 != in1 && out1 != in2 && out1 != in3) {
			System.out.println("run 입니다."+"남은 기회:"+(10-w));
		}
		else {
			System.out.println(strike +" Strike "+ball +" Ball "+" 입니다. "+"남은 기회:"+(10-w));
			
		}
		
		// 출력
	
			if(strike==3) {
				System.out.println("정답! out 입니다.");
				break;
			}
			
			w++;
		}
	
		// 반복
		
		
		System.out.print("계속 도전하시겠습니까?(y/n) = ");
			replay = scan.next();
		
			if(replay == "n") {;
				System.out.println("이용해주셔서 감사합니다.");
			}
			
	}
		
		
		
		
		
		
		
		}
			
	

}



