package object_clasess;

public class Instancedemo1 {
public static void main(String[] args) {
	String s1="raju";
	if(s1 instanceof String) {
		System.out.println("s1 is pointing to String object");
	}
	 String s2=new String("rahul");
	 if(s2 instanceof String) {
			System.out.println("s2 is pointing to String object");
		}
	 Integer i1=121;
	 if(i1 instanceof  Number) {
			System.out.println("s1 is pointing to String object");
		}
	 
}
}
