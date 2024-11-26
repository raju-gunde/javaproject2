package apr_16;

public class AreaOfASquareAndRectangle {
	public double area(double side) {
		return side*side;
		
	}
	public double area(double length,double breadth) {
		return length*breadth;
	}
	public static void main(String[] args) {
		AreaOfASquareAndRectangle a1=new AreaOfASquareAndRectangle();
		System.out.println("area of squre="+a1.area(2.3));
		System.out.println("area of rectangle="+a1.area(+2.3, 3.3));
	}

}
