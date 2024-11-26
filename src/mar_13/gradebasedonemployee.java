package mar_13;
class employee{
	int employeeId;
	String employeeName;
	double salary;
	char employeegrade;
	public void setEmployeeData(int id,String name,double salarys)
	{
		employeeId=id;
		employeeName=name;
		salary=salarys;
	}
	public void getEmployeedata() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
	public void calculategrade(){
		if(salary>1000)employeegrade='a';
		else if(salary>2000)employeegrade='b';
		else employeegrade='c';
		System.out.println(employeegrade);
	}
	
	
}


public class gradebasedonemployee {
	public static void main(String[] args) {
	employee e1=new employee();	
	e1.setEmployeeData(1,"ramana",3100);
	
	e1.getEmployeedata();
	e1.calculategrade();
	}

}
