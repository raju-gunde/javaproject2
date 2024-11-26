package interfacefunctional;

import java.util.function.Function;

public interface ConsumerDemo2 {
	public static void main(String[] args) {
		Function<String, Integer> fn2 = str -> str.length();
		System.out.println("Length is :" + fn2.apply("NIT"));
		Function<String, Boolean> fn3 = str -> str.equals("raaj");
		System.out.println(fn3.apply("raajh"));

	}
	// Function<String,Integer> fn1= str -> str.length();

}
