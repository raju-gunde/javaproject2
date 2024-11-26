package mar_19;

public class employeebls {
	private int employeeNumber;
	private String employeeName;
	private int salary;

	public employeebls(int employeeNumber, String employeeName, int salary) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalary() {
		return salary;
	}

}
