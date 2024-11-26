package apr_17;

public class Cuboid extends  Rectangle{
	private double height;
    public Cuboid()
    {
    	this.height=15;
    }
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double computeArea(double width, double length,double height){
		
		return width*length*height;
	}
	
	public void show()
	{
		
	   System.out.println("width : "+super.getWidth());
	   System.out.println("length : "+super.getLength());
		System.out.println("heigth : "+this.height);
		System.out.println(this.computeArea(super.getWidth(),super.getLength(),height));
	}

}
