package examon_06;

class Ticket {
	private String eventname;
	private int seatnumber;
	private double price;

	public Ticket(String eventname, int seatnumber, double price) {
		super();
		this.eventname = eventname;
		this.seatnumber = seatnumber;
		this.price = price;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [eventname=" + eventname + ", seatnumber=" + seatnumber + ", price=" + price + "]";
	}
	

}

class viptickets extends Ticket {
	private boolean Studentdiscount;

	public viptickets(String eventname, int seatnumber, double price, boolean studentdiscount) {
		super(eventname, seatnumber, price);
		Studentdiscount = studentdiscount;
	}

	public boolean isStudentdiscount() {
		return Studentdiscount;
	}

	public void setStudentdiscount(boolean studentdiscount) {
		Studentdiscount = studentdiscount;
	}

	@Override
	public String toString() {
		return "viptickets [Studentdiscount=" + Studentdiscount + ", getEventname()=" + getEventname()
				+ ", getSeatnumber()=" + getSeatnumber() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}

public class Maintest {

	public static void main(String[] args) {
		Ticket t1=new Ticket("IPL", 999, 9999);
		System.out.println(t1);
		viptickets v1=new viptickets("IPL", 757, 7777, true);
		System.out.println(v1);
		
	}

}
