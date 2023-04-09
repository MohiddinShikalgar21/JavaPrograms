package Test;
import java.util.*;
public class twosumbruteforce {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter target:");
    	int target=sc.nextInt();
    	int[] arr=new int[10];
    	System.out.println("Enter the number of elements:");
    	int n=sc.nextInt();
    	int m=0;
    	int l=0;
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	for(int j=0;j<n;j++)
    	{
    		for(int k=1;k<n;k++)
    		{
    			if(arr[j]+arr[k]==target)
    			{
    				m=arr[j];
    				l=arr[k];
    			}
    		}
    	}
    	if(m!=0)
    	{
    		System.out.print(m);
    		System.out.println(l);
    	}
    	else
    	{
    		System.out.println("There exists no such pair.");
    	}
    }
}
