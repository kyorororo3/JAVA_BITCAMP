
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  Exception : 예외  != 에러   ->개발자용
		  
		  Baseball -> 1 ~ 10     어떤 자가 'A'라고 입력 == 65
		  random find - > 1 ~ 100 -> 어떤자가 'B'라고 입력 == 66
		  
		  number format 10 -> 'a' == 97
		  array index [5] -> [0]~[4] ->[5] array index out of bound
		  class not find 
		  file not found
		  
		  
		  형식
		  
		  try{
		  	//예외가 발생할 가능성이 있는 코드 
		  
		  }catch(예외 클래스1 e{
		     // 예외 메시지를 발생 (출력)
		  }catch(예외 클래스2 e{
		     // 예외 메시지를 발생 (출력)
		   }catch(예외 클래스3 e{
		     // 예외 메시지를 발생 (출력)
		  }finally{
		  	//무조건 실행
		  	//되돌림(undo)
		  	// rollback
		  	
		  	
		  	
		  }
		 */
		
		
	
		int arr[] = {11, 22, 33};
		
		System.out.println("프로그램 시작");
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("for문 탈출 부분"); //catch가 딱 잡고 여기는 튀고 그냥 넘어가버림
			
			return;
			
		}catch (ArrayIndexOutOfBoundsException e) {  //
			// System.out.println("배열의 범위를 벗어났습니다.");
			 e.printStackTrace();
			 //System.out.println(e.getMessage());
		}
		
		catch (NumberFormatException e) {  //ArrayIndexOutOfBoundsException e
		}
		finally {
			System.out.println("finally 부분");  //항상 거쳐가는 존재. return이 있음에도 불구하고 출력이되는 건 반드시 거쳐간다는 것 
			//뒷처리를 해주는 곳 
		}

		System.out.println("프로그램 끝"); //return을 넣었을 경우 마지막에 출력이 안됨
			
			
		
		try {
			callFunc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void callFunc() throws Exception {   //함수에서 할 수 있는  예외처리
		int num[] = {11,22,33};
		
	//	try {
			for (int i = 0; i < 4; i++) {
				System.out.println(num[i]);
			}
	//	}catch(IndexOutOfBoundsException e) {
	//		e.printStackTrace();
	//	}
		
		
	}
	static void function() {
		System.out.println("function() 시작");
		
		return; //값만 없을 뿐 return을 사용할 수 있다.
		// System.out.println("function() 끝");  //에러

	}
}
