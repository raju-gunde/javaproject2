package interfacepack;

interface Bag {
	default void colour(){
		System.out.println("Bag colour");
		
	}
}
interface  chain{
	default void coulour() {
		System.out.println("chain colour");
		
	}
	
}
class naveen implements chain,Bag{
	@Override
	public void colour(){
		System.out.println(" over ridden methid ");
		Bag.super.colour();
		
		chain.super.coulour();
		
	}
	
	
}

public class MultipleInheritancedefult {

	public static void main(String[] args) {
		naveen n1=new naveen();
		n1.colour();
		
		
		// TODO Auto-generated method stub

	}

}
