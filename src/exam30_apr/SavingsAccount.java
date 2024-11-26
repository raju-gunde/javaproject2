package exam30_apr;

public class SavingsAccount extends BankAccount{
	double deposit;
	
	
	

	

	public SavingsAccount(double deposit) {
		super();
		this.deposit = deposit;
	}

	@Override
	public void withdraw(double withdaw) {
		withdaw-=deposit;
		System.out.println(withdaw);
		
		
		
		
	}

	@Override
	public String getAccountType() {
		 return "Current";
		
	}
	

}
