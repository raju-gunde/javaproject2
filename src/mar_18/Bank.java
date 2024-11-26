package mar_18;

public class Bank {
	private String bankName;
	private String custemername;
	private String bankAdress;
	private String bankIFSCCode;
	private int costemerAccountNumber;
	private int currentBalance;
	

	public void setData(String bankName,String custemername,String bankAdress,String bankIFSCCode,int costemerAccountNumber,int currentBalance)
	{
		
		this.bankName=bankName;
		this.custemername=custemername;
		this.bankAdress=bankAdress;
		this.bankIFSCCode=bankIFSCCode;
		this.costemerAccountNumber=costemerAccountNumber;
		this.currentBalance=currentBalance;
	}
	public void withdraw(double amount)
	{
		if(currentBalance<1000)
		{
			System.out.println("insufficient balance");
		}
		else if(currentBalance-amount<1000) {
			System.out.println("maintein minimum balance");
		}
		else {
			if(amount<0) {
				System.out.println("enter valid amount");
			}
			else {
			currentBalance-=amount;
			System.out.println("your balance is:"+currentBalance);
			
		 
			
			}
		}
		
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("diposit valid amount");
		}
		else
		currentBalance+=amount;
	}
		
		public void currentbalance()
		{
			System.out.println("your balance is:"+currentBalance);
			System.out.println("transaction succsess fully");
			
		}
		public String displayDetails() {
			return "Bank [bankName=" + bankName + ", custemername=" + custemername + ", bankAdress=" + bankAdress
					+ ", bankIFSCCode=" + bankIFSCCode + ", costemerAccountNumber=" + costemerAccountNumber
					+ ", currentBalance=" + currentBalance + "]";
		}
		
		
}
		
	

