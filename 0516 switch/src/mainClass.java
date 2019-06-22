
public class mainClass {

	public static void main(String[] args) {
		// Switch 문
		
		/*
		사용빈도 수는 낮지만 기본 제어문이기 때문에 알아둬야 한다.
		switch :조건 명시 
		if와 다른 점은 값이 명확해야함!!! -->(범위를 사용할 수 없다)
		
		형식:
		switch(대상이 되는 변수)
		{case 값1(value):
				처리
				break;				//블록괄호로 대부분 선언한다
		case 값2(value):
				처리
				break;	
		case 값3(value):
				처리
				break;    //분기 가능
				
			default: == 조건문에서의 else
				break; (의미 없음 = 왜냐 값 1,2,3이 아닐땐 무조건 디폴트로 들어오기 때문에, 하지만 들어가있는 경우를 종종 볼 수 있음)
				
		
		}
		 
		 */

			int number =1;
			
			switch(number) {
			
				case 1: //number == 1
					System.out.println("number = 1입니다"); //각자의 처리부분
					break; //빠져나간다. 탈출의 의미 이것을 가지고 여러가지고 분기를 할 수 있다.
				case 2:
					System.out.println("number = 2입니다");  //각자의 처리부분
					break;
					
				default:			//else
					break; //안붙여줘도 상관 없다 
			}	
					//주의점 1 범위값을 설정할 수 없다
					//switch(number) --> switch (number <1) XXXXX
					//case 1 --> case(number >1) XXXXXX
					//코드가 깨끗하게 보여서 크게 나눌 때 쓸만함  ios {} 이거 빼면 에러가 나옴 무조건 묶도록 나와있음
			
			
			// = = 위의 switch문가 동일함
			if (number == 1) {
			}
			
			else if (number == 2) {
			
			}
			else {
			}
			
			
			char c = '가';
			switch(c) {
			case('가'):
				System.out.println("c = '가' 입니다");
				break;
			
			}
			
			/*주의점 2 더블문에 쓸 수 없다
			double d = 123.4567;
			switch( d ) {
			case 123.4567;
				break;
			}
			
			//double은 switch를 사용할 수 없다
			조건문에서는 더블 사용 가능. 스위치의 사용도가 떨어지는 이유는 쓰일 수 있는 곳이 한정적
			
			*/
			
			double d = 123.4567;
			if (d == 123.4567) {
			}
			
			
			
			String str = "abc";
			switch(str) {
				case "Abc":
					break;
				case "abc":
					System.out.println("str == \"abc\"");
					break;
			}		
				//c언어에서는 동작하지 않는다. C#은 가능 
				// 호주나 미국은 ASP를 많이 씀 JSP랑 비슷하지만 플랫폼이 달라서 약간의 차이가 존재한다
					
			if(number > 0 && number <10) {			
			}
			else if (number > 0 && number <20) {
			}
			else if (number > 0 && number <30) {
			}
			
			//0부터 30까지 조사
			
			switch (number) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}	
			// 속도가 요할 때는 스위치가 더 빠르다
			// 스위치는 논리연산 보다는 대입이 많다. 이값하고 같은 값을 찾는 느낌
			
		
			
			}
	}


