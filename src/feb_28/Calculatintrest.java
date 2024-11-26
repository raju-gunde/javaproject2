package feb_28;

public class Calculatintrest {
	public static void main(String[] args) {
		float price=20000;
		double intrest=2.76;
		float months=28;
		double total=(price*intrest*months)/100;
		System.out.println(total);
		double amount =price+total;
		System.out.println(amount);
		
		
	}

}
