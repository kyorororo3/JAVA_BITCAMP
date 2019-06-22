package cls;

import single.SingletonClass;

public class MyClass {

	private int mynum;
	
	public MyClass() {
		mynum = 234;
	}

	public int getMynum() {
		return mynum;
	}

	public void setMynum(int mynum) {
		this.mynum = mynum;
	}
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();  //1
		sc.num = mynum; //5
	}
}
