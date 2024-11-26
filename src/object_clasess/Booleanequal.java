package object_clasess;
class Cusomerbool{
	private int custId;
	private String custName;
	
	
	public Cusomerbool(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}


	public boolean equals(Object obj) {
		int id1=this.custId;
		String name1=this.custName;
		Cusomerbool cb1=(Cusomerbool) obj;
		int id2=this.custId;
		String name2=this.custName;
		if(id1==id2&&name1.equals(name2)) {
			return true;
		}
		else 
			return false;
		
	}
	
}

public class Booleanequal {

	public static void main(String[] args) {
		Cusomerbool cb1=new Cusomerbool(11,"scot");
		Cusomerbool cb2=new Cusomerbool(11,"scot");
		System.out.println(cb1==cb2);
		System.out.println(cb1.equals(cb2));
				
		// TODO Auto-generated method stub

	}

}
