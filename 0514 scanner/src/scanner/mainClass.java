package scanner;

import java.util.Scanner; //library 같은 존재 자바 유틸리티의 스캐너를 갖다 써라 JRE System Library

public class mainClass {

	public static void main(String[] args) {
		
		// 입력(콘솔) -입력의 종착력은 web 필드에서 입력을 받는다. console이 아니라는 것
		Scanner scan = new Scanner(System.in); //선언만 해줌 new는 나중에 설명 - 자바에서만 보여주는 과정
		
		// boolean(참/거짓)
		boolean b;
		System.out.print("input b = "); //콘솔에서 입력할 때 앞에 편하게 보기 위한 방법
		b = scan.nextBoolean(); //nextBoolean함수 중요 - 입력을 받을 수 있는 함수
		System.out.println("b =" + b);
		
		
		// int(정수)
		int i; // 문자, 실수가 나올 경우 mismatch 가 됨 형식에 맞춰 써야할 것
		System.out.print("input i = ");
		i = scan.nextInt();
		System.out.println("i = " + i);
		
		
		// double(실수)  //실수가 정수보다 크기 때문에 실수형인지 정수형인지 모를 때는 실수를 사용할 것
		double d;
		System.out.print("input d =");
		d = scan.nextDouble();
		System.out.println("d = " + d);

		//String(문자열) //어디서나 String은 굉장히 중요함 - 카톡이나 전화번호등등 다 문자열로 나오는 것 어떤 언어든 String으로 /C에서 가장 속썩이는게 String
		String str;
		System.out.print("input str =");
		// str = scan.nextLine(); 이것도 가능하다. 하지만 next로 주로 사용하길
		str = scan.next();
		System.out.println("str =" + str);
		
		//next, nextline : nextline을 사용했을 경우 엔터도 키값으로 받아들여서 str:hellow i:12로 나올게 str:i:12로 나온다는 것
		System.out.print("str:");
		str = scan.next();
		System.out.print("i:");
		i = scan.nextInt();
		System.out.println("i = " + i);
		
	
	}
}
