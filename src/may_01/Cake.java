package may_01;

public abstract class Cake {
	private String shape;
	private String flavour;
	private int qty;
	private float price;
	protected Cake(String shape, String flavour, int qty) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.qty = qty;
		
	}
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price*qty;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	protected void showCake() {
		System.out.println("A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-");
	}
	
	

}
