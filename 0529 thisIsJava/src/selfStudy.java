
public class selfStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[4-2]
		
		
		int sum = 0;
		
		for (int i = 1; i <= 20 ; i++) {
			//if(i % 2 != 0 && i % 3 != 0) {
				sum = sum + i;
			//}
		
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1 ; i<200 ; i++) {
			if(i % 2 == 0) {
				sum = sum -i ;
			}
			else {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
			
		}
		
		for(int x = 0 ; x <= 10 ; x++) {
			for(int y = 0; y <= 10 ; y++) {
				if((2*x) + (4*y) == 10) {
					System.out.println("x = " + x + "y = " + y);
				}
			}
		}
	}
	

}
