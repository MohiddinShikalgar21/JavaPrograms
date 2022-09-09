package Test;
import java.util.*;
public class remdup {
   static int removedup(int[] arr,int n)
   {
	   if(n==0 || n==1) return n;
	   Arrays.sort(arr);
	   int j=0;
	   for(int i=0;i<n-1;i++)
	   {
		   if(arr[i]!=arr[i+1])
		   {
			   arr[j++]= arr[i];
		   }
	   }
	   arr[j++]= arr[n-1];
	   return j;
   }
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	   int t= sc.nextInt();
	   int[] a= new int[t];
	   for(int k=0;k<t;k++)
	   {
		   a[k]= sc.nextInt();
	   }
	   int j=removedup(a,t);
	   for(int h=0;h<j;h++)
	   {
		   System.out.print(a[h]+" ");
	   }
   }
}
