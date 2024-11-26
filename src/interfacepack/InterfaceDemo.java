package interfacepack;

public class InterfaceDemo {

	public static void main(String[] args) {
		Moveable c1=new Carinterface();
		c1.move();
		System.out.println("Speed of the Car is :"+Moveable.SPEED);
		// TODO Auto-generated method stub

	}

}
