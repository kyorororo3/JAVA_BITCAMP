package Dto;

public abstract class Human {

	
	
	int number;
	String name;
	int age;
	double height;
	
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


	public String toString() {
		
		return super.toString();
	}

	
	
	
}
