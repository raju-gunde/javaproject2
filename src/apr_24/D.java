package apr_24;
class C { 
	 public C(String s) { 
	  System.out.print("B"); 
	 } 
	} 
	public class D extends C { 
	 public D(String s) {
		 super(s);
	  System.out.print("D"); 
	 } 
	 public static void main(String[] args) { 
	 new D("C"); 
	  System.out.println(" "); 
	 } 
	} 