package mar_19;
class person{
	private int personId;
	private String name;
	public person(){
		this.personId=101;
		this.name="raaj";
		//this is the non parameter constructor in these constructor is not changble by the object;
		
	}
	@Override
	public String toString() {
		return "person [personId=" + personId + ", name=" + name + "]";
	}

	
	
}

public class Nonparameteconstructor {
	public static void main(String[] args) {
		person p1=new person();
		System.out.println(p1);
		person p2=new person();
		System.out.println(p2);
		
	}

}
