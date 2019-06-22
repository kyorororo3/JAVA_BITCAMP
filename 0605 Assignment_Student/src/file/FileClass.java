package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dto.StudentDto;
import single.Singleton;

public class FileClass {

	File myfile;
	private String filename;
	Singleton sc = Singleton.getInstance();
	
	public FileClass() {
		myfile = new File("e:\\temp\\studentlist.txt");
		filename = "studentlist";
	}

	public FileClass(String filename) {
		myfile = new File("e:\\temp\\" + filename + ".txt");
		this.filename = filename;
		
	}
	public void createFile() {
		
		try {
			if(myfile.createNewFile()) {
				System.out.println(filename + ".txt 파일 생성 성공");
			}
			else {
				System.out.println(filename + ".txt 파일 생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dataSave() { // list에서 file로
		String datas[] = null;
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto dto = sc.list.get(i);
			datas[i] = dto.toString();
		}
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(myfile)));
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
				
			}pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dataLoad() { //file에서 list
		Singleton sc = Singleton.getInstance();
		String str;
		try {
			BufferedReader br = new BufferedReader(new FileReader(myfile));
			while((str = br.readLine()) != null) {
			String data[] = str.split("-");
			StudentDto dto = new StudentDto (Integer.parseInt(data[0]),
											 data[1],
											 Integer.parseInt(data[2]),
											 Integer.parseInt(data[3]),
											 Integer.parseInt(data[4]));
			sc.list.add(dto);
											 
			}br.close();
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
