package operator;

public class mainClass {

	public static void main(String[] args) {
		/* operator (기본연산자) = + - * / %
		   operator (고급연산자) bit 연산 : & | ^ << >> ~ (기술면접을 볼 때 자주 나옴)
		   operator (논리연산자) &&(AND) ||(OR) !(NOT)
		*/
		
		
		int num1, num2;
		int result;
		
		num1 = 7;
		num2 = 2;
		
		result = num1 + num2;
		
		// num1 + num2 = result; 이 경우 에러가 남. 오른편에서 계산한 후 왼쪽에 대입
		
		System.out.println(num1+ "+" +num2 + "=" + result);
		
	result = num1 - num2;
		
		System.out.println(num1+ "-" +num2 + "=" + result);
    
	result = num1 * num2;
		
		System.out.println(num1+ "*" +num2 + "=" + result);
	
    result = num1 / num2;
		
		System.out.println(num1+ "/" +num2 + "=" + result);
	
		//a % b -> a를 b로 나눈 나머지 나오게 됨
		
	result = num1 % num2;
			
		System.out.println(num1+ "%" +num2 + "=" + result);
		// %가 왜 필요할까요? 꽤나 쓰이기 때문에 활용도가 괘 높음
		
		//제일 많이 쓰이는 연산 - *를 제일 많이 씀 그러나 %도 꽤나 씀
		// 예상 프로그램을 작성할 때 %를 자주 씀 
		
		//Random == 무작위
		int r; // 오른쪽에서 무작위로 나온 것들이 r로 나온다는 것
		r = (int)(Math.random() *10); //0-9
		System.out.println("r = " + r);
		
		int inputNumber = 27 % 5 +1; //1 ~ 5
		System.out.println("inputNumber = " + inputNumber);
		
		// 1~10 
		r = (int)(Math.random() *10)+1; //1-9
		System.out.println("r = " + r);
		
		// 10 20 30 40 50
		r = ((int)(Math.random()*5) + 1) * 10;
			//( 0 1 2 3 4 + 1 ) * 10
		System.out.println("r = " + r);

		// -1 0 1
		int x = (int)(Math.random() * 3) - 1;
		System.out.println("x =" + x);
		int y = (int)(Math.random() * 3) - 1; 
		System.out.println("y =" + y);

		
		//주의할 점 1 
		r = 0 / 3;
		System.out.println("r = " + r);
		/*
		r = 3 / 0;
		System.out.println("r = " + r);
	
		
		r = 3 % 0;
		System.out.println("r = " + r);
		
		*/

		
		//****** 퍼센트/나누기 할 때 분모는 0이 되선 안된다 컴퓨터 상에서 연산이 되지 않는다. 제어문을 알 때 0이 붙었을 경우, 안된다라고 해야함
		
		// 주의할 점 2 (자기 자신을 갱신)
		
		int n;
		n = 0;
		n = n + 1;
		System.out.println("n= " + n); // 이코드를 더 많이 씀
		
		n = n - 1;
		System.out.println("n= " + n);
		
		n += 1;
		System.out.println("n = " + n); 
		
		// increment(증가연산자) ++ == +1, decrement(감소연산자) -- == -1
		
		int num3 = 0;
		num3++;
		System.out.println("num3 = " + num3); //여기에 이미 1이 있음
		
		++num3;
		System.out.println("num3 = " +  num3); //이미 있는 1에 또 1일 더해서 2임
		
		num3--;
		System.out.println("num3 = " + num3); // 이미 있는 2에 -1 을 해서 1이 됨
		
		int num4;
		//num4 = num3++; (+를 하기 전에 대입) num3 = 2 num4 = 1
		//num4 = ++num3; (+를 하고 대입) num3 = 2 num4 = 2
		/*num4= (num3++); // num4 = 1 예상 밖. 이 경우 플러스가 우선순위에서 밀리는 것 
		System.out.println("num3 = " + num3);*/
		num4= ++num3;
		System.out.println("num4 = " + num4);
			
		//섞어 놓을 때 우선순위를 잘 봐야 한다. 
		

	}

}
