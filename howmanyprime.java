package Test;
import java.util.*;
import java.util.Arrays;
public class howmanyprime {
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	int n= sc.nextInt();
    	boolean[] arr= new boolean[n+1];
    	Arrays.fill(arr,true);
    	arr[0]=false;
    	arr[1]=false;
    	for(int i=2;i*i<=n;i++)
    	{
    		for(int j=2*i;j<=n;j+=i)
    		{
    			arr[j]=false;
    		}
    	}
    	int count=0;
    	for(int k=0;k<=n;k++)
    	{
    		if(arr[k]==true) count++; 
    	}
    	System.out.println(count);
    	for(int l=0;l<=n;l++)
    	{
    		System.out.println(l + " " +arr[l]);
    	}
    }
}
