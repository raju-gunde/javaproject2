package apr_17;

public class Rectangle extends GeometricShape{
	private double width;
	private double length;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		this.length=10;
		this.width=10;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double computeArea(double width, double length){
		
		return length*width;
	}
	public void show() {
	   System.out.println("width : "+width);
	   System.out.println("length : "+length);
	   System.out.println("area :"+this.computeArea(width, length));
	}
	
	
	

}
