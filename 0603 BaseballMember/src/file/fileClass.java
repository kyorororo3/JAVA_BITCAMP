package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileClass {

	static String[] readfile() {
		
		File file = new File("e:\\temp\\playerInfo.txt");
		
		String datas[] = null;
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return null;
		}
		
		else {
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				int count = 0;
				String str;
				while((str = br.readLine()) != null) {
					count++;
				} br.close();
				datas = new String[count];
				
				int len = 0;
				br = new BufferedReader(new FileReader(file));
				while((str = br.readLine()) != null) {
					datas[len] = str;
					len ++;
				} 
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		return datas;
		
	}
}
