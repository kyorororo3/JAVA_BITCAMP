import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//menu
		  //1. 파일 생성  -> 파일명
		File newFile;
		String readStr[] = new String[10];
		String writeStr = "";
		String aWriteStr = "";
		
		  newFile = createFile();
		  
		  //2. 파일 삭제  -> 파일명 입력
		  deleteFile();
		
		  try {
			//3. 파일 쓰기 -> 파일명 입력 + 파일에다가 써야할 문자열도 입력을 받는다
			writeStr = write(newFile);
			//4. 파일 읽기 -> 파일명 입력 + String : 읽어온 것을 String에 담기
		
			read(newFile, readStr);
		 
			//5. 파일 추가 쓰기
			aWriteStr = additionalWrite(newFile);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  //6. 모두 출력 
		  allPrint(readStr, writeStr, aWriteStr);
		
	}
	static File createFile() {
		
		String fileName;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("새로 만들 파일명을 입력해주세요 : ");
		fileName = scan.next();
		
		File newFile = new File("e:\\temp\\"+fileName+".txt");
		
		try {
			if(newFile.createNewFile()) {
				System.out.println(fileName + ".txt 파일 생성 성공!");
			}
			else {
				System.out.println(fileName + ".txt 파일 생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return newFile;}
	
	static void deleteFile() {
		
		//삭제할 파일명 입력하기
		String dFileName;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 파일명을 입력해주세요 : ");
		dFileName = scan.next();
		
		File file = new File("e:\\temp\\"+dFileName+".txt");
		//파일명을 조사
		
		if(file.exists()) {
			file.delete();
				System.out.println("파일을 삭제하였습니다.");
			}
			else {
					System.out.println("삭제할 파일이 없습니다.");	
				}
		
	
	}
	
	static String write(File newFile) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일에 기입할 내용을 적어주세요 : ");
		String comment = scan.next();
		
		FileWriter fileWriter = new FileWriter(newFile);
		fileWriter.write(comment);
		fileWriter.close();
	return comment;}
	
	static void read(File newFile, String str[]) throws Exception {
		if(newFile.exists()) {
			BufferedReader br =new BufferedReader(new FileReader(newFile));
	
			int w = 0;
			while((str[w] = br.readLine()) != null) {
				System.out.println(str[w]);
			w++;}
			br.close();
		}
		else {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
	static String additionalWrite(File newFile) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일에 추가로 기입할 내용을 적어주세요 : ");
		String comment1 = scan.next();
		
		FileWriter fileWriter = new FileWriter(newFile, true);
		fileWriter.write(comment1);
		fileWriter.close();
	return comment1;}

	static void allPrint(String[] str, String str1, String str2) {
	
	 System.out.println("기입한 내용 : " + str1);
	 System.out.println("읽어온  내용 : " + str);
	 System.out.println("추가해서 기입한 내용 : " + str2);
	}
}
