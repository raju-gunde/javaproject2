package exam30_apr;

public abstract class BankAccount {
	String accountNumber;
	double balance;
	
	
	
	
	public String getAccountNumber() {
		
		return this.accountNumber;
	}
public double getBalance() {
	return this.balance;
		
	}
public void deposit() {
	
}
public abstract void withdraw(double withdaw);
public abstract String getAccountType();


}
