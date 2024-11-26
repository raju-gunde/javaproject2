package mar_21;

class employeee1 {
	private int employeeId;
	private String emoloyeeName;

	public employeee1(int employeeId, String emoloyeeName) {
		super();
		this.employeeId = employeeId;
		this.emoloyeeName = emoloyeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmoloyeeName() {
		return emoloyeeName;
	}
 }

class manager {
	private int managerId;
	private String name;
	public manager(employeee1 emp) {
		this.managerId=emp.getEmployeeId();
		this.name=emp.getEmoloyeeName();
		
		
	}
	
	@Override
	public String toString() {
		return "manager [managerId=" + managerId + ", name=" + name + "]";
	}

	

}

public class Main {
	public static void main(String[] args) {
		employeee1 e1=new employeee1(18, "virat");
		manager m1=new manager(e1);
		System.out.println(m1);
		

	}

}
