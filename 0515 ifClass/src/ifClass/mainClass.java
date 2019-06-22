package ifClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 제어문의 종류
		  --> 연습이 많이 필요한 제어문 익숙해지는데 시간이 좀 걸림 1달정도 걸려 
		 
		  1)조건문
		   -if
		   
		   -if else
		   
		   -if
		   -else if
		   -else
		   
		   -switch
		   
		  2)loop(반복문)
		   - for >>~에 대해서
		   
		   - while
		   
		   - do while
		  
		  3)반복제어문
		   -break
		   
		   -continue
		  >>잘 조합해서 제어하는 것이 굉장히 중요하다
		  >>기술 면접에서 무조건 나옴 
		 */
		
		//조건문의 형식
		/*
		 형식이 어떻게 되는가? 고정적으로 정해져 있는 형식
		 1.if(조건(문)){ 조건 == 논리연산(true/false) a>0 && a <= 10 >>1~10
		 }
		 	//처리 (조건이 맞았을 때) 조건문 사용빈도수 1위
		 2.if(조건(문))
		 	System.out.print("~~~~"); 첫번째 문장에서는 {}를 안붙여도 나온다
		 	
		 3.if(조건1){
		 	//조건 1 true 처리
		 }
		   if(조건1){
		   //조건 1 false 처리
		 */
		int number;
		number = 1;
		if(number > 0) {
			System.out.println("number는 0보다 큽니다");
		}	
		if(number == 1) {
			//if(number =1) 대입연산자 이거 C에서는 괜찮다
			System.out.println("변수 number의 값은 1입니다");
		}	
		if(number >=10 ) {
			System.out.println("number는 10보다 크거나 같습니다");
		}
			
		if(true) {
			System.out.println("true입니다");
	}  // 설명용일뿐 이렇게 적진 않는다.
		
		boolean b = false;
		if(b==false) {
			System.out.println("b == true입니다");
		}
		if(b !=true) {
			System.out.println("b != true입니다");
		}
		
		
		if (b) { // b == false (b b== true)
			System.out.println("b == true입니다");
		}
		if (!b) { // b == false (b b== true)
			System.out.println("!b == false입니다");
		}
		
		
		if(number>0 && number <= 10) {
			System.out.println("number는 0보다 크고 10보다 작거나 같습니다.");
		}
		
		if(number < 30 || number >49) {
			System.out.println("number는 30보다 작거나 49보다 큽니다"); //합집합이 없는 상황 2가지 조건을 묶어줌
		}
		
		// if else
		if(number > 10) {
			System.out.println("number는 10보다 큽니다"); 
		}
		else {
			System.out.println("number는 10보다 작거나 같습니다"); 
		}
		
		//조건 분기
		/*연령대를 조사할 때, 10대,20대,이런거 분기를 많이 시켜야한다.
		 if(조건1){
		 }	//조건1이 true였을 때 처리
		 
		 else if(조건2){
			조건2이 true 처리
		 }
		 else if(조건3){
		 	조건3이 true 처리
		 }
		 else {
		 	조건이 다 성립되지 않았을 때 처리  >> 아무 처리 안하고 싶으면 빼버리면 된다.
		 }
			

		 */
		
		int age = 50;
		
		if(age < 20) {
			System.out.println("당신은 미성년자 입니다.");
		}
		else if(age <30) {
			System.out.println("당신은 20대 입니다.");
					
		}
		else if(age <40) {
			System.out.println("당신은 30대 입니다.");
			
		}
		else if(age <50) {
			System.out.println("당신은 40대 입니다.");
			
		}
		else {
			System.out.println("당신은 50세 이상입니다.");	
		}
		
		//조건처리를 어디서부터 해나갈 것인가 생각을 해서 만들어야함 위에서든 아래에서든 쓸 수 있는 건 있다.
		
		if(age > 0 && age <20) { //두가지 논리 연산이 들어가는 경우 복잡하지만 참이 성립될 가능성이 높다.
			System.out.println("당신은 미성년자 입니다.");
		}
		else if (age >=20 && age <30) {
			System.out.println("당신은 20대 입니다.");
		}
		else if (age >=30 && age <40) {
			System.out.println("당신은 30대 입니다.");
		}
		else if (age >=40 && age <50) {
			System.out.println("당신은 40대 입니다.");
		}
		
		
		//if문 안의 if문
		int count = 95;
		
		if(count >= 90) {
			
			if(count >= 95) {
				System.out.println("A+입니다.");	
			}else {
				System.out.println("A입니다.");
			}
		}
		
		
		
		
		
		
		
		
		}
	}




