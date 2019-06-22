package cast;

public class mainClass {

	public static void main(String[] args) {
		/*
		  우선순위 
		  | 둘이 붙었을 때 누가 효용할 수 있는가
		  그릇이 제일 작은것 
		  boolean
		  
		  byte 			1
		  short char 	2
		  int			4
		  long			8
		  
		  float			4
		  double		8
		 그릇이 제일 큰 것
		우선순위가 왜 필요할까요?
		자료형을 변환하는 작업이 필요하는데
		자동 자료형 변환, 강제 자료형(cast)변환
		
		 */
		
		short sh = 1;
		int i;
		i = sh;
		System.out.println("i = " + i);
		// 2byte를 4byte에 넣는 것이기 때문에 대입할 때 문제가 전혀 생기지 않음 == 자동 자료형 변환

		i = 25;
		sh = (short)i; // cast 변환 //c언어의 경우는 받아들여줌 하지만 자바는 규격화 되어있어서 바로 에러뜸
		System.out.println("sh = " + sh);
		
		//주의점 :숫자의 범위를 넘어서는 안된다. 그 경우 변환은 안됨
		
		long l = 12049356367320L;
		float f;
		f =l; // 자동형 변환으로 아무 문제 없이 나옴
		
		System.out.println("f = " + f);
		
		double d;
		d = l;
		System.out.println("d = " + d);
		
		f = (float)d;
		System.out.println("f = " + f); //변수를 계속 해서 변환해서 쓰면 오히려 더 혼란이 오기 때문에 실제로 쓰긴 좋지 않다
		
		double r;
		r = (int)(Math.random()*10);
		//r =(int)(Math.random())*10;  console == 0 
		//랜덤값은 시간에서 가져온다
		System.out.println("r = " + r);
		//대부분이 다 소수점까지는 잘 안씀 정수만 사용하려고 함
		
		//0.123E2 or 0.123e2 --> 0.123 x 10의 2승 == 12.3
		// E는 10
		//승의 수는 양수일 필요가 없다. 음수여도 되는 것 -2
		double dnum = 0.123e-2;
		System.out.println("dnum = " + dnum);
		
		int n1 = 3;
		int n2 = 2;
		
		float f1;
		
		f1 = (float)n1 / n2;
		System.out.println("f1 = " + f1);
		
		int n3 = 3;
		int n4 = 2;
		
		float f2;
		
		f2 = n3 / n4; //여기서 이미 int로 계산한 것 int로 했다는 것은 int가 정수만을 받기에 (1.5)에서 5가 없어진 것 그래서 1만 남음
		System.out.println("f2 = " + f2);
		
		
		
		
		
		
		
	}

}
