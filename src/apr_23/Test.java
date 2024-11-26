package apr_23;

/*Constructor :
 * 
 * Types of Constructor :
 *    2 types of constructor
 *         a)Compiler generated const  -> Default const
 *         b)User given const  -> No param const
 *                             -> Param const
 *                             
 *    Default const :
 *     a)If a programmer is not providing any cost then compiler will add one default const
 *        for every class.
 *     b)In default const we cant add any logics.
 *     c)In default const only default values are initialized to our instance variables
 *     d)The acess modifiers of default const is same as the class acss modifiers we cant change it.
 *    
 *    
 *    
 *    No-Param const : 
 *    a)If a programmer is developing a constructor wihtout any param then it is called NPC.
 *    b)Programmer can initialize some default values to instance as per the requirement.
 *    c)In NPC we can write any logic .
 *    d)We can change the accs modifiers of NPC.
 *    e)By using user defined constructor we can call current class const or super class const
 *      explicitly
 * 
 * 
 * */
class A {
	private int a;
	private int b;

	 A() {
		this(5);
		this.a = 10;
		this.b = 20;
	}
	 A(int a) {
		 System.out.println("A b c");
	 }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}

}

public class Test {
	public static void main(String[] args) {
		A t = new A();
		System.out.println(t);
		t.setA(40);
		t.setB(89);
		System.out.println(t);
	}

}
