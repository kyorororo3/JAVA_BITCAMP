import java.util.Scanner;

public class java08 {

	public static void main(String[] args) {
		//절차지향이 속도가 엄청 빠름 객체지향보다 빠름
		
		String password = "bcd234";
		String result = "" ;
		
		
		result = encode(password);
		
		
		System.out.println("암호화된 문자열은 "+result+" 입니다.");
		
		
		String originalStr = "";
		// result << 암호화 된 문자열
		
		
		char[] abcCode ={
				'`','~','!','@','#','$','%','^','&','*',
				
				'(',')','-','_','+','=','|','[',']','{',

				'}',';',':',',','.','/'};

				// 0 1 2 3 4 5 6 7 8 9

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		
		// 한문자씩 꺼내오기 위해 for문을 돌릴 것 한문자씩 산출
		for (int i = 0; i < result.length(); i++) {
			
			//한문자씩 산출
			char c = result.charAt(i);
			
			//ASCII code로 변환
			int ascCode = (int)c;  //알파벳이냐 아니냐를 찾기 위해 한 것
			
			//알파벳인 경우 숫자
			if(ascCode >= 97 && ascCode<=122) {
			//암호표 대조하면서 몇 번째에 있는지 찾는 것
				
				int index = 0;
				
				for (int j = 0; j < numCode.length; j++) {
					
					if(c == numCode[j]) {
						index = j;
						break;
					}
				}
				//아스키코드로 맞춰주는 부분
				index = index + 48;  // 2 -> 50; "2"
				//원본의 문자를 추가한다
				originalStr =originalStr + (char)index;
				System.out.println(originalStr);
				
			}
			
			//아닌 경우 --> 문자"알파벳"으로 바꿔줘야함
			else {				
				int index = 0;
				for (int j = 0; j < abcCode.length; j++) {
					
					if(c == abcCode[j]) {
						index = j;
						break;
					}
						
				}
				index = index + 97;
				originalStr = originalStr +(char)index;
			}
		}
			System.out.println("복호된 문자열 =" +originalStr +"입니다");
			
	}
			
		
		
		// abcdefghijklmnopqrstuvwxyz
		/* Scanner scan = new Scanner(System.in);
			String password = "abc123";
			String result ="";
			char[] abcCode ={
		'`','~','!','@','#','$','%','^','&','*',
		
		'(',')','-','_','+','=','|','[',']','{',

		'}',';',':',',','.','/'};

		// 0 1 2 3 4 5 6 7 8 9

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		int w, num;
		char cPassword;

		
		char aPassword;
		String strc1, strc2, str3;
		int containNumber;
		int abcNum = 0;
		
		strc1 = new String(abcCode);
		strc2 = new String(numCode);
		String strc3 = strc1+strc2;
		String result2 = ""; 
		
		System.out.print("암호화할 문자열을 입력하시오: ");
			password = scan.next();
		
			//암호화할 문자열이 들어왔을 때, 이 것의 아스키코드를 파악하기 위해 모든 글자 다 체크
		
		w = 0;
		num = 0;
		result = "";
		
		for (int i = 0; i < password.length(); i++) {
			cPassword = password.charAt(i);
			num = (int)(cPassword);
		
			if(97<=num && num<=122) {
				num= num-97;
				result = result + abcCode[num];
		
			}
			else if(48<=num && num<=57) {
				num= num-48;
				result = result + numCode[num];
			}
		}
		
		System.out.println("암호화된 문자열은 "+result+" 입니다.");
		
		
		System.out.print("복구화된 문자열은: ");
		for (int i = 0; i < result.length(); i++) {
			 aPassword = result.charAt(i);
			 containNumber =strc3.indexOf(aPassword);
			 
			 if(0 <= containNumber && containNumber <= 25) {
				 containNumber+= +97;
				 aPassword = (char)containNumber;
				result2 = result2 + aPassword;
			 } 
				 
			 else {
				 	containNumber+= +22;
				 	 aPassword = (char)containNumber;
				 	
				 	result2 = result2 + aPassword;
			 
			 	System.out.println("복호된 문자열 =" + result2 +"입니다");
			 }
			 
				 
			 
			 
		}	
			
		
			*/
		
		

	//암호화
	static String encode(String src) {
		
		char[] abcCode ={
				'`','~','!','@','#','$','%','^','&','*',
				
				'(',')','-','_','+','=','|','[',']','{',

				'}',';',':',',','.','/'};

				// 0 1 2 3 4 5 6 7 8 9

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		
		String result = "";
			for (int i = 0; i < src.length(); i++) {
				char ch = src.charAt(i);
				int num = (int)ch;
			
				if(97<=num && num<=122) {
					num= num-97;
					result = result + abcCode[num];
			
				}
				else if(48<=num && num<=57) {
					num= num-48;
					result = result + numCode[num];
				}
			}
			return result;
	}
}

