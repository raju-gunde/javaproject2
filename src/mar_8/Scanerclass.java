package mar_8;

public class Scanerclass {
	public static void main(String[] args) {
	   
		System.out.println("main method started");
		m1();
		System.out.println("main method ended");
		
	}
	public static void m1()
	{
		System.out.println("m1 method is started");
		 m2();
		 System.out.println("m1 method will be exicuted");
	}
	public static void m2()
	{
		int x=100;
		System.out.println("m2 method"+x);
	}
}
