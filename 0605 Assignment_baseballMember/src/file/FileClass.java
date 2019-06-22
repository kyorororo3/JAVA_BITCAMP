package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileClass {

	private String filename;
	private File myFile;
	
	public FileClass() {
		
		myFile = new File("e:\\temp\\baseballMember.txt");
		filename = "baseballMember.txt";
		
		createFile();
	}
	public FileClass(String filename) {
		myFile = new File("e:\\temp\\" + filename + ".txt");
		this.filename = filename;
		createFile();
		
	}
	//파일 생성
	
	public void createFile() {
		
		try {
			if(myFile.createNewFile()) {
				System.out.println(filename+" .txt 파일 생성 성공");
			}
			else {
				System.out.println(filename + ".txt 파일 생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filename + "파일의 데이터를 저장하였습니다.");
	}
	
	
	//파일 읽기
	
	public String[] readFile() {
		String datas[] = null;
		int count = 0;
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader(myFile));
			String str;
			while((str = br.readLine()) != null) {
				count++;
			}br.close();
			
			datas = new String[count];
			br = new BufferedReader(new FileReader(myFile));
			int w = 0;
			while((str = br.readLine()) != null){
				str = datas[w];
				w++;
			}br.close();
			
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datas;
	}
	
	
	
}
