package apr_25;
record demo1(int a,int b) {
	int show(){
		return a+b;
	}
	
		
}

public record RecordClassMcq() {

	public static void main(String[] args) {
		demo1 d1=new demo1(25, 10);
		System.out.println(d1.show());
		// TODO Auto-generated method stub

	}

}
