package Test;
import java.util.*;
public class floor {
   static int floor(int[] arr,int x)
   {
	   int m=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]<=x) 
		   {
			   return i;
		   }
	   }
	   
	   return m;
   }
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	   int n= sc.nextInt();
	   int[] arr= new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]= sc.nextInt();
	   }
	   int x= sc.nextInt();
	   int y= floor(arr,x);
	   System.out.println(y);
   }
}
