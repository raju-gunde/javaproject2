package mar_22;

class custemer {
	private int custemerId;
	private String custemerName;
	private double custemerBill;

	public custemer(int custemerId, String custemerName, double custemerBill) {
		super();
		this.custemerId = custemerId;
		this.custemerName = custemerName;
		this.custemerBill = custemerBill;
	}

	public static custemer getcustemerObject() {
		return new custemer(115, "mohan", 550);
	}

	@Override
	public String toString() {
		return "custemer [custemerId=" + custemerId + ", custemerName=" + custemerName + ", custemerBill="
				+ custemerBill + "]";
	}

}

public class CustemerDemo {

	public static void main(String[] args) {

		custemer c1 = custemer.getcustemerObject();
		System.out.println(c1);
		// TODO Auto-generated method stub

	}

}
