package interfacepack;
abstract class arjun{
	public abstract void raj();
}
public class AnonymousDemo2 {

	public static void main(String[] args) {
		arjun a1=new arjun() {
			
			@Override
			public void raj() {
				System.out.println("raaj is print");
				// TODO Auto-generated method stub
				
			}
		};
		a1.raj();
		// TODO Auto-generated method stub

	}

}
