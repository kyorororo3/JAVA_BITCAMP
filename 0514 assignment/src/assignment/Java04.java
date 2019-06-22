package assignment;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
		String str;
		System.out.println(">>name");
		str = scan.next();
		System.out.println(">>name:"+ str);
		int i;
		System.out.println(">>age");
		i = scan.nextInt();
		System.out.println(">>age:" + str);
		
		boolean b;
		System.out.println(">>man");
		b = scan.nextBoolean();
		System.out.println(">>man:" +b);
		
		String str1;
		System.out.println(">>phone");
		str1 = scan.next();
		System.out.println(">>phone:" +str1);
		
		double d;
		System.out.println(">>height");
		d = scan.nextDouble();
		System.out.println(">>height:"+d);
		
		String str2;
		System.out.println(">>address");
		str2 = scan.next();
		System.out.println(">>address:"+str2);
		
		
		
	}

}
