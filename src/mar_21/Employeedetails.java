package mar_21;

class Address {
	private String cityName;
	private String districtName;
	private String stateName;

	public Address(String cityName, String districtName, String stateName) {
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Ardess [cityName=" + cityName + ", districtName=" + districtName + ", stateName=" + stateName + "]";
	}
}

class Emloyee {
	private int empId;
	private String empName;
	private Address address;

	public Emloyee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emloyee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

}

public class Employeedetails {
	public static void main(String[] args) {
		Address a1=new Address("chutyal", "nalgonda", "telangana");
		System.out.println(a1);
		Emloyee e1=new Emloyee(105, "arjunram", a1);
		System.out.println(e1);
		

	}

}
