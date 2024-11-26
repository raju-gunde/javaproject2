package abstraction;
abstract class shape{
	public abstract void draw();
}
 class rectangle extends shape{
	 @Override
	public  void draw() {
		System.out.println("rectangle shape");
	}
}
 class circle extends shape{
	 @Override
	 public  void draw() {
			System.out.println("circle shape");
		} 
 }
 

public class AbstractIQ {

	public static void main(String[] args) {
		shape sh=null;
		sh=new rectangle();
		sh.draw();
		sh=new circle();
		sh.draw();
		

	}

}
