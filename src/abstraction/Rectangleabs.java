package abstraction;

public class Rectangleabs extends Shapeabs{
	protected int breadth;

	public Rectangleabs(int length,int breadth) {
		super(length);
		this.breadth = breadth;
	}
	public  void area(){
		double areaOfRect = super.data * this.breadth;
		System.out.println("Area of rect :"+areaOfRect);
		
	}
	

}
