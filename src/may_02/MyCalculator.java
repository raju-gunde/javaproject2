package may_02;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum=0;
		for(int i=1;i<=6;i++)
		{
			if(n%i==0) { sum+=i; }
		}
		return sum;
	}

}
