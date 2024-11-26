package mar_15;


public class Compilersearching {
	static int x=100;
	int y=200;
	public void acssecs() {
		int z=300;
		System.out.println(Compilersearching.x);
		System.out.println(this.y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		Compilersearching c1=new Compilersearching();
		c1.acssecs();
		
	}
	

}
