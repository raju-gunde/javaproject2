package apr_04;

public class Mainstudent {

	public static void main(String[] args) {
		Student ss=new Student(1, "John Smith", 25000);
	     System.out.println(ss.displaydetails());
	     
	     DayScholar dd=new DayScholar(2, "Brian Lara", 25000, 5000);
	     System.out.println(dd.displaydetails());
	 dd.payFee(18000);
	     Hosteller hh=new Hosteller(3, "Virat Kohli", 25000, 8000);
	     System.out.println(hh.displaydetails());
	    hh.payFee(33100);
	     

				
	}

}