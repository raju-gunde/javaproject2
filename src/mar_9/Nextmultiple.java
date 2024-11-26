package mar_9;

class  Nextvalue{
	public static void SumOfMultiples(int number1,int number2,int number3) {
		int sum=0;
		number1/=10;
		number1*=10;
		number1+=10;
		System.out.println(number1);
		number2/=10;
		number2*=10;
		number2+=10;
		System.out.println(number1);
		number3/=10;
		number3*=10;
		number3+=10;
		System.out.println(number3);
		sum=number1+number2+number3;
		System.out.println(sum);
	}
}

public class Nextmultiple {

	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int number3=Integer.parseInt(args[2]);
		
		Nextvalue.SumOfMultiples(number1,number2,number3);
		
		
	

	}

}
