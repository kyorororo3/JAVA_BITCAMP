
public class mainClass {

	public static void main(String[] args) {
		// String : 문자열 
		//문자열을 다룰 수 있는 class
		//Wrapper class c언어에서는 String을 사용할 수 있는 Wrapper class가 없어서 char 배열로 사용한다. 원초적으로 쓰이는 c언어 하핳 
		
		/*
		  
		 
		 */
		
		System.out.println("-----------------------");
		
		String str; //String이 원래 자료형이라고 하죠 String은 클래스 명 == class template(형태)
					//str == 변수라고 불렀지만 Object(객체) -->instance(주체) 실질적으로 우리가 접근해야하는 매개체 
		
		//딸린 식구들 변수와 함수 이건 나중에 한다고 함
		str = "안녕하세요";
		System.out.println("str ="+str);
		
		System.out.println("-----------------------");
		
		//형태가 여러가지있다.
		String str1 = new String("하이"); //new == 동적할당 포인터를 사용하는 것이 이부분 
		//이것이 스탠다드  new String 객체를 만들때 나오는 거고 사실 Wrapper class에서는 =에 포함되어 있어서 생략해도 그 결과가 나온다
		System.out.println("str1 = "+ str1);
	
		System.out.println("-----------------------");
		
		String str2 = "반갑습니다.";
		
		System.out.println("str2 = "+ str2);
		
		//문자열끼리 합할 때 쓰는 방법
		String str3;
		str3 = str1 +str2; //연산자를 통해서 합할 수 있다.
		
		System.out.println("str3 = "+ str3);
		
		
		
		//[함수] concat() == 문자열을 합한다
		String str4 = "건강하세요";

		String str5 = str3.concat(str4);
		
		System.out.println("Str = "+str5);
		
		//connection + catch가 합쳐진 함수가 concat() 
		//concat보다는 연산자를 더 많이 쓴다. 이게 더 간단하거든.
		
		
		//char의 배열은 String에 포함이 된다라는 개념을 기억할 것
		char cdata[] = {'h','e','l','l','o'}; //호환이 됩니다. 
		
		String str6 =new String(cdata); //배열 명칭은 빼고 넣는다.
		System.out.println("str6 = "+str6);
		
		
		/*
		 class 객체
		 
		 만약 인간이라는 class가 있었다고 한다면
		 사람은 기능을 가지고 있다. 그 기능을 function(함수)라고 생각하면 됨.
		 class의 소속되어 있는 함수의 경우 method(메소드)라고 부름 
		 
		 기능(function)함수 = method)
		 	먹는다
		 	걷는다
		 	공부한다
		 -->블로그에 정리하는 개념 정도
		 
		 */
		
		//[함수]equals : 문자열 비교함수  -- 비교한 값을 산출할 수 있음
		//--> 참 많이 쓰입니다
		
		/*
		String str7 = "Hello";
		String str8 = "Hello";

		if(str7 == str8) {
			System.out.println("str7과 str8은 같다.");
		}
		else {
			System.out.println("str7과 str8은 다르다.");	
		}
		
		*/
		
		String str7 = "Hello";
		String str8 = "Hell";

		str8 = str8 +"o";
		
		if(str7 == str8) { //처음 들어간 문자열로 들어가고 편집된 것에 영향받지 않았다.
			System.out.println("str7과 str8은 같다.");
		}
		else {
			System.out.println("str7과 str8은 다르다.");	
		} //정상적으로 비교가 되지않았다. 
		
		if(str7.equals(str8) == true) {  //들어온 것을 자체로 비교를 한 것
			System.out.println("str7과 str8은 같다.");
			
		}
		else {
			System.out.println("str7과 str8은 다르다.");				
		} //정확하게 비교가 되었다
		
		
		boolean b = str7.equals(str8);		//이렇게 넣어서
		// b가 output (str8) input
		if(b == true) {						//if에 넣은 것
			System.out.println("str7과 str8은 같다.");
			
		}
		else {
			System.out.println("str7과 str8은 다르다.");				
		} 
		
		
		
		// [함수] indexOf == 문자 검색을 위한 함수. 앞부분부터 찾는다. 찾은 문자의 index 번호를 돌려준다.
		
		String str9 = "abcdeabcdeabcde";
					// 0123456789.... index번호의 순서가 이렇게 나온다는 것
		int n = str9.indexOf("d"); 
		
		System.out.println("n = " + n );
		
		
		// [함수] lastIndexOf == 문자 검색을 위한 함수. 뒤에서부터 찾는다.
		
		n =str9.lastIndexOf("d");
		
		System.out.println("n = " + n );
		
		
		// [함수] length == 문자열길이
		
		int len = str9.length();
		System.out.println("len = " + len );
		
		// [함수] replace == 수정  replace("원래 있던 것","새롭게 넣고 싶은 것")
		
		String str10 = "A*B*C*D";
		
		String repStr = str10.replace("*", "-");
		System.out.println("repStr = " + repStr);
		
		str10 = "\"삼성의 추락\"…2분기 연속 반도체 매출 1위 내줘";
		
		repStr = str10.replace("…", "__");
		System.out.println("repStr = " + repStr);
		
		/*
		 split :
		 token을 이용해서 문자열을 자르는 작업
		 
		 이름	  나이      생년월일 	 주소
		 홍길동-24-2001/01/13-서울시	"-" 이 token이다	
		 
		 홍길동
		 24
		 2001/01/12
		 서울시
		 
		 --> 이렇게 된다
		 
		 token은 원하시는 스타일로 넣어도 되지만 안되는게 있다.
		 
		 
		 */
		
		
		
		String str11 = "홍길동-24-2001/01/13-서울시"; //문자열이 1개인 상태
		
		String splits[] = str11.split("-"); //배열로 들어가야함 0번째 홍길동 1번째 24 2번째 생년월일 3번째 서울시
		
		System.out.println("splits[0] =" + splits[0]);
		System.out.println("splits[1] =" + splits[1]);
		System.out.println("splits[2] =" + splits[2]);
		System.out.println("splits[3] =" + splits[3]);
		
		
		for(int i=0;i<splits.length;i++) {
			System.out.println("splits[" + i +"] =" + splits[i]);
		}
		
		
		
		/* "홍길동 - 24 -2001 /01/13- 서울시";
		쓸데없는 빈칸이 많을 때 replace로 빈칸을 먼저 삭제한 후 split으로 자르면 됨 
		이조합이 꽤나 쓰임
		*/
		
		//[함수] substring -> substr (사용도 높음) split이랑 비슷한 느낌 : ~문자열부터 ~문자까지 가져와라 잘라서 가져오는 느낌
		
		/*
		String substr = str11.substring(0); //문자를 다 가지고 오는 격
		System.out.println(substr);
		*/
		
		
		String substr = str11.substring(4); //문자를 다 가지고 오는 격
		System.out.println(substr);
		
		
		substr = str11.substring(4,6); //뒤는 6번째 전까지 가져와라 
		System.out.println(substr);
		
		//substring보다 split이 조금 더 쓰이지만 그래도 쓰이는 편 영역부터 영역까지 가져오는 것
		
		
		//[함수] toUpperCase 모든 문자 ->대문자
		
		//[함수] toLowerCase	 모든 문자 ->소문자
	
		String str12 ="abcAbc";
		String upstr = str12.toUpperCase();
		System.out.println("upstr = " + upstr);
		
		String lowstr = str12.toLowerCase();
		System.out.println("lowstr = " + lowstr);
		
		//오라클에서는 쓰는 편인데 자바의 경우는 이젠 잘 안쓰는 느낌
		char c ='A'; //ASCII A =65 a = 97
		
		System.out.println("c = " +c+ " " +(int)c);
		
		System.out.println("c = " +(char)(c+32));
		
		
		
		//[함수] toString ==String으로 바꿔주는 것
		
		String str13 = "안녕하세요";
		System.out.println(str13);
		System.out.println(str13.toString());
		// 해도 출력이 되고 안해도 출력이 되니까 안쓰는 경우가 많음 나중에는 또 다르게 쓰일지도 모른다
		
		//[함수] trim 공백을 없애주는 함수 (앞부분과 뒷부분)
		
		String str14 = "            java java  java   ";
		String trimStr = str14.trim();
		
		System.out.println("trimStr =" + trimStr); //앞과 뒤의 공백이 사라짐
		
		//네이버에 검색할 때 스페이스를 많이 넣어도 그게 공백이 사라지고 필요로 한 값이 나옴 
		
		//[함수] valueOf 숫자->문자열 문자열->숫자 로 변경하고 싶을 때 사용하는 함수 
	
		int num = 123;
		long lo = 1234L;
		double d = 123.4567;
		
		String snum = String.valueOf(num);
		String slo = String.valueOf(lo);
		String sd = String.valueOf(d);
	
		System.out.println(snum + " " + slo + " "+ sd);
		
		String _snum = num + ""; //이렇게만 해줘도 문자열로 바뀜 
		String _slo = slo + "";
		String _sd = sd + "";
		
		System.out.println(snum + " " + slo + " "+ sd);
		
		
		//[contain] 검색용 탐색용
		//알고리즘 프로그래머들에게 중요한 4대 알고리즘(정렬, 트리, 셔플, 탐색)
		//정렬 불특정 숫자들이 나열되어 있을 때 그걸 순서대로 정리해서 나열하는 걸 정렬
		//트리 가지를 뻗어나가는 것 처럼 
		//셔플 섞는 것
		//탐색 찾는 것 - 알고리즘을 제대로 짤 경우 시간이 짧게 걸림 
		//기술면접을 볼때는 이 네가지를 훑어보고 가는게 좋다
		
		String str15 = "서울시 강남구";
		
		boolean rb;
		rb = str15.contains("서울");
		if(rb == true) {
			System.out.println("문자열을 찾았습니다.");
		}
		else {
			System.out.println("문자열을 찾지 못했습니다.");
		}
	
		
		
		
		
		//[함수] charAt : index번호를 넣으면 문자를 돌려준다.
		
		String str16 = "가나다라마";
		
		char ch = str16.charAt(0);
			System.out.println("ch = "+ ch);
	
	
		int n1 =4;
		double n2 = 1.23;
		byte n3 = 1;
		System.out.println(n1+"\t" +n2+"\t" + n3);
		
		String numStr = String.valueOf(n1);
		String numStr1 = String.valueOf(n2);
		String numStr2 = String.valueOf(n3);
		
		System.out.println(numStr+"\t"+ numStr1+"\t" +numStr2);
		
		
	}

}
