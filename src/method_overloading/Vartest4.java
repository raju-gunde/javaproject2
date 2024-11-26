package method_overloading;

import java.util.Arrays;

class testing1 {
	public void test(int... x) {
	
		for (int z : x) {

			System.out.println(z);

		}
		
	}
}
	public class Vartest4 {

	public static void main(String[] args) {
//		testing1 ts1=new testing1();
//		ts1.test(1,2,3,4,5,6);
//		// TODO Auto-generated method stub
		 int[] arr={1,2,4,5,7};
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]+1!=arr[i+1])
	            {
	                System.out.println(arr[i]+1);
	               
	            }
	        }
	}
	}
