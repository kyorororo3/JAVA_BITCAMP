package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		 Generic : 자료형 변수 == template (형태)
		 자료형을 나중에 정하는 것이 제네릭
		 int n1, n2;
		 double d1, d2;
		 
		 
		 */

		//자료형은 객체를 생성할 때 정한다 변수는 안되고 Wrapper class로 넣어줘야 함
		Box<Integer> box = new Box<Integer>(2);
		int r = box.getNumber();
		System.out.println("r = " + r);
		
		Box<String> box1 = new Box<String>("Generic");
		String str = box1.getNumber();
		System.out.println("str = " + str);
		
		Box<Double> box2 = new Box<Double>(4.2);
		double d = box2.getNumber();
		System.out.println("d = "+ d);
		
		
		
		Box2<Integer, String> _box = new Box2<Integer, String>(123,"hello");
		System.out.println(_box.toString());
		
	}
}

	class Box <T> {
		     // 사용자 지정 <T>를 많이 쓰는건 template약자로 많이 쓰임 
		T number;
		
		public Box(T number) {
			this.number = number;
			// number++; 연산 처리가 안됨 
		}
		
		public T getNumber() {
			return number;
		}
	}

	class Box2 <T, A> { // 맨 첫글자는 대문자를 쓰는게 관례 
		
		T time;
		A area;
		
		public Box2(T time, A area) {
			super();
			this.time = time;
			this.area = area;
		}

		public T getTime() {
			return time;
		}

		public void setTime(T time) {
			this.time = time;
		}

		public A getArea() {
			return area;
		}

		public void setArea(A area) {
			this.area = area;
		}

		@Override
		public String toString() {
			return "Box2 [time=" + time + ", area=" + area + "]";
		}
		
		
	}