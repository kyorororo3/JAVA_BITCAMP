package result;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortClass sort = new sortClass();
		
		
		
		//menu만 만들어주면 되는 것 main은 복잡하게 할 것 없음
		
		//변수 선언  두군데 이상에서 나타는 변수는 멤버 변수를  가질 필요가 있다. 현재 입력 정렬 출력에서 필요함
		//int number[] = null;
		//int updown;
		
		//초기화
		sort.init();
		
		//입력
		
		//int count;
			//1. 몇개
			//2. 갯수에 맞게 동적할당 
			//3. 숫자들 입력
			//4. up/down
		sort.input();
		
		
		//정렬
		sort.sorting();
		
		//int temp;
		
		//출력
		sort.resultPrint();
		
		
		
		
		
	}

}
