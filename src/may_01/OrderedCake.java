package may_01;

public class OrderedCake extends Cake{
	private String massege;

	OrderedCake()
	{
		super("round","vanilla",1);
	    super.setPrice(400);
	}

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
		
		// TODO Auto-generated constructor stub
	}
	

	public OrderedCake(String shape, String flavour, int qty, String massege) {
		super(shape, flavour, qty);
		this.massege = "happyBirhday";
	}
	
	

	

	@Override
	public String toString() {
		return "OrderedCake [massege=" + massege + ", getShape()=" + getShape() + ", getFlavour()=" + getFlavour()
				+ ", getQty()=" + getQty() + ", getPrice()=" + getPrice() +  "]";
	}

	protected void showCake() {
		
		System.out.println("A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-" );
	}
	public static void main(String[] args) {
		Cake c1=new OrderedCake("cake","chicken",2,"happyburthday");
		c1.setPrice(400);
	c1.showCake();
		System.out.println(c1.toString());
	}
	
	
	

	
	

}
