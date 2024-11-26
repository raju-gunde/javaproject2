package abstraction;

public class Circleabs extends Shapeabs{
	final double pi=3.14;
	public Circleabs(int radios) {
		super(radios);
		
		
	}
	@Override
	public void area() 
	{
		double areaOfCircle = pi * super.data * super.data;
		System.out.println("Area of Circle is :"+areaOfCircle);
	}

}
