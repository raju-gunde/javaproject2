package interfacelambda;
@FunctionalInterface

interface A{
	void roo(String a);
	default void rahul() {
		System.out.println("rahul print");
	}
}

public class Lambdademo1 {

	public static void main(String[] args) {
		A a1=a ->System.out.println(a);
		
		a1.rahul();
		a1.roo("ramu");
		
		// TODO Auto-generated method stub

	}

}
