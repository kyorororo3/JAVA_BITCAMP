package main;

import cls.MyClass;
import hcls.HeClass;
import ycls.YouClass;

public class mainClass {

	public static void main(String[] args) {

		
		MyClass mcls = new MyClass();
		YouClass ycls = new YouClass();
		
//		int n = mcls.getMynum();
//		ycls.setYounum(n);
		
		mcls.method();
		ycls.method();
		
		System.out.println(ycls.toString());
		
		//메모리를 통해서 주고받고 하는 것이 싱글톤
		
		HeClass hcls = new HeClass();
		hcls.func();
		System.out.println(hcls.toString());
		ycls.func();
		System.out.println(ycls.toString());
	}

}
