import java.util.Scanner;

public class java04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i;
		System.out.print("10의 배수로 입력해주세요: ");
		// i = scan.nextInt();
		/*
		if(i>=10 && i<20) {
			System.out.println("입력한 수는 10과 같거나 크고 20보다 작다.");
		}	
			else if(i>=20 && i<30) {
				System.out.println("입력한 수는 20과 같거나 30보다 작다.");
				
		}
			else if(i>=30 && i<40) {
				System.out.println("입력한 수는 30과 같거나 크고 40보다 작다.");
				
		}
			else if(i>=40 && i<50) {
				System.out.println("입력한 수는 40과 같거나 크고 50보다 작다.");
				
		}
			else if(i>=50 && i<60) {
				System.out.println("입력한 수는 50과 같거나 크고 60보다 작다.");
				
		}
			else if(i>=60 && i<70) {
				System.out.println("입력한 수는 60과 같거나 크고 70보다 작다.");
				
		}
			else if(i>=70 && i<80) {
				System.out.println("입력한 수는 70과 같거나 크고 80보다 작다.");
				
		}
			else if(i>=80 && i<90) {
				System.out.println("입력한 수는 80과 같거나 크고 90보다 작다.");
				
		}
			else if(i>=90 && i<100) {
				System.out.println("입력한 수는 90과 같거나 크고 100보다 작다.");
				
		}
		
		*/
		/*
		int num;
		num = scan.nextInt(); //49
		num = num/10%10; // 4
		for (i =0; i<=num ; i++);
			if(i>=num*10 && num<(num*10)+10) {
				System.out.println("입력한 수는"+(num*10)+"과 같거나 크고"+(num*10)+10+"보다 작다.");
			
			
				}

			
		*/
		
		
	
		Scanner sc = new Scanner(System.in); //콘솔에서만 쓰고 안쓰게 되는 존재
		
		int inputNumber;
		
		System.out.print("숫자입력 = ");
		inputNumber = sc.nextInt();
		/*
		if(inputNumber > 0 && inputNumber <= 10) {
			System.out.println("0보다 크고 10보다 작거나 같은 범위에 있습니다.");
		}
		else if(inputNumber > 10 && inputNumber <= 20) {
			System.out.println("10보다 크고 20보다 작거나 같은 범위에 있습니다.");
		}
			
		else if(inputNumber > 20 && inputNumber <= 30) {
			System.out.println("20보다 크고 30보다 작거나 같은 범위에 있습니다.");
		}
			
		/**/
		int num10 = 0;
		for (int j = 0; j < 10; j++) {//조건문의 j<n n부분만 바꿔서 범위를 정할 수 있다.
			num10 = 10* j;
			if(inputNumber > num10 && inputNumber <= num10 +10) {
				System.out.println(num10+"보다 크고" +(num10+10)+"보다 작거나 같은 범위에 있습니다.");
				
			}
			
		}
			
			
			
			
		
		
			}
	}


