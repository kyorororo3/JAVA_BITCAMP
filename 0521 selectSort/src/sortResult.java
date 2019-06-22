import java.util.Scanner;

public class sortResult {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		int number[];
		int updown;
		
		//숫자 입력
		System.out.println("정렬할 숫자의 갯수를 입력해주십시오");
		System.out.print(">>");
		int count = sc.nextInt();
		
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i+1)+"번째 수 :");
			number[i] = sc.nextInt();
			
		}
		
		//올림/내림
		System.out.println("올림(1)/내림(2)");
		System.out.print(">>");
		updown =sc.nextInt();
		
		int temp;
		for (int i = 0; i < number.length -1; i++) {
			
			for(int j = i + 1; j< number.length; j++) {
				if(updown == 1) {
					if(number[i] > number[j]) { //올림차순
					temp = number[i];		  //swap
					number[i] = number[j];
					number[j] = temp;
					}
				}
				else {
					if(number[i] < number[j]) { 
						temp = number[i];		  //swap
						number[i] = number[j];
						number[j] = temp;
						}
				}
			}
		}
				
		
		//출력
		
		if(updown == 1) {System.out.println("올림차순으로 정렬하였습니다.");
		}
		else {	System.out.println("내림차순으로 정렬하였습니다.");
		}
		
		for (int i = 0; i < number.length; i++) {
			
		System.out.println("number["+i+"] ="+ number[i]);
		
		}
		
	}

}
