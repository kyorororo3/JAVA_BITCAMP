import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		  
		 
		 Selection Sort
		  선택		정렬
		 swap > < 숫자를 교환
		  
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		int number[] = {5, 2, 1, 3, 4};
		/*				2, 5, 1, 3, 4
		 				1, 5, 2, 3, 4
		 				
		 				   5, 2, 3, 4
		 				   2, 5, 3, 4
		 				   
		 				   	  5, 3, 4
		 				   	  3, 5, 4
		 				   	  
		 				   	  
		 				   	     5, 4
		 				   	     4, 5
		 */
		
		int temp;
		for (int i = 0; i < number.length -1; i++) {
			
			for(int j = i + 1; j< number.length; j++) {
				
				if(number[i] > number[j]) { //올림차순
				temp = number[i];		  //swap
				number[i] = number[j];
				number[j] = temp;
				}
				
				/*
			 if(number[i] < number[j]) { //내림차순
				temp = number[i];		  //swap
				number[i] = number[j];
				number[j] = temp;
				}  
				 */
			}
			
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number["+i+"] =" + number[i]);
		}
		
		
		
		
		/*
		 //input
		  
		 user에게 먼저 물어보기 -> 몇개를 정렬하시겠습니까?
		 >> 입력받기
		 
		 배열확보
		
		올림/내림 어떤거?
		>> 입력받기
		
		//process
		정렬처리
		
		//output
		출력
		 
		 
		 
		 */
		
		//입력
		System.out.print("정렬할 숫자의 갯수를 정해주세요=");
		int n = sc.nextInt();
		int num[] = new int[n];
		
		int w = 0;
		while(w<num.length) {
			System.out.print((w+1)+"번째 "+"정렬할 숫자를 나열해주세요 =");
				num[w] = sc.nextInt();
				w++;
			
		}
			
			
		System.out.print("올림차순/내림차순 중 하나를 선택해주세요 (올림/내림)= ");
			String str = sc.next();
			//처리
			int _temp;
			if (str.equals("올림")) {
				
				for (int i = 0; i > num.length-1; i++) {
					
					for (int j = i + 1; j < num.length; j++) {
						
						if(num[i] > num[j]) {
						_temp = num[i];
						num[i] = num[j];
						num[j] = _temp;
						break;
						}
					}
				}
			}
			
			else {
						
						for (int i = 0; i < num.length-1; i++) {
							
							for (int j = i + 1; j < num.length; j++) {
								
								if(num[i] < num[j]) {
								_temp = num[i];
								num[i] = num[j];
								num[j] = _temp;
								
								}
							}
						}
					}
			//출력		
			for (int i = 0; i < num.length; i++) {
				System.out.print("num["+i+"] = " + num[i]+" ");	
			}
			
	}

}
