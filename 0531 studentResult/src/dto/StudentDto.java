package dto;

//Data Transfer Object -> 생활기록부가 있었을 때 거기서 개별 데이터
public class StudentDto {

	private int number;
	private String name;
	private int lang;
	private int eng;
	private int math;
	
	
	public StudentDto() {
		
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLang() {
		return lang;
	}


	public void setLang(int lang) {
		this.lang = lang;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public StudentDto(int number, String name, int lang, int eng, int math) {
		
		this.number = number;
		this.name = name;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() { //확인용
		return "StudentDto [number=" + number + ", name=" + name + ", lang=" + lang + ", eng=" + eng + ", math=" + math
				+ "]";
	}

}
