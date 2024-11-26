package interfacefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
//		Predicate<Integer> p1= num ->num%2==0;
//		Scanner sc=new Scanner(System.in); 	
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		System.out.println( num+"is even??:"+p1.test(num));
		List<String> s = Arrays.asList("king", "raju", "arjun");
		Predicate<String> p = l -> l.startsWith("k");
		for (String n : s) {
			
			if(p.test(n))
				System.out.println(n);

		}
	

	}

}
