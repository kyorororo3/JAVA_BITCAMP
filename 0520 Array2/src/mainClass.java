import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 배열
		 Array : 같은 자료형 변수 묶음
		 관리 : index number 0~n-1
		 
		 자료형 배열변수명[] = new 자료형[배열의 총 숫자];
		 
		 int arr[] = new int[5];
		 int arr[] = { 1, 2, 3, 4, 5};
		 arr[0] = 11;
		 
		 int arr[3][4] = {   //배열변수에 가까이 있을 수록 큰 덩어리
		 	{1, 2, 3, 4},
		 	{5, 6, 7, 8},
		 	{9, 10, 11, 12}
		 };
		 
		 
		 int arr2[][] = new int[3][4];
		 
		 pointer c언어에서 독보적인 존재 
		 자바를 깔볼정도로 존재감있는 존재
		 
		 array ->쉽다
		 pointer ->어렵다
		 array == pointer
		 
		 int *p; == int p[];
		 int **p; == int p[][];
		 접근하는 방식이 동일
		 
		 p[0][1] = 2;
		 *(*(p+0))+1) =2;
		 
		 표기법만 다를 뿐 
		 
		 사실 이 두개는 같은 것
		 
		 */
		//초기화 설정을 하고 접근
		
		int arr2[][] = { //[행][열]  == [3][4]
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }
				
		};
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[1][2]);
			
		//이중 for문으로 돌리면 다 나열할 수 있음
		
		//동적할당을 하여 값을 정하는 것
		int array2[][] = new int[2][3];
		
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[0][2] = 13;
		
		array2[1][0] = 21;
		array2[1][1] = 22;
		array2[1][2] = 23;
		
		System.out.println("array2.length = " + array2.length); //console :2 new int[여기 값이 출력됨][]
		System.out.println("array2.length = " + array2[0].length); //console :3 new int[][여기 값이 출력됨]
		System.out.println("array2.length = " + array2[1].length); //console :3 new int[][여기 값이 출력됨]
		
		
		for (int i = 0; i < array2.length; i++) { 	//2
			for (int j = 0; j < array2[0].length; j++) {	//3
				System.out.print("array["+i+"]["+j+"] =" + array2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		int _arr2[][] = { //[행][열]  == [3][6]
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8, 9 },
				{ 9, 10, 11, 12, 13, 14 } //자주 하지 않지만 가능한 형태
				
		};
		
		
		System.out.println(_arr2.length);
		System.out.println(_arr2[0].length);
		System.out.println(_arr2[1].length);
		System.out.println(_arr2[2].length);
		//문법 상 하자는 없습니다.
		
		
		
		
		
		//국어, 영어, 수학의 점수를 입력을 받는다 --> 출력(학생5명)
		
		//1. 국어, 영어,수학 점수 입력
		/*
		Scanner scan = new Scanner(System.in);
		
		int array[][] = new int[5][3];
		
		for (int i = 0; i < array.length; i++) {
		int j = 0;		
				System.out.print("국어 점수를 입력하시오 :"); 
				array[i][j] = scan.nextInt();
				
				System.out.print("영어 점수를 입력하시오 :");
				array[i][j++] = scan.nextInt();
				
				System.out.print("수학 점수를 입력하시오 :");
				array[i][j++] = scan.nextInt();
				// System.out.print("array["+i+"]["+j+"] =" + array2[i][j] + " ");
				System.out.println();
			
		}
		
		//2.다섯명의 학생 점수 출력
		

		*/
		
		//답안
		Scanner sc = new Scanner(System.in);
		
		int arrNum[][] = new int[5][3];
		String title[] = {" 국어"," 수학"," 영어"};
		
		//입력
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println((i+1)+"번째 학생의" );
			
			for (int j = 0; j < arrNum[0].length; j++) {
				System.out.print(title[j] + ":");
				arrNum[i][j] = sc.nextInt();
				
			}
		}
		
		//출력
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print((i+1)+"번째 학생의" );
			
			for (int j = 0; j < arrNum[0].length; j++) {
				System.out.print(title[j] + ":"+arrNum[i][j]+" ");
				
			}
			System.out.println( );
		}
		
		
		
		
		
		
		
		
		
	}

}
