package object_clasess;
class foo1{

	@Override
	public String toString() {
		String str=super.toString();
		return "nit"+str;
	}
	
}

public class ToStringDemo1 {

	public static void main(String[] args) {
		foo1 f1=new foo1();
		System.out.println(f1);
		Object obj=new foo1();
		System.out.println(obj);
		// TODO Auto-generated method stub

	}

}
