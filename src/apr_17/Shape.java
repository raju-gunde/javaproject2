package apr_17;

public class Shape {
	
	public static Shape randshape() {
		Shape s=null;
		switch ((int)(Math.random()*3)) {//((int)Math.randome()*3)
		case 0:s=new Circle();break;
		case 1:s=new Squre();break;
		case 2:s=new Rectangl();break;
		default:System.out.println("Print as default message");break;
		}
		return s;
	}
	public void draw() {
		System.out.println("shape draw" );
	}
	public void erase() {
		System.out.println("Shape erase");
	}

}
