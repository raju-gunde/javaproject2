package exam_02may;

public class Student {
	String name;
	int id;
	String course;
	String collagename;
	public Student(String name, int id, String course, String collagename) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.collagename = collagename;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + ", collagename=" + collagename + "]";
	}
	

}
