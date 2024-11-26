package multilevelinheritance;

class student {
	protected int Studentid;
	protected String StudenName;
	protected double Studentfee;
	protected int StudentAddres;

	public student(int studentid, String studenName, double studentfee, int studentAddres) {
		super();
		Studentid = studentid;
		StudenName = studenName;
		Studentfee = studentfee;
		StudentAddres = studentAddres;
	}

}

class Science extends student {
	protected int phy, che;

	public Science(int studentid, String studenName, double studentfee, int studentAddres, int phy, int che) {
		super(studentid, studenName, studentfee, studentAddres);
		this.phy = phy;
		this.che = che;
	}

	
}
class pcm extends Science{
	protected int math;

	public pcm(int studentid, String studenName, double studentfee, int studentAddres, int phy, int che, int math) {
		super(studentid, studenName, studentfee, studentAddres, phy, che);
		this.math = math;
	}

	@Override
	public String toString() {
		return "pcm [math=" + math + ", phy=" + phy + ", che=" + che + ", Studentid=" + Studentid + ", StudenName="
				+ StudenName + ", Studentfee=" + Studentfee + ", StudentAddres=" + StudentAddres + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

public class Multilevelstudent {

	public static void main(String[] args) {
		pcm p=new pcm(1, "A", 508114, 79, 90, 90, 99);
		System.out.println(p);
		
		// TODO Auto-generated method stub

	}

}
