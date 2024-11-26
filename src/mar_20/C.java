package mar_20;

public class C {
	private int data=15;
	public C() {
		D d1=new D(this);
		d1.display();
		
	}
	public void show() {
		System.out.println(this.data);
		
	}

}
