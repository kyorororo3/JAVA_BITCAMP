package assignment20190515;

import java.util.Scanner;

public class java12 {

	public static void main(String[] args) {
		// 삼항연산자
		
		int i = 12;
		int i1 = 11;
		String str = (i==i1)? "맞아요":"틀렸습니다";
		System.out.println("str = " + str);
		
		
		Scanner sc = new Scanner(System.in);
		
		int inNumber;
		String numName;
		
		System.out.println("숫자입력 :");
		inNumber = sc.nextInt();
		
		numName = (inNumber > 0)? "양수":"음수"; //양수 판단

		System.out.println(numName + "입니다.");
	}

}
