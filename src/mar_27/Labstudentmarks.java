package mar_27;

class Student {
	private String name;
	private String marks;
	
	public Student(String name, String marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}

class Studentgrade {
	private Student student;
	private char studentGade;

	public Studentgrade(Student student, char studentGade) {
		super();
		this.student = student;
		this.studentGade = studentGade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public char getStudentGade() {
		return studentGade;
	}

	public void setStudentGade(char studentGade) {
		this.studentGade = studentGade;
	}
	

	@Override
	public String toString() {
		return "Studentgrade [student=" + student + ", studentGade=" + studentGade + "]";
	}
	

}

class calculateStudentGrade {
	public static Studentgrade calculategrade(Student sr) {

		int marks = Integer.parseInt(sr.getMarks());
		char grade;
		
		if (marks > 90) {
			grade = 'A';
		} else if (marks >= 75) {
			grade = 'b';
		} else if (marks >= 60) {
			grade = 'c';
		} else
			grade = 'f';

		Studentgrade rs=new Studentgrade(sr, grade);
		
		return rs;
		
	}
}

public class Labstudentmarks {

	public static void main(String[] args) {
		Student studet=new Student("rahul", "99");
		System.out.println(calculateStudentGrade.calculategrade(studet));
		

	}

}
