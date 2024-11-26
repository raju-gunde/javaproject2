package mar_19;

public class Employee {

	public static void main(String[] args) {
		employeebls e1= new employeebls(121, "ABC", 60000);
		
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getEmployeeNumber());
		e1.getSalary();
	    if (e1.getSalary()>=60000)
	    {
	    	System.out.println("your designation is develepor");
	    }
	    else if (e1.getSalary()>40000)
	    {
	    	System.out.println("your designation is desiner");
	    }
	    else {
	    	System.out.println("your designation is tester");
	    }
	   
		
	}

}
/*) If salary is >=60000, Print Employee is a Developer



b) If salary is >=40000 and <60000 , Print Employee is a Designer



c) If Salary is <40000 , Print Employee is a Tester*/


