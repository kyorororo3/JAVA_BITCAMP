
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			/*
			 Over Load : function의 명칭은 같고
			 			 매개변수(인수, 인자, parameter)의 자료형이나
			 			 갯수가 다른 함수
			 		
			 image draw -> RGB, RGBA(알파는 투명)
			 			배경을 draw		paint(String imageName)
			 			달, 해의 이미지		paint(String imageName, int x, int y)
			 
			 
			 */
		
		
		method();  //일반 호출
		
		method('A');
		//구분자는 매개변수
		
		method(12);
		
		method('B', 12);
		
		method(12, 'B');
		
		
		int sum = displaySum(1,2,3,4,5);
		System.out.println("sum =" + sum);
		
		
		sum = displaySum(4,5,7);
		System.out.println("sum =" + sum);
		
		
		disp("hello", 2,1,4,6);
		
	}

	
	
	static void method() {
		System.out.println("method() 호출");
	}
	
	
	static void method(char c) {
		System.out.println("method(char c) 호출");
	}
	
	static void method(int i) {
		System.out.println("method(int i) 호출");
			
	}
	
	static void method(char c, int i) { //getter: 겟타 라고도 부름
		System.out.println("method(char c, int i) 호출");
		
	}

	static void method(int i, char c) {  //컴파일러는 순번대로 보기 때문에 같은걸 뒤집기만 하더라도 다른걸로 본다
		System.out.println("method(int i, char c) 호출");
		
	}
							// 가인수가 다른 것은 사용 못함
	//static void method(int i1, char c1) {  //컴파일러는 순번대로 보기 때문에 같은걸 뒤집기만 하더라도 다른걸로 본다
	//	System.out.println("method(int i, char c) 호출");
		
	//}
	
	
	//static int method() { //오버로드는 매개변수로 분간하기 때문에 이건 안됨. 리턴값의 경우 함수의 모든것이 끝난 후 나오는 존재 이기 때문에 분간을 위한 존재로 활동을 못함
	//	return 1;  함수 값의 출구에 불구하기 때문에 매개변수와는 별개로 봐야함
	//}
	
	//가변인수 = 변화가 가능한 인수 (배포용으로 더 많이 사용) 
	static int displaySum(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}
	
	//일반 인수 + 가변 인수 섞어 쓴 버전
	static int disp(String str, int...num) {  //가변인수를 앞에 둘 수 없다. 인수들을 나열하고 마지막에 적어야 함 //가변인수는 두개를 할 수 없다. // 몇개인지 모를 때 당연히 배열을 많이 쓰긴하지
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		System.out.println("str = " + str);
		System.out.println("sum = " + sum);
	return sum;}
}
