package apr_04;

public class DayScholar  extends Student{
	double Transeportfee;

	

	public DayScholar(int studentid, String name, double payfee, double transeportfee) {
		super(studentid, name, payfee);
		Transeportfee = transeportfee;
	}
	public String displaydetails() {
		return ""+this.toString()+"tranceportfee:"+Transeportfee;
	}
public void payFee(double amount) {
    	if(amount<1) {
    		System.out.println("fee is clear");
    	}
    	else {
    		System.out.println("remaining amount is:"+((Transeportfee+payfee)-amount));
    	}
    	   
		
	}
	
	

}
