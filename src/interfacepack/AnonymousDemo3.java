package interfacepack;
interface Engine{
	void speed();
	
}

public class AnonymousDemo3 {

	public static void main(String[] args) {
		Engine car=new Engine() {

			@Override
			public void speed() {
				System.out.println("car speed is 180kmp");
				// TODO Auto-generated method stub
				
			}
			
		};
		car.speed();
		// TODO Auto-generated method stub

	}

}
