package method_overloading;
class Addition{
	public Addition(int x, int y)
	   {	  
		   System.out.println("Sum of two integer is :"+(x+y));
	   }
	   
	   public Addition(int x, int y, int z)
	   {
		   this(100,200);
		   System.out.println("Sum of three integer is :"+(x+y+z));
	   }
	   
	   public Addition(float x, float y)
	   {	
		   this(10,20,30);
		   System.out.println("Sum of two float is :"+(x+y));
	   }
}

public class Testadition1 {

	public static void main(String[] args) {
		Addition a1=new Addition(2.3f, 3.4f);
		// TODO Auto-generated method stub

	}

}
