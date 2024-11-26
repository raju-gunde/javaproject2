package apr_08;

public class MainTicket {

	public static void main(String[] args) {
		Ticket t1=new Ticket("Concert", 101, 50.0);
		System.out.println(t1);
		StudentTicket t2=new StudentTicket("Student Event", 301, 30.0, true);
		System.out.println(t2);
		// TODO Auto-generated method stub

	}

}
