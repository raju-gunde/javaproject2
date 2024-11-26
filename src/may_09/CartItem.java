package may_09;

public class CartItem {

	private String name;
	private double price;
	private double quanty;

	public CartItem(String name, double price, double quanty) {
		super();
		this.name = name;
		this.price = price;
		this.quanty = quanty;
	}
	
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuanty() {
		return quanty;
	}

	public void setQuanty(double quanty) {
		this.quanty = quanty;
	}

      public double getTotalPrice() {
	  double totalprice=price*quanty;
	  return totalprice;
	  
  }
@Override
public String toString() {
	return "CartItem [name=" + name + ", price=" + price + ", quanty=" + quanty + "]";
}
  
}
