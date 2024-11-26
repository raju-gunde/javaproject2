package may_03;

public interface Bank {
	void withdral(double amount);
	void deposit(double amount);
	void checkbalance(double amount);

}
class Hdfc implements Bank{

	@Override
	public void withdral(double amount) {
		
		System.out.println("withdrawl:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		System.out.println("deposit:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance(double amount) {
		System.out.println("checkbalance:"+amount);
		// TODO Auto-generated method stub
		
	}
	
}
class Sbi implements Bank{

	@Override
	public void withdral(double amount) {
		System.out.println("withdrawl:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		System.out.println("deposit:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance(double amount) {
		System.out.println("checkbalance:"+amount);
		// TODO Auto-generated method stub
		
	}
	
}
class Icic implements Bank{

	@Override
	public void withdral(double amount) {
		System.out.println("withdrawl:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		System.out.println("deposit:"+amount);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance(double amount) {
		System.out.println("checkbalance:"+amount);
		// TODO Auto-generated method stub
		
	}
	
}












