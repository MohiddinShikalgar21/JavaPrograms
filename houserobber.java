
//Given an integer array representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

package Test;
public class houserobber {
    static int rob(int[] nums) {
        final int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; ++i) {
          dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
      }
    public static void main(String[] args) {
    	int[] arr= {12,1,3,45,23,25};
    	System.out.println(rob(arr));
    }
}
