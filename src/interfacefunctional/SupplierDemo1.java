package interfacefunctional;

import java.util.function.Supplier;
public class SupplierDemo1 {

	public static void main(String[] args) {
		Supplier<Integer>s1=()->2+2;
		System.out.println(s1.get());
		// TODO Auto-generated method stub

	}

}
