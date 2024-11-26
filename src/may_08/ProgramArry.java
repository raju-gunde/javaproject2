package may_08;

import java.util.Scanner;

public class ProgramArry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		String arr[]=new String[size];
		
		for(int i=0;i<arr.length;i++) 
		{
		System.out.println("enter the element:"+i);
		arr[i]=sc.nextLine();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The size of the array is :"+ arr.length);
		sc.close();
		// TODO Auto-generated method stub

	}

}
