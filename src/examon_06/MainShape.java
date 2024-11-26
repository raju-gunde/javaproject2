package examon_06;

class Rectangle {
	private int Length;
	private int Width;

	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public void getrectangle() {
		 double area;
		 area=Length*Width;
		 System.out.println("area of rectangle:"+area);
		 
	}

}

class Square extends Rectangle {
	private double side;

	public Square(int length, int width, double side) {
		super(length, width);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	public void getSquare() {
		double area;
		area=this.side*this.side;
		System.out.println("area of suare:"+area);
		
		
	}

}

public class MainShape {

	public static void main(String[] args) {
		
		Square ss=new Square(2, 3, 4);
		ss.getSquare();
		ss.getrectangle();
		
	}

}
