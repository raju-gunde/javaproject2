package examon_06;

class Train {
	private String name;
	private String type;
	private String timing;

	public Train(String name, String type, String timing) {
		super();
		this.name = name;
		this.type = type;
		this.timing = timing;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTiming() {
		return timing;
	}


	public void setTiming(String timing) {
		this.timing = timing;
	}


	@Override
	public String toString() {
		return "Train [name=" + name + ", type=" + type + ", timing=" + timing + "]";
	}

}
class Maintr extends Train{

	public Maintr(String name, String type, String timing) {
		super(name, type, timing);
		// TODO Auto-generated constructor stub
	}
	
	
}
public class MainTrain {

	public static void main(String[] args) {
		Maintr m1=new Maintr("Rajdhani"," AC", "12.20 pm");
		System.out.println(m1);
		
		
		
		// TODO Auto-generated method stub

	}

}
