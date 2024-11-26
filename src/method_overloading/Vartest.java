package method_overloading;
class test{
	public void input(int... x) {
		System.out.println("Var args executed");
		
	}
}

public class Vartest {

	public static void main(String ...x) {
		test t1=new test();
		t1.input(1);
		t1.input(1,2);
		t1.input(1,2,3);
		// TODO Auto-generated method stub

	}

}
