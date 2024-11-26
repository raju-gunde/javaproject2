package object_clasess;

import java.util.Objects;

import mar_19.Employee;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
class Empoloyew{
	private int id;
	private String name;
	public Empoloyew(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class Instaceopratordemo3 {
	public static void main(String[] args) {
		Student s1=new Student(11, "raju");
		Student s2=new Student(11, "raju");
		Empoloyew e1=new Empoloyew(11,"raju");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(e1));
		System.out.println(s1.equals(null));
	}

}
