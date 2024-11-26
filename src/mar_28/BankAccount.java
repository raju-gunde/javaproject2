package mar_28;

public class BankAccount {
	private double balance;
	private double Intrestraate;
	{
		Intrestraate=0.01;
	}
	public BankAccount(double balance) {
		this.balance=balance;
	}
     public void deposit(double amount) {
    	 this.balance+=amount;
    	 System.out.println("deposit:"+balance);
		
	}
     public void withdraw(double amount) {
    	 this.balance-=amount;
    	 System.out.println("withdral amount:"+balance);
 		
 	}
     public void calculateInterest() {
    	 this.balance*=Intrestraate;
    	 System.out.println("intrest rate:"+balance);
 		
 		
 	}
     public static void main(String[] args) {
    	 BankAccount b1=new BankAccount(2000);
    	 b1.deposit(1000);
    	 b1.withdraw(500);
    	 
    	 b1.calculateInterest();
	}
}
