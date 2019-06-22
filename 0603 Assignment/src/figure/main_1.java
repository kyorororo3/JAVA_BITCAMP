package figure;

public class main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape[] = new Shape[3];
		
		shape[0] = new Rectangle(6,4);
		shape[1] = new Circle(25,30,3);
		shape[2] = new Circle(15,32,6);
		
		for (int i = 0; i < shape.length; i++) {
			System.out.println("넓이 : "+ shape[i].calcArea());
		}
	}

}
