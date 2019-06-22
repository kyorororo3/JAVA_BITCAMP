import java.util.Calendar;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 Calendar, Date
		 
		  
		 */
		
	//	Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance(); 	//이거를 더 자주 쓰는 편 
			//getInstance면 현재의 시간으로 오게 되는 것. 시스템에서 넘어오는 시간
		//왜 필요한건가요?
		//일정관리 = 예약시스템 (병원, 숙박시스템에서 자주 쓰임)
		
		//날짜 취득 == getter
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0~11의 범위
		int day = cal.get(Calendar.DATE); //
		
		System.out.println(year +"년 "+ month +"월 " + day + "일");
	
	
		//날짜 설정 == setter
	//	cal.set(Calendar.YEAR, 2020);
	//	cal.set(Calendar.MONTH, 2-1); //0~11
	//	cal.set(Calendar.DATE, 27);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1; //0~11 
		day = cal.get(Calendar.DATE); 
		
		System.out.println(year +"년 "+ month +"월 " + day + "일");
		
		
		//오전 오후
		String ampm = cal.get(Calendar.AM_PM) == 0? "오전":"오후";
		
		//오전은 0, 오후는 1
		System.out.println("ampm =" + ampm +cal.get(Calendar.AM_PM));
		
		//요일
		int weekday =cal.get(Calendar.DAY_OF_WEEK); //1~7 일월화수목금토
		
		System.out.println("weekday = " + weekday);
		
		switch(weekday) {
		case 1:
			System.out.println("일요일입니다.");
			break;
		case 2:
			System.out.println("월요일입니다.");
			break;
		case 3:
			System.out.println("화요일입니다.");
			break;
		case 4:
			System.out.println("수요일입니다.");
			break;
		case 5:
			System.out.println("목요일입니다.");
			break;
		case 6:
			System.out.println("금요일입니다.");
			break;
		case 7:
			System.out.println("토요일입니다.");
			break;
		}
		
		cal.set(Calendar.MONTH, 5 -1);
		
		// 지정한 달의 마지막날짜를 취득하는 방법(31,30,29,28)
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday :" + lastday);
		//이번 달 마지막 날짜
		
		
		// 연월일을 설정하면, 달력의 빈칸이 몇개 있는지 취득
		year = 2020;
		month = 2;
		day = 1;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //0~11
		cal.set(Calendar.DATE, day);
	
		weekday = cal.get(Calendar.DAY_OF_WEEK); // 요일을 구한다
		int _day = (weekday -1) % 7;		//달력의 빈칸
		System.out.println("위쪽의 빈칸은 " + _day + " 칸입니다.");
		
		//달력의 밑쪽 빈칸을 구하기 위한 것
		//마지막 날짜 
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE , lastday);
		
		//요일
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("weekday =" + weekday);
		
		int _lastday = 7 - weekday;
		System.out.println(month + "월의 밑의 공간은" + _lastday + "입니다." );
		
		/*
		 * * * 1  2  3  4
		 5 6 7 8 9 10 11
		 
  		 */
		
		
		
		
	}

}
