package ycls;

import single.SingletonClass;

public class YouClass {

	private int younum;
	private String youname;
	
	public YouClass() {
		
	}

	public int getYounum() {
		return younum;
	}

	public void setYounum(int younum) {
		this.younum = younum;
	}

	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance(); //8
		 younum = sc.num;  //9 
	}
	
	public void func() {
		SingletonClass sc = SingletonClass.getName();
		youname = sc.name;
	}
	@Override
	public String toString() {
		return "YouClass [youname=" + youname + "]";
	}
	
	
}
