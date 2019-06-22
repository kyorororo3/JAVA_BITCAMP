import java.util.StringTokenizer;

public class mainClass {

	public static void main(String[] args) {
	
		// String str = "홍길동-2001/03/14-서울시";
		String str = "홍길동--2001/03/14-서울시";
		String split[] = str.split("-");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println("split[" + i + "] = " + split[i]); //method
		}
		
		
		StringTokenizer st = new StringTokenizer(str, "-"); //class
		
		int len = st.countTokens(); // 자르고 넘긴 문자열의 길이, 배열이 몇개인가 
		System.out.println("len = " + len);
		
		String s = st.nextToken(); //return 값
		// 0번지의 문자열이 들어감
		System.out.println(s);
		
		//1번지
		s = st.nextToken();
		System.out.println(s);
		
		//2번지
		s = st.nextToken();
		System.out.println(s);
		
		/*
		//차이점
		//tokenizer는 아무것도 없는 부분을 취급하지 않는다.
		split : 빈문자열도 문자로 취급
		StringTokenizer : 빈문자열은 무시한다. 
		nullcode exception을 막아주기 위해서  나타난 클래스
		
		 콘솔 결과
			 
	    split[0] = 홍길동
		split[1] = 
		split[2] = 2001/03/14
		split[3] = 서울시
		len = 3
		홍길동
		2001/03/14
		서울시

		 */
	}

}
