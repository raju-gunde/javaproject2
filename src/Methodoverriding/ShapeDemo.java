package Methodoverriding;
class Shape{
	  protected void draw() {
		System.out.println("genric draw");
	}
}
class Rectangle extends Shape{
	@Override
      public  void draw() {
		System.out.println("rectangle draw");
	}
	
}
class Squre extends Shape{
	protected void draw() {
		System.out.println("squre draw");
	}
}


public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=null;
		s=new Rectangle();
		s.draw();
		s=new Squre();
		s.draw();

	}

}
