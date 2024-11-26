package interfacepack;
class Super{
	public void m1() {
		System.out.println("super is m1");
	}
}

public class AnonymousDemo1 {

	public static void main(String[] args) {
		Super s=new Super() {
			@Override
			public void m1() {
				System.out.println("sub is m1");
			}
		};
		s.m1();
		// TODO Auto-generated method stub

	}

}
