package Methodoverriding;
class Superr {
	public  void m1() {
		System.out.println("super class m1 will be prpint");
	}
	
}
class Subs extends Superr{
	
	public  void m1() {
		System.out.println("super class m1 will be prpint");
	}
}

public class StaiticMethodPresence {

	public static void main(String[] args) {
		Superr s1=new Subs();
		s1.m1();
		// TODO Auto-generated method stub

	}

}
