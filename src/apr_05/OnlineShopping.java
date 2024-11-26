package apr_05;

class product {
	protected String name;
	protected double price;

	public product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void dispayproduct() {
		System.out.println("product [name=" + name + ", price=" + price + "]");
	}

	public void calculateTotalCost(int quantity) {
		double totalcost = price * quantity;
		System.out.println("total cos of product" + totalcost);
	}

}

class Electronics extends product {
	private String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	public void displaybrand() {
		
		System.out.println("the brand of the product is:"+this.brand);
		super.dispayproduct();
	}

}

class Clothing extends product {
	private int productsize;

	public Clothing(String name, double price, int productsize) {
		super(name, price);
		this.productsize = productsize;
	}

	public void displaysize(){
		super.dispayproduct();
		System.out.println("the size of the productis:"+this.productsize+"M");// Write Code Here
	}

}

public class OnlineShopping {

	public static void main(String[] args) {
		Electronics e1=new Electronics("FAN", 400, "BRAND");
		
		e1.displaybrand();
		e1.calculateTotalCost(3);
		Clothing cc=new Clothing("silk sariee", 5000, 40);
		//cc.dispayproduct();
		cc.displaysize();
		cc.calculateTotalCost(4);

		// TODO Auto-generated method stub

	}

}
