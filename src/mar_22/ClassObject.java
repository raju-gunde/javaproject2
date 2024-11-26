package mar_22;

class employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double da;

	public employee(int employeeId, String employeeName, double basicSalary, double hra, double da) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da;

	}

	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + "]";
	}

}

class manager {
	private int magerId;
	private String managerName;
	private double basicSalary;
	private double hra;
	private double da;
	private double projectAllowance;

	public manager(int magerId, String managerName, double basicSalary, double hra, double da,
			double projectAllowance) {
		super();
		this.magerId = magerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.projectAllowance = projectAllowance;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da + projectAllowance;
	}

	@Override
	public String toString() {
		return "manager [magerId=" + magerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + ", projectAllowance=" + projectAllowance + "]";
	}
}

class Trainer {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double da;
	private double batchCount;
	private int perkPerBatch;

	public Trainer(int employeeId, String employeeName, double basicSalary, double hra, double da, double batchCount,
			int perkPerBatch) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da + (batchCount * perkPerBatch);

	}

	@Override
	public String toString() {
		return "Trainer [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + ", batchCount=" + batchCount + ", perkPerBatch=" + perkPerBatch + "]";
	}

}

class Sourcing {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double da;
	private double enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;

	public Sourcing(int employeeId, String employeeName, double basicSalary, double hra, double da,
			double enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da + ((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment;
	}

	@Override
	public String toString() {
		return "Sourcing [employeeId=" + this.employeeId + ", employeeName=" + this.employeeName + ", basicSalary=" + this.basicSalary
				+ ", hra=" + this.hra + ", da=" + this.da + ", enrollmentTarget=" + this.enrollmentTarget + ", enrollmentReached="
				+this.enrollmentReached + ", perkPerEnrollment=" + this.perkPerEnrollment + "]";
	}

}
class TaxUtil{
	public double Tax(employee emp) {
		if(emp.calculateGrossSalary()>40000) {
			return emp.calculateGrossSalary()*0.20;
		}
		else
			return emp.calculateGrossSalary()*0.05;
		
	}
	public double Tax(manager mng) {
		if(mng.calculateGrossSalary()>40000) {
			return mng.calculateGrossSalary()*0.20;
		}
		else {
			return mng.calculateGrossSalary();
		}
	}
	public double Tax(Trainer tri) {
		if(tri.calculateGrossSalary()>40000) {
			return tri.calculateGrossSalary()*0.20;
		}
		else {
			return tri.calculateGrossSalary()*0.05;
		}
	}
	public double Tax(Sourcing src) {
		if(src.calculateGrossSalary()>40000) {
			return src.calculateGrossSalary()*0.20;
		}
		else {
			return src.calculateGrossSalary()*0.05;
		}
	}
}

public class ClassObject {

	public static void main(String[] args) {
		employee e1=new employee(115, "ramraj", 50000, 10000, 2000);
		System.out.println(e1);
		TaxUtil t1=new TaxUtil();
		System.out.println(t1.Tax(e1));
		manager m1=new manager(200, "arjun", 70000, 7000, 4000, 5000);
		System.out.println(m1);
		System.out.println(t1.Tax(m1));
		Trainer tr=new Trainer(211, "srinu", 20000, 3000, 2000, 5, 3000);
		System.out.println(tr);
		System.out.println(t1.Tax(tr));
		Sourcing sr=new Sourcing(114, "vamshi", 43000, 3400, 3000, 3400, 3000, 4);
		System.out.println(sr);
		System.out.println(t1.Tax(sr));
	
		
		// TODO Auto-generated method stub

	}

}
