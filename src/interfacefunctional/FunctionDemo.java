package interfacefunctional;
import java.util.function.Function;


public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=x->x*x;
		System.out.println(f1.apply(2));
		
		

	}
	
}
