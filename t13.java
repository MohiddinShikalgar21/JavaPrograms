/* package codechef; // don't place package name! */
package Test;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class t13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[2];
		
		    for (int j=0;j<n;j++)
		    {
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=sc.nextInt();
		        int d=sc.nextInt();
		        arr[j]=(Math.max(a,b)+Math.max(c,d));
		  
		    }
		    for(int k=0;k<2;k++)
		    {
		    System.out.println(arr[k]);
		    }
	}
}
