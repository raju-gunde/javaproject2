package sealedkeyword;
sealed class bird permits peacock,parate{
	public void fly() {
		System.out.println("bird");
			
	}
	
} 
non-sealed class peacock extends bird{
	public void fly() {
		System.out.println("peacock");
	}
}
 non-sealed class parate extends bird{
	public void fly() {
		System.out.println("parate");
	}
}
  class king extends parate{
	  public void fly() {
			System.out.println("king");
		}
  }

public class Seeleddemo1 {
	public static void main(String[] args) {
		bird b=null;
		b=new parate();b.fly();
		b=new peacock();b.fly();
		
		
	}

}
