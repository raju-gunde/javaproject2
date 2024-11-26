package mar_19;
import java.util.Scanner;
class employeeraj{
	private double salary;

	public employeeraj(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [salary=" + salary + "]";
	}
	
}

public class Contsructoringetteremp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		employeeraj e1=new employeeraj(salary);
		if(e1.getSalary()<=20000) {
			System.out.println("tester");
		}
		else {
			System.out.println("developer");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
