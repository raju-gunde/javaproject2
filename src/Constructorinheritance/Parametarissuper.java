package Constructorinheritance;
class alpha{
	public alpha(int x) {
		//super();
		System.out.println("superclass alpha:"+x);
		
	}
}
class beta extends alpha{
	public beta() {
		super(10);
		System.out.println("subclass beta connstructor..");
	}
}

public class Parametarissuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new beta();

	}

}
