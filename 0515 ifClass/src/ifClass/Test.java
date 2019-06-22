package ifClass;

public class Test {

	public static void main(String[] args) {
		
		
		boolean b = false;
		
		
		if(b !=true) { // 비교1
			System.out.println("b != true입니다");
		}
		
		if (b) { // b == false (b b== true)
			System.out.println("b == true입니다");
		}
		if (!b) { // b == false (b b== true) // 비교2
			System.out.println("!b == false입니다");
		}
		
		boolean test = !b;
		
		System.out.println(!b);
		
	}
}
