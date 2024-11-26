package method_overloading;
class sum {
	public int add(int a,int b) {
		int z=a+b;
		return z;
		
	}
	public String add(String x,String y) {
		String z=x+y;
	  return z;
	}
	public double add(double x, double y)
	  {
		  double z = x+y;
		  return z;
	  }
	
}

public class Test3 {

	public static void main(String[] args) {
		sum s1=new sum();
        String add = s1.add("Data", "base");
		
		int x = s1.add(12, 12);
		
		double y = s1.add(12.89, 12.90);
		
		
		System.out.println(add+" : "+x+" : "+y);
		// TODO Auto-generated method stub

	}

}
