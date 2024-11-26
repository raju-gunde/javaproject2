package method_overloading;

class testvarargus {
	public void accept(int x, int... y) {
		System.out.println("x value is :" + x);
		System.out.println(y);
		for (int z : y) {
			System.out.println(z);
		}
	}
}

public class Acceptdata {
	public static void main(String[] args) {
		testvarargus a1 = new testvarargus();
		a1.accept(1, 12, 2, 5, 7, 4);
	}

}
