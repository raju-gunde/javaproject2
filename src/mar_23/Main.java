package mar_23;

public class Main {

	public static void main(String[] args) {
		Cours c1=new Cours("211", "java");
		System.out.println(c1);
		Student s1=new Student(211221,"arjunkumar" , 2, 1, 1, c1);
		System.out.println(s1);
		
	}

}
