
public class java03 {

	public static void main(String[] args) {
		// 배열에 값에 *2 연산되어 값이 산출되도록 메소드 작성
		int num1[] = {1, 2, 3, 4, 5};
		
		getDouble(num1);
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1["+i+"] =" + num1[i]);
		}


	}
	
	static void getDouble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*2;
		}
	}
}
