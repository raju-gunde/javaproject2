package apr_16;
class overload{
	public void intChar(int n,char c) {
		System.out.println("int="+n+" "+"char="+c);
		
		
	}
	public void  intChar(char c,int n) {
		System.out.println("int="+n+" "+"char="+c);
		
	}
}

public class IntCharOverloadingMethod {

	public static void main(String[] args) {
		overload o=new overload();
		o.intChar(30, 'a');
		o.intChar('a', 60);
		
		
		// TODO Auto-generated method stub

	}

}
