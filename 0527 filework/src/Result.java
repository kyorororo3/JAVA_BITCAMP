import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
		
	//	6. 모두 출력
		
	//	7. 검색 -> 이름
		
	//	8. 종료
		
	}
	
	static void menu() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("\"e:\\\\temp\" 에서 실행할 작업을 선택해주세요. ");
	
			
			System.out.println("=========================");
			System.out.println("| 1. 새로운 파일 생성	|");
			System.out.println("| 2. 파일 삭제		|");
			System.out.println("| 3. 파일 내용 작성		|");
			System.out.println("| 4. 파일 내용 읽기		|");
			System.out.println("| 5. 파일 추가 내용 작성	|");
			System.out.println("| 6. 파일 내용 검색		|");
			System.out.println("=========================");
			System.out.print("작업하실 번호를 입력해주세요 : ");
			int choice = scan.nextInt();
			
			String fileName = "";
			switch(choice) {
			case 1:
				System.out.print("새로 만들 파일명을 입력해주세요 : ");
				fileName = scan.next();
				createFile("fileName");
				break;
			
			case 2:
				System.out.print("삭제할 파일명을 입력해주세요 : ");
				fileName = scan.next();
				deleteFile("fileName");
				break;
			
			case 3:
				writeFile("fileName");
				break;
				
			case 4:
			String arr[] = readFile("fileName");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			} break;
			
			case 5:
				appendWriteFile("fileName");
				break;
			
			case 6:
				System.out.print("검색할 항목을 입력해주세요(이름/나이/주소) : ");
				String info = scan.next();
				String arr1[] = readFile("fileName");
				String str1[];
				String str2[][];
		/*		for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						str1 = arr1[i].split("-");
						str2[i][j] = str1[i];
					}
				}	
				for (int i = 0; i < str2.length; i++) {
					for (int j = 0; j < str2[0].length; j++) {
					if(info.equals("이름")) {
						System.out.println(str2[i][j]);
					}
					else if(info.equals("나이")) {
						System.out.println(str2[i][j]);
					}
					else if(info.equals("주소")) {
						System.out.println(str2[i][j]);
					}
					break;
					
					}
				}		
			*/		
			}
			System.out.println("계속해서 작업하시겠습니까? (y/n) :");
			String yesOrNo = scan.next();
			if(yesOrNo.equals("n")) {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	//파일 생성
	static File createFile(String filename) {
		
		File dirFile = new File("e:\\temp");
		String fileList[] = dirFile.list();
		boolean b = false;
		
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].equals(filename + ".txt") == true) {
				b = true;
				break;
				
			}
		}
		if(b) {
			System.out.println("같은 이름의 파일이 존재합니다. 파일을 생성하지 못했습니다.");
			return null;
		}

		File file = new File("e:\\temp\\" + filename + ".txt");
		
		try {
			
			if(file.createNewFile()) {
				System.out.println(filename + ".txt" + "파일을 생성하였습니다.");
			}
			else {
				System.out.println(filename + ".txt" + "파일을 생성하지 못했습니다."); //같은 이름의 경우는 아닌 것
				return null;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("예외가 발생하였습니다.");
		}
	return file;}

	//파일 삭제
	static void deleteFile(String filename) {
		
		File file = new File("e:\\temp\\" + filename + ".txt");
		
		boolean b = file.exists();
		if(b == false) {
			System.out.println("삭제할 파일" + filename + ".txt" + "이 존재하지 않습니다.");
		}else {
			if(file.delete()) {
				System.out.println("파일" + filename + ".txt" + "를 삭제하였습니다.");
			}else {
				System.out.println("파일" + filename + ".txt" + "를 삭제하지 못하였습니다.");
			}
			
		}
		
	}

	static boolean writeFile(String filename) {
		Scanner sc = new Scanner(System.in);
		
		File file = new File("e:\\temp\\" + filename + ".txt");
		boolean b = file.exists();
		if(b == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return false;
		}
		else {
			System.out.print("이름 >>>");
			String name = sc.next();
			
			System.out.print("나이 >>>");
			String age = sc.next();
			
			System.out.print("주소 >>>");
			String address = sc.next();
			
			String data = name + "-" + age + "-" + address; //split
			
			PrintWriter pw;
			
			try {
				pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
				pw.println(data);
				pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(filename + ".txt 파일에" + data + "를 작성하였습니다.");
			
			return true;
		}
	}


	static boolean appendWriteFile(String filename) {
		Scanner sc = new Scanner(System.in);
		
		File file = new File("e:\\temp\\" + filename + ".txt");
		boolean b = file.exists();
		if(b == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return false;
		}
		else {
			System.out.print("이름 >>>");
			String name = sc.next();
			
			System.out.print("나이 >>>");
			String age = sc.next();
			
			System.out.print("주소 >>>");
			String address = sc.next();
			
			String data = name + "-" + age + "-" + address; //split
			
			PrintWriter pw;
			
			try {
				pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
				pw.println(data);
				pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(filename + ".txt 파일에" + data + "를 추가 작성하였습니다.");
			
			return true;
		}
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
