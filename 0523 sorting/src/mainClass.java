import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//초기화
		
		int inputArr[] = new int[0];
		String upDown = "";

		
		//배열 = numberInput(올림/내림)
		//몇개의 숫자
		//숫자 입력
		//올림? 내림?
		//return은 여기만
		
		inputArr = numberInput();
		
		System.out.print("(올림/내림)?");
		upDown = scan.next();
		
		// sorting(배열, 올림/내림세트)
		//swap
		
		sorting(inputArr,upDown);
		
		
		//result(배열, 올림/내림 표시)
		printing(inputArr,upDown);
		
			
	

		
	}
	
	static int[] numberInput() {
		Scanner scan = new Scanner(System.in);
	
		int count = 0;
		int input = 0;
		int inputArr[] = new int[0];
		
		System.out.print("정렬하고자 하는 숫자의 갯수를 입력해주세요 :");
		 	count = scan.nextInt();
		 	inputArr = new int[count];
		
		for (int i = 0; i < count; i++) {
			System.out.print(i+1+"번째 숫자 : ");
			input = scan.nextInt();
			inputArr[i]=input;
		}
		
	
			
	return inputArr;}
	
	static void sorting(int[] inputArr, String str) {
		
		while(true) {
			if(str.equals("올림")) {
				
				for (int i = 0; i < inputArr.length-1; i++) {
					for (int j = i+1; j < inputArr.length; j++) {
					
						if(inputArr[i] > inputArr[j]) {
						int temp;
						temp = inputArr[i];
						inputArr[i] = inputArr[j];
						inputArr[j] = temp;
						}
						
					}
				}
			break; }
			else if(str.equals("내림")) {
				
				for (int i = 0; i < inputArr.length-1; i++) {
					for (int j = i+1; j < inputArr.length; j++) {
					
						if(inputArr[i] < inputArr[j]) {
						int temp;
						temp = inputArr[i];
						inputArr[i] = inputArr[j];
						inputArr[j] = temp;
						}
						
					}
				}
			break; }
			
			else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			}
		}
		
	}
	
	static void printing (int[] inputArr, String str) {
		
		System.out.println(str+"차순으로 정렬하신 배열은 :" + java.util.Arrays.toString(inputArr));
		
	}
	
	
	
}
