package interfacelambda;



interface alpha{
	void m2();
	void m1();
}


public class Anonimous1 {

	public static void main(String[] args) {
		alpha a1=new alpha() {

			@Override
			public void m1() {
				System.out.println("raju is anonomous");
	        
				// TODO Auto-generated method stub
				
			}

			@Override
			public void m2() {
				System.out.println("raj kumar is ready");
				// TODO Auto-generated method stub
				
			}
		
		};
		a1.m2();

		a1.m1();
		alpha a2=new alpha() {

			@Override
			public void m1() {
				System.out.println("ravi is anonomous");
	        
				// TODO Auto-generated method stub
				
			}

			@Override
			public void m2() {
				System.out.println("m2 anounomous");
				// TODO Auto-generated method stub
				
			}
		
		};
		a2.m2();
		a2.m1();
	  
		
		// TODO Auto-generated method stub

	}

}
