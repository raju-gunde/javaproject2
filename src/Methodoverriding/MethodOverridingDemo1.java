package Methodoverriding;
class bird{
	public void fly()
	{
		System.out.println("bird is flying");
	}
}
class Peacock extends bird{
	public void fly()
	{
		
		System.out.println("peacock is flying");
	}
}
class Parrot extends bird
{
	public void fly()
	{
		System.out.println("Parrot Bird is flying...");
	}	
}

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		bird b=null;
		b=new Peacock();b.fly();
		b=new Parrot();
		b.fly();
		// TODO Auto-generated method stub

	}

}
