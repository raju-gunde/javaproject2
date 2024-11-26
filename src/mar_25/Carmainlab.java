package mar_25;

class Driver {
	private String name;
	private int age;

	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "driver [name=" + name + ", age=" + age + "]";
	}

}

class Car {
	private String brand;
	private String model;
	private int year;
	private Driver driver;

	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	public Car(Car c) {
		this.brand = c.brand;
		this.model = c.model;
		this.year = c.year;
		this.driver = c.driver;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void changeDriver(Driver driver) {
		this.driver=driver;
		

	}


	@Override
	public String toString() {
		return "car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}

}

public class Carmainlab {

	public static void main(String[] args) {
		Driver d1=new Driver("ramraj", 20);
		Car car=new Car("benz", "superpower", 2024, d1);
		Car newCar = new Car(car);
		System.out.println(car);
		System.out.println(newCar);
		Driver d2 = new Driver("Harish",32);
		newCar.changeDriver(d2);
		System.out.println(car);
		System.out.println(newCar);
	}

}
