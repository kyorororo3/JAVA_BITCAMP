
public class java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num;
			num = 1;
		for(int i = 0; i<101 ;i=i+2) {
			num = i;
			System.out.println("1부터 100사이 짝수의 합은:" + num);
			
		}
		
		for(int i = 0; i<101 ;i++) {
			num = i;
			System.out.println("1부터 100사이 짝수의 합은:" + num);
		
	}

		*/

		int sum1, sum2; //sum1홀수의 합 sum2짝수의 합
		//초기화
		sum1 = 0;
		sum2 = 0;
		int num = 0;

		// sum1 = sum2 = 0; 0이 왼쪽으로 대입 대입 핑퐁핑퐁
		//처리
		for (int i = 0; i <100; i++) {
			num++;
			if(num%2 == 1) {  //홀수
				sum1 = sum1 + num ;
			}
			else{			  //짝수
					sum2 = sum2 + num;
			
			}
		
		
		}
		
		//출력
		System.out.println("홀수의 합" + sum1);
		System.out.println("짝수의 합" + sum2);
		
		
		
		
		
		
	}
}
