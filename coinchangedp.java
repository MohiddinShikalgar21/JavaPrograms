package Test;
import java.util.*;

public class coinchangedp {
    static int coinchangewithoutdp(int n,int[] arr) {
        if(n==0) return 0;
    	int ans=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(n-arr[i]>=0) {
    			int subans=coinchangewithoutdp(n-arr[i],arr);
    			ans=Math.min(ans, subans+1);
    			//System.out.println(subans);
    		}
    	}
    	return ans;
    }
    static int coinchangewithdp(int n,int[] arr,int[] dp) {
    	if(n==0) return 0;
    	int ans=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(n-arr[i]>=0) {
    			int subans=0;
    			if(dp[n-arr[i]]!=-1) subans=dp[n-arr[i]];
    			else {
    			    subans=coinchangewithdp(n-arr[i],arr,dp); 
    			}
    			ans=Math.min(ans, subans+1);
    		}
    	}
    	dp[n]=ans;
    	return ans;
    }
    public static void main(String[] args) {
    	int[] arr= {1,7,12};
    	int n=14;
    	int ans1=coinchangewithoutdp(n,arr);
    	System.out.println(ans1);
    	int[] dp=new int[n+1];
    	Arrays.fill(dp,-1);
    	int ans2=coinchangewithdp(n,arr,dp);
    	System.out.println(ans2);
    }
}
