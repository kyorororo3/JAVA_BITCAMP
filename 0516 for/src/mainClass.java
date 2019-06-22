
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* for : loop(순환, 반복)
		  
		   for ( 초기화(선언도 함께 할 수 있음)1111111 ; 조건문444444/77777777/100000  ; 연산식3333333/66666666666/9999999){
		   처리222222/555555555/888888
		   
		  (11)에 탈출 순환을 시켜줄 때 for문을 쓴다.
		   
		   조건문이 성립될 때까지 반복해라의 느낌
		   
		   
		   왜 for문이 나오게 되었는가.
		   int num = 0; //10번을 연산처리;
		   
		   num = num + 1;
		   num = num + 1;
		   num = num + 1;
		   num = num + 1;
		   num = num + 1;
		   
		   조건이 맞으면 계속 순환, 안맞을 때까지 계속 돌리고 안맞으면 탈출
		   
		 */
		
		int i;
		for(i = 0;i <10 ;i = i + 1) { // == for(i = 0 ; i <10 ; i++) 
			System.out.println("loop i:" + i);
		}
		
		System.out.println("loop out i:" + i);
	
	
	/*
		i=0;
		for(i = 0; ;i++) { //연산식/조건이 없을 때 출력이 무한으로 나감
			System.out.println("loop i:" + i);
	
	
		System.out.println("loop out i:" + i);
		}
		*/
		
		/*
		 	int i;
		for(i = 0;i <0;i = i + 1) { //조건이 안맞을 경우 System.out.println("loop out i:" + i); 여기 출력에서 loop out i = 0
			System.out.println("loop i:" + i);  //연산식이 잘못된 경우에도 계속해서 무한
		}
		
		System.out.println("loop out i:" + i);
	
		 */
		
		//수학의 시그마 처리와 유사하다
		
		// 1~10 더한 수를 구하라.

		int sum = 0;
		for(i = 11;i <=20 ; i++) { // == for(i = 0 ; i <10 ; i++) 
			sum = sum + i;
		}
		
		
		System.out.println("합계:" + sum);
	
		sum = 0;
		int n = 1;
		for(i = 0;i <10 ; i++) { // == for(i = 0 ; i <10 ; i++) 
			sum = sum + n;
			n++;
		}
		
		System.out.println("합계:" + sum);
	
		//경우에 따라서 

		for(i =0;i <10; i= i+2) {
			System.out.println("loop i:"+i);
		}
	
	
		for (i = 10; i > 0; i-- ) {
			System.out.println("loop i:"+i);
		}
		
		// endless loop(무한루프)
		//for(i = 0;  ; i++) { 
		//}
	
		int j = 0;
		for(  ;j<10; ) {
			System.out.println("loop j:" +j);
			j++;
			
			
		//for문은 두가지를 섞어서 쓸 수는 없을까? 
		for(i = 0, j = 0; i<10 ; i++, j++) {
			//문법상 틀린 것은 아니나 보통 이렇게 쓰진 않는다
		
		System.out.println("loop i:" +i);
		System.out.println("loop j:" +j);
		
		}
		//위와 아래의 차이가 무엇일까? 선언을 안에한 것과 밖에서 한 것
		for(int k = 0; k <10 ; k++) {
			System.out.println("loop k:" +k);
				
		//k = 1; 밖에서 접근이 불가
		//for의 목적은 루프하는데 있음. 그래서 루프에 집중한 경우는 안에서 선언하는게 조금 덜 복잡하다. 밖에서 신경써야할 변수가 줄어들기 때문에
		}
		
		
		//for문 안의 for문 
		
		for(i = 0; i < 10; i++) {
			
			System.out.println("loop i:" +i);
			
			for(j = 0; j < 5; j++) {
				
				// 10*5번의 루프가 돌아가게 된다. i=0일때 j=0~4, i=1일때 j=0~4
				System.out.println("\tloop j:" +j);
			
			}
		}
				
				
		//int i 와 int j 가  for문에서 보편적으로 쓰임
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	}
	

}
