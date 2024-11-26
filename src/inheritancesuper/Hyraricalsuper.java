package inheritancesuper;

import java.util.Scanner;

class shape {
	protected int x;

	public shape(int x) {
		this.x=x;
		System.out.println("x value is :" + x);

	}
}

class square extends shape {
	public square(int side) 
	{
		super(side);
	}

	public void getareaofsquare() 
	{
		System.out.println("area of square:" + (x*x));
	}

}

class rectangle extends shape {
	protected int breadth;

	rectangle(int l, int b) 
	{
		super(l);
		this.breadth = b;
	}

	public void getrectanlearea() {
		System.out.println("area of rectancle:" + (x*breadth));
	}
}

public class Hyraricalsuper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side of square:");
		int side = sc.nextInt();
		square ss=new square(side);
		ss.getareaofsquare();
		System.out.println("enter the length of rectacle:");
		int lenth=sc.nextInt();
		System.out.println("enter the bridth of rectanle:");
		int breadth=sc.nextInt();
		rectangle rr=new rectangle(lenth, breadth);
		rr.getrectanlearea();
		sc.close();

	}

}
