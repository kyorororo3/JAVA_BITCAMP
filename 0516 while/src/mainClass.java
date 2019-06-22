
public class mainClass {

	public static void main(String[] args) {
		
		
		//while문은 for의 형제
		
		/*
		 
		  while 도 loop
		  
		  for -> (초기화;조건문;연산식){
		  			처리
		  }
		  
		  --------------while의 형식
		  
		  초기화
		 while(조건식){
		  	처리
		  	연산식
		 
		 }
		 
		 --------------do while의 형식
		  
		 초기화
		 do{ 
		 	처리
		 	연산식
		 } while(조건문)
		 */

		
		int w;
		w = 0;				//초기화
		while(w <10) {		//조건식
			
			System.out.println("while w:" + w);
			
			w++;			//연산식 (주의 점) }의 맨끝 처리하기 바로 위에 있을 경우가 많다 
		}
		
		
		w = -1;
		while (w <=3 && w >= 0 ) {
			System.out.println("while w:" + w);
			w++;
		}
		
		w = 5;
		
		do {
			System.out.println("do while w:" + w);
			w++;
		}while(w < 5);  //while문의 경우는 거짓일 경우 없어짐 but do의 경우 w의 값이 그대로 나옴 순서의 문제
		
		//자기가 원할때 실행되는걸 좋아하지 이런느낌 do while을 그렇게 잘 쓰지 않음
		
		//무한루프
		/*
		w = 0;
		while(true) {
			System.out.println("while true w:" + w);
			w++;
		}
		*/
		//application
		
		// 1. initialize(초기화) init(약자)
		
		// 2. loop(무한루프) //while을 제일 많이 씀 100%는 아니지만.. 탈출하기가 편리함
		
		// 3. release(해방) memory와 process를 해방
		
		
		
		
		
		
		
		
		
		
	}

}
