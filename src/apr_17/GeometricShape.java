package apr_17;

public class GeometricShape {
	String shapetype;
	double area;
	public GeometricShape() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public double computeArea(double value1, double value2) {
		return area;
	}
	public void show() 
	{
		System.out.println("-----rectangle details------ ");
		Rectangle r=new Rectangle();
		r.show();
		System.out.println("-----cuboid details------ ");
		Cuboid cu=new Cuboid();
		cu.show();
	}
	

}

