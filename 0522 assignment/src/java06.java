
public class java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123"
				+ "";

		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		int num = Integer.parseInt(str);
		System.out.println("숫자"+num+"입니다");
		
		
		str = "1234o";

		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	
		
		
}
	
	static boolean isNumber(String str) {
		//null heap에 공간이 없는 것, 빈칸은 그래도 메모리를 차지하는 것
		if(str == null || str =="") {
			return false;
		}
		// charAt(0,1,2) --> 0번째 1번째 2번째
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int ascNum = (int)c;
			if(ascNum < 48 || ascNum > 57 ) {
				//ascNum >=48 && ascNum <=57
				b = false;
				break;
				
			}
			
		}
		return b;
	}
	/* 내가 한 것
	  static boolean isNumber(String str) {
		boolean b = true;
		
		int w = 0;
		while(w<str.length()) {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(w);
				int num =(int)ch;
				
				if(48<=num && num<=57) {
					b = true;
					break;
				}
				else {
					b = false;
				}
			}
	w++;}
		return b;
	}*/
}
