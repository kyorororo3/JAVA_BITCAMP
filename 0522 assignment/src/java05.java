
public class java05 {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};

		System.out.println(java.util.Arrays.toString(data));

		System.out.println("최대값:"+max(data));
		

	}

	static int max(int arr[]) {
		int n, temp;
		n = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					n = arr[0];
				}
			}
		}
		return n;	} 
}
