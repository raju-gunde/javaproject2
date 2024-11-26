package apr_08;

class Circle {
	double radios;

	public Circle() {
		this.radios=0.0;
		// TODO Auto-generated constructor stub
	}

	public Circle(double radios) {
		super();
		this.radios = radios;
	}

	public double getArea() {

		return 3.14*radios*radios;
	}

}
class Cylinder extends Circle{
	double height;

	public Cylinder() {
		super();
	}

	public Cylinder(double radios, double height) {
		super(radios);
		this.height = height;
	}
	
	public double getVolume() {
		if(height <0) {
			return -1;
		}else {
			return 3.14*radios*radios*height;
		}
	}

	
	
}

public class ShapeTester {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder();
		System.out.println(c1.getVolume());
		System.out.println(c1.getArea());
		Cylinder c2=new Cylinder(4,6);
		System.out.println(c2.getArea());
		System.out.println(c2.getVolume());
		c2.getClass();
		// TODO Auto-generated method stub

	}

}
