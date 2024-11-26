package mar_25;

class Employe {
	private String name;
	private int age;
	private double salary;
	private String department;

	public Employe(String name, int age, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public Employe(Employe p1) {
		this.name = p1.name;
		this.age = p1.age;
		this.salary = p1.salary;
		this.department = p1.department;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void raicesalary(double persantage) {
		this.setSalary(salary + (salary * persantage));
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}

}

public class Maindetails {

	public static void main(String[] args) {
	
	Employe e1=new Employe("raju", 20, 5000, "manager");
	e1.raicesalary(0.20);
	System.out.println(e1);
	}

}
