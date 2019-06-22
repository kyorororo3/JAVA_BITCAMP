package figure;

public abstract class Shape {

	Point p;  //클래스 안에서 클래스 선언 composition
	public Shape(){
		this(new Point(0,0));
	}
	
	public Shape(Point p){   //Shape(new Point)(23,45));
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}
