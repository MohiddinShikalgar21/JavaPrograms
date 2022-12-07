package Test;
import java.util.*;
public class majelement {
	    static int majorityElement(int[] nums) {
	        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	        int max=nums[0];
	        for(int i:nums){
	            if(map.containsKey(i)){
	                map.put(i,map.get(i)+1);
	                if((map.get(i))>=(nums.length/2)+1) {
	                    max=i;
	                   // System.out.println(map.get(i));
	                }
	            }
	            else map.put(i,1);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		int[] nums= {6,6,6,7,7};
		System.out.println(majorityElement(nums));
	}
}
