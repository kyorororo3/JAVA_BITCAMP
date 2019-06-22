
public class java04 {

	public static void main(String[] args) {
		
		//a b c d e f g h i j k l m n o p q r s t u v w x y z
		//` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /
		char[] abcCode = 
			{	'`','~','!','@','#','$','%','^','&','*',

				'(',')','-','_','+','=','|','[',']','{',
				
				'}',';',':',',','.','/'};

		
		// 0 1 2 3 4 5 6 7 8 9
		// q w e r t y u i o p
		
		char[] numCode = {'q', 'w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			int num = ch;
		

			//알파벳일 경우 -> 숫자 123
			if (97<= num && num<=122) {
				num = num-97;		//'a' == 0으로 셋팅하기 위해서
				result = result + abcCode[num];
				
			}
			//알파벳이 아닐 경우 -> 문자 abc
			else {
				num = num-48;
				result = result +numCode[num]; 	//'0' == 0으로 셋팅하기 위해서
			}
		
		}
		
			
			
			/*
			  
			 
			 */
			

		
		System.out.println("src " +src);
		System.out.println("result " +result);
		
			//암호화를 복구화 시키는 방법을 도전해보기 복구화가 시간이 더 많이 걸린다
		
		
	}

}
