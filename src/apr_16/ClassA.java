package apr_16;

class ClassB
{
	public void m1()
	{
		System.out.println("parent class");
	}
}
public class ClassA extends ClassB
{
	@Override
	public void m1()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		ClassB b=new ClassA();
		b.m1();
	}
}
