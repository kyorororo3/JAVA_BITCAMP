package hcls;

import single.SingletonClass;

public class HeClass {

	private int hnum;
	private String hname;
	public HeClass() {
		hname = "송혜연";
		
	}
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		hnum = sc.num;
	}

	public void func() {
		SingletonClass sc = SingletonClass.getName();
		sc.name = hname;
	}
	@Override
	public String toString() {
		return "HeClass [hname=" + hname + "]";
	}
	
	
}
