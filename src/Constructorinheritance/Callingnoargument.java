package Constructorinheritance;
class A{
	public A(){
		System.out.println("class A");
		
	}
}
class B extends A{
	public B() {
		System.out.println("class -B");
	}
}
public class Callingnoargument {

	public static void main(String[] args) {
		new B();
		// TODO Auto-generated method stub

	}

}
