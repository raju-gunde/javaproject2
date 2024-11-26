package apr_05;
class Animal {
	protected String animalname;
	protected int animalage;

	public Animal(String animalname, int animalage) {
		super();
		this.animalname = animalname;
		this.animalage = animalage;
	}

	public void makesound() {
		System.out.println("The animal makes a generic sound");
	}
//
//	@Override
//	public String toString() {
//		return "Animal [animalname=" + animalname + ", animalage=" + animalage + "]";
//	}
	public void displaydetails() {
		System.out.println("Animal [animalname=" + animalname + ", animalage=" + animalage + "]");
	}

}

class Lion extends Animal {
	private int manelength;

	public Lion(String animalname, int animalage, int manelength) {
		super(animalname, animalage);
		this.manelength = manelength;
	}

	public void makesound() {
		System.out.println("The lion roars loudly.");
	}

	public void manelength() {
		System.out.println("the lion length is:"+this.manelength);

	}

}

class Elephant extends Animal {
	private float tasklength;

	public Elephant(String animalname, int animalage, float tasklength) {
		super(animalname, animalage);
		this.tasklength = tasklength;
	}

	public void makesound() {
		System.out.println("The elephant trumpets.");
	}

	public void tasklength() {
		System.out.println("elephantlenth is:"+this.tasklength);
	}
	

}

public class ZooManagement {

	public static void main(String[] args) {
		Lion l1=new Lion("lion tiger", 9, 8);
		l1.displaydetails();
		l1.manelength();
		l1.makesound();
		Elephant e1=new Elephant("elephant", 28, 15);
		e1.displaydetails();
		e1.tasklength();;
		e1.makesound();
		
		// TODO Auto-generated method stub

	}

}
