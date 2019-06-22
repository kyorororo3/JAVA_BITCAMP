import java.util.Scanner;

public class rockpaperscissiors {

	public static void main(String[] args) {
		//가위바위보 만드는 것
		
		
		//1. 가위바위보의 랜덤 출력
		
		int com_rps = (int)(Math.random()*3);
	
		System.out.print("가위바위보!  컴퓨터 = ");
		
		if(com_rps==0) {
			System.out.print("가위");
		}
		else if(com_rps==1) {
			System.out.print("바위");
		}
		else if(com_rps==2) {
			System.out.print("보");
		}
		System.out.println();
		
		//2. 유저의 가위바위보 입력
		
		Scanner scan = new Scanner(System.in);
		String user_rps;
			System.out.print("가위바위보 중 하나를 입력해주세요: ");
			user_rps= scan.next();
			
			
		//3. 유저 vs 컴퓨터
			
			String array[][] = new String [3][3];
			/*	for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						*/
						int num;
						if(user_rps=="가위") {
							 user_rps = "0";
								System.out.print(user_rps);
							num = Integer.parseInt(user_rps);
							array[num][com_rps] = "비김";
							array[num][com_rps] = "패";
							array[num][com_rps] = "승";	
							System.out.print(array[num][com_rps]);
						
						}
						else if(user_rps=="바위") {
							 user_rps = "1";
								System.out.print(user_rps);
							num = Integer.parseInt(user_rps);
							array[num][com_rps] = "승";
							array[num][com_rps] = "비김";
							array[num][com_rps] = "패";	
							System.out.print(array[num][com_rps]);
							
						
						}
						else if(user_rps=="보") {
							user_rps = "2";
							System.out.print(user_rps);
							num = Integer.parseInt(user_rps);
							array[num][com_rps] = "패";
							array[num][com_rps] = "승";
							array[num][com_rps] = "비김";	
							System.out.print(array[num][com_rps]);
							
							
						}
				
				//	}
			
				//}
				
	
		
		
			
				
			
			
	
		//4. 출력

		

	}

}
