package Test;
import java.util.*;

public class climbstairs {
  static int climb(int n) {
	  if(n==1) return 1;
	  if(n==2) return 2;
	  else return climb(n-1)+climb(n-2);
  }
  static int climbusingdp(int n) {
	  int[] dp=new int[n];
	  dp[0]=1;
	  dp[1]=2;
	  for(int i=2;i<n;i++) {
		  dp[i]=dp[i-1]+dp[i-2];
	  }
	  return dp[n-1];
  }
  public static void main(String[] args) {
	  System.out.println(climb(6));
	  System.out.println(climbusingdp(6));
  }
}
