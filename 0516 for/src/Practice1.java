
public class Practice1 {

	public static void main(String[] args) {
		
		
	out:for (int i = 0; i < 10; i++) {
			
			System.out.println("i =" + i );
			for (int j = 0; j < 10; j++) {
				System.out.println("\t j ="+ j);
				if(i == 5 && j == 3) {  //loop문 하나당 break 하나 그래서 하나만 탈출하게 되는 것
					break out;
					
				}	
			}
		}
	
	
	out:for (int i = 0; i < 10; i++) {
		
		System.out.println("i =" + i );
		for (int j = 0; j < 10; j++) {
			System.out.println("\t j ="+ j);
			if(i == 5 && j == 4) {  //loop문 하나당 break 하나 그래서 하나만 탈출하게 되는 것
				break out;
			}
		}
	}				
	
	
	}

}
