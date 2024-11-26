package mar_28;

class person {
	private String name;
	private int age;
	{
		System.out.println("Person instance created");
	}

	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void introduce() {
		System.out.println("Hi, my name is" +name+" and I'm "+age+" years old");
				
	}
}

public class Instanceclass {

	public static void main(String[] args) {
		person p1=new person("raaj", 21);
		p1.introduce();
		// TODO Auto-generated method stub

	}

}
