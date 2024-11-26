package mar_5;
class arthematicoperation{
	 public static int adition(int number1,int number2) {
		return number1+number2;
		
	}
	public static int substractoin(char x,char y) {
		return x-y;
	}
	public static int multiplication(long x,long y) {
		return  (int)(x*y);
		
	}
	public static int division(short a,short b) {
		return a/b;
	}
	}

public class Arthematic {
	public static void main(String[] args) {
		int number1=20;
		int number2=10;
		short a=100;
		short b=20;
		char operation=args[0].charAt(0);
		System.out.println(operation);
		switch(operation) {
		case '+':System.out.println(arthematicoperation.adition(number1,number2));break; 
		case '-':System.out.println(arthematicoperation.substractoin((char)number1,(char)number2));break; 
		case 'm':System.out.println(arthematicoperation.multiplication(number1,number2));break; 
		case '/':System.out.println(arthematicoperation.division(a,b));break; 
		
		
		}
	    
		
		
	}

}
