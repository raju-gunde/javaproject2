package Methodoverriding;
class Rbi{
	public void loan() {
		System.out.println("bank should provide loan");
	}
}
 class Sbi extends Rbi{
	 @Override
	 public void loan() {
		 System.out.println("sbi should provide 9.7$% loan rate");
	 }
	 
 }
 class Bob extends Rbi{
	 public void loan() {
		 System.out.println("bob is provide 11.7$% loan at rate");
	 }
 }

public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Rbi r=null;
		r=new Sbi();
		r.loan();
		r=new Bob();
		r.loan();
		// TODO Auto-generated method stub

	}

}
