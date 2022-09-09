package Test;
import java.util.Arrays;

public class fibonaccidp{
   static int fib(int n,int[] dp) {
	   int flag=0;
	   dp[1]=1;
	   for(int i=0;i<dp.length;i++) {
		   if(dp[i]==n) { flag=dp[i]; break; }
	   }
	   if(flag!=0) return flag;
	   else {
	   if(n<=2) { dp[n]=1; return 1; }
	   else if(dp[n]!=0) return dp[n];
	   else {
	   int p= fib(n-1,dp)+fib(n-2,dp);
	   dp[n]=p;
	   return p;
	   }}
   }
   public static void main(String[] args) {
	   int[] arr=new int[9];
	   System.out.println(fib(8,arr)); 
	   for(int i=1;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
   }
}

