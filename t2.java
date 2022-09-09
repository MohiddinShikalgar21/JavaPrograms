package Test;
import java.util.*;
public class t2 {
    public static void main(String[] args)
    {
    	System.out.println("Enter a number to find whether prime or not:");
    	Scanner sc= new Scanner(System.in);
    	int n= sc.nextInt();
    	int flag = 0;
    	for(int i=2;i<=n/2;i++)
    	{
    		if(n%i==0)
    		{
    			System.out.println("Not Prime");
    			flag=1;
    			break;
    		}
    		else
    		{
    			continue;
    		}
    	}
    		if(flag==0)
    		{
    			System.out.println("Prime");
    		}
    }
}
