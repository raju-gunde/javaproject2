package mar_21;

class companyName {
	private String name;
	private String companaylocation;

	public companyName(String name, String companaylocation) {
		super();
		this.name = name;
		this.companaylocation = companaylocation;
	}

	@Override
	public String toString() {
		return "companyName [name=" + name + ", companaylocation=" + companaylocation + "]";
	}

}

class Employee {
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	private companyName company;

	public Employee(int employeeNumber, String employeeName, double employeeSalary, companyName company) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", company=" + company + "]";
	}

}

public class Company {

	public static void main(String[] args) {
		companyName c1=new companyName("tcs", "hyd");
		System.out.println(c1);
		Employee e1=new Employee(115, "raju", 70000, c1);
		System.out.println(e1);
		
		
		// TODO Auto-generated method stub

	}

}
