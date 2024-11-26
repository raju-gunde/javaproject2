package apr_08;

public class StudentTicket extends Ticket {
	private boolean StudentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		StudentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return StudentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		StudentDiscount = studentDiscount;
	}

	@Override
	public String toString() {
		return " "+super.toString()+"StudentTicket [StudentDiscount=" + StudentDiscount + "]";
	}
	

}
