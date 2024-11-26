package exam_02may;

public class Testcollage {
public static void main(String[] args) {
	ScienceCollege s1=new ScienceCollege();
	HistoryCollege h1=new HistoryCollege();
	s1.getColageName("SRIRAM");
	s1.addStudents(10);
	s1.showcaseCollegeDetails("sriram collage is Strength is 10"
			);
	h1.getColageName("SRIRAM");
	h1.addStudents(9);
	h1.showcaseCollegeDetails("sriram collage is Strength is 10");
	Student s=new Student("raju", 1, "Science", "ScienceCollege");
	System.out.println(s);
	
	
	
}
}
