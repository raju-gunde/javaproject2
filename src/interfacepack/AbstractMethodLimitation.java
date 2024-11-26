package interfacepack;
interface Vehicle{
	void run();
	void horn();
	default void digitalMeter() {
		System.out.println("degital meter");
	}
}
class Car implements Vehicle{

	@Override
	public void run() {
		System.out.println("car is runnimg");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void horn() {
		System.out.println("peep peep");
		// TODO Auto-generated method stub
		
	}
	 public void digitalMeter() {
		System.out.println("Car having a degital meter");
	}
	
}
class Bike implements  Vehicle{

	@Override
	public void run() {
		System.out.println("bike is running");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void horn() {
		System.out.println("poop poop");
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractMethodLimitation {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.run();
		c1.horn();
		c1.digitalMeter();
		Bike b1=new Bike();
		b1.run();
		b1.horn();
		// TODO Auto-generated method stub

	}

}
