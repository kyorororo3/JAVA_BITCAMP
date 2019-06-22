package point3D;

public class Point3D {

	int x,y,z;
	
	public Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3D(){
		this(0, 0, 0);
		
	}
	
	public boolean equals(Object obj) {
							// 어떠한 값도 다 들어갈 수 있다
		Point3D p3d = (Point3D)obj;
		if(this.x == p3d.x && this.y == p3d.y && this.z == p3d.z) {
			return true;
		}
	return false;}
	
	public String toString() {  //object의 것을 over ride 
		return "x =" + x + " y = " + y + " z = " + z ;
	}
}
