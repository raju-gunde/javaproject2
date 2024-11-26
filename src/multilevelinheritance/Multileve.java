package multilevelinheritance;
class grandfathe{
	public void land() {
		System.out.println("2 acres land");
	}
}
class father extends grandfathe{
	public void house() {
		System.out.println("2 BHK flat");
	}
	
}
class son extends father{
	public void car() {
		System.out.println("audi car");
	}
}

public class Multileve {

	public static void main(String[] args) {
		son s1=new son();
		s1.car();
		s1.land();
		s1.house();
		// TODO Auto-generated method stub

	}

}
