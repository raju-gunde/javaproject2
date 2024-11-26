package may_09;

public class ShoppingCart {
	private CartItem item;

	public ShoppingCart(CartItem item) {
		super();
		this.item = item;
	}

	public CartItem getItem() {
		return item;
	}

	public void setItem(CartItem item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}
	

}
