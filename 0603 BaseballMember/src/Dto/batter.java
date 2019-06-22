package Dto;

public class batter extends Human{

	int bat;
	int hit;
    double hitAvg;
	
	
	
	public batter() {
		super();
	}
	
	public batter(int number, String name, int age, double height, int bat, int hit, double hitAvg) {
		super(number, name, age, height);
		this.bat = bat;
		this.hit = hit;
		this.hitAvg = hitAvg;

		
	}

	public int getBat() {
		return bat;
	}

	public void setBat(int bat) {
		this.bat = bat;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}
	

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ number = " + number + " , name = " + name + 
				" , age = " + age + ", height = " + height + 
				" , bat = " + bat + " , hit = " + hit + " , hitAvg = " + hitAvg +"]";
		}
}
