package mar_8;
import java.util.*;

public class Swich_cases {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter cahracter");
	char colour=sc.next().toLowerCase().charAt(0);
	 switch (colour)
	 {
	 case 'r':System.out.println("red");break;
	 case 'g':System.out.println("green");break;
	 case 'w':System.out.println("white");break;
	 default:System.out.println("colour not matcing");
	 }
  }
}	


