package dto;

//public void method(Human human) {} 이렇게 받는 경우가 생기는데 기본 생성자가 없을 경우 이게 에러가 남
public class Human {

	private int number;
	private String name;
	private int age;
	private double height;
	
	public Human() {
		
	}

	public Human(int number, String name, int age, double height) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return number + "-" + name + "-" + age + "-" + height;
	}
	
	
}
