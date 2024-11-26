package apr_16;

public class PrintNumber {
	public int print(int number) {
		return number;
	}
	public long print(long number) {
		return number;
	}
	public float print(float number) {
		return number;
	}
	public double print(double number) {
		return number;
	}
	public char print(char number) {
		return number;
	}
	public String print(String number) {
		return number;
	}
	public static void main(String[] args) {
		PrintNumber p1=new PrintNumber();
	    System.out.println(p1.print(69));
		System.out.println(p1.print(48));
		System.out.println(p1.print(39));
		System.out.println(p1.print(89.90));
		System.out.println(p1.print('n'));
		System.out.println(p1.print("rajukumar"));
		
	}
	

}
