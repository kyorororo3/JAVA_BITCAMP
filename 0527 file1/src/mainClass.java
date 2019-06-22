import java.io.File;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		  file : 저장매체 == 기능 -> 가져다 사용
		  저장매체는 두개 file / database
		  Database: oracle -> 파일
		  file이 보안에 강한 편 
		  
		  디비는 서버 
		  
		  *.txt 조상 file => 2진수로 변환 binary file  
		  *dll(Dynamic link library) >> 동적파일, lib(library) >> 정적파일, 파일 jar
		  	부팅되면서 읽혀져서 나오는 파일메모리 절감차원에서 좋음  메모리가 많이 필요함, 속도가 빠름 윈도우를 끄기 전까지 계속 메모리에 유지되는 것
		 
		 
		 */
			//객체, 변수
		File file = new File("c:\\");
		/*
		// 경로의 파일 명을 조사
		String filelist[] = file.list();
		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]); 		//$ 시스템파일이라고 감춰져 있는 것
			
			//같은 파일명이 있을 때 막아줄 수 있는 역할을 하기 때문에 파일리스트는 중요하다 
		}
	*/
		// 파일과 폴더를 조사 		도스환경에서 폴더는 디렉토리라고 함
		File filelist[] = file.listFiles();
		
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());
			}
			else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
		
	
		
		//파일 생성
		File newFile = new File("e:\\temp\\newFile.txt");
		
		try {
			if(newFile.createNewFile()) {
				System.out.println("newFile.txt 파일 생성 성공!");
			}
			else {
				System.out.println("newFile.txt 파일 생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//폴더 생성
		String dirStr = "e:\\temp1\\sub";
		File newDir = new File(dirStr);
		
		if(newDir.mkdirs()) {   //mkdirs가 있다. 
			System.out.println("폴더 생성 성공!");
		}
		
		else {
			System.out.println("폴더 생성 실패");
		}
		
		
		
		// file 존재 여부
		if(newFile.exists()) {
			System.out.println("파일이 존재합니다.");
		}
		else {
				System.out.println("파일이 존재하지 않습니다.");	
			}
	
		
		// file 쓰기/읽기 가능여부
		if(newFile.canWrite()) {
			System.out.println("파일을 쓰기가 가능합니다.");
		}
		else {
				System.out.println("파일을 쓰기가 불가능합니다.");	
			}

	
		// file 삭제
				if(newFile.delete()) {
					System.out.println("파일을 삭제하였습니다.");
				}
				else {
						System.out.println("파일을 삭제하지 못했습니다.");	
					}

	
	
	
	
	}
	
	

}
