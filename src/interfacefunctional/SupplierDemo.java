package interfacefunctional;
import java.util.Scanner;

import java.util.function.Supplier;
record bottle(int id,String name) {
	
}
public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<bottle> b1=()->
		{
			/*Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int i1=sc.nextInt();
			System.out.println("enter Name");
			String s1=sc.nextLine();
			String s2=sc.nextLine();*/
			int i1=111;
			String name="abc";
			bottle b=new bottle(i1, name);
			
			
			return b;
			
		};
	//	bottle bt=b1.get();
	//	System.out.println(bt);
		// TODO Auto-generated method stub
  
	
	}
}
