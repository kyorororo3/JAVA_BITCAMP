
public class card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 JQK *4 == 52장
		// 52을 셔플
		// 0~51까지 섞임
		
		
		//스페이드, 		다이아, 하트, 클로버
		//0~12 스페이드	 13~25	
		
		/*
		 랜덤 넘버 / 카드 숫자 / 무늬 출력
	ex)	 13	   	   1		다이아
		 51		  13		클로버
		  셔플
		  
		  순서대로 정렬
		 */
		
		
		//선언부
		int ranNum;
		int cNum;
		boolean noProb[] = new boolean[52];
		int rNumber[] = new int[52];
		
		//초기화
		String cName[] = {"스페이드","다이아","하트","클로버"};
		int cNumber[][] = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13}
		};
		
		for (int i = 0; i < noProb.length; i++) {
			noProb[i] = false;
		}
				
		//random number 생성 / shuffle process
		int w;
		w = 0;
			while(w<rNumber.length) {
					ranNum = (int)(Math.random()*rNumber.length);
					if(noProb[ranNum]==false) {
						noProb[ranNum] = true;
						rNumber[w]=ranNum;
						w++;	
					}				
				
				}
		//	for (int i = 0; i < rNumber.length; i++) {
		//		System.out.println("rNumber["+i+"] =" +rNumber[i]);				
		//	}
			
		//sorting
		int temp;
		//finding
		for (int i = 0; i < rNumber.length-1; i++) {
			for (int j = i+1; j < rNumber.length; j++) {
				
				if(rNumber[i] < rNumber[j]) {
				temp = rNumber[i];
				rNumber[i] = rNumber[j];
				rNumber[j] = temp;
				
				}	
			
					
				
				
				
			}
			
		}
		for (int i = 0; i < cNumber.length; i++) {
			
		
			
		//printing
		
			
		}	
		
		for (int i = 0; i < rNumber.length; i++) {
			System.out.println("rNumber["+i+"] = " + rNumber[i]);
		}
		
		
	
		
		
	}

}
