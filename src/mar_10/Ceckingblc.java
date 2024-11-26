package mar_10;

import java.util.Scanner;

import mar_11.Blccircle;

public class Ceckingblc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int value=Blccircle.getSquerAndCube(num);
		System.out.println(value);
		sc.close();
		// TODO Auto-generated method stub

	}

}
