package mar_18;

public class Bankcustemer {

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.setData("sbi", "raju", "hyd", "raju1234king",123456, 2000);
		b1.withdraw(500);
		b1.deposit(500);
		b1.currentbalance();
		System.out.println(b1.displayDetails());
		// TODO Auto-generated method stub

	}

}
