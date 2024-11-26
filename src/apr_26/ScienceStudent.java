package apr_26;

public class ScienceStudent extends Studentabstract{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super("rahul","9");
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	@Override
	public  int getPercentage() {
		return (physicsMarks+chemistryMarks+mathsMarks)/3;
	}



	@Override
	public String toString() {
		return ""+super.toString()+"ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + "]";
	}

}
