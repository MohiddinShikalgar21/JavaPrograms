package Test;
import java.util.*;
import java.util.Arrays;
public class t16 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        int[] arr= new int[15];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
        	arr[i]= sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        	for(int k=j+1;k<n;k++)
        	{
        		int temp=0;
        		if(arr[j]>arr[k])
        		{
        			temp=arr[j];
        			arr[j]=arr[k];
        			arr[k]=temp;
        		}
        	}
        }
        for(int m=0;m<n;m++)
        {
        	System.out.println(arr[m]);
        }
        if(n%2!=0)
        {
        	double mean= arr[((n/2)-1)+1];
        	System.out.println("The mean is: "+mean);
        }
        else
        {
        	int mean2= (arr[(n/2)-1]+arr[n/2])/2;
        	System.out.println("The mean is: "+mean2);
        }
    }
}
