package has_relation;
import java.util.Scanner;

class Student {
	private int Studentid;
	private String StudentName;

	public Student(int studentid, String studentName) {
		super();
		Studentid = studentid;
		StudentName = studentName;
	}

	public int getStudentid() {
		return Studentid;
	}

	public void setStudentid(int studentid) {
		Studentid = studentid;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", StudentName=" + StudentName + "]";
	}

}

class faculty {
	public static void viewStudentprofile(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("snter student reg:");
		int reg=sc.nextInt();
		if(reg==s.getStudentid()) 
		{
			System.out.println(s);
		}
		else {
			System.err.println("student is not available:");
		}
		sc.close();

	}
}

public class Assosiation {

	public static void main(String[] args) {
	Student s1=new Student(897, "rahul");
	faculty.viewStudentprofile(s1);
	
		// TODO Auto-generated method stub

	}

}
