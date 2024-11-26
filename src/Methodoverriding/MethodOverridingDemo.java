package Methodoverriding;
class animal{
	public void roam(){
		System.out.println("genric roming");
		
	}
}
class lion extends animal{
	public void roam() {
		System.out.println("loin roming");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		animal a1=new lion();
		a1.roam();
		
		
		// TODO Auto-generated method stub

	}

	
}
