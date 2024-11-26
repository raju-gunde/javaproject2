package exam_02may;


public interface Drawable {
	void getArea();

}
class Circle implements Drawable{

	@Override
	public void getArea() {
		double pi=3.14;
		double r=5;
		double area=pi*r*r;
		System.out.println(area);
		// TODO Auto-generated method stub
		
	}
	
}
class Rectangle implements Drawable{

	@Override
	public void getArea() {
		double a=10;
		double b=20;
		double area=a*b;
		System.out.println(area);
		// TODO Auto-generated method stub
		
	}
}

