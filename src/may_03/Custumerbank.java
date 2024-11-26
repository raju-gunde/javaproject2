package may_03;

public class Custumerbank {
	String name;
	double accountbalance;
	
	
	public Custumerbank(String name, double accountbalance) {
		super();
		this.name = name;
		this.accountbalance = accountbalance;
	}
	public void withdrawl(Bank bank,double amount) {
		accountbalance-=amount;
		bank.withdral(amount);
		
		
		
	}
public void deposit(Bank bank,double amount) {
	accountbalance+=amount;
	bank.deposit(amount);;
	//System.out.println("deposit:"+accountbalance);
		
	}
	public void checkbalance(Bank bank) {
		bank.checkbalance(accountbalance);
		//System.out.println("total balance:"+accountbalance);
		
		
	}
	@Override
	public String toString() {
		return "Custumerbank [name=" + name + ", accountbalance=" + accountbalance + "]";
	}
	public static void main(String[] args) {
		Hdfc h1=new Hdfc();
		Sbi s1=new Sbi();
		Icic i1=new Icic();
		Custumerbank c1=new Custumerbank("arjun", 40000);
	   System.out.println(c1);
	   c1.checkbalance(i1);
	   c1.deposit(i1, 2000);
	   c1.withdrawl(i1, 1000);
	   c1.checkbalance(i1);
		
		
		
		
	}

}
