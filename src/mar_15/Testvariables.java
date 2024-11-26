package mar_15;
class test{
    int x=10;
    //static int x=10;
}

public class Testvariables {
	public static void main(String[] args) {
		test t1=new test();
		test t2=new test();
		--t1.x;
		++t2.x;
		System.out.println(t1.x);
		System.out.println(t2.x);
		
	}

}
