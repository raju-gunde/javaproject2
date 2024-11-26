package Methodoverriding;
final class citizen{
 private final String aadharNumber;

	public citizen(String aadharNumber) {
		super();
		if(aadharNumber.length()==12) {
		this.aadharNumber = aadharNumber;
		System.out.println("ITS A VALID NUMBER");
		}
		else {
			this.aadharNumber=aadharNumber;
			System.err.println("iNVALID ADHARNU MBER");
		}
	}

	public String getAadharNumber() {
		return aadharNumber;
	}
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		citizen ci1=new citizen("934709429842");
		System.out.println(ci1.getAadharNumber());
		// TODO Auto-generated method stub

	}

}
