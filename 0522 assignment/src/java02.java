
public class java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};

		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);

		System.out.println(java.util.Arrays.toString(result));
	}

	 static int[] shuffle(int[] original) {

		 
		 for (int i = 0; i < 1000; i++) {
			 int x = (int)(Math.random()*9);
			 int y = (int)(Math.random()*9);
			 
			 int temp;
			 temp = original[x];
			 original[x] = original[y];
			 original[y] = temp;
		 } 
		 return original;
	}

	
	//베이스볼 2번째 방법 
	/*내가 만든 것
	static int[] shuffle (int arr[]) {
	
	int r, w;
	boolean swit[]= new boolean[arr.length];
	
	for (int i = 0; i < swit.length; i++) {
		swit[i] = false;
	}
	
	w=0;
	while(w<arr.length) {
		r =(int)(Math.random()*arr.length);
		if(swit[r] == false) {
			swit[r] = true;
			arr[r] = w;
		w++;
		}
	}
	return arr;
	
	}
	*/
	
	
}
