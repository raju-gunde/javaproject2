package apr_04;

public class Student {
	int Studentid;
	String name;
	double payfee;
	
	public Student(int studentid, String name, double payfee) {
		super();
		Studentid = studentid;
		this.name = name;
		this.payfee = payfee;
	}
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", name=" + name + ", payfee=" + payfee + "]";
	}
	public String displaydetails() {
		return ""+this.toString();
	}
	public double payfee() {
		return payfee;
		
	}
	
	
	
	
	

}
