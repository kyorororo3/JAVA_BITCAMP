import java.util.Scanner;

public class Restore {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String password;
		String result;
		// abcdefghijklmnopqrstuvwxyz
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
				 System.out.print(aPassword);
			 } 
				 
			 else if(26<=containNumber && containNumber <=35) {
				 	containNumber+= +22;
				 	 aPassword = (char)containNumber;
				 	System.out.print(aPassword);
				 	
			 
			 
			 }
			 
				 
			 
			 
		}	
			
		
		
		}

}

