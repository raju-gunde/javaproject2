package mar_25;

class employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
      public static employee getemployeedetails() {
    	  return new employee(123, "raj kumar", 25000);
      }
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
      
}

public class Employeelab {

	public static void main(String[] args) {
		employee e1=employee.getemployeedetails();
		System.out.println(e1);
		// TODO Auto-generated method stub

	}

}
