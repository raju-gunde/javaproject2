package feb_27;

public class Salary
{
	public static void main(String[] args)
	{
		float salary=Float.parseFloat(args[0]);
		float hra=(salary*15/100);
		float conveyance=(salary*15/100);
		float entartainment=(salary*15/100);
		float sum=salary+hra+conveyance+entartainment;
		System.out.println( "total salary :"+sum);
		
	}
}
