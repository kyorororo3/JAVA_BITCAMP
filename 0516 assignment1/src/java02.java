import java.util.Scanner;

public class java02 {

	public static void main(String[] args) {
	
		/*
		
			String sArray[] = new String[5];
			sArray[0]="*";
			sArray[1]="**";
			sArray[2]="***";
			sArray[3]="****";
			sArray[4]="*****";
			
		for(int i = 0; i<5; i++) {
			System.out.print("\n"+ sArray[i]);

			for(int j = 5; j>=0 && j<5 ; j++\) {
				System.out.print("\n"+ sArray[j]);

			}
		/*for(int j = 1; j<5 ; j++) {
					
			System.out.print("*");
		}
		*/
		
		/*재민씨한테 들은 해설.. 벋 계속 에러가 나더라..
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
		
			if(i <n/2+1) {
				for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			}
			else {
				for( int j=0; j<=n-i; j++) {
					System.out.print("*");
				
		
				}
		}
		}	
				System.out.println();
		
	*/
		
		
		/*
		  
		 * 
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		int len = 0; //소귀값을 정한 것 
		for(int j = 0; j <9; j++) {
			
			if(j <5)len++;
			else	len--;
			
			for(int i = 0; i <len; i++) {
				System.out.print("*"); //가로축
			}	
			System.out.println();
		}
			
		System.out.println();
		/*				3
		 *** 			7
		 *******		5
		 *****			6
		 ******			8
		 ********		7
		 *******		6
		 ******			4	
		 ****			2
		 **				1
		  
		  */
		
		int numArr[] = {3,7,5,6,8,7,6,4,2,1 };
		
		for(int j = 0; j <10; j++) {
			
			for(int i = 0; i <numArr[j]; i++) {
				System.out.print("*"); //가로축
			}	
			System.out.println();
			
		}
		
		  //임의로 할 때는 Array를 쓰면 된다...!
		
	}

}
