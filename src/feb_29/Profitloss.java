package feb_29;

public class Profitloss {
	public static void main(String[] args) {
		float sellingprice=Float.parseFloat(args[0]);
		float  costprice=Float.parseFloat(args[1]);
		float profit=sellingprice-costprice;
		float loss=costprice-sellingprice;
		System.out.println(profit);
		System.out.println(loss);
		double profitpers=(profit/costprice)*100;
		System.out.println(profitpers);
		double losspers=(loss/costprice)*100;
	   System.out.println(losspers);
		
		
		
	}

}
