package mar_24;

import java.time.LocalDate;
import java.util.Scanner;

class juice {
	private String juiceName;
	private int price;
	private LocalDate date;

	public juice(String juiceName, int price, LocalDate date) {
		super();
		this.juiceName = juiceName;
		this.price = price;
		this.date = date;
	}

	public static juice getdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter juice name");
		String name = sc.nextLine();
		System.out.println("enter price");
		int price = sc.nextInt();
		LocalDate date = LocalDate.now();
		return new juice(name, price, date);

	}

	@Override
	public String toString() {
		return "juice [juiceName=" + juiceName + ", price=" + price + ", date=" + date + "]";
	}

	

}

public class Juicemain {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter count");
		int number=sc.nextInt();
		for(int i=0;i<number;i++) 
		{
			juice j1=juice.getdetails();
			System.out.println(j1);
		}
		
		// TODO Auto-generated method stub
	}
	

}
