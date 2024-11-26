package object_clasess;
class equaldemo{
	private int id;
	private String name;
	public equaldemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equal(Object obj) {
		equaldemo e1=(equaldemo) obj;
		if(this.id==e1.id&&this.name.equals(e1.name)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
}

public class Booleandemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equaldemo e1=new equaldemo(01, "raju");
		equaldemo e2=new equaldemo(01, "raju");
		System.out.println(e1.equal(e2));
		
	}

}
