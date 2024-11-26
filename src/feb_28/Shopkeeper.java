package feb_28;

import java.net.MulticastSocket;

public class Shopkeeper {
	public static void main(String[] args) {
		float tv=32000;
		float profit=32000*27/100;
		float vat=32000*12/100;
		float service=32000*12/100;
		System.out.println( "tv price:"+tv);
		System.out.println( "profit:"+profit);
		System.out.println("vat:"+vat);
		System.out.println(  "service:"+service);
	float total=tv+profit+vat+service;
	System.out.println("total selling price:"+total);
		
	}

}
