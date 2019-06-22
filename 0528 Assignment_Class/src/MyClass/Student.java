package MyClass;

public class Student {

	
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	int result;
	
	public int getTotal(int kor, int eng, int math) {
		
		return kor + eng + math;
	}
	public double getAverage() {
		double avg;
		avg = (double)getTotal(kor, eng, math)/3;
		
		return Math.round(avg*10)/10.0;
	}
}
