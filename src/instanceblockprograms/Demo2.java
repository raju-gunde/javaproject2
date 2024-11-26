package instanceblockprograms;
class demo{
	int x=100;
	{
		System.out.println("x value is by instance block:"+this.x);
		x=200;
		System.out.println("x value by instance block"+this.x);
	}
	demo(){
		x=300;
		System.out.println("the value of non argumet:"+this.x);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		demo d1=new demo();
		// TODO Auto-generated method stub

	}

}
