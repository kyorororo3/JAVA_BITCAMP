import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	File file = new File("e:\\temp/newFile.txt");
	// d:/가 d:\\대체 가능
	
	
	try {
		if(checkBeforeReadFile(file)) {
			/*FileReader fileReader = new FileReader(file);
			// 한글자씩 읽어 옴
				int ch = fileReader.read();
				while(ch != -1) { // -1 파일의 끝
					System.out.print((char)ch);
					ch = fileReader.read();
					
					
				}
				
			
		}
		*/
			//문장으로 읽어오는 것을 더 많이 사용  - 한글자 -> 저장해서 모은다
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);  //배열에다가 어떻게 넣을까를 생각해봐야함
				
			}
			br.close();
		}	                                                                                          
		else {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	    }catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	
	}
	static boolean checkBeforeReadFile(File f) { // utility 함수 - 프로그램에 직접적인 영향을 끼치지 않고 검사용으로 사용되는 함수
		if(f.exists()) {  //파일 존재 여부
			if(f.isFile() && f.canRead()) {
				return true;
			}
		}
	return false;
	}
	
}
