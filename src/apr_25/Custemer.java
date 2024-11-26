package apr_25;

public class Custemer {
	int custid;
	String custName;
	String custAddres;
	double CustBill;
	public Custemer(int custid, String custName, String custAddres) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custAddres = custAddres;
		
	}
	public Custemer(int custid, String custName, String custAddres, double custBill) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custAddres = custAddres;
		CustBill = custBill;
	}
	@Override
	public String toString() {
		return "Custemer [custid=" + custid + ", custName=" + custName + ", custAddres=" + custAddres + ", CustBill="
				+ CustBill + "]";
	}
	
	
	

}
