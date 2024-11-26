package mar_13;
class manager{
	int managerId;
	String managerName;
	public void setaManagerData(int id,String name) {
		managerId=id;
		managerName=name;
	}
		public void getManagerData() {
			System.out.println("managerIdis:"+managerId+"  manager name is:"+managerName);
		}
		public String managerdata() {
			return ":"+  managerId+"  manager name is"+ managerName;
		} 
	
}


public class Parameterconstructor {
	public static void main(String[] args) {
		manager m1=new manager();
		m1.setaManagerData(21, "srikanth");
		m1.getManagerData();
		m1.setaManagerData(3, "sreyas");
		
		System.out.println(m1.managerdata());
	}
	

}
