package mar_20;

public class Student {
	private int studentId;
	private String studentName;
	private Hasarelatoincollage clg;
	public Student(int studentId, String studentName, Hasarelatoincollage clg) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", clg=" + clg + "]";
	}
	

}
