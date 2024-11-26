package mar_10;

import java.util.*;

public class Switchcolour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the charcter");
		char colour=sc.next().toLowerCase().charAt(0);
		switch (colour) {
		case 'r':System.out.println("red");break;
		case 'w':System.out.println("white");break;
		case 'b':System.out.println("black");break;
		default:System.out.println("not colour is mathing");
		sc.close();
		}
	}

}
