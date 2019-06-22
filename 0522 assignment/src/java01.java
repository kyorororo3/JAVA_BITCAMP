import java.math.MathContext;

public class java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//두 점간의 거리
		System.out.println(getDistance(1,1,2,2));
	}
	static double getDistance(int x, int y, int x1, int y1) {
	
		/*
		 내가 한 것
		double d;
		d =Math.sqrt(Math.pow(y1-y,2)+Math.pow(x1-x,2));
		
		
		//루트( (y1 - y)2승 + (x1 - x)2승 )
		sqrt : root  >> 용량이 무거운 편 2분의 1승 root ==0.5승
		회사에서는 sqrt라는 함수를 만들어 씀
		
		pow : power(제곱근)
		
		
		
		return d;
		*/
		
		double value;
		
		value = Math.pow(y1 - y , 2)+Math.pow(x1 - x, 2);
		value = Math.pow(value,0.5);
		// == value = Math.sqrt( value );		>> sqrt가 무겁기 때문에 이 방법으로도 사용 가능
		return value;
		}
}
