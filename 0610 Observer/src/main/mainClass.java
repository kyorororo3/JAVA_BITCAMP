package main;

public class mainClass {

	public static void main(String[] args) {
	/*
	 
	 Observer : 감시자 패턴
	 DB를 통해서 뽑는게 아니라 실시간으로 사용자 정보를 다 뺄 수 있는 스타일 
	 
	 */
		
		
		//감시대상의 클래스
		
		MyClass human = new MyClass();
		human.addObserver(new ObserverA());
		human.addObserver(new ObserverB());
		
		human.notifyObservers("이것은 비밀 사항입니다.");
		
		human.notifyObservers("비밀번호: abc123");
	}

}
