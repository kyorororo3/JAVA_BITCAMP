
public class Practice {

	public static void main(String[] args) {
	int i; int j;
	for(i = 0; i < 10; i++) {
			
			System.out.println("loop i:" +i);
			
			for(j = 0; j < 5; j++) {
				
				// 10*5번의 루프가 돌아가게 된다. i=0일때 j=0~4, i=1일때 j=0~4
				System.out.println("\tloop j:" +j);
			
			}
		}
				


	int sum = 0;
	for(i = 11;i <=20 ; i++) { // == for(i = 0 ; i <10 ; i++) 
		sum = sum + i;
		System.out.println("합계:" + sum); //괄호 안에 넣었을 경우 더하기가 되는 과정이 콘솔로 나온다
	}
	
	
	

	sum = 0;
	int n = 11;
	for(i = 0;i <10 ; i++) { // == for(i = 0 ; i <10 ; i++) 
		sum = sum + n;
		n++;
		
	}

	System.out.println("합계:" + sum);// 괄호 밖에 넣었을 경우, 더하기가 되는 과정이 다 끝난 후 결과만 도출되서 나오는 것 왜냐하면 안에서 계산을 열심히하고 탈출했을 때 출력을 했기 때문이다
	
	
	
	
	//for(i =0;i <10; i= i+2) {
	//	System.out.println("loop i:"+i);
	//}

	for (i = 10; i > 10; i-- ) {
		System.out.println("loop i:"+i);
	
	}
	
	
	
	
	
	}

}
