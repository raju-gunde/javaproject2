package mar_11;
class student {
public static String getStudentDetails(int roll,String name,double fee) {
	return ""+roll+"-- "+name +"-- " +fee;
}
}

public class Sringblc {

	public static void main(String[] args) {
		String details=student.getStudentDetails(2 , "ramana" ,  72727);
		System.out.println("sudent details:" +details);
		
		// TODO Auto-generated method stub

	}

}
