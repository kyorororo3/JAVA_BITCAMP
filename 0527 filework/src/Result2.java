import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Result2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String human = searchData("test", "일지매");
		String split[] = human.split("-");
		System.out.println("name: " + split[0]);
		System.out.println("age: " + split[1]);
		System.out.println("address: " + split[2]);
	}


	//검색이름, 파일 명을 인수로 입력
	
	//리턴 값은 String
	
	static String searchData(String filename, String name) {
		
		String datas[] = readFile(filename);
		
		//검색
		int findIndex = -1;
		
		for (int i = 0; i < datas.length; i++) {
			String data[] = datas[i].split("-");
			if(name.equals(data[0])) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			return "";
		}
	return datas[findIndex];
	// 동명이인의 경우 먼저 나온 것이 나오게 되는 점에서 회원번호를 쓰는게 좋다
	}
	
	
	static String[] readFile(String filename) {
		
		
		File file = new File("e:\\temp\\" + filename + ".txt");
		
		String datas[] = null;
		
		if(!file.exists()) {
			System.out.println("읽을 파일이 존재하지 않습니다. ");
			return null;
		}else {
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				//데이터 수를 조사
				int count = 0;
				String str;
			
					while((str = br.readLine()) != null){
						count++;
					}
					br.close();
				//String 배열 생성
				datas = new String[count];
				
				
				//데이터들을 배열에 읽고 넣기
				int len = 0;
				 br = new BufferedReader(new FileReader(file));  //커서를 위로 올려주는 작업
				 while((str = br.readLine()) != null){
						datas[len] = str;
						len++;
				 }
				 
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		return datas;}
			
}
