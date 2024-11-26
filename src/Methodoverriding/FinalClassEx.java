package Methodoverriding;


 final class Apple{
	private int data=100;
	public void setdata( int data) {
		this.data=data;
		System.out.println(this.data);
	System.out.println("Data value is :"+data);
	}
}

public class FinalClassEx { 

	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.setdata(100);
		// TODO Auto-generated method stub

	}

}
