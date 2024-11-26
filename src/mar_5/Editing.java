package mar_5;
import java.net.MulticastSocket;
import java.util.*;
class logicaloperations{
public static void isalindrome(int n) {
	int rev=0;
	int original=n;
    while(n!=0)
    {
    	int reminder=n%10;
    	rev=rev*10+reminder;
        n/=10;
       
    }
    
    if(rev==original) System.out.println(original+ " is a palindrome");
 
}
public static void isarmstrong(int n) {
	for(int i=1;i<=n;i++)
	{
	int sum=0,c=0;
	int temp=i;
	while(temp!=0) 
	{
		
		c++;
		temp/=10;
		
	}
	temp=i;
	 while(temp!=0)
	 {
		 int reminder=temp%10;
		 sum+=Math.pow(reminder,3);
		 temp/=10;
	 }
	 if(sum==i)System.out.println(i+" is armstrong\t");
}
}
public static boolean isprimeNumber(int n) {
	for(int i=1;i<n;i++)
	{
		int temp=i,count=0;
		for(int j=2;j<n;j++)
		{
			if(temp%j==0)count++;
			if(count>1)continue;
		}
		if(count==1)System.out.println(i);
		

	}
	return true;
	}
}
	public class Editing {
	public static void main(String[] args) {
		
	Scanner n=new Scanner(System.in);
	System.out.print("enter number : ");
	int num=n.nextInt();
	for(int i=1;i<num;i++)
	logicaloperations.isalindrome(i);
	
    logicaloperations.isarmstrong(num);
    logicaloperations.isprimeNumber(num);
	}

}
