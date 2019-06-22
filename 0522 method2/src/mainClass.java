
public class mainClass {

	public static void main(String[] args) {
		
		
		
		/*
		  function == method
		     매개변수 :1.일반자료형(value의 의한 할당)
		     	  2.배열(address의 의한 할당)
		  
		 */
		
		int n = 23;
		function1('C', n);
		
		System.out.println("n = " + n );
		
		int array[] = {1,2,3};
		function2(array); //괄호로 넘겨주는게 아니다 
		
		int arr2[];
		arr2 = function3();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] = "+ arr2[i] );	
		}	
		
		int num = 11;
		int numArr[] = new int[1];
		numArr[0] =11;
		
		System.out.println("함수 전: num =" + num + " numArr[0] =" + numArr[0]); 
						// 수가 넘어가는게 아니라 numArr로 가는 것 주소 즉 어디에 있는지가 그대로 들어가는 것 
		function4(num,numArr); //주소값이라면 원래의 값이 변경이 된다
		System.out.println("함수 후: num =" + num + " numArr[0] =" + numArr[0]); 
		
		
		int ar[] = {1,2};
		int alias[] = ar;
		alias[0] = 10;
		//ar[0] -> 10 
		
		int myArray[] = {10, 20, 30, 40, 50};
		//10으로 나눈 값이 필요함
		//div10 ->1,2,3,4,5
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("함수 전: myArray["+i+"] = "+ myArray[i]);
		}
	/*
		div10(myArray); //주소값이라면 원래의 값이 변경이 된다
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("함수 후: myArray["+i+"] = "+ myArray[i]);
		}
		*/
		myArray=div11(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("함수 후: myArray["+i+"] = "+ myArray[i]);
		}
	}

	
	static void function1(char c, int i) {
		System.out.println(" c = " + c + " i = "+ i); //main에서 가져온 값을 확인 할 수 있음
		i = 45; // 여기서 45로 바꿨다 해도 main의 n은 23이 대입받은 상태로 남아 있음
	}
	static void function2(int arr[]) { //매개변수의 []안은 비워둬야 한다 c언어의 경우 []대신 *이게 들어감
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i +"] = "+ arr[i]);
		}
		
	}
	static int[] function3() {
		int arr[] = {10,20,30}; //주소만 나간다 
		return arr;
	}
	static void function4(int num, int arr[]) {
						//들어가는 값  들어갔다 나오는 값  array는 스스로 return을 하는 격. 그래서 원래 return이 나올 수 있는 갯수는 아예 없거나 1개지만 배열을 쓰면 그게 더해질 수 있다는 것.
		num = 22;
		arr[0] =22;
		System.out.println("함수 안: num= "+num + " arr[0] = "+arr[0]);
	}
	static void div10(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]= arr[i]/10;
		}
		
	}
	static int[] div11(int arr[]) { //return으로 나오는 값을 받을 때 하는 방법
		for (int i = 0; i < arr.length; i++) {
			arr[i]= arr[i]/10;
		}
		return arr;
	}
}
