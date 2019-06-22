package variable;

public class mainClass {

	public static void main(String[] args) {
		/* 이론이다ㅏㅏ
		 1.소스코드
		 ㅣ
		 2.컴파일(문자코드->기계어) 기계어라는 것은 컴퓨터는 2진수 밖에 모르기 때문에 마이너리 코드 "2진수코드" - lib파일을 불러들임(*.jar)  (함수가 정의되어 있는 부분을 불러들어오는 것)
		 --> * : 모든 것이라는 뜻
		 ㅣ
		 3.build == .exe 파일을 생성
		 ㅣ
		 4.실행
 2,3은 프로그램에서 다 해주는 것 묶여져있다. build automatically가 다해주는 것
 		 
		 */
		
		/*
		 숫자(상수):완전 정해진 숫자 우리가 알아볼 수 있는 숫자
		 컴퓨터가 알아볼 수 있는 숫자 
		 2진수 : 0,1 ***************
		 8진수 : 0~7  10진수로 했을 때 == 8 -> 010 (무조건 0을 앞에 붙여줘야 하는 것) 8진수의 경우 3개씩 잘라서 계산할 것
		 10진수 : 0~9 
		 16진수(2진수와 함께 반드시 알아야 하는 진수) : 0~9 A B C D E F(소문자도 가능) 0x8 0xA1 *************
		 										A:10 B:11 C:12 D:13 E:14 F:15
		 		10101100 이 있을 때 이 것을 4개씩 끊어서 보는게 계산이 편하다
		 		
		 		1010 1100 4개씩 잘라서 계산-> 10진수로 바꿔라 
		 		8421 8421 붙여서 계산하기가 편해짐
		 		16의 1승 16의 0승(0승이면 무조건 1)
		 		1이 있는 숫자만 뽑아서 승을 곱함
		 		16*10 + 1*12 = 172
		 		0xAC (16진수)
		 		 
		 		수치가 어떻게 적용되는지 원리를 알아야한다 
		 		어떤 계산 원리법인지를 알아야 한다
		 		
		 		2진수 1111 1111 -> 10진수 255 
		 		
		 		1111 1111 16진수
		 		0xFF 0xFF
		 		
		 		0xFF00 red
		 		0x0000FF blue
		 		
		 		우리가 컴파일을 할 때 16진수로 계산됨 이 것을 컴퓨터가 풀어서 받아들임
		 		
		 		여기까지 우리가 쓸 수 있는 숫자였다.
		 변수: 특정 이름을 정하고 값을 원할 때 변경할 수 있는 수
		 그릇과 같은 존재로 별명을 미리 정하고 그 안에 들어가는 값을 넣는 감각
		 
		 int == integer 정수의 약자
		 예약어 == 이미 정의가 되어 있는 말 
		  
		 */
		int i;
		//i라는 변수를 선언했다! 라는 것 
		//자료형 변수명 //요즘 언어는 ;이 없다 예)파이썬
	
		int aa;
		int _num; // _를 앞이나 뒤에 적는건 상관 없다
		
		//변수명을 지을 때, 바로 알아볼 수 있도록 선언한다 
		
		//학생의 변수를 정할 때
		int n;
		int sn;
		//--> 이 두가지의 변수 이름은 알아보기가 어려운 상황, 제일 좋은 변수 명은 본인만이 알아보는 것이 아니라 누구나 알아보는 변수 명이 좋다.
		int studentNumber;
		int stNum; // 앞에다가는 소문자 뒤에는 대문자 이렇게 쓰는 스타일 
		int stu_Num; //사람마다 변수명을 지으는 스타일이 있다.
		
		//변수명이 성립되지 않는 경우
		// int int;  1. 예약어 사용 불가능 
		// int _num; 2. 같은 이름의 변수는 선언 불가
		// int -num; 3. 연산자 포함 불가
		// int *num; 4.C언어의 경우 *를 포함하는게 가능하지만, 자바는 안됨. 그렇다고 해서 포인터를 안쓴다고 생각하면 오산
		// int 1sb;  5.맨 처음에 숫자로 설정하는 건 불가. but 두번째부터 설정하는건 가능 (int s1b;)
		
		int 넘버; //한글을 사용 가능하지만 회사에서 선호하지 않음
		//----------여기까지는 변수명을 작명하는 방법 
		//변수명을 작성했다는 것은 선언했다는 것 모든 변수는 컴퓨터의 메모리를 차지하기 때문에 값을 정하지 않아서 밑에 노란 선이 생김
		
		
		//변수의 종류 3가지
		
		/*
		// 숫자형
			정수
			byte	 1byte == 8bit 256개의 숫자를 표현할 수 있다 범위는 256개까지 표현 가능
			short 	 2byte 	  short int
			int		 4byte ****(가장 많이 쓰임 당연히 소수보다 정수를 더 많이 사용하기 때문에) 예전에는 2인적이 있었다. 하지만 지금은 규격화 된 것
			long	 8byte	  long int (왠만한 천문학적 숫자까지 다 표현 가능)
			
			소수(실수)
			float	 4byte 소수 점 6,7번째까지밖에 가능
			double	 8byte ****
			
		long vs float 
		float가 용량은 덜 잡지만 우선 순위를 보았을 때 long 보다는 위다
		제일 작은 것 byte, 제일 큰 것 double
		
		원형을 그렸을 때 float의 경우 정확한 소수점을 표현하지 못함. 오차가 생기기 때문에 마름모 꼴이 되는 경우가 많기 때문에 double이 무거움에도 불구하고 double을 더욱 빈번하게 사용
		
		
	
		// 문자형
		 	문자
		 	char	2byte **** (c언어의 경우 1byte) character 의 약자 ASCII == 문자의 숫자 (컴퓨터는 숫자밖에 못알아 보니까  수치로 바꿔주는 역할) 'A' == 65 (정해진 값) 'a' == 97
		 	 
		 	문자열 "abc" 6byte "abcde" 10byte 매번 다른 크기임 유동적이다.
		 	String (!= 자료형) == class ****(!= ~이 아니다) 문자열을 다루기 위해서 클래스가 나오는 것 wrapper class 형태로 만들어 놓은 것 이 클래스가 작지 않기 때문에 정리를 따로 해야함
		 	
		참/거짓형
			boolean 1byte****	true(1)/false(0) (자료형)
			bool(줄인 버전)
		
		****는 무조건 외워야 하는 것
		*/
		
		//-----------------------------------변수 사용법
		
		//---------숫자형
		int number;
		// 변수의 자료형	 int 
		// 변수명은		 number
		number = 123; //항상 오른쪽에 있는 값이 왼쪽에 대입된다. 그래서 대입 연산자라고 부름
		
		System.out.println(number);  //변수에 들어간 값을 출력한 것
		
		number = 234;
		
		System.out.println(number);  //값이 변경된 체로 나오는 것
		
		byte by;	// 변수의 선언
		by = 12;	// 변수의 값의 대입
		
		byte by1 = 23; //변수의 선언과 동시에 값을 대입
		
		System.out.println("by = " + by);
		
		
		by = 127; //1byte에 해당하는 값을 넣어야 하는 상황 
		
		System.out.println("by = " + by);
		
		//by = 128; //error를 보면 mismatch cannot convert from int to byte 표현을 할 수 있는 숫자를 넘어갈 경우 이러한 에러가 난다
		
		by = -127;
		
		System.out.println("by = " + by);

		//byte는 너무 적어서 범위를 벗어나기가 쉽다.
		
		short sh;
		sh = 1234;
		System.out.println("sh = " + sh);

		int Number;
		int NUMBER; //대문자로 사용하는 경우가 잘 없다. 다른 글씨로 인식
		Number = 123456;
		
		System.out.println(Number);

		long lo;
		// lo = 123467849960; //컴파일러가 받아들일 수 없다
		lo = 123456867034947L; //L의 경우 소문자/대문자 모두 가능하지만 소문자의 경우 숫자와 헷갈릴 수 있기 때문에 주로 대문자로 사용
		
		System.out.println(lo);  // 우리나라가 돈 단위가 높기 때문에 long형을 사용하는 경우도 간혹 있음
		
		float f;
		f = 123.4F; // 뒤에 F를 붙이지 않으면 안됨 소수점은 한자리만 있어도 double로 취급함 그니까 F를 붙여서야 float으로 인식함
		
		System.out.println("f = " + f);
		
		double d;
		d = 123.4576689503;
		System.out.println("d = " + d); //맨 뒷자리가 반올림이 될 경우 있다.
		
		//---------문자형
		char c;
		c = 'A';
		System.out.println("c ="+ c);
		// c = "A"; 큰따옴표에 문자를 넣을 수는 없다.
		c = 65; //문자의 숫자값을 넣으면 문자로 나옵니다 
		System.out.println("c =" + c);
		c = 'A' +1;
		System.out.println("c =" + c); // + 숫자 할 경우 다음 알파벳으로 넘어가네
		
		System.out.printf("%c", c); // %c 버전 / %d 버전이 있다
		
		System.out.printf("%d\n", (int)c); // 문자열을 강제로 수치화 하는 방법
		
		//---------문자열형
		// String == 자료형이 아니라는 것이 매우 중요하다 **** 
		// Wrapper class - 누군가가 편하게 사용하라고 만든 자료형 클래스 / 자료형을 클래스로 만들어 놓은 것
		
		String str; // 변수라고 안하고 객체라고함
		str = "안녕하세요";
		System.out.println("str = " + str);
		
		str = "반갑습니다";
		System.out.println("str = " + str);
		
		//---------True(1)/false(0)
		// bool(1byte) 0/1을 취급 / BOOL(4byte) 0/21323 (0을 쓰거나 4byte가 커버되는 아무 숫자) - C언어에서의 차이가 무엇일까요 자바에는 해당 되지 않지만 포인트를 잘 알아야함
		
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		// b = 1; 숫자는 쓸 수 없더라...
	
		// escape sequence
		// \n == 개행
		// \t == tap 띄어쓰기
		
		System.out.println("hello\t" + "world"); //줄맞춤을 할 때 편하다는 것 콘솔을 보는 것은 output은 아니다. 확인만 하는 것
		// "world" 출력이 이렇게 되려면 
		System.out.println("\"world\"");

		System.out.println("'world'"); // 여기에 해당되지 않기 때문에 그냥 바로 가능하지만 정석대로 한다면 ("\'world\'")
		
		
	}
	
}
