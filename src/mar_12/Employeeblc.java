package mar_12;

public class Employeeblc {
	int eid;
	String name;
	double salary;
	public void setEmployeedata() {
		eid=1;
		name="arjunkumar";
		salary=3400;
	}
	public void getEmployeeInformation() {
		System.out.println("employee:"+eid);
		System.err.println("employee:"+name);
		System.out.println("employee :"+salary);
	}

}
