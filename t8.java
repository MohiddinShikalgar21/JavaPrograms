package Test;
import java.util.*;
public class t8 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr= new int[10];
        int count = 0;
        
        for(int i=0;i<=n;i++)
        {
        	arr[i]=sc.nextInt();
        	for(int j=1;j<k;j++)
        	{
        		while(j<k && (j+arr[i])%m==0)
        		{
        			count=count+j;
        			if(count<=k)
        			{
        			arr[i]=j+arr[i];
        			}
        		}
        	}
        }
        
        for(int b=0;b<=n;b++)
        {
        	System.out.println(arr[b]);
        }
        
    }
}
