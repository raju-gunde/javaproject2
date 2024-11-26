package mar_9;
class opration{
	public static void  multiplication(int number1,int number2)
	{
		int total=number1*number2;
		System.out.println("multiplication:"+total);
		
		
	}
	
}

public class StringInput {
	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		opration.multiplication(number1,number2);
		
		
	}

}
/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.Take input from command line argument.

		 Example 1:*/