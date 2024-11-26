package Methodoverriding;

class Cat {
	protected int a = 10;
	protected int b = 20;

	final private void calculate() {
		int sum = a + b;
		System.out.println(sum);
	}
}

class Mat extends Cat {
	public void calculate() {
		int mul = a * b;
		System.out.println("Mul is :" + mul);
	}



	public static void main(String[] args) {
		new Mat().calculate();
		// TODO Auto-generated method stub

	}

}
