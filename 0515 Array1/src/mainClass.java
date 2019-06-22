
public class mainClass {

	public static void main(String[] args) {
		/*
		  Array (배열): 같은 자료형 변수의 묶음
		  
		  Matrix(행렬)
		  
		  int num1, ... num10 (기하급수적으로 증가하는 변수)
		  
		  자료형 배열변수[] = new 자료형[배열갯수]; -동적할당 //new도 예약어라서 변수명으로 나올 수 없다.
		 == 자료형 []배열변수 = new 자료형[배열갯수]; -동적할당
		 == 자료형[] 배열변수 = new 자료형[배열갯수]; -동적할당 
		  배열변수[0] = 자료형 데이터 
		  배열변수[1] = 자료형 데이터
		  		:
		 배열변수[배열갯수-1] = 자료형 데이터  -정적할당
		 인덱스로 구별해준다
		 
		 배열변수[index번호]
		 ---- 변수의 확장판
		 */
		
		//int Array[] = new int[10]; //[0]~[9]까지
		//int []Array = new int[10]; //[0]~[9]까지
		int[] Array = new int[10]; //[0]~[9]까지
		//C언어의 포인터를 이렇게 쓰는 것 뒤에 masterlist를 붙여서 쓴다
		//변수를 10개 선언한 격
		
		Array[0] =10;
		Array[1] =11;
		Array[2] =Array[1]; //도 가능
		Array[3] =13;
		Array[4] =14;
		Array[5] =15;
		Array[6] =16;
		Array[7] =17;
		Array[8] =18;
		Array[8] =19;
		Array[9] =20;
		
			
		System.out.println("Array[1] =" + Array[0]);
		System.out.println("Array[9] =" + Array[9]);
		
		char cArray[]; //배열변수
		cArray = new char[5]; //할당을 하는 부분이 뒤에 나오는 것
		
		cArray[0] = '안';
		cArray[1] = '녕';
		cArray[2] = '하';
		cArray[3] = '세';
		cArray[4] = '요'; 
		//cArray[5] ='.'; error 가 아닌 exception이 나온다. 바운더리를 넘었기 때문에
		
		int var =1; //메모리로 들어감 initialize(초기화) 줄임말 = init
		String sArray[] = {"hello","hi","good"}; //초기화 가능사실 동적할당이 자동적으로 들어가있는 상황 세글자 3이 갯수
		
		System.out.println("sArray[2] = " + sArray[2]);
		 /*String sArr[];
		 sArr = {"hello","hi","good"}; 초기화는 선언문을 벗어나지 못한다.
		
		활용도가 높은 정도가 아니라 이거 없인 못살아 모드 index번호활용도가 넓음
		/**/
		
		//Array Length(길이)
		System.out.println("배열길이 : " + sArray.length);
		System.out.println("배열길이 : " + Array.length);
		System.out.println("배열길이 : " + cArray.length);
		
		//길이값은 모두가 가지고 있다 
		// 배열은 복제가 가능 --> 배열을 복사 할 수 있다. 
		//포인터적 개념이 강함
		
		String aliasArray[] = sArray; //alia 별명
		System.out.println("aliasArray[0]: " + aliasArray[0]);
		
		aliasArray[1] = "안녕";
		System.out.println("sArray[1]: " + sArray[1]);
		
		//값을 집어넣으니까 원근데이터에 영향을 끼침; (이것을 바로 포인터라고 함) 데이터가 있는 것 중에서 원하는 주소를 끄집어 내는 것 같은거
		
		//배열복제 ex
		
		int number1[] = { 11, 12, 13};
		int number2[] = { 21, 22, 23};
		
		int num1[] =number1;
		int num2[] =number2;
		
		System.out.println("num1 =" +num1[0]+ " "+ num1[1] + " " +num1[2]);
		System.out.println("num2 =" +num2[0]+ " "+ num2[1] + " " +num2[2]);
		
		int temp[];
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 =" +num1[0]+ " "+ num1[1] + " " +num1[2]);
		System.out.println("num2 =" +num2[0]+ " "+ num2[1] + " " +num2[2]);
		
		/*
		int temp;
		temp = number1[0];
		number1[0] = number2[0];
		number2[0] = temp;
		
		*/
		
		
	}

}
