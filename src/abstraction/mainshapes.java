package abstraction;

public class mainshapes {

	public static void main(String[] args) {
		Shapeabs s=null;
		
		s=new Rectangleabs(10, 20);
		s.area();
		s=new Circleabs(10);
		s.area();
		
		// TODO Auto-generated method stub

	}

}
