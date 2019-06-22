
public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 Wrapper class
		 : 일반 자료형(char, int, double)을 클래스화 한 것 
		  
		 일반자료형					wrapper class
		 boolean				Boolean
		 ----------------------------------
		 byte					Byte
		 short					Short
		 int					Integer ***
		 long					Long
		 ----------------------------------
		 float					Float
		 double					Double ***
		 ----------------------------------
		 char					Character
		 char[]					String ***
		 
		 3가지는 무조건 기억 할 것
		 나머지는 사용할 일이 그다지 없음
		 
		 String
		 숫자 ==> 문자열
		 String.valueOf('1') -> "1"
		 String.valueOf(12) -> "12"
		 String.valueOf(12.345) ->"12.345"
		 
		 12+"";
		 12.345+"";
		 >> 이렇게 간단하게 string으로 바뀜
		 
		 
		 
		 
		 
		 */
		
		
		// Integer == int
		int i = 12;
		Integer iobj = 34;   //	Integer iobj = "34"; 문자열을 놓았기 때문에 에러가 남
		
		Integer _iobj = new Integer(i);
		System.out.println(_iobj);
		int num = iobj.intValue();
		int _num = iobj;
		
		System.out.println("_num = " + _num);
		System.out.println("num = " + num);
		
		//차이점이 나오는 곳
		
		//이 작업이 왜 필요한가요? 카카오톡 네트워크 전부다 숫자로 전송하지 않고 문자로 전송. 이 방법이 더 안전하다 문자열로 바꿔서 보내고 받은 후 숫자로 표현하는 경우가 더 많다. 변형 되는 값을 아는게 중요하다
		
		//숫자 -> 문자열 toString();  >>숫자의 wrapper class는 모두 이 함수를 가지고 있다.
		String nstr = iobj.toString(); //이때부터는 숫자가 아니게 되는 것 34 -> "34"
		nstr = iobj +" "; //operator 하나만으로 숫자를 문자열로 바꿀 수 있다. 자바가 짱짱맨
		
		
		
		//문자열 -> 숫자**  사용빈도 높음
		String numStr = "234";
		int number = Integer.parseInt(numStr); // 숫자로 변환 완료 이 부분은 외워야한다. 활용도 굉장히 높아요
		System.out.println(number + 11);
		
		//실수의 값으로 볼 때
		
		Double d = 234.5678;
		Double d1 = new Double(345.6789);
		double dd = d; //일반자료형과 wrapper class 값 교환이 원활하다
		
		//자료형과 클래스의 차이는 toString()의 함수를 갖고 있다.
		//실수 -> 문자열
		String sd = d.toString();
		
		sd = d+" ";
		
		//문자열 ->실수
		String dStrnum = "56.78";
		double d2 = Double.parseDouble(dStrnum);
		System.out.println("d2+11 = " + (d2+11));
		
		
		
		
		
	}

}
