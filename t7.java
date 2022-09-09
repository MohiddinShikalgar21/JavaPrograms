package Test;
import java.util.*;
public class t7 {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of elements:");
    	int n=sc.nextInt();
    	int arr[]=new int[10];
    	int sum=0;
    	float average;
    	System.out.println("Enter the elements:");
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    		sum=sum+arr[i];
    	}
    	average=sum/n;
    	System.out.println("The avg is "+average);
    	
    }
}
