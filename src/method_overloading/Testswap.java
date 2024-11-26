package method_overloading;

public class Testswap {

	public static void main(String[] args) {
		int original1=90;
		int original2=30;
		swap(original1, original2);
        System.out.println(original1);
        System.out.println(original2);
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
