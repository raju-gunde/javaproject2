package Exam_apr20;

class Employee {
	private String name;
	private String role;

	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public double calculatesalary() {
		return 0.0;
	}

}

class Managers extends Employee {
	private int basesalary;
	private int bonas;

	public Managers(String name, String role, int basesalary, int bonas) {
		super(name, role);
		this.basesalary = basesalary;
		this.bonas = bonas;
	}

	public int getBasesalary() {
		return basesalary;
	}

	public int getBonas() {
		return bonas;
	}

	public double calculatesalary() {
		double totalsalary = basesalary + bonas;
		return totalsalary;

	}}

class Programer extends Employee{
	private double baseSalary;
	private double overtimePay;
	public Programer(String name, String role, double baseSalary, double overtimePay) {
		super(name, role);
		this.baseSalary = baseSalary;
		this.overtimePay = overtimePay;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public double getOvertimePay() {
		return overtimePay;
	}
	public double calculatesalary() {
		double totalsalary = baseSalary + overtimePay;
		return totalsalary;

	}
	
}

	public class Myprogram11 {

		public static void main(String[] args) {
			Employee e1=new Managers("raju", "manager", 3900, 300);
			System.out.println(e1.getName());
			System.out.println(e1.getRole());
			System.out.println(e1.calculatesalary());
			Employee e2=new Managers("arjun", "programer", 3000, 4000);
			System.out.println(e2.getName());
			System.out.println(e2.getRole());
			System.out.println(e2.calculatesalary());
			// TODO Auto-generated method stub

		}

}
