package scanner;

import java.util.Scanner;

public class String_next_or_nextline_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String(문자열) //어디서나 String은 굉장히 중요함 - 카톡이나 전화번호등등 다 문자열로 나오는 것 어떤 언어든 String으로 /C에서 가장 속썩이는게 String
		Scanner scan = new Scanner(System.in);
		
		String str;
		int i;
		/*
				System.out.print("input str =");
				str = scan.next();
				System.out.println(" str = " + str);
				System.out.print("input i =");
				i = scan.nextInt();
				System.out.println("i =" + i);
		
				
			System.out.println("-------------------------------------------");
			
			*/
			
			System.out.print("input str =");
			str = scan.nextLine();
			System.out.println(" str = " + str);
			System.out.print("input i =");
			i = scan. nextInt();
			System.out.println("i =" + i);
		
	}

}
