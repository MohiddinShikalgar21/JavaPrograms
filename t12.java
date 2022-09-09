package Test;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class t12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[25];
		int[] arr2= new int[25];
		for(int i=0;i<n;i++)
		{
		    arr[i]= sc.nextInt();
		    int total=100-arr[i];
		    arr2[i]= total;
		}
		for(int k=0;k<n;k++)
		{	
		System.out.println(arr2[k]);
		}
	}
}

