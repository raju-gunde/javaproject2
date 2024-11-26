package mar_20;

public class eployeeblc {
	 private double employeesalary;

	public eployeeblc(double employeesalary) {
		super();
		this.employeesalary = employeesalary;
	}

	public double getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "eployeeblc [employeesalary=" + employeesalary + "]";
	}
	 

}
