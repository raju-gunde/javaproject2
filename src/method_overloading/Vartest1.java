package method_overloading;
class test2{
	public void acceptdata(int... values) {
		int res=0;
		for(int value:values)
		 {
			 res = res+value;
		 }
		 System.out.println("Sum is parameter is :"+res);
		   
		
	}
}

public class Vartest1 {
	public static void main(String[] args) {
		test2 t1=new test2();
		t1.acceptdata();
		t1.acceptdata(1,2);
		t1.acceptdata(1,2,3);
	}

}
