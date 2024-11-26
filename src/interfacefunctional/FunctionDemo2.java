package interfacefunctional;
import java.util.function.Function;


public class FunctionDemo2 {
	public static void main(String[] args) {
//		
//		Function<String,Integer> f1=str->str.length();
//		System.out.println(f1.apply("rahul"));
//		System.out.println(f1.apply("ram"));
//		Function<String,Boolean>f2=str->str.endsWith("ravi");
//		System.out.println(f2.apply("ravi"));
//		String s="hello";
//		s.length();
		Function<Double, Double> d=(d1)-> 8.9;
		double d2=d.apply(2.0);
		System.out.println(d2);
		
	}
	
	
  
}
