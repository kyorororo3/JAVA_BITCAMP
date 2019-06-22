package view;

public class Singleton {

	private static Singleton s = null;
	
	public FrontWindow fwin;
	public SubWindow swin;
	
	//리소스가 많을 때 시간 절약가능
	private Singleton() {
		fwin = new FrontWindow();
		swin = new SubWindow();
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s; 
	}
}
