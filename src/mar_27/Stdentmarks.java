package mar_27;

class STudents {
	private String name;
	private int marks;

	public STudents(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "STudent [name=" + name + ", marks=" + marks + "]";
	}

}

class grade {
	private STudents STU;
	private char Grade;
	public grade(STudents sTU, char grade) {
		super();
		STU = sTU;
		Grade = grade;
	}
	public STudents getSTU() {
		return STU;
	}
	public void setSTU(STudents sTU) {
		STU = sTU;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "grade [STU=" + STU + ", Grade=" + Grade + "]";
	}
	
	

	
}
class calculate{
	public static char catculation(STudents st) {
		if(st.getMarks()>90) {
			return 'A';
		}
		else if(st.getMarks()>80) {
			return 'b';
		}
		else if(st.getMarks()>65) {
			return 'c';
		}
		else return 'f';
		
	}
	
}

public class Stdentmarks {

	public static void main(String[] args) {
		STudents s1=new STudents("kirak", 84);
		char c=calculate.catculation(s1);
		grade g=new grade(s1, c);
		System.out.println(g);
	
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
