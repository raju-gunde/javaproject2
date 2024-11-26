package mar_19;
class car
{
	private int carModel;
	private String carName;
	private String carColour;
	private int horsePower;
	public car(int carModel, String carName, String carColour, int horsePower) {
		super();
		this.carModel = carModel;
		this.carName = carName;
		this.carColour = carColour;
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "car [carModel=" + carModel + ", carName=" + carName + ", carColour=" + carColour + ", horsePower="
				+ horsePower + "]";
	}
	//it is pass one or more arguments to the constructor is colled parameterconstructor;
	
	
	
}

public class Parameterconstructor {
	public static void main(String[] args) {
		car c1=new car(2023, "mahindra thar", "orange", 1600);
		System.out.println(c1);
		
	}

}
