package Exam_apr20;
class Vecle{
	String brand;

	public Vecle(String brand) {
		super();
		this.brand = brand;
	}
	public void displayInfo() {
		System.out.println("vehicle is electrical");
		
	}
   public void drive() {
	   System.out.println("simulate is safe driving, ");
		
	}
    public void service() {
    	System.out.println("servicing is better");
	
   }
	
	
}
class car extends Vecle{
	int seats;

	public car(String brand, int seats) {
		super(brand);
		this.seats = seats;
	}
	public void drive(String seats) {
		   System.out.println(" car simulate is safe driving, "+seats);
		   
			
		}
	
}
class Truck extends Vecle{
	double loadcapasity;

	public Truck(String brand, double loadcapasity) {
		super(brand);
		this.loadcapasity = loadcapasity;
	}
	public void displayInfo() {
		System.out.println("truck is electrical");
		
	}
	 public void service() {
	    	System.out.println("truck is better");
		
	   }
	
}



public class Myprogram22 {

	public static void main(String[] args) {
		Vecle v1=new car("kia", 4);
		v1.drive();
		
		
		// TODO Auto-generated method stub

	}

}
