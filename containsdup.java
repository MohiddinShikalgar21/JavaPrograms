package Test;

import java.util.Arrays;
import java.util.*;
public class containsdup {
    static boolean isduplicate(int[] arr) {
    	Arrays.sort(arr);
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]==arr[i-1]) return true;
    	}
    	return false;
    }
    
    static boolean isduplicateoptimised(int[] arr) {
    	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<arr.length;i++) {
    		if(map.containsKey(arr[i])) return true;
    		else map.put(arr[i], 1);
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	int[] arr= {1,23,12,11,34,23,56,57,65,4,3,2,1};
    	int[] arr2= {1,2,67,3,45,22,11,33};
    	System.out.println(isduplicateoptimised(arr));
    	System.out.println(isduplicateoptimised(arr2));
    	System.out.println(isduplicate(arr));
    	System.out.println(isduplicate(arr2));
    }
}
