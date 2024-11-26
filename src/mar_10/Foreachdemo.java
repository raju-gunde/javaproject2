package mar_10;
import java.util.Arrays;

public class Foreachdemo {
	public static void main(String[] args) {
		char [] values= {'f','e','e','k','w','x'};
		Arrays.sort(values);
		for(char value:values)
		{
			System.out.println(value);
		}
	}

}
