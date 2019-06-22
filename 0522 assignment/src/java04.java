
public class java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mNumber;
		int array[] = {-1,-2,-4,-9};
		
		
		mNumber=max(array);
		
		System.out.println("array[]에서 가장 큰 수:"+ mNumber);
		
		
		/*int i = 0; 
		 (0xffffffff) ( 0 );
		 	주소		   value 
		 null일때는 주소가 아예 설정이 안되어 있는 것 
		 (0x00000000) ( 0 );
		 
		 int arr [] = (0); >> null 실제로 하면 에러 근데 이렇게 얘기하기도 한다고 그 말
		 
		 arr[] = { 1,2,3};
		 static    heap
		 주소값에 대한 value
		 
		 
		 */
	}
	static int max(int arr[]) {
		if(arr == null || arr.length ==0) {
			return - 999999;	
			}
		int m = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(m < arr[i]) {
				m = arr[i];
			
				//if(m > arr[i]) { //최소값 
				//m = arr[i];
				
			}
		}
		return m;
	}
	
	
	/* 내가 한 것
	static int max(int arr[]) {
		int n = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp;
			
				if(arr[i]<arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						n = arr[0];
								
					if(arr[0] ==0 || arr == null) {
						n = -999999;
					}
				}
			}
		}
	return n;
	}*/
	
}
