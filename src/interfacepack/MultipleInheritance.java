package interfacepack;

import javax.swing.text.SimpleAttributeSet;

import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

interface A{
	void m1();
	
}
interface B {
	void m1();
	
}
class C implements A,B{

	@Override
	public void m1() {
		System.out.println("multiple interface is possible");
		// TODO Auto-generated method stub
		
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
	
		
		
		C c=new C();
		c.m1();

	}

}
