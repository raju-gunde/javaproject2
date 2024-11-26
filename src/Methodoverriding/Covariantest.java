package Methodoverriding;

class Alpha
{
}
class Beta extends Alpha
{
	
}


class Super {

	public Alpha show() {
		System.out.println("\"Super class Show Method\"");
        return new Alpha();
	}
}
class Sub extends Super{
	public Beta show() {
		System.out.println("\"Sub class Show Method\"");
		return new Beta();
	}
}


public class Covariantest {

	public static void main(String[] args) {
		Super s=new Sub();
		s.show();
		
		// TODO Auto-generated method stub

	}

}
