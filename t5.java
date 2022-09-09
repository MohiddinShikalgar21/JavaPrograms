package Test;
import java.util.*;
public class t5 {
    public static void main(String[] args)
    {
    	System.out.println("Enter a number to check whether palindrome or not:");
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	int orig=n;
    	int rev=0;
    	while(n!=0)
    	{
    		int n2=n%10;
    		rev=rev*10+n2;
    		n=n/10;
    	}
    	if(orig==rev)
    	{
    		System.out.println("Palindrome");
    	}
    	else
    	{
    		System.out.println("Not Palindrome");
    	}
    }
}
