package interfacefunctional;

import feb_26.interchage_java;

class Accept<T>{
	private T a;

	public Accept(T a) {
		super();
		this.a = a;
	}

	public T getA() {
		return a;
	}
	
}

public class TypeParameterd {

	public static void main(String[] args) {
		 Accept<Integer> intType = new Accept<Integer>(12);
		 System.out.println(intType.getA());
		 Accept <Boolean> booltype=new Accept<Boolean>(true);
		 System.out.println(booltype.getA());
		//Accept<Integer> inttype = new Accept<Integer>(12);
		// TODO Auto-generated method stub

	}

}
