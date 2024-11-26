package exam_02may;
interface animal1{
	void bark();
	
	
}
class Dog implements animal1{

	@Override
	public void bark() {
		System.out.println("\"Dog is barking\".");
		// TODO Auto-generated method stub
		
	}


	
	
}

public class Animaltest {

	public static void main(String[] args) {
		animal1 a1=new Dog();
		a1.bark();
		
		// TODO Auto-generated method stub

	}

}
