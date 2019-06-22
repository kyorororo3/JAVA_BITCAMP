package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import single.SingletonClass;

public class FileClass {

	SingletonClass sc;
	File myfile;
	private String filename;
	
	public FileClass() {
		sc = SingletonClass.getInstance();
		myfile = new File("e:\\temp\\baseballUpdated.txt");
		filename = "baseballUpdated";
		
	}
	public FileClass(String filename) {
		myfile = new File("e\\temp\\" + filename +".txt");
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
	
	public void saveData() {
		String datas[] = new String[sc.map.size()];
		Iterator<Integer> it = sc.map.keySet().iterator();

		while(it.hasNext()) {
			Integer key = it.next();
			
			Human h = sc.map.get(key);
			if(h.getNumber() <2000) {
				Pitcher p = (Pitcher) h;
				datas[key] = p.toString();
				
			}
			else {
				Batter b = (Batter) h;
				datas[key] = b.toString();
			}
			}
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(myfile)));
			
			for (int i = 0; i < sc.map.size(); i++) {
				pw.println(datas[i]);
				
			}pw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("데이터의 내용을 파일에 정상적으로 저장되었습니다.");
	}
	
	public void loadData() {
		String str;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(myfile));
				int w = 0;
				while((str = br.readLine()) != null) {
					String data[] = str.split("-");
					Human h = new Human();
					if(h instanceof Pitcher) {
						Pitcher p = new Pitcher (Integer.parseInt(data[0]),
												data[1],
												Integer.parseInt(data[2]),
												Double.parseDouble(data[3]),
												Integer.parseInt(data[4]),
												Integer.parseInt(data[5]),
												Double.parseDouble(data[6]));
					
						sc.map.put(w, p);
					}
					Batter b = new Batter (Integer.parseInt(data[0]),
							data[1],
							Integer.parseInt(data[2]),
							Double.parseDouble(data[3]),
							Integer.parseInt(data[4]),
							Integer.parseInt(data[5]),
							Double.parseDouble(data[6]));
	
					sc.map.put(w, b);
					w++;
				}
				System.out.println("데이터의 내용을 파일에 정상적으로 불러왔습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
