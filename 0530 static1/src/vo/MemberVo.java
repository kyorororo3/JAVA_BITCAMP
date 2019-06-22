package vo;
	//VO ==Value Object 값에 의한 오브젝트
public class MemberVo {
	
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//확인용 함수 String을 리턴값으로 가짐. 제일 많이 쓰는 함수 
	@Override
	public String toString() {
		return "MemberVo [age=" + age + ", name=" + name + "]";
	}
	
	
}
