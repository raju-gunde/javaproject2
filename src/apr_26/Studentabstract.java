package apr_26;

public abstract class Studentabstract {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents=75;
	
	public abstract int getPercentage();
	
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
		
	}
	public Studentabstract() {
		super(); 
		//studentName
		// TODO Auto-generated constructor stub
	}
	public Studentabstract(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "Studentabstract [studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	

}
