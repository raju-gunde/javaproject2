package method_overloading;

class modify {
	int x;
	String name;

	public modify(int x, String name) {
		super();
		this.x = x;
		this.name = name;
	}

	@Override
	public String toString() {
		return "modify [x=" + x + ", name=" + name + "]";
	}

}

public class Pasingthedatamethods {

	public static void main(String[] args) {
		String name = "raju";
		modify(name);
		System.out.println(name);
		System.out.println(modify(10));
		modify m1=new modify(30, "ramraj");
		System.out.println(m1);
		
	}

	public static void modify(String name) {
		System.out.println(name = "akil");

	}

	public static int modify(int x) {

		return x;

	}

}
