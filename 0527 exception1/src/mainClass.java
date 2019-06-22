import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class mainClass {

	public static void main(String[] args) {
		
		// NullPointerException -> new를 안해줘서 생기는 예외
		
		String str = null;
		
		try {
		System.out.println(str.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	System.out.println("프로그램 실행중...");
	
	
		
		// ArrayIndexOutOfBoundsException
		
		int arr[] = {1, 2, 3};
		
		try {
		System.out.println(arr[3]);
		}catch (ArrayIndexOutOfBoundsException e ){
			e.printStackTrace();
		}
		
	
		// fileNotFoundException
		
		File file = new File("c:\\xxxxxx");
		FileInputStream is; 
		
		try {
		is = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		//StringIndexOutOfBoundsExcetion
		
		String str1 = "java";
		
		try {
		System.out.println(str1.charAt(4));
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		//NumberFormatException  1->'a' 숫자여야하는데 문자로 입력 사실 에러는 안나옴

		int i;
		
		try {
		i = Integer.parseInt("11a2");
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
	


}
