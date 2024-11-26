package sealedkeyword;


sealed class OnlineClasses permits laptop,mobile{
	public void demo() {
		System.out.println("nareshit online");
	}
	
}
non-sealed class laptop extends OnlineClasses{
	public void demo() {
		System.out.println("nareshit classes on laptop");
	}
}

final class mobile extends OnlineClasses{
	public void demo() {
		System.out.println("nareshit classes on mobile");
	}
	
}


public class Sealeddemo2 {

	public static void main(String[] args) {
		OnlineClasses oc1=new OnlineClasses();
		oc1.demo();
		oc1=new laptop();
		oc1.demo();
		oc1=new mobile();
		oc1.demo();
				
		// TODO Auto-generated method stub

	}

}
