package abstraction;
abstract class animal{
	public abstract void checkup();
}

   class Lion extends animal
    {
	@Override
	public void checkup() 
	{
		System.out.println("Lion Checkup");		
	}
	
}
   class Bird extends animal
   {
   	@Override
   	public void checkup() 
   	{
   		System.out.println("Bird Checkup");		
   	}
   	
   }
   class Dog extends animal
   {
   	@Override
   	public void checkup() 
   	{
   		System.out.println("Dog Checkup");		
   	}
   	
   }
   class animalCheckep{
	   public static void checkup(animal animals[]) {
		   for(animal animalss:animals) {
			   animalss.checkup();
		   }
	   }
   }

public class Arrayabs {

	public static void main(String[] args) {
		Lion []lions = {new Lion(), new Lion(), new Lion()};
		animalCheckep.checkup(lions);
		Bird []birds = {new Bird(), new Bird()};
		animalCheckep.checkup(birds);
		// TODO Auto-generated method stub
		Dog []dogs = {new Dog(), new Dog(), new Dog(), new Dog()};
		animalCheckep.checkup(dogs);
	}

}
