

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 break == escape(탈출용) == return
		 
		 break만 가지고는 사용을 할 수 없음(but return은 가능하다)
		 
		 탈출하는 것이 무엇인가요?
		 탈출제어문 : 1.loop문을 탈출할 때 for, while, do while
		 
		 형식: 
		 for( ; ; ){
		 	if(조건){
		 		break;
		 	}
		 조건이 참인데 루프되지 않고 빠져나오게끔해준다
		 }
		 for문안에 if있는게 제일 많이 쓴대
		 
		 
		 
		 
		 */
		
		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("num = 1");
				break;
				// return;
			case 2:
				System.out.println("num = 2");
				break;
				
		}
		
		
		for(int i = 0 ; i<10 ; i++) {
			
		
			System.out.println("for i:" + i);
		
			if(i == 5) {
				break;
			}
		}
		
		char cArray[] = { 'a', 'b', 'c'};
		
		for(int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
			if(cArray[i] == 'b') {
				System.out.println("탈출!");
				break;
				
			}
		}
		
		
		int iArray[] = {1, 2, 3, -1, 7};
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.println("iArray["+ i +"]" + iArray[i]);
			if(iArray[i] < 0) {
				System.out.println("탈출!");
				break;
				
			}
			
		}
		
		
		// 2중 for
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i =" + i );
			for (int j = 0; j < 10; j++) {
				System.out.println("\t j ="+ j);
				if(i == 5 && j == 3) {  //loop문 하나당 break 하나 그래서 하나만 탈출하게 되는 것
					break;
					
				}	
			}
		}
		System.out.println();
	
		
		boolean b = false;
		for (int i = 0; i < 10; i++) {			
			System.out.println("i = " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("\t j = " + j);
				if(i == 5 && j == 3) {
					b = true;
				}		
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		}
		
		
		/*내꺼
		    
	
		boolean b = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("i =" +i);
			for (int j = 0; j < 10; j++) {
				System.out.println("i =" +j);
				if(i==5 && j==3) {
					b=true;
			}
				if(b=true) {
					break;
			}
		}
				if(b=true) {
					break;
		}
		}	
			
				/*
				
				out:for (int i = 0; i < 10; i++) {
					
					System.out.println("i =" + i );
					for (int j = 0; j < 10; j++) {
						System.out.println("\t j ="+ j);
						if(i == 5 && j == 4) {  //loop문 하나당 break 하나 그래서 하나만 탈출하게 되는 것
							break out;
						}
					}
				}				
			
			*/
				
				
				
				
				
				
				
				
				
				
	}

 }
