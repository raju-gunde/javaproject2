package object_clasess;
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D{
	
}
public class InstanceDemo2 {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		D d1=new D();
		if(d1 instanceof Object) {
			System.out.println("work");
		}
		if(c1 instanceof Object) {
			System.out.println("work");
		}
		if(b1 instanceof Object) {
			System.out.println("work");
		}
		if(a1 instanceof Object) {
			System.out.println("work");
		}
		
	}

}
