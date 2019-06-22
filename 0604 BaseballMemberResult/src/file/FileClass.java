package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileClass {

	private String filename;  // 많이 불편한 편
	private File myFile;
	
	public FileClass(){
		myFile = new File("e:\\temp\\baseballmember.txt");
		filename = "baseballmember.txt";
		createFile();
		
	}
	
	public FileClass(String filename) {// dao class에서 잡아줄때 
		myFile = new File("e:\\temp\\" + filename + ".txt");
		this.filename = filename;
		createFile();
		
	} //팀별관리라면 이게 나을지도 모른다
	
	
	//파일 생성
	/*public void createFile() {
		try {
			if(myFile.createNewFile()) {
				System.out.println(filename + "파일 생성 성공");
			}
			else {

				System.out.println(filename + "파일 생성 실패");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/

	public File createFile() {
		try {
			if(myFile.createNewFile()) {
				System.out.println(filename + "파일 생성 성공");
			}
			else {

				System.out.println(filename + "파일 생성 실패");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myFile;
	}
	
	
	//파일 읽기
	public String[] readFile() {
		String datas[] = null; //몇개인지 모를 때 null을 슴
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(myFile));
			
			//데이터의 수 조사
			int count = 0;
			String str;
			while((str = br.readLine()) != null ) {
				count++;
				
			}
			br.close();
			
			//데이터의 수만큼 배열 할당
			datas = new String[count];
			System.out.println("데이터의 갯수 : " + datas.length);
			
			// 배열에 저장
			int w = 0;
			br = new BufferedReader(new FileReader(myFile));
			while((str = br.readLine()) != null) {
				datas[w] = str;
				w++;
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(filename + ".txt 파일로 부터 데이터를 정상적으로 읽었습니다.");
	
		return datas; 
    }
	
	//파일 쓰기
	public void writeFile(String datas[]) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
			
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
				
			}
			pw.close();
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	System.out.println(filename + ".txt 파일의 데이터를 저장하였습니다.");
	}
	
}
