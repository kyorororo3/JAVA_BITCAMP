package single;

public class SingletonClass {

	private static SingletonClass single = null;
	public int num; // 데이터를 중간에 넘겨주기 위한 수단
	public String name;
	private static SingletonClass singleName = null;
	
	private SingletonClass() {
		//2 
	}
	//private은 호출하는게 아님
	
	
	public static SingletonClass getInstance() {
		if(single == null) {
			single = new SingletonClass(); //3  //6
			// private이라고 해도 클래스 안에서는 객체 생성가능
			
		}
		//4 //7
		return single; // 맨 처음만 생성을 해주고 그 다음 부터는 동일한 instance값만 넘겨주는 상황 static이기 때문에 유지되는 것 그 값을 그대로 유지 
		//singleton이 값을 하나 만들고 계속 유지하는것 
		
	}
	
	public static SingletonClass getName() {
		if(singleName == null) {
			singleName = new SingletonClass(); 
			
		}
		//4 //7
		return singleName; 
		
	}

}
