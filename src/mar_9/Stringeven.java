package mar_9;

import java.util.Scanner;
class Stringas{
	public static String IsEvenIsOdd(int number) {
		if(number%2==0)return "the number is even";
		else 
			return "the nuber is odd";
	}
}

public class Stringeven {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please enter number:");
			int number=sc.nextInt();
			System.out.println(Stringas.IsEvenIsOdd(number));
			sc.close();
		}
	}

}
