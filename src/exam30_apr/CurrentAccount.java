package exam30_apr;


public class CurrentAccount extends BankAccount{
	double deposit;
	


	public CurrentAccount(double deposit) {
		super();
		this.deposit = deposit;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "surrent";
	}

	@Override
	public void withdraw(double withdaw) {
		withdaw+=deposit;
		System.out.println(withdaw);
		// TODO Auto-generated method stub
		
	}

}
