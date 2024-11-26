package method_overloading;


public class Autoboxing1 {

	public static void main(String[] args) {
	int a=100;
	Integer x=Integer.valueOf(a);
	System.out.println(x);//from java 1.4v;
	int b=200;
	Integer y=b;
	System.out.println(y);//from java 1.5v onwards compiler takes care;

	}

}
