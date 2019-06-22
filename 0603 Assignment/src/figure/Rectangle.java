package figure;

public class Rectangle extends Shape {

	int width; // 폭
	int height; // 높이
	
	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(int width, int height) {
		this(new Point(0,0), width, height);
	}
	
	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
		
	}
	
	public boolean isSquare() {
		return true;
	}

	@Override
	double calcArea() {

		return (this.width * this.height);
	}
}
