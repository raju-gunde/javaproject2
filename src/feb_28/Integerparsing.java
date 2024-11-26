package feb_28;
class calculate{
	public static int dosum(int x,int y)
	{
		 return (x+y);
	}
	public static int  getsquer(int num)
	{
	return num*num;
	}
}


public class Integerparsing
{

	public static void main(String[] args)
	{
		    int result=calculate.dosum(12,24);
			System.out.println(result);
			result=calculate.getsquer(4);
			System.out.println(result);
			
		
		
		
	}
}

