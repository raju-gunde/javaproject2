package mar_16;
class number{
	int number;
	int sum=0;
	public void setdata(int number) {
		this.number=number;
		
	}
	public void getdata() {
		while (number!=0) {
			number=(number%10)*10/10;
			}
		System.out.println(number);
		
	}
	
}

public class reverslabexam {

	public static void main(String[] args) {
		number n1=new number();
		n1.setdata(123);
		n1.getdata();
		// TODO Auto-generated method stub

	}

}
