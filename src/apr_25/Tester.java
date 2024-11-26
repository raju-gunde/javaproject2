package apr_25;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customerdemo1 c1=new Customerdemo1("rahul","ramakrishna");
		
		Account a1=new Account(c1, 5000, 1234, 2);
		System.out.println(a1);
		//a1.deposit(1000);
		a1.withdraw(5000);
		
	}

}
