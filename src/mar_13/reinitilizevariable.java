package mar_13;
import java.util.Scanner;
class product{
	int productid;
	String productName;
	
		public void SetProductData() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter produt id:");
			productid=sc.nextInt();
			System.out.println("product name:");
			productName=sc.nextLine();
			productName=sc.nextLine();
			sc.close();
			
		}
	public void getproductInformation() {
		System.out.println(" productid is :"+productid);
		System.out.println("product name is :"+productName);
	}
	
	
}

public class reinitilizevariable {
	public static void main(String[] args) {
		product p1=new product();
		p1.SetProductData();
		p1.getproductInformation();
		
	}

}
