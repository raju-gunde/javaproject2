package apr_08;

public class VIPTicket extends Ticket {
	private String specialAcces;

	public VIPTicket(String eventName, int seatNumber, double price) {
		super(eventName, seatNumber, price);
		// TODO Auto-generated constructor stub
	}

	public String getSpecialAcces() {
		return specialAcces;
	}

	public void setSpecialAcces(String specialAcces) {
		this.specialAcces = specialAcces;
	}

	@Override
	public String toString() {
		return ""+super.toString()+"StudentTicket [specialAcces=" + specialAcces + "]";
	}
	

}
