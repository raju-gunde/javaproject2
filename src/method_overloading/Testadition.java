package method_overloading;
class adition{
	public adition(int a,int b) {
		System.out.println("sum of two integer"+(a+b));
	}
	public adition(int a,int b,int c) {
		System.out.println("sum of three integers"+(a+b+c));
	}
	public adition(float x, float y)
	   {	  
		   System.out.println("Sum of two float is :"+(x+y));
	   }
	
}

public class Testadition {

	public static void main(String[] args) {
		new adition(2.3f, 3.4f);
		new adition(2, 4);
		new adition(2, 3,5);
		// TODO Auto-generated method stub

	}

}
