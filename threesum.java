
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

package Test;
import java.util.*;

public class threesum {
    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if(sum<0) j++;
                if(sum>0) k--;
            }
        }
        return new ArrayList<>(set);
        
    }
	public static void main(String[] args) {
		int[] arr= {-1,0,1,2,-1,-4};
		List<List<Integer>> l=threeSum(arr);
		System.out.println(l);
		
	}
}
