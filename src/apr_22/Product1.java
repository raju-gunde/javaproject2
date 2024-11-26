package apr_22;

public class Product1 {
	private int id;
	private String name;
	
	public Product1(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		Product1 p2=(Product1) obj;//
		if(this.id==p2.id&&this.name.equals(p2.name)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Product1 p1=new Product1(123, "bat");
		Product1 p2=new Product1(123, "bat");
		
		System.out.println(p1.equals(p2));
		// TODO Auto-generated method stub

	}

}
