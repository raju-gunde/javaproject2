package apr_26;

public class StudentTester {

	public static void main(String[] args) {
		Studentabstract sa1=null;
		System.out.println("total number of students"+Studentabstract.getTotalNoStudents());
		sa1=new ScienceStudent(90, 40, 40);
		//System.out.println("total number of students"+sa1.getTotalNoStudents());
		System.out.println(sa1.getPercentage());
		System.out.println(sa1.toString());
		sa1=new HistoryStudent(90, 90);
		System.out.println(sa1.getPercentage());
		System.out.println(sa1.toString());

	}

}

