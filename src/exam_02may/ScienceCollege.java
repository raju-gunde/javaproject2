package exam_02may;

public class ScienceCollege  implements Collage{

	@Override
	public void getColageName(String name) {
		System.out.println(name);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStudents(double add) {
		if(add>10) {
			System.err.println("Print a message if the college is full");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showcaseCollegeDetails(String details) {
		System.out.println(details);
		// TODO Auto-generated method stub
		
	}

}
