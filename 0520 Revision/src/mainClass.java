import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 
		 java == OOP(Object Oriented Program)
		 
		 기본 자료형
		 
		 숫자
		
		정수
		 byte	1byte == 8bit
		 short	2byte
		 int	4byte
		 long	8byte
		 
		실수
		 float	4byte	소수점 6번째 자리까지 밖에 안나옴
		 double	8byte	
		 
		 
		 문자
		 
		 char	2byte
		 String	?byte  - length()길이값
		 
		 true/false
		
		 boolean 1byte
		
		
		Array(배열)
		:같은 자료형 변수의 묶음
		
		int iArr[] = new int[10]; //동적할당 10
		>> 처음부터 할당한 것
		
		
		int iArr[];
		iArr = new int[5]; 나중에 할당 한 것 //동적할당 5
		
		정적사용 >> 0~4 ->5는 안됨 추가할 수 없음
		
		자료형변환
		
		char >> int
		
		char ch = 'A'; 
		System.out.println(ch); --> console: A
		System.out.println((int)ch); --> console: 65
		
		int num = ch; //에러나지 않음  자동형변환 
		
		byte by = num; //에러남
		by =(byte)num; //cast 변환
		
		int num1 = 3, num2 = 2;
	
		double avg = num1/num2; 		->1.0
		double avg = (double)num1/num2;	->1.5
		double avg = (double)num1/(double)num2 >>이렇게 할 필요 없이 앞에만 붙여도 됨
		
		
		 */
		
		//대문자 --> 소문자
		// A == 65, a == 97;
		
		char c = 'A';
		int n = c;
		System.out.println("n =" + n);
		
		n = n + 32;
		c = (char)n;
		System.out.println("c =" + c);
		
		
		String str ="abc";
		
		System.out.println(str.charAt(0));
		for(int i = 0; i<str.length(); i++) {
			int cn = (int)str.charAt(i);
			System.out.println((char)(cn -32));
			
		}
		
		
		
		
	//if
	int number = 5;
	if(number > 0) { //논리연산 true or false
		//조건이 true인 경우, 이 블록안의 처리가 실행된다.
	}
	
	
	// && || !도 같이 사용
	
	if(number >0 && number<10) {
		
	}
	
	if(number <0 || number >10) {	
	}
	
	if(number <0 || number >10) {	
	}
	//>>> 밑에 것과 같은 것
	if(number >=0 && number<=10) {
		
	}
	
	boolean b = true;
	
	if(b == true) {
	}
	if(b) {
	}
		
	b = false;
	if(b == false) {
	}
	if(!b) {
	}
	else {
		
	}
	
	//조건분기 if else if
	
	if(number> 0 && number <=10) {  //1 ~10

	}
		
	else if (number> 10 && number <=20) {
		
	}
	
	else if (number> 20 && number <=30) {
		
	}
	
	
	// switch 값이 명확해야 한다 명확해야한다. double은, 실수는 사용할 수 없다 깨끗할때 짜면 보기 좋음
	switch(number) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
	
		default:
			break; // no의미
			
	}
	
	//loop (for while do while)
	
	for(int i = 0; i<10 ; i++) {
		
	}
	
	for(int i = 0; i<= 10 ; i++) {
	// i = 5가 될 수도 있고 i-- 도 가능 but 주로 i++	
	}
	
	
	for (int i = 0; i < 10; i++) {
		// i = 1 i<=10 쓸수 있지만 알아보기 힘들게 된다
		for (int j = 0; j < 5; j++) {
			
		}
	}
	
	//for문은 초기화가 제어문 안에 있고 while은 초기화가 밖에 있음. while은 연산식을 제어할 수 있다.
	
	
	int w;
	w = 0;
	while(w<10) {
		//처리는 여기
		
		w++;
	}
	
	
	int w1, w2;
	w1 = w2 = 0;
	while(w1 <10) {
		
		w2 = 0; //초기화를 해야 50번 도는게 된다 초기화가 밖에 있어서 while문 안에 있는 것을 다시 넣어줘야한다. 이중 while문으로 50번 돌기 위해서는 넣어야함. but 많이 쓰는 편은 아님
		while(w2 <5) {
			
			w1++;
		}
		w2++;
	}
	
	//50번이 돌지 않음 
	
	
	
	
	
	
	//do while
	
	int w3 = 0;
	do {
		//무조건 한번 처리 됨
		w3++;
	}while(w3 >10);
	
	while(w3>10) {
		
	}
	
	
	
	
	//for문은 많이 쓰고 while은 적지 않게 씀
	
	
	//Application
	
	//initialize	초기화 -- 값을 넣어주는 것
	//loop			프로그램 실제 처리
	
	/*
	while(true) {
	}
	*/
	
	//release		해방 -- 동적할당 ->delete
	
	
	
	
	
	//while문이 위에 있을 때 실행이 안됨
	int arrp[] = new int[3];
	// delete arr; 			//자바에서는 사라졌지만 C에서는 나옴 
	// >> 동적할당을 지워주는 것 자바는 가비지컬렉터가 알아서 해주는 것
							//메모리 누수현상을 없애기 위해 하는 것 
	
	
	//break			상당히 자주 사용 loop문과 사용 + for while 문
	
	
	int _number[] = { 11, 22, 33, 44, 55 };
	for(int i = 0; i <_number.length; i++) {
		if(_number[i] == 33) {
			break;
		}
		
	}
	//loop문 하나당 break 하나 
	
	boolean bo =false;
	for(int i =0; i<10; i++) {
		for (int j = 0; j < 5; j++) {
			if(i ==5 && j ==3) {
				bo =true;
			}
			if(bo) {
				break;
			}
		}
			if(bo) {
				break;
		
			}
	
	}
	
	loopout:for (int i = 0; i < 5; i++) {
				
				for (int j = 0; j < 10; j++) {
			
			if(i == 5 && j == 3) {
				break loopout;
			}
			
		}
	}
	
	
	//continue (생략 skip) loop문 없이 사용 불가
	
	Scanner sc = new Scanner(System.in);
	
	
	//num <0는 다시 입력하십시오 
	
	w = 0;
	int myNum;
	while(w <5) {
		System.out.print((w + 1)+"번째수 :");
		myNum = sc.nextInt();
		
		if(myNum<0) {
			System.out.println("음수를 입력하셨습니다. 다시 입력해주세요.");
			continue;
		}
		
		w++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
