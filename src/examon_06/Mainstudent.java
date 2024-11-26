package examon_06;

class Student {
	private String Studentname;
	private String Studentid;
	private String StudentCollage;
	private String Studentaddress;

	public Student(String studentname, String studentid, String studentCollage, String studentaddress) {
		super();
		Studentname = studentname;
		Studentid = studentid;
		StudentCollage = studentCollage;
		Studentaddress = studentaddress;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentid() {
		return Studentid;
	}

	public void setStudentid(String studentid) {
		Studentid = studentid;
	}

	public String getStudentCollage() {
		return StudentCollage;
	}

	public void setStudentCollage(String studentCollage) {
		StudentCollage = studentCollage;
	}

	public String getStudentaddress() {
		return Studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}

	@Override
	public String toString() {
		return "Student [Studentname=" + Studentname + ", Studentid=" + Studentid + ", StudentCollage=" + StudentCollage
				+ ", Studentaddress=" + Studentaddress + "]";
	}

}

class main extends Student {

	public main(String studentname, String studentid, String studentCollage, String studentaddress) {
		super(studentname, studentid, studentCollage, studentaddress);

	}

}

public class Mainstudent {

	public static void main(String[] args) {
		main m = new main("Jack", "Jack1324", "Devine Public School", "London");
		System.out.println(m);
		// TODO Auto-generated method stub

	}

}
