package mar_28;

public class Rectangle {
	private int height;
	private int width;
	{
		height = 0;
		width = 0;

	}

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public double gerarea() {
	return (height*width);	
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(20, 30);
		System.out.println(r1.gerarea());
        //create an object to Rectangle class and print area and perimeter
	
	}

}
