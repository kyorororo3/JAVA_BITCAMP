package child;

import parent.Parent;

public class Child extends Parent {
	
	public Child() {
		super( 2 );
		System.out.println("Child Child()");
	}
	
	public Child(int num) {
		super(num);
		System.out.println("Child Child(int i)");

	}
	//상속받은 겟터 셋터는 기입하지 않아도 돌아간다. 
	
	
	//Over Riding
	public void method() { 
		super.method(); //생성자에서만 쓰이는 것이 아니라 오버라이드 하기 전 메소드를 불러오는데도 사용이 가능 
		//super를 안쓰면 새로 바뀐 아래의 글이 출력되지만, super를 함
		System.out.println("Child method()");
	}
}
