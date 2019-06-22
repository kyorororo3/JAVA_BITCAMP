
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		int String
		10진수 -> 2진수
		3    11
		
		
			10
		2	5 ---------> 0
		2	2 ---------> 1
		2   1 ---------> 0
		2   0 ---------> 1
		
		
		 
		 
		 
		 
		 */
		
		String bin = "";
		int dec = 10;
		
		
		bin = number10to2(dec);
		System.out.println(bin);
		
		
	}

	static String number10to2(int num) {
		int i;
		String str ="";
		
		i = (num/2);
		str = num%2+"";
		
		while(true) {
			str = i%2+""+str;
			i = (i/2);
			
			switch(i) {
			case 1:
			str = 1+""+str;
				return str;
			case 0:
			str = 0+""+str;
				return str;
			}
		}
		/*while(true) {
			str = num % 2 + str;
			num = num / 2;
			if(num == 0) {
				break;
				
			}
			*/
		
		}
	//}
		/*
		 *
	

		
	}
	*/
	static String number10to16(int num) {
		int i;
		String numStr[] = { "A", "B", "C", "D", "E", "F" };
		String str ="";
		
		while(true) {
			if(num % 16 <= 10 && num % 16 <= 15) {
				str = numStr[num%16 - 10] + str;
				break;
			}
			else {
				str = num % 16 +str;
				break;
				}
		}
	return "";}
}
