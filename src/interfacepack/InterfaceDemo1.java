package interfacepack;

interface calculater{
	void doSum(int x, int y);
	void doSub(int x, int y);
	void doMul(int x, int y);
	
}
class Calculate implements calculater{

	@Override
	public void doSum(int x, int y) {
		int z=x+y;
		System.out.println("sum is:"+z);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSub(int x, int y) {
		int z=x-y;
		System.out.println("sub is :"+z);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doMul(int x, int y) {
		
		int z=x*y;
		System.out.println("mul is: "+z);
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		calculater c=new Calculate();
		c.doSum(1, 2);
		c.doSub(10, 5);
		c.doMul(2, 2);
		// TODO Auto-generated method stub

	}

}
