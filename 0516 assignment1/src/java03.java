
public class java03 {

	public static void main(String[] args) {
		//1~1000 사이에 수를 전부 합친 값을 출력하다.
		//1부터 1000사이 수의 합은:
	
		int num = 0;
	for(int i = 0; i <=1000; i++) {
		num = num + i;
	
	}
		System.out.println("1부터 1000사이 수의 합은:" + num);
		
	
	
	
	int sum = 0;
	for (int i = 0; i <= 1000; i++) {
		sum = sum + i;
	}
	System.out.println("1부터 1000사이 수의 합은:" + sum);
	
	
	
	//이쪽을 더 선호하는 경우가 있음 loop문을 따로 손대지 않아도 되는 것 
	sum = 0;
	int count = 0;
	for (int i = 0; i < 1000; i++) {
		count += 1;
		sum = sum + count;
		
		System.out.println("1부터 1000사이 수의 합은:" + sum);
						
	}
	
	
	
	
	}

}
