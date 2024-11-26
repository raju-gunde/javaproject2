package mar_23;
class person{
	private String name;
	private int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static person getpersondetails() {
		return new person("rahul", 12);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Details{
	public static void main(String[] args) {
		person p1=person.getpersondetails();
		System.out.println(p1);
		
	}
	
}
