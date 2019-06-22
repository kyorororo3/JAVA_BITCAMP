import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// baseball
		
		int ballArr[] = new int[3];
		int randomBallArr[] = new int[3];
		int rArr[] = new int[3];
		int strike, ball;
		int w; 
		boolean clear =false;
		boolean replay =true;
		
		
		while(true) {
		//random number
		randomBallArr = randomNumber(rArr);
		
		
		//numberInput
	
		
			
		//ballCheck && strikeCheck
		strike = ball = 0;
		w = 0;
		while(w<10){
			ballArr = numberInput(randomBallArr);
			
			ball= ballCheck(ballArr, randomBallArr);
			
			strike = strikeCheck(ballArr, randomBallArr);
			
			clear = win(strike, ballArr, randomBallArr);
				if(clear == true) {
					break;		
				}
			System.out.println(strike +" 스트라이크 "+ball +" 볼 입니다.");
			
			
			w++;}
		
		ballResult(clear);
		
		
		//ballResult
		replay = replay();
			if(replay == false) {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	static int[] randomNumber(int[] randomBallArr) {
	
		int r,w;
		int ballArr[] = new int[3];
		boolean swit[] = new boolean[10];
		
		//숫자 중복을 없애기 위한 boolean돌리기
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false;
		}
		//랜덤 숫자의 출현
		w=0;
		while(w<ballArr.length) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r] = true;
				randomBallArr[w] = r;			
				w++;
			}
		}
		for (int i = 0; i < randomBallArr.length; i++) {
			System.out.println("randomBallArr["+ i + "] =" + randomBallArr[i]);
		}
	return randomBallArr;
	}
	
	
	
	static int[] numberInput(int[] randomBallArr) {
		Scanner scan = new Scanner(System.in);
		
		
		//숫자의 갯수는 그냥 내가 3개로  설정
		
		//숫자 하나하나 기입
		int ballArr[] = new int[3];
		int num = 0;
		while(true) {
			for (int i = 0; i < randomBallArr.length; i++) {
				System.out.print(i+1+" 번째 숫자: "); 
				num = scan.nextInt();
				ballArr[i] = num;
			}	
				if(ballArr[0] != ballArr[1] 
						&& ballArr[0] != ballArr[2] 
								&& ballArr[1] != ballArr[2]) {
					break;
				}
				else { 
					System.out.println("같은 숫자가 있습니다. 다시 입력하십시오.");
				}
			
		}
	return ballArr;}
	
	
	
	
	static int ballCheck(int[] ballArr, int[] randomBallArr) {
		int  ball = 0;
		
		for (int i = 0; i < ballArr.length; i++) {
			for (int j = 0; j < ballArr.length; j++) {
				
				if(ballArr[i] ==randomBallArr[j] && i!=j) {
					ball++;
			
				}
			}
		}
		
	return ball; }
	
	
	
	static int strikeCheck(int[] ballArr, int[] randomBallArr) {
		int strike = 0;
		
		
		for (int i = 0; i < ballArr.length; i++) {
			
			if(ballArr[i] == randomBallArr[i]) {
				strike++;
			
			}
		}
		
	return strike; }
	
	
	
	static boolean win(int strike, int[] ballArr, int[] randomBallArr) {
		boolean clear=false;
	
		if(strike>(ballArr.length-1)) {
			clear = true;
			
	
		}
		return clear;	}
	
	
	
	static void ballResult(boolean clear) {
		
		if(clear == true) {
			System.out.println("축하합니다.");
		}
		else {
			System.out.println("아쉽습니다. 다시 도전하세요.");
		}
	}
	
	
	
	static boolean replay() {
		Scanner scan = new Scanner(System.in);
		String replay = "";
		boolean re = true;
		
		System.out.println("계속 도전하시겠습니까? (y/n)");
		replay = scan.next();
		
		if(replay.equals("n")) {
			re = false;
			System.out.println("이용해주셔서 감사합니다.");
			
		}
	
	 
	 
	return re;}
 }
