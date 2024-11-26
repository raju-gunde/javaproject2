package mar_23;

public class Cours {
	private String courseCode;
	private String courseName;

	public Cours(String courseCode, String courseName) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	@Override
	public String toString() {
		return "Cours [courseCode=" + courseCode + ", courseName=" + courseName + "]";
	}
	

}
