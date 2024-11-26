package mar_23;

class Vehicle {
	private String brand;
	private int model;
	private int year;

	public Vehicle(String brand, int model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public static Vehicle getvehicledetails() {
		return new Vehicle("tata", 2022, 2024);

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

}

public class Vehicleehicledetails {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("tata", 201, 2021);
		System.out.println(v1);
	}
	

}
