package operator2;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자 == true/false
		/*
		  && : AND 그리고
		  || : OR 또는
		  !  : NOT 
		  
		  >>>>> 세가지 만으로는 조금 부족하다 / if 제어문과 같이 사용하는 편임
		  a = b (대입연산)
		  a > b (대조비교)
		  a < b (대조비교)
		  a >= b (등호는 항상 뒤에 온다)
		  a <= b 
		  a == b (==를 써주는 이유는 대입연산이 되지 않도록 하기 위해)
		  
		 */
		
		int number = 5;
		
		System.out.println(number == 5); // console 돌리면 true가 나옴 
		System.out.println(number > 5); // console 돌리면 false가 나옴 
		//System.out.println(number !> 5); // C언어에서는 가능하고 자바에서는 안됨 only 등위 
		
		System.out.println(number >= 5); // console 돌리면 true가 나옴
		System.out.println(number <= 5); // console 돌리면 true가 나옴
		
		System.out.println(number > 0 && number < 10); // console 돌리면 true가 나옴 
		System.out.println(number < 0 && number < 10); // console 돌리면 false가 나옴 
		
		System.out.println(number < 0 || number < 10); // console 돌리면 true가 나옴 
		System.out.println(number != 6); // console 돌리면 true가 나옴 
		System.out.println(!(number < 0 && number > 10)); // console 돌리면 true가 나옴 
		// System.out.println((number >= 0 || number <= 10));
		
	}

}
