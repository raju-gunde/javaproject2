package apr_2;
class Manager{
	 String name;
	 public Manager(String name) {
	  this.name=name;
	  System.out.print(this.name);
	 }
	 void welcomeMessage(){
	  System.out.println("Welcome to Java-Latte");
	 }
	}

	public class Constructor1 {
	 public static void main(String[] args) {
		 Manager m1=new Manager("rahul    ");
		 m1.welcomeMessage();
	 }
	}