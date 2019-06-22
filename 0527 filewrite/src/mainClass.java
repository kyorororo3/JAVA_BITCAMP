import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args) {

		File file = new File("e:/temp/newFile.txt");
		
		// 위에 기입이 된다. 파일이 없을 경우 생성과 같이 기입된다.
		
		// readonly 설정
		//file.setReadOnly();
		
		
		// readonly 해제
		//file.setWritable(true);
		
		//쓰기
		try {
			//첫 번째 쓰기 방법
			/*
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("안녕하세요 반갑습니다");
			fileWriter.write("hi good day ");
			fileWriter.close(); //write()의 경우 작성의 마무를 꼬오오오오오오오오오오오오오오오오오오옥 해준다.
			
		
		
			PrintWriter pw = new PrintWriter(new BufferedWriter (new FileWriter(file)));
			pw.print("안녕");
			pw.println("안녕하세요");
			pw.print("hello");
			
			pw.close();
			*/
			
			// 추가 기입 
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("안녕하세요 반갑습니다");
			fileWriter.write("hi good day ");
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
