package mar_20;

import java.util.Scanner;

public class Employeeelc {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter your number");
		double salary=sc.nextDouble();
		eployeeblc e1=new eployeeblc(salary);
		if(e1.getEmployeesalary()<=2000) {
			System.out.println("employee is tester");
			
		}
		else if(e1.getEmployeesalary()<=4000) {
			System.out.println("employee is desiner");
			
		}
		else {
			System.out.println("employee is developer");
		}
		sc.close();
	}

}
