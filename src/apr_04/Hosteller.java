package apr_04;

public class Hosteller extends Student {
	double Hostelfee;

	public Hosteller(int studentid, String name, double payfee, double hostelfee) {
		super(studentid, name, payfee);
		Hostelfee = hostelfee;
	}

	public String displaydetails() {
		return ""+this.toString()+"hostel fee:"+Hostelfee;
	}
       public void payFee(double amount) {
    	   if((Hostelfee+payfee)-amount<1) {
       		System.out.println("fee is clear");
       	}
       	else {
       		System.out.println("remaining amount is:"+((Hostelfee+payfee)-amount));
       	}
    	   
    	   
		
	}
	
	

}
