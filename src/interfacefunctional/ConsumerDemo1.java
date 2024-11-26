package interfacefunctional;
import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Integer> c1= num ->System.out.println("consumer is"+num);
		c1.accept(12);
		Consumer<String> c2=num ->System.out.println("consumer is:"+num);
		c2.accept("rahul ramakrishna");
		// TODO Auto-generated method stub

	}

}
