package Test;
import java.util.*;
public class coinchange {
  static int mincoins(int n,int[] arr,int[] dp)
  {
	  if(n==0) return 0;
	  int ans= Integer.MAX_VALUE;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(n-arr[i]>=0)
		  {
			  int subans=0;
			  if(dp[n-arr[i]]!=-1)
			  {
				  subans=dp[n-arr[i]];
			  }
			  else 
			  {
			      subans= mincoins(n-arr[i],arr,dp);
			  }
			  if(subans!=Integer.MAX_VALUE && subans+1<ans) ans= subans+1;
		  }
	  }
	  return dp[n]=ans;
  }
  public static void main(String[] args)
  {

	  int n=18;
	  int[] dp= new int[n+1];
	  Arrays.fill(dp,-1);
	  dp[0]=0;
	  int arr[]= {1,5,2};
	  int m= mincoins(n,arr,dp);
	  System.out.println(m);
  }
}
