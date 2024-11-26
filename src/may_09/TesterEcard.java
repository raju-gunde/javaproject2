package may_09;

import java.util.function.Consumer;

import method_overloading.Acceptdata;

public class TesterEcard {

	public static void main(String[] args) {
		CartItem cart=new CartItem("moblile", 100000, 3);
		ShoppingCart shop=new ShoppingCart(cart);
		
		
		Consumer<ShoppingCart> c=s ->{
			double total=s.getItem().getTotalPrice();
			if(total>100000) {
				double discount=total*0.1;
				System.out.println("total price is :"+(total-discount));
				
			}
			else {
				System.out.println("total price:"+total);
			}
			
		};
		System.out.println(shop);
		c.accept(shop);
		
		// TODO Auto-generated method stub

	}

}
