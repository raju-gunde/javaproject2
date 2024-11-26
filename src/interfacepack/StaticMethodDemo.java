package interfacepack;
interface drawable{
	static void draw() {
		System.out.println("drawing ");
	}
	
}

public class StaticMethodDemo implements drawable{

	public static void main(String[] args) {
		drawable.draw();
		
		// TODO Auto-generated method stub

	}

}
