package apr_19;

public class Alpha {
	public Alpha raju() {
		System.out.println("raju is print alpha");
		return new Beta();
	}
	

}
class Beta extends Alpha{
	public Beta raju() {
		System.out.println("raju is print Beta");
		return  null;
	}
	
}

