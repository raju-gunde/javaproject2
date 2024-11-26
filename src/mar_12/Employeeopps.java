package mar_12;
class Employee{
	int employeenumber;
	String name;
	public void SetEmployeeData() {
	employeenumber=111;
	name="srinu";
	
	}
	public void ShowEmployeeData() {
		System.out.println("employee number is:"+employeenumber);
		System.out.println("employee name is:"+name);
	}
	public String employeecompany() {
		System.out.println("iam working in TC company");
		return "";
	}
	public int SalaryEpmloyee(int salary) {
		return salary;
	}
		
	
}
public class Employeeopps {
	public static void main(String[] args) {
		Employee person=new Employee();
		person.SetEmployeeData();
		person.ShowEmployeeData();
		System.out.println(person.employeecompany());
		System.out.println(person.SalaryEpmloyee(34000));
		Employee person2=new Employee();
		person2.employeenumber=222;
		person2.name="charan";
		//person2.SetEmployeeData();
		person2.ShowEmployeeData();
		System.out.println(person2.employeecompany());
		System.out.println(person2.SalaryEpmloyee(39000));
		
	}

}
