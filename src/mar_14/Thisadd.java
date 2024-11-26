package mar_14;
class add{
	int result;
	public int dosum( int x,int y)
	{
		this.result=x+y;
		return result;
	}
}

public class Thisadd {
	public static void main(String[] args) {
		add a1=new add();
		System.out.println(a1.dosum(2, 3));
		System.out.println(a1.dosum(2, 5));
		
	}

}
