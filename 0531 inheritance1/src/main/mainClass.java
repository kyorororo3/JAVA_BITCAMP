package main;

import Children.Children;
import child.Child;
import parent.Parent;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent pa1 = new Parent();
		
		Parent pa2 = new Parent(2);
		
		
		
		Child ch1 = new Child(1122);
		//Parent꺼를 먼저 부름. 장유유서다 소멸자는 반대로 먼저가고 부모님 다음에 감
		
		int n = ch1.getNumber();
		
		System.out.println("n = " + n);
		
		
		
		ch1.method();
		//고쳐 기입한 내용으로 출력
		
		/*
		 회사		[]		//하나로 관리하는 것이 편합니다.
		 총무부	[]	
		 기획부	[]
		 경리부	[]
		 
		 부모[]		//하나로 관리하는 것이 편합니다
		 아들[]
		 딸[]
		 
		 */
	
		Parent p1 = new Child();
		Parent p2 = new Children();
		// instance는 부모가 관리  메모리는 child/children 동적할당
		
		p1.method();
		//힙에 생성된 것은 자식것들이기 때문에 
		
	/*
	 야구팀 []
	 투수[]
	 타자[]
	 포수[]
	 내야수[]
	 
	 */
		
	
	}

}
