package mar_28;

public class Car {
	private String make;
	private String model;
	private int year;
	{
		make=null;
		model=null;
		year=0;
		
	}
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getDescription() {
		return "malke:"+make+"model is:"+model+"year is released:"+year;
	}
	public static void main(String[] args) {
		Car c1=new Car("benz", "superpower", 2024);
		System.out.println(c1.getDescription());
	}
	

}
