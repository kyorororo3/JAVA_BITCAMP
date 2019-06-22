
public class java01 {

	public static void main(String[] args) {
		// 다음의 모양이 출력 되도록 작성하시오
		//*****
		//*****
	
		
		
		/*내 생각을 적어본다
		 *****개가 들어가는 건 String으로 표현을 해야할 것 같고
		 반복된게 9개가 나오니까 루프문으로 해줘야할 것 같다
		for+if문으로 해보면 될 것 같긴 한데 안나온다"ㅁ" 
		-->이게 아니라
		Array로 다해도 될 것 같다
		 */
/*   첫번 째 내가 했던 방식
		String sArray[] = new String[10];
		sArray[0] = ("*****");
		sArray[1] = ("*****");
		sArray[2] = ("*****");
		sArray[3] = ("*****");
		sArray[4] = ("*****");
		sArray[5] = ("*****");
		sArray[6] = ("*****");
		sArray[7] = ("*****");
		sArray[8] = ("*****");
		sArray[9] = ("*****");
		
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		System.out.println(sArray[3]);
		System.out.println(sArray[4]);
		System.out.println(sArray[5]);
		System.out.println(sArray[6]);
		System.out.println(sArray[7]);
		System.out.println(sArray[8]);
		System.out.println(sArray[9]);
		
		
	*/ 
		/*두번째 내가 한 방식
		
		for(int i = 0; i<9 ; i++) {
				System.out.print("\n");
			for(int j = 0; j<5; j++) {
				System.out.print("*");
			}
		}
	
	이건 좀 성공한 듯*/
		
		/*
		 5x9
		 column row
		 열		행
		 9		5
		 
		 *****
		 *****
		 *****
		 *****
		 *****
		 *****
		 *****
		 *****
		 *****

		 */
		for(int j = 0; j <9; j++) {
			
		
			for(int i = 0; i <5; i++) {
				System.out.print("*"); //가로축
			}	
			System.out.println();
		}
		//개행하는 방법은 여러가지 
		
		
		
		
		
		
	}

}
