package mar_15;
class student {
	int rollNumber;
	String name;
	String adress;
	static String collagename="NIT";
	static String courseName="JAVA";
	public void setStudentData(int rollNumber,String name,String adress) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.adress=adress;
	}
	public void displayStudentData() {
		System.out.println("student number:"+rollNumber);
		System.out.println("name:"+name);
		System.out.println("adress:"+adress);
		System.out.println("collagName:"+collagename);
		System.out.println("course:"+courseName);
	}
	
	
	
	
}

public class Studentvariables {

	public static void main(String[] args) {
		student priya=new student();
		priya.setStudentData(201, "priya", "hyd");
		priya.displayStudentData();
		student raju=new student();
		raju.setStudentData(115, "naveen", "kammam");
		raju.displayStudentData();
		
		
		// TODO Auto-generated method stub

	}

}
