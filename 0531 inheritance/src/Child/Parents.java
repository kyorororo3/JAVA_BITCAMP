package Child;
//부모클래스
public class Parents {

		protected int pNumber;
		//자식클래스에서 접근은 허용하겠다. but 외부 접근은 차단한 것 요즘은 자주 사용되지 않는다. 몇년전까지만해도 꽤 쓰였음
		//같은 클래스에 있으면 접근이 가능해져버린다.
		public int getpNumber() {
			return pNumber;
		}

		public void setpNumber(int pNumber) {
			this.pNumber = pNumber;
		}

		public void pMethod() {
			System.out.println("Parents pMethod()");
			
		}
}

