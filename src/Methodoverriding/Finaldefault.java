package Methodoverriding;
class R{
	final int a;
	{ 
		foo();
		a=100;
	}

public void foo() {
	System.out.println("default value of a is:"+a);
}
}

public class Finaldefault {

	public static void main(String[] args) {
		R r1=new R();
		System.out.println(r1.a);
		//r1.foo();
		// TODO Auto-generated method stub

	}

}
