package abstraction;
abstract class Bike{
	protected int speed;

	public Bike() {
		super();
		System.out.println("constructor will be print");
		
	}
	public void getDetails()
	{
		System.out.println("It has 2 wheels...");
	}
	public abstract void run();

	
	
}
class Royal extends Bike{

	@Override
	public void run() {
		System.out.println("royelbike is running");
	}
	
	
}

public class Abstractiqtionn {
   public static void main(String[] args) {
	  Bike b1=new Royal();
	  b1.getDetails();
	  b1.run();
	
}

}
