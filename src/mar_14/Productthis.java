package mar_14;
class product {
	int productId;
	String productName;
	public void setproductData(int productId,String productName) {
		this.productId=productId;
		this.productName=productName;
//if we dot't use this wordthe value is 0 and null thats why we are menstion this key word
	
	}
	public void getproductData()
	{
		System.out.println("your product id:"+productId);
		System.out.println("your prduct name is:"+productName);
	}
}

public class Productthis {
	public static void main(String[] args) {
		product p1=new product();
		p1.setproductData(231, "ramraj");
		p1.getproductData();
		
		
	}

}
