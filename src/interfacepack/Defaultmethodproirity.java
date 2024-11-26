package interfacepack;
interface R{
	default void r() {
		System.out.println(" default is ravi");
	}
}
class Q{
	public void r() {
		System.out.println(" concrete is raju");
	}
}
class S extends Q implements R{
	
	
}

public class Defaultmethodproirity {

	public static void main(String[] args) {
		S c=new S();
		c.r();
		
		// TODO Auto-generated method stub

	}

}
