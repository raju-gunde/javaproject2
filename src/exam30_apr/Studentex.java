package exam30_apr;

public class Studentex {
	private int id;
	private double marks;
	private String name;
	private String grade;

	public Studentex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studentex(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		
	}

public void caluclategrade() {
	if(marks>90) {
		System.out.println("A");
	}
	if(marks>80) {
		System.out.println("B");
	}
	else {
		System.out.println("F");
	}

	
}

@Override
public String toString() {
	return "Studentex [id=" + id + ", marks=" + marks + ", name=" + name + ", grade=" + grade + "]";
}



	
}
