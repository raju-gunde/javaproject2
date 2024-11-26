package interfacepack;
interface Alpha{
	void m1();
}
interface Beta extends Alpha{
	void m2();
}
class Gama implements Beta{

	@Override
	public void m1() {
		System.out.println("alpha is print");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		System.out.println("beta is print");
		// TODO Auto-generated method stub
		
	}
	
}

public class ExtendingInterface {
	public static void main(String[] args) {
		Gama g=new Gama();
		g.m1();
         g.m2();
	}

}
