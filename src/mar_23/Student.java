package mar_23;

public class Student {
	private int enrollmentNumber;
	private String studentName;
	private int grade1;
	private int grade2;
	private int grade3;
	private Cours cr;

	public Student(int enrollmentNumber, String studentName, int grade1, int grade2, int grade3, Cours cr) {
		super();
		this.enrollmentNumber = enrollmentNumber;
		this.studentName = studentName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.cr = cr;
	}

	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(int enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

	public Cours getCr() {
		return cr;
	}

	public void setCr(Cours cr) {
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "Student [enrollmentNumber=" + enrollmentNumber + ", studentName=" + studentName + ", grade1=" + grade1
				+ ", grade2=" + grade2 + ", grade3=" + grade3 + ", cr=" + cr + "]";
	}
	
	

}
