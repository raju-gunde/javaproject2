package instanceblockprograms;
class instance{
	int x=100;
	public instance(){ 
		x=30;
		System.out.println(this.x);{
			x=20;
			System.out.println(20);
			System.out.println(this.x);
		}
	}
	{
		x=200;
		System.out.println(this.x);
	}
	{
		x=2;
		System.out.println(x);
	}
	
}

public class Demo4 {
	public static void main(String[] args) {
		instance c1=new instance();
		System.out.println(c1.x);
	}

}
