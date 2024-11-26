package apr_25;

public class Account {
	Customerdemo1 cust;
	double balance;
	int accouuntNUmber;
	float intrestRate;
	public Account(Customerdemo1 cust, double balance, int accouuntNUmber, float intrestRate) {
		super();
		this.cust = cust;
		this.balance = balance;
		this.accouuntNUmber = accouuntNUmber;
		this.intrestRate = intrestRate;
	}
	public void deposit(double amount) {
		double total=amount+balance;
		System.out.println(total);
		
	}
	public void withdraw(double amount) {
		if(amount<balance) {
		double total=balance-amount;
		System.out.println(total);
		}
		else {
			System.err.println("please check your balance  wise do not withdraw");
		}
	}
	@Override
	public String toString() {
		return "Account [cust=" + cust + ", balance=" + balance + ", accouuntNUmber=" + accouuntNUmber
				+ ", intrestRate=" + intrestRate + "]";
	}
	
	

}
