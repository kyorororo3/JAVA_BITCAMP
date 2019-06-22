import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		//calculator
		//+ - * /이 중 아니면 다시 입력하세요
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("계산할 첫번째 숫자를 입력해주세요: ");
		int user1 = sc.nextInt();
		System.out.print("계산할 연산부호를 입력해주세요: ");
		String user2 = sc.next();
		System.out.print("계산할 두번째 숫자를 입력해주세요: ");
		int user3 =sc.nextInt();
	
				if(user2 == "+") {;
					System.out.println("정답은:"+(user1+user3)+"입니다");
				}
		
					else if(user2 == "-") {;
						System.out.println("정답은:"+(user1-user3)+"입니다");
					}
		
						else if(user2 == "*") {;
							System.out.println("정답은:"+(user1*user3)+"입니다");
						}
		
						else if(user2 == "/") {;
							System.out.println("정답은:"+(user1/user3)+"입니다");
						}
							else {
								System.out.println("잘못된 연산부호를 입력하셨습니다");
				
					}
	     /*

			boolean p = (user2=="+"); 
	
		
		int w = 0;
		while (p == true) {
			System.out.println("계산할 두번째 숫자를 입력해주세요: ");
			w++;
		}
		
		
		
		
		(user2=="+" && user2=="-" && user2 =="*" && user2 =="/"
	
		
		boolean p = (user2=="+"); 
		boolean m = (user2=="-");
		boolean t = (user2=="*");
		boolean d = (user2=="/");
		
		if (p== (user2=="+")) {
			System.out.print("계산할 두번째 숫자를 입력해주세요: ");
		}
			else if(m== (user2=="-")) {
				System.out.print("계산할 두번째 숫자를 입력해주세요: ");
			}

			else if(t== (user2=="*")) {
				System.out.print("계산할 두번째 숫자를 입력해주세요: ");
			}	

			else if(d== (user2=="/")) {
				System.out.print("계산할 두번째 숫자를 입력해주세요: ");		
		
			}
			
			else {
				System.out.println("잘못 입력하셨습니다.연산부호를 수정해주세요.");
			}
			*/
		
		
	}

}
