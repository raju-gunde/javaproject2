package mar_21;

class Order {
	private int orderId;
	private String itemName;
	private double itemPrice;

	public Order(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}

}

class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;

	public Customer(int customerId, String customerName, String customerAddress, Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;

	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", order=" + order + "]";
	}
}

public class Zomato {

	public static void main(String[] args) {
		Order o1=new Order(115, "biryani", 200);
		Customer c1=new Customer(213, "surya arjun", "hyd-ameerpet", o1);
		System.out.println(c1);
		
		
		

	}

}
