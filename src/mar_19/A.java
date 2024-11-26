package mar_19;

public class A {

	private int data = 15;
	
	public A()
	{
		B b=new B(this);
		b.display();
	}
	public void show()
	{
		
		System.out.println(this.data);
	}
}
