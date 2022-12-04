//Given an array of integers and an integer k, find out whether there are two distinct indices i and 
//j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

package Test;
import java.util.*;

public class containsdupwithinrange {
    static boolean containsdup(int[] arr,int k) {
    	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<arr.length;i++) {
    		if(map.containsKey(arr[i])) {
    			int j = map.get(arr[i]);
    			if(Math.abs(j-i)<=k) return true;
    		}
    		else map.put(arr[i], i);
    	}
    	return false;
    }
    public static void main(String[] args) {
    	int[] arr= {1,23,12,11,34,23,56,57,65,4,3,2,1};
    	System.out.println(containsdup(arr,3));
    	System.out.println(containsdup(arr,4));
    }
}
