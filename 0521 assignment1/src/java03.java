
public class java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int coinUnit[]= {500,100,50,10};
		
		int money = 2680;
		
		System.out.println("money ="+money);
		for (int i = 0; i < coinUnit.length; i++) {
				
			if(coinUnit[i] == 500) {
				System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i]);
				continue;
				
			}
			else {
				System.out.println(coinUnit[i]+"원 : "+money%coinUnit[i-1]/coinUnit[i]);
				
			}
			
			
			System.out.println(coinUnit[0]+"원 ="+ money / coinUnit[0]); 
	
		}
					*/
		
			

			int coinUnit[]= {500,100,50,10};
			
			int money = 2680;
			
			String strMoney[ ] = {"500원:", "100원:","50원:","10원:"};
			System.out.println("money ="+money);
			for (int i = 0; i < coinUnit.length; i++) {
	
					System.out.println(strMoney[i] +money/coinUnit[i]);
					money = money %coinUnit[i];
					
				
		
			}
				

			
	}

}
