package method_overloading;

public class AcceptHetro {
	public void accepthetro(Object ...obj) {
		for(Object o:obj) {
			System.out.println(o);
		}
		
	}
	public static void main(String[] args) {
		AcceptHetro ac1=new AcceptHetro();
		ac1.accepthetro("HDFH",77,'A',"HDJKHF");
	}

}

