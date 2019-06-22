
public class java07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String strNumber1 = "123.4567";
		String strNumber2 = "456";
		//int로 나오면 String으로 바꿔야함
		if(isIntOrDouble(strNumber1) == true) {
			System.out.println("실수입니다.");		
		}
		else {

			System.out.println("정수입니다.");
		}
		
		if(isIntOrDouble(strNumber2) == true) {
			System.out.println("실수입니다.");		
		}
		else {

			System.out.println("정수입니다.");
		}
	}
	
	static boolean isIntOrDouble(String str) {
		boolean b = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '.') {	//.123 123.  마지막과 
				b = true; //예인 경우에만 이쪽에 나오고 초기화를 false한 이유는 이거 안걸리면 그냥 false로 바로 나오게끔 하는 것 
				break;
			}
		}
	return b; }
	
	/*static boolean isIntOrDouble(String str) {
	boolean b = true;
		
		int w = 0;
		while(w<str.length()) {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int num =(int)ch;
				
				if(num<48) {
					b = true;
					break;
				}
				else {
					b = false;
				}
			}
	w++;}
	
		
	return b;}*/
	
}
