package mar_21;

class name {
	int productId;
	String productname;

	@Override
	public String toString() {
		return "name [productId=" + productId + ", productname=" + productname + "]";
	}
	//becous this is a non parametirised constructor so ot is taking ontime value only
	//so defalt constructor will be add by the compailar;

}

public class Product {

	public static void main(String[] args) {
		name n1=new name();
		n1.productId=123;
		n1.productname="mobile";
		System.out.println(n1);
		n1=new name();
		//becous this is a non parametirised constructor so ot is taking ontime value only
		//so defalt constructor will be add by the compailar;
		
		System.out.println(n1);
		name n2=n1;
		n2.productId=111;
		n2.productname="arjun";
		System.out.println(n2);
		// TODO Auto-generated method stub

	}

}
